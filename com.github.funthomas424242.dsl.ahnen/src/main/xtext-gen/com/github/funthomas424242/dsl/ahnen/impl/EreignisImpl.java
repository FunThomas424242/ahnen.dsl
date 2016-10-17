/**
 * generated by Xtext 2.10.0
 */
package com.github.funthomas424242.dsl.ahnen.impl;

import com.github.funthomas424242.dsl.ahnen.AhnenPackage;
import com.github.funthomas424242.dsl.ahnen.Ereignis;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ereignis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.funthomas424242.dsl.ahnen.impl.EreignisImpl#getVon <em>Von</em>}</li>
 *   <li>{@link com.github.funthomas424242.dsl.ahnen.impl.EreignisImpl#getBis <em>Bis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EreignisImpl extends MinimalEObjectImpl.Container implements Ereignis
{
  /**
   * The default value of the '{@link #getVon() <em>Von</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVon()
   * @generated
   * @ordered
   */
  protected static final String VON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVon() <em>Von</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVon()
   * @generated
   * @ordered
   */
  protected String von = VON_EDEFAULT;

  /**
   * The default value of the '{@link #getBis() <em>Bis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBis()
   * @generated
   * @ordered
   */
  protected static final String BIS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBis() <em>Bis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBis()
   * @generated
   * @ordered
   */
  protected String bis = BIS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EreignisImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AhnenPackage.Literals.EREIGNIS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVon()
  {
    return von;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVon(String newVon)
  {
    String oldVon = von;
    von = newVon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AhnenPackage.EREIGNIS__VON, oldVon, von));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBis()
  {
    return bis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBis(String newBis)
  {
    String oldBis = bis;
    bis = newBis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AhnenPackage.EREIGNIS__BIS, oldBis, bis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AhnenPackage.EREIGNIS__VON:
        return getVon();
      case AhnenPackage.EREIGNIS__BIS:
        return getBis();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AhnenPackage.EREIGNIS__VON:
        setVon((String)newValue);
        return;
      case AhnenPackage.EREIGNIS__BIS:
        setBis((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AhnenPackage.EREIGNIS__VON:
        setVon(VON_EDEFAULT);
        return;
      case AhnenPackage.EREIGNIS__BIS:
        setBis(BIS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AhnenPackage.EREIGNIS__VON:
        return VON_EDEFAULT == null ? von != null : !VON_EDEFAULT.equals(von);
      case AhnenPackage.EREIGNIS__BIS:
        return BIS_EDEFAULT == null ? bis != null : !BIS_EDEFAULT.equals(bis);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (von: ");
    result.append(von);
    result.append(", bis: ");
    result.append(bis);
    result.append(')');
    return result.toString();
  }

} //EreignisImpl