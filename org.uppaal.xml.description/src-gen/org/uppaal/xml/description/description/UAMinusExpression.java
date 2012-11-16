/**
 */
package org.uppaal.xml.description.description;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Minus Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.UAMinusExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uppaal.xml.description.description.DescriptionPackage#getUAMinusExpression()
 * @model
 * @generated
 */
public interface UAMinusExpression extends UAExpression
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
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAMinusExpression_Expression()
   * @model containment="true"
   * @generated
   */
  UAExpression getExpression();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UAMinusExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(UAExpression value);

} // UAMinusExpression
