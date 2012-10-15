/**
 */
package dk.itu.ecdar.text.ecdarText;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ET Field ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETFieldID#getName <em>Name</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETFieldID#getIoType <em>Io Type</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETFieldID#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETFieldID()
 * @model
 * @generated
 */
public interface ETFieldID extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETFieldID_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETFieldID#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Io Type</b></em>' attribute.
   * The literals are from the enumeration {@link dk.itu.ecdar.text.ecdarText.ETIOType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Io Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Io Type</em>' attribute.
   * @see dk.itu.ecdar.text.ecdarText.ETIOType
   * @see #setIoType(ETIOType)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETFieldID_IoType()
   * @model
   * @generated
   */
  ETIOType getIoType();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETFieldID#getIoType <em>Io Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Io Type</em>' attribute.
   * @see dk.itu.ecdar.text.ecdarText.ETIOType
   * @see #getIoType()
   * @generated
   */
  void setIoType(ETIOType value);

  /**
   * Returns the value of the '<em><b>Dimensions</b></em>' containment reference list.
   * The list contents are of type {@link dk.itu.ecdar.text.ecdarText.ETArrayDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dimensions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dimensions</em>' containment reference list.
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETFieldID_Dimensions()
   * @model containment="true"
   * @generated
   */
  EList<ETArrayDeclaration> getDimensions();

} // ETFieldID
