/**
 */
package org.uppaal.xml.description.description;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Pre Increment Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.UAPreIncrementExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uppaal.xml.description.description.DescriptionPackage#getUAPreIncrementExpression()
 * @model
 * @generated
 */
public interface UAPreIncrementExpression extends UAExpression
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(UAExpression)
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAPreIncrementExpression_Expression()
   * @model containment="true"
   * @generated
   */
  UAExpression getExpression();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UAPreIncrementExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(UAExpression value);

} // UAPreIncrementExpression
