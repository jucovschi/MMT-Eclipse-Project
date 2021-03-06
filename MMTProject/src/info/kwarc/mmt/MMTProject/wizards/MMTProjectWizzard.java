package info.kwarc.mmt.MMTProject.wizards;

import info.kwarc.mmt.MMTProject.Activator;
import info.kwarc.mmt.MMTProject.MMTProjectUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

/**
 * This is a sample new wizard. Its role is to create a new file 
 * resource in the provided container. If the container resource
 * (a folder or a project) is selected in the workspace 
 * when the wizard is opened, it will accept it as the target
 * container. The wizard creates one file with the extension
 * "lf". If a sample multi-page editor (also available
 * as a template) is registered for the same extension, it will
 * be able to open it.
 */

public class MMTProjectWizzard extends Wizard implements INewWizard {
	private NewMMTProjectPage page;
	private ISelection selection;

	/**
	 * Constructor for MMTProject.
	 */
	public MMTProjectWizzard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new NewMMTProjectPage(selection);
		addPage(page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	public boolean performFinish() {
		final String containerName = page.getContainerName();
		final String fileName = page.getFileName();
		final HashMap<String, String> opts = new HashMap<String, String>();
		final boolean latinInclude = page.getLatinInclude();
		opts.put("source-base", page.getSourceBase());
		opts.put("narration-base", page.getNarrationBase());
    		
 		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerName, fileName, opts, latinInclude, monitor);
				} catch (CoreException e) {
 					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
    		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}
	
	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 */

	private void doFinish(
		String containerName,
		String fileName,
		Map<String, String> opts,
		Boolean includeLatin,
		IProgressMonitor monitor)
		throws CoreException {
		// create a sample file
		monitor.beginTask("Creating project " + containerName, 2);
		
		MMTProjectUtils.createProject(containerName, opts, monitor);
		monitor.worked(1);
		
		if (includeLatin) {
			monitor.beginTask("Copying Latin" + fileName, 2);
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IResource resource = root.findMember(new Path(containerName));
			if (!resource.exists()) {
				throwCoreException("Path "+containerName+" is invalid ");
			}
			IContainer container = (IContainer) resource;
			final IFile file = container.getFile(new Path("mars/latin.mar"));
			try {
				InputStream stream = openLatinStream();
				if (file.exists()) {
					file.setContents(stream, true, true, monitor);
				} else {
					file.create(stream, true, monitor);
				}
			stream.close();
		} catch (IOException e) {
		}
		monitor.worked(1);
		}

		containerName+="/source";

		monitor.beginTask("Creating " + fileName, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists()) {
			throwCoreException("Path "+containerName+" is invalid ");
		}
		IContainer container = (IContainer) resource;
		final IFile file = container.getFile(new Path(fileName));
		try {
			InputStream stream = openContentStream();
			if (file.exists()) {
				file.setContents(stream, true, true, monitor);
			} else {
				file.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
		monitor.worked(1);
		monitor.setTaskName("Opening file for editing...");
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page =
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, file, true);
				} catch (PartInitException e) {
				}
			}
		});
		monitor.worked(1); 
	}
	
	private InputStream openLatinStream() {
		try {
			URL url = Activator.getDefault().getBundle().getEntry("resources/latin.mar");
			return url.openStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * We will initialize file contents with a sample text.
	 */

	private InputStream openContentStream() {
		String contents = "%namespace \"http://cds.omdoc.org/test\".\n" + 
				"\n" + 
				"%sig A = {\n" + 
				"   a: type.\n" + 
				"   c: a.\n" + 
				"}.\n" + 
				"\n" + 
				"%sig B = {\n" + 
				"   %include A.\n" + 
				"   c: a.\n" + 
				"}.\n" + 
				"\n" + 
				"%sig C = {\n" + 
				"   %include A.\n" + 
				"   %include B.\n" + 
				"   %struct s: A.\n" + 
				"   c : s.a.\n" + 
				"   %struct t: A.\n" + 
				"   d : t.a.\n" + 
				"}.";
		return new ByteArrayInputStream(contents.getBytes());
	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "MMTProject", IStatus.OK, message, null);
		throw new CoreException(status);
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}