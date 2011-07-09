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
 * A representation of the model object '<em><b>view Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.viewDeclaration#getViewID <em>View ID</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.viewDeclaration#getFrom <em>From</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.viewDeclaration#getTo <em>To</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.viewDeclaration#getViewDefinitions <em>View Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.mmt.lF.LFPackage#getviewDeclaration()
 * @model
 * @generated
 */
public interface viewDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>View ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>View ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>View ID</em>' attribute.
   * @see #setViewID(String)
   * @see info.kwarc.mmt.lF.LFPackage#getviewDeclaration_ViewID()
   * @model
   * @generated
   */
  String getViewID();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.viewDeclaration#getViewID <em>View ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>View ID</em>' attribute.
   * @see #getViewID()
   * @generated
   */
  void setViewID(String value);

  /**
   * Returns the value of the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' attribute.
   * @see #setFrom(String)
   * @see info.kwarc.mmt.lF.LFPackage#getviewDeclaration_From()
   * @model
   * @generated
   */
  String getFrom();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.viewDeclaration#getFrom <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' attribute.
   * @see #getFrom()
   * @generated
   */
  void setFrom(String value);

  /**
   * Returns the value of the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' attribute.
   * @see #setTo(String)
   * @see info.kwarc.mmt.lF.LFPackage#getviewDeclaration_To()
   * @model
   * @generated
   */
  String getTo();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.viewDeclaration#getTo <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' attribute.
   * @see #getTo()
   * @generated
   */
  void setTo(String value);

  /**
   * Returns the value of the '<em><b>View Definitions</b></em>' containment reference list.
   * The list contents are of type {@link info.kwarc.mmt.lF.sigDefinitions}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>View Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>View Definitions</em>' containment reference list.
   * @see info.kwarc.mmt.lF.LFPackage#getviewDeclaration_ViewDefinitions()
   * @model containment="true"
   * @generated
   */
  EList<sigDefinitions> getViewDefinitions();

} // viewDeclaration