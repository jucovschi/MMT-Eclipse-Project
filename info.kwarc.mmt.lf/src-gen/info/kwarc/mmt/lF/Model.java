/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.Model#getConstructs <em>Constructs</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.Model#getNotInDocument <em>Not In Document</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.mmt.lF.LFPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Constructs</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constructs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constructs</em>' containment reference list.
   * @see info.kwarc.mmt.lF.LFPackage#getModel_Constructs()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getConstructs();

  /**
   * Returns the value of the '<em><b>Not In Document</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not In Document</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not In Document</em>' attribute list.
   * @see info.kwarc.mmt.lF.LFPackage#getModel_NotInDocument()
   * @model unique="false"
   * @generated
   */
  EList<String> getNotInDocument();

} // Model
