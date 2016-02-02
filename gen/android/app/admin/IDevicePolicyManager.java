/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/app/admin/IDevicePolicyManager.aidl
 */
package android.app.admin;
/**
 * Internal IPC interface to the device policy service.
 * {@hide}
 */
public interface IDevicePolicyManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.admin.IDevicePolicyManager
{
private static final java.lang.String DESCRIPTOR = "android.app.admin.IDevicePolicyManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.admin.IDevicePolicyManager interface,
 * generating a proxy if needed.
 */
public static android.app.admin.IDevicePolicyManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.admin.IDevicePolicyManager))) {
return ((android.app.admin.IDevicePolicyManager)iin);
}
return new android.app.admin.IDevicePolicyManager.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_setPasswordQuality:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setPasswordQuality(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPasswordQuality:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _result = this.getPasswordQuality(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setPasswordMinimumLength:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setPasswordMinimumLength(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPasswordMinimumLength:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _result = this.getPasswordMinimumLength(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setPasswordMinimumUpperCase:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setPasswordMinimumUpperCase(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPasswordMinimumUpperCase:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _result = this.getPasswordMinimumUpperCase(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setPasswordMinimumLowerCase:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setPasswordMinimumLowerCase(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPasswordMinimumLowerCase:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _result = this.getPasswordMinimumLowerCase(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setPasswordMinimumLetters:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setPasswordMinimumLetters(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPasswordMinimumLetters:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _result = this.getPasswordMinimumLetters(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setPasswordMinimumNumeric:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setPasswordMinimumNumeric(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPasswordMinimumNumeric:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _result = this.getPasswordMinimumNumeric(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setPasswordMinimumSymbols:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setPasswordMinimumSymbols(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPasswordMinimumSymbols:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _result = this.getPasswordMinimumSymbols(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setPasswordMinimumNonLetter:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setPasswordMinimumNonLetter(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPasswordMinimumNonLetter:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _result = this.getPasswordMinimumNonLetter(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setPasswordHistoryLength:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setPasswordHistoryLength(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPasswordHistoryLength:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _result = this.getPasswordHistoryLength(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setPasswordExpirationTimeout:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
long _arg1;
_arg1 = data.readLong();
int _arg2;
_arg2 = data.readInt();
this.setPasswordExpirationTimeout(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPasswordExpirationTimeout:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
long _result = this.getPasswordExpirationTimeout(_arg0, _arg1);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getPasswordExpiration:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
long _result = this.getPasswordExpiration(_arg0, _arg1);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_isActivePasswordSufficient:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isActivePasswordSufficient(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getCurrentFailedPasswordAttempts:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getCurrentFailedPasswordAttempts(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getProfileWithMinimumFailedPasswordsForWipe:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getProfileWithMinimumFailedPasswordsForWipe(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setMaximumFailedPasswordsForWipe:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setMaximumFailedPasswordsForWipe(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getMaximumFailedPasswordsForWipe:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _result = this.getMaximumFailedPasswordsForWipe(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_resetPassword:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
boolean _result = this.resetPassword(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setMaximumTimeToLock:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
long _arg1;
_arg1 = data.readLong();
int _arg2;
_arg2 = data.readInt();
this.setMaximumTimeToLock(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getMaximumTimeToLock:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
long _result = this.getMaximumTimeToLock(_arg0, _arg1);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_lockNow:
{
data.enforceInterface(DESCRIPTOR);
this.lockNow();
reply.writeNoException();
return true;
}
case TRANSACTION_wipeData:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.wipeData(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setGlobalProxy:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
android.content.ComponentName _result = this.setGlobalProxy(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getGlobalProxyAdmin:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.content.ComponentName _result = this.getGlobalProxyAdmin(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_setRecommendedGlobalProxy:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.net.ProxyInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = android.net.ProxyInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setRecommendedGlobalProxy(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setStorageEncryption:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
int _arg2;
_arg2 = data.readInt();
int _result = this.setStorageEncryption(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getStorageEncryption:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _result = this.getStorageEncryption(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getStorageEncryptionStatus:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getStorageEncryptionStatus(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setCameraDisabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
int _arg2;
_arg2 = data.readInt();
this.setCameraDisabled(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getCameraDisabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _result = this.getCameraDisabled(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setScreenCaptureDisabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setScreenCaptureDisabled(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getScreenCaptureDisabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _result = this.getScreenCaptureDisabled(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setKeyguardDisabledFeatures:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setKeyguardDisabledFeatures(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getKeyguardDisabledFeatures:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _result = this.getKeyguardDisabledFeatures(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setActiveAdmin:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
int _arg2;
_arg2 = data.readInt();
this.setActiveAdmin(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_isAdminActive:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _result = this.isAdminActive(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getActiveAdmins:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List<android.content.ComponentName> _result = this.getActiveAdmins(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_packageHasActiveAdmins:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.packageHasActiveAdmins(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getRemoveWarning:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.RemoteCallback _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.RemoteCallback.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
this.getRemoveWarning(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_removeActiveAdmin:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.removeActiveAdmin(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_hasGrantedPolicy:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
boolean _result = this.hasGrantedPolicy(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setActivePasswordState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
int _arg5;
_arg5 = data.readInt();
int _arg6;
_arg6 = data.readInt();
int _arg7;
_arg7 = data.readInt();
int _arg8;
_arg8 = data.readInt();
this.setActivePasswordState(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8);
reply.writeNoException();
return true;
}
case TRANSACTION_reportFailedPasswordAttempt:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.reportFailedPasswordAttempt(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_reportSuccessfulPasswordAttempt:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.reportSuccessfulPasswordAttempt(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setDeviceOwner:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.setDeviceOwner(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isDeviceOwner:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isDeviceOwner(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getDeviceOwner:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getDeviceOwner();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getDeviceOwnerName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getDeviceOwnerName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_clearDeviceOwner:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.clearDeviceOwner(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setProfileOwner:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
boolean _result = this.setProfileOwner(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getProfileOwner:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.content.ComponentName _result = this.getProfileOwner(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getProfileOwnerName:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _result = this.getProfileOwnerName(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_setProfileEnabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setProfileEnabled(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setProfileName:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
this.setProfileName(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_clearProfileOwner:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.clearProfileOwner(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_hasUserSetupCompleted:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.hasUserSetupCompleted();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_installCaCert:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
byte[] _arg1;
_arg1 = data.createByteArray();
boolean _result = this.installCaCert(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_uninstallCaCert:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
this.uninstallCaCert(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_enforceCanManageCaCerts:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.enforceCanManageCaCerts(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_installKeyPair:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
byte[] _arg1;
_arg1 = data.createByteArray();
byte[] _arg2;
_arg2 = data.createByteArray();
java.lang.String _arg3;
_arg3 = data.readString();
boolean _result = this.installKeyPair(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_addPersistentPreferredActivity:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.IntentFilter _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.IntentFilter.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.content.ComponentName _arg2;
if ((0!=data.readInt())) {
_arg2 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.addPersistentPreferredActivity(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_clearPackagePersistentPreferredActivities:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
this.clearPackagePersistentPreferredActivities(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setApplicationRestrictions:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
android.os.Bundle _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.setApplicationRestrictions(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getApplicationRestrictions:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
android.os.Bundle _result = this.getApplicationRestrictions(_arg0, _arg1);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_setRestrictionsProvider:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.ComponentName _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setRestrictionsProvider(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getRestrictionsProvider:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.content.ComponentName _result = this.getRestrictionsProvider(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_setUserRestriction:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setUserRestriction(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_addCrossProfileIntentFilter:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.IntentFilter _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.IntentFilter.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
this.addCrossProfileIntentFilter(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_clearCrossProfileIntentFilters:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.clearCrossProfileIntentFilters(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setPermittedAccessibilityServices:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.util.List _arg1;
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_arg1 = data.readArrayList(cl);
boolean _result = this.setPermittedAccessibilityServices(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getPermittedAccessibilityServices:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.util.List _result = this.getPermittedAccessibilityServices(_arg0);
reply.writeNoException();
reply.writeList(_result);
return true;
}
case TRANSACTION_getPermittedAccessibilityServicesForUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List _result = this.getPermittedAccessibilityServicesForUser(_arg0);
reply.writeNoException();
reply.writeList(_result);
return true;
}
case TRANSACTION_setPermittedInputMethods:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.util.List _arg1;
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_arg1 = data.readArrayList(cl);
boolean _result = this.setPermittedInputMethods(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getPermittedInputMethods:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.util.List _result = this.getPermittedInputMethods(_arg0);
reply.writeNoException();
reply.writeList(_result);
return true;
}
case TRANSACTION_getPermittedInputMethodsForCurrentUser:
{
data.enforceInterface(DESCRIPTOR);
java.util.List _result = this.getPermittedInputMethodsForCurrentUser();
reply.writeNoException();
reply.writeList(_result);
return true;
}
case TRANSACTION_setApplicationHidden:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
boolean _arg2;
_arg2 = (0!=data.readInt());
boolean _result = this.setApplicationHidden(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isApplicationHidden:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.isApplicationHidden(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_createUser:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
android.os.UserHandle _result = this.createUser(_arg0, _arg1);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_createAndInitializeUser:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
android.content.ComponentName _arg3;
if ((0!=data.readInt())) {
_arg3 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
android.os.Bundle _arg4;
if ((0!=data.readInt())) {
_arg4 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
android.os.UserHandle _result = this.createAndInitializeUser(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_removeUser:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.UserHandle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.UserHandle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _result = this.removeUser(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_switchUser:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.UserHandle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.UserHandle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _result = this.switchUser(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_enableSystemApp:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
this.enableSystemApp(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_enableSystemAppWithIntent:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.Intent _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _result = this.enableSystemAppWithIntent(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setAccountManagementDisabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setAccountManagementDisabled(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getAccountTypesWithManagementDisabled:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getAccountTypesWithManagementDisabled();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getAccountTypesWithManagementDisabledAsUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String[] _result = this.getAccountTypesWithManagementDisabledAsUser(_arg0);
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_setLockTaskPackages:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String[] _arg1;
_arg1 = data.createStringArray();
this.setLockTaskPackages(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getLockTaskPackages:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String[] _result = this.getLockTaskPackages(_arg0);
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_isLockTaskPermitted:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isLockTaskPermitted(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setGlobalSetting:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.setGlobalSetting(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setSecureSetting:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.setSecureSetting(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setMasterVolumeMuted:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setMasterVolumeMuted(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_isMasterVolumeMuted:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.isMasterVolumeMuted(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_notifyLockTaskModeChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
this.notifyLockTaskModeChanged(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setUninstallBlocked:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setUninstallBlocked(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_isUninstallBlocked:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.isUninstallBlocked(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setCrossProfileCallerIdDisabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setCrossProfileCallerIdDisabled(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getCrossProfileCallerIdDisabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.getCrossProfileCallerIdDisabled(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getCrossProfileCallerIdDisabledForUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.getCrossProfileCallerIdDisabledForUser(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setTrustAgentConfiguration:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.ComponentName _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.os.PersistableBundle _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.PersistableBundle.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
int _arg3;
_arg3 = data.readInt();
this.setTrustAgentConfiguration(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_getTrustAgentConfiguration:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.ComponentName _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
java.util.List<android.os.PersistableBundle> _result = this.getTrustAgentConfiguration(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_addCrossProfileWidgetProvider:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.addCrossProfileWidgetProvider(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeCrossProfileWidgetProvider:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.removeCrossProfileWidgetProvider(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getCrossProfileWidgetProviders:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.util.List<java.lang.String> _result = this.getCrossProfileWidgetProviders(_arg0);
reply.writeNoException();
reply.writeStringList(_result);
return true;
}
case TRANSACTION_setAutoTimeRequired:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setAutoTimeRequired(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getAutoTimeRequired:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getAutoTimeRequired();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isRemovingAdmin:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _result = this.isRemovingAdmin(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.admin.IDevicePolicyManager
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void setPasswordQuality(android.content.ComponentName who, int quality, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(quality);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setPasswordQuality, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPasswordQuality(android.content.ComponentName who, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getPasswordQuality, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setPasswordMinimumLength(android.content.ComponentName who, int length, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(length);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setPasswordMinimumLength, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPasswordMinimumLength(android.content.ComponentName who, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getPasswordMinimumLength, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setPasswordMinimumUpperCase(android.content.ComponentName who, int length, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(length);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setPasswordMinimumUpperCase, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPasswordMinimumUpperCase(android.content.ComponentName who, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getPasswordMinimumUpperCase, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setPasswordMinimumLowerCase(android.content.ComponentName who, int length, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(length);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setPasswordMinimumLowerCase, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPasswordMinimumLowerCase(android.content.ComponentName who, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getPasswordMinimumLowerCase, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setPasswordMinimumLetters(android.content.ComponentName who, int length, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(length);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setPasswordMinimumLetters, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPasswordMinimumLetters(android.content.ComponentName who, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getPasswordMinimumLetters, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setPasswordMinimumNumeric(android.content.ComponentName who, int length, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(length);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setPasswordMinimumNumeric, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPasswordMinimumNumeric(android.content.ComponentName who, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getPasswordMinimumNumeric, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setPasswordMinimumSymbols(android.content.ComponentName who, int length, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(length);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setPasswordMinimumSymbols, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPasswordMinimumSymbols(android.content.ComponentName who, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getPasswordMinimumSymbols, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setPasswordMinimumNonLetter(android.content.ComponentName who, int length, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(length);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setPasswordMinimumNonLetter, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPasswordMinimumNonLetter(android.content.ComponentName who, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getPasswordMinimumNonLetter, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setPasswordHistoryLength(android.content.ComponentName who, int length, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(length);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setPasswordHistoryLength, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPasswordHistoryLength(android.content.ComponentName who, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getPasswordHistoryLength, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setPasswordExpirationTimeout(android.content.ComponentName who, long expiration, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeLong(expiration);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setPasswordExpirationTimeout, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public long getPasswordExpirationTimeout(android.content.ComponentName who, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getPasswordExpirationTimeout, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getPasswordExpiration(android.content.ComponentName who, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getPasswordExpiration, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isActivePasswordSufficient(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_isActivePasswordSufficient, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getCurrentFailedPasswordAttempts(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getCurrentFailedPasswordAttempts, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getProfileWithMinimumFailedPasswordsForWipe(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getProfileWithMinimumFailedPasswordsForWipe, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setMaximumFailedPasswordsForWipe(android.content.ComponentName admin, int num, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(num);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setMaximumFailedPasswordsForWipe, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getMaximumFailedPasswordsForWipe(android.content.ComponentName admin, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getMaximumFailedPasswordsForWipe, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean resetPassword(java.lang.String password, int flags, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(password);
_data.writeInt(flags);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_resetPassword, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setMaximumTimeToLock(android.content.ComponentName who, long timeMs, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeLong(timeMs);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setMaximumTimeToLock, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public long getMaximumTimeToLock(android.content.ComponentName who, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getMaximumTimeToLock, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void lockNow() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_lockNow, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void wipeData(int flags, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(flags);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_wipeData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.content.ComponentName setGlobalProxy(android.content.ComponentName admin, java.lang.String proxySpec, java.lang.String exclusionList, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.ComponentName _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(proxySpec);
_data.writeString(exclusionList);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setGlobalProxy, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.ComponentName.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.ComponentName getGlobalProxyAdmin(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.ComponentName _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getGlobalProxyAdmin, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.ComponentName.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setRecommendedGlobalProxy(android.content.ComponentName admin, android.net.ProxyInfo proxyInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((proxyInfo!=null)) {
_data.writeInt(1);
proxyInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setRecommendedGlobalProxy, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int setStorageEncryption(android.content.ComponentName who, boolean encrypt, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((encrypt)?(1):(0)));
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setStorageEncryption, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean getStorageEncryption(android.content.ComponentName who, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getStorageEncryption, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getStorageEncryptionStatus(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getStorageEncryptionStatus, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setCameraDisabled(android.content.ComponentName who, boolean disabled, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((disabled)?(1):(0)));
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setCameraDisabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean getCameraDisabled(android.content.ComponentName who, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getCameraDisabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setScreenCaptureDisabled(android.content.ComponentName who, int userHandle, boolean disabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
_data.writeInt(((disabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setScreenCaptureDisabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean getScreenCaptureDisabled(android.content.ComponentName who, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getScreenCaptureDisabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setKeyguardDisabledFeatures(android.content.ComponentName who, int which, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(which);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setKeyguardDisabledFeatures, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getKeyguardDisabledFeatures(android.content.ComponentName who, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getKeyguardDisabledFeatures, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setActiveAdmin(android.content.ComponentName policyReceiver, boolean refreshing, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((policyReceiver!=null)) {
_data.writeInt(1);
policyReceiver.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((refreshing)?(1):(0)));
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setActiveAdmin, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isAdminActive(android.content.ComponentName policyReceiver, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((policyReceiver!=null)) {
_data.writeInt(1);
policyReceiver.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_isAdminActive, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.content.ComponentName> getActiveAdmins(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.ComponentName> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getActiveAdmins, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.ComponentName.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean packageHasActiveAdmins(java.lang.String packageName, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_packageHasActiveAdmins, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void getRemoveWarning(android.content.ComponentName policyReceiver, android.os.RemoteCallback result, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((policyReceiver!=null)) {
_data.writeInt(1);
policyReceiver.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((result!=null)) {
_data.writeInt(1);
result.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getRemoveWarning, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeActiveAdmin(android.content.ComponentName policyReceiver, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((policyReceiver!=null)) {
_data.writeInt(1);
policyReceiver.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_removeActiveAdmin, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean hasGrantedPolicy(android.content.ComponentName policyReceiver, int usesPolicy, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((policyReceiver!=null)) {
_data.writeInt(1);
policyReceiver.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(usesPolicy);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_hasGrantedPolicy, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setActivePasswordState(int quality, int length, int letters, int uppercase, int lowercase, int numbers, int symbols, int nonletter, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(quality);
_data.writeInt(length);
_data.writeInt(letters);
_data.writeInt(uppercase);
_data.writeInt(lowercase);
_data.writeInt(numbers);
_data.writeInt(symbols);
_data.writeInt(nonletter);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setActivePasswordState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void reportFailedPasswordAttempt(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_reportFailedPasswordAttempt, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void reportSuccessfulPasswordAttempt(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_reportSuccessfulPasswordAttempt, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean setDeviceOwner(java.lang.String packageName, java.lang.String ownerName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeString(ownerName);
mRemote.transact(Stub.TRANSACTION_setDeviceOwner, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isDeviceOwner(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_isDeviceOwner, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getDeviceOwner() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDeviceOwner, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getDeviceOwnerName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDeviceOwnerName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void clearDeviceOwner(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_clearDeviceOwner, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean setProfileOwner(android.content.ComponentName who, java.lang.String ownerName, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(ownerName);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setProfileOwner, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.ComponentName getProfileOwner(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.ComponentName _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getProfileOwner, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.ComponentName.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getProfileOwnerName(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getProfileOwnerName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setProfileEnabled(android.content.ComponentName who) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setProfileEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setProfileName(android.content.ComponentName who, java.lang.String profileName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(profileName);
mRemote.transact(Stub.TRANSACTION_setProfileName, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearProfileOwner(android.content.ComponentName who) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_clearProfileOwner, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean hasUserSetupCompleted() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_hasUserSetupCompleted, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean installCaCert(android.content.ComponentName admin, byte[] certBuffer) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeByteArray(certBuffer);
mRemote.transact(Stub.TRANSACTION_installCaCert, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void uninstallCaCert(android.content.ComponentName admin, java.lang.String alias) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(alias);
mRemote.transact(Stub.TRANSACTION_uninstallCaCert, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void enforceCanManageCaCerts(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_enforceCanManageCaCerts, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean installKeyPair(android.content.ComponentName who, byte[] privKeyBuffer, byte[] certBuffer, java.lang.String alias) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeByteArray(privKeyBuffer);
_data.writeByteArray(certBuffer);
_data.writeString(alias);
mRemote.transact(Stub.TRANSACTION_installKeyPair, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void addPersistentPreferredActivity(android.content.ComponentName admin, android.content.IntentFilter filter, android.content.ComponentName activity) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((filter!=null)) {
_data.writeInt(1);
filter.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((activity!=null)) {
_data.writeInt(1);
activity.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addPersistentPreferredActivity, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearPackagePersistentPreferredActivities(android.content.ComponentName admin, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_clearPackagePersistentPreferredActivities, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setApplicationRestrictions(android.content.ComponentName who, java.lang.String packageName, android.os.Bundle settings) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
if ((settings!=null)) {
_data.writeInt(1);
settings.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setApplicationRestrictions, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.os.Bundle getApplicationRestrictions(android.content.ComponentName who, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_getApplicationRestrictions, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setRestrictionsProvider(android.content.ComponentName who, android.content.ComponentName provider) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((provider!=null)) {
_data.writeInt(1);
provider.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setRestrictionsProvider, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.content.ComponentName getRestrictionsProvider(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.ComponentName _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getRestrictionsProvider, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.ComponentName.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setUserRestriction(android.content.ComponentName who, java.lang.String key, boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(key);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setUserRestriction, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void addCrossProfileIntentFilter(android.content.ComponentName admin, android.content.IntentFilter filter, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((filter!=null)) {
_data.writeInt(1);
filter.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_addCrossProfileIntentFilter, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearCrossProfileIntentFilters(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_clearCrossProfileIntentFilters, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean setPermittedAccessibilityServices(android.content.ComponentName admin, java.util.List packageList) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeList(packageList);
mRemote.transact(Stub.TRANSACTION_setPermittedAccessibilityServices, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List getPermittedAccessibilityServices(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getPermittedAccessibilityServices, _data, _reply, 0);
_reply.readException();
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_result = _reply.readArrayList(cl);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List getPermittedAccessibilityServicesForUser(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getPermittedAccessibilityServicesForUser, _data, _reply, 0);
_reply.readException();
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_result = _reply.readArrayList(cl);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setPermittedInputMethods(android.content.ComponentName admin, java.util.List packageList) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeList(packageList);
mRemote.transact(Stub.TRANSACTION_setPermittedInputMethods, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List getPermittedInputMethods(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getPermittedInputMethods, _data, _reply, 0);
_reply.readException();
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_result = _reply.readArrayList(cl);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List getPermittedInputMethodsForCurrentUser() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPermittedInputMethodsForCurrentUser, _data, _reply, 0);
_reply.readException();
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_result = _reply.readArrayList(cl);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setApplicationHidden(android.content.ComponentName admin, java.lang.String packageName, boolean hidden) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
_data.writeInt(((hidden)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setApplicationHidden, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isApplicationHidden(android.content.ComponentName admin, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_isApplicationHidden, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.os.UserHandle createUser(android.content.ComponentName who, java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.UserHandle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_createUser, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.UserHandle.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.os.UserHandle createAndInitializeUser(android.content.ComponentName who, java.lang.String name, java.lang.String profileOwnerName, android.content.ComponentName profileOwnerComponent, android.os.Bundle adminExtras) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.UserHandle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(name);
_data.writeString(profileOwnerName);
if ((profileOwnerComponent!=null)) {
_data.writeInt(1);
profileOwnerComponent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((adminExtras!=null)) {
_data.writeInt(1);
adminExtras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_createAndInitializeUser, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.UserHandle.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean removeUser(android.content.ComponentName who, android.os.UserHandle userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((userHandle!=null)) {
_data.writeInt(1);
userHandle.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_removeUser, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean switchUser(android.content.ComponentName who, android.os.UserHandle userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((userHandle!=null)) {
_data.writeInt(1);
userHandle.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_switchUser, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void enableSystemApp(android.content.ComponentName admin, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_enableSystemApp, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int enableSystemAppWithIntent(android.content.ComponentName admin, android.content.Intent intent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_enableSystemAppWithIntent, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setAccountManagementDisabled(android.content.ComponentName who, java.lang.String accountType, boolean disabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(accountType);
_data.writeInt(((disabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setAccountManagementDisabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String[] getAccountTypesWithManagementDisabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAccountTypesWithManagementDisabled, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String[] getAccountTypesWithManagementDisabledAsUser(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getAccountTypesWithManagementDisabledAsUser, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setLockTaskPackages(android.content.ComponentName who, java.lang.String[] packages) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStringArray(packages);
mRemote.transact(Stub.TRANSACTION_setLockTaskPackages, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String[] getLockTaskPackages(android.content.ComponentName who) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getLockTaskPackages, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isLockTaskPermitted(java.lang.String pkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
mRemote.transact(Stub.TRANSACTION_isLockTaskPermitted, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setGlobalSetting(android.content.ComponentName who, java.lang.String setting, java.lang.String value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(setting);
_data.writeString(value);
mRemote.transact(Stub.TRANSACTION_setGlobalSetting, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setSecureSetting(android.content.ComponentName who, java.lang.String setting, java.lang.String value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(setting);
_data.writeString(value);
mRemote.transact(Stub.TRANSACTION_setSecureSetting, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setMasterVolumeMuted(android.content.ComponentName admin, boolean on) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((on)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setMasterVolumeMuted, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isMasterVolumeMuted(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_isMasterVolumeMuted, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void notifyLockTaskModeChanged(boolean isEnabled, java.lang.String pkg, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isEnabled)?(1):(0)));
_data.writeString(pkg);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_notifyLockTaskModeChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setUninstallBlocked(android.content.ComponentName admin, java.lang.String packageName, boolean uninstallBlocked) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
_data.writeInt(((uninstallBlocked)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setUninstallBlocked, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isUninstallBlocked(android.content.ComponentName admin, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_isUninstallBlocked, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setCrossProfileCallerIdDisabled(android.content.ComponentName who, boolean disabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((disabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setCrossProfileCallerIdDisabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean getCrossProfileCallerIdDisabled(android.content.ComponentName who) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getCrossProfileCallerIdDisabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean getCrossProfileCallerIdDisabledForUser(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getCrossProfileCallerIdDisabledForUser, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setTrustAgentConfiguration(android.content.ComponentName admin, android.content.ComponentName agent, android.os.PersistableBundle args, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((agent!=null)) {
_data.writeInt(1);
agent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((args!=null)) {
_data.writeInt(1);
args.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_setTrustAgentConfiguration, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.util.List<android.os.PersistableBundle> getTrustAgentConfiguration(android.content.ComponentName admin, android.content.ComponentName agent, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.os.PersistableBundle> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((agent!=null)) {
_data.writeInt(1);
agent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getTrustAgentConfiguration, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.os.PersistableBundle.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean addCrossProfileWidgetProvider(android.content.ComponentName admin, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_addCrossProfileWidgetProvider, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean removeCrossProfileWidgetProvider(android.content.ComponentName admin, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_removeCrossProfileWidgetProvider, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<java.lang.String> getCrossProfileWidgetProviders(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<java.lang.String> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getCrossProfileWidgetProviders, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArrayList();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setAutoTimeRequired(android.content.ComponentName who, int userHandle, boolean required) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
_data.writeInt(((required)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setAutoTimeRequired, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean getAutoTimeRequired() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAutoTimeRequired, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isRemovingAdmin(android.content.ComponentName adminReceiver, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((adminReceiver!=null)) {
_data.writeInt(1);
adminReceiver.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_isRemovingAdmin, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_setPasswordQuality = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getPasswordQuality = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setPasswordMinimumLength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getPasswordMinimumLength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setPasswordMinimumUpperCase = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getPasswordMinimumUpperCase = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setPasswordMinimumLowerCase = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getPasswordMinimumLowerCase = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_setPasswordMinimumLetters = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getPasswordMinimumLetters = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_setPasswordMinimumNumeric = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getPasswordMinimumNumeric = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_setPasswordMinimumSymbols = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_getPasswordMinimumSymbols = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_setPasswordMinimumNonLetter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getPasswordMinimumNonLetter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_setPasswordHistoryLength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_getPasswordHistoryLength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_setPasswordExpirationTimeout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_getPasswordExpirationTimeout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_getPasswordExpiration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_isActivePasswordSufficient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_getCurrentFailedPasswordAttempts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_getProfileWithMinimumFailedPasswordsForWipe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_setMaximumFailedPasswordsForWipe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_getMaximumFailedPasswordsForWipe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_resetPassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_setMaximumTimeToLock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_getMaximumTimeToLock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_lockNow = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_wipeData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_setGlobalProxy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_getGlobalProxyAdmin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_setRecommendedGlobalProxy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_setStorageEncryption = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
static final int TRANSACTION_getStorageEncryption = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
static final int TRANSACTION_getStorageEncryptionStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
static final int TRANSACTION_setCameraDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
static final int TRANSACTION_getCameraDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
static final int TRANSACTION_setScreenCaptureDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
static final int TRANSACTION_getScreenCaptureDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
static final int TRANSACTION_setKeyguardDisabledFeatures = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
static final int TRANSACTION_getKeyguardDisabledFeatures = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
static final int TRANSACTION_setActiveAdmin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
static final int TRANSACTION_isAdminActive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
static final int TRANSACTION_getActiveAdmins = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
static final int TRANSACTION_packageHasActiveAdmins = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
static final int TRANSACTION_getRemoveWarning = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
static final int TRANSACTION_removeActiveAdmin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
static final int TRANSACTION_hasGrantedPolicy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
static final int TRANSACTION_setActivePasswordState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
static final int TRANSACTION_reportFailedPasswordAttempt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 51);
static final int TRANSACTION_reportSuccessfulPasswordAttempt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 52);
static final int TRANSACTION_setDeviceOwner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 53);
static final int TRANSACTION_isDeviceOwner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 54);
static final int TRANSACTION_getDeviceOwner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 55);
static final int TRANSACTION_getDeviceOwnerName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 56);
static final int TRANSACTION_clearDeviceOwner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 57);
static final int TRANSACTION_setProfileOwner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 58);
static final int TRANSACTION_getProfileOwner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 59);
static final int TRANSACTION_getProfileOwnerName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 60);
static final int TRANSACTION_setProfileEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 61);
static final int TRANSACTION_setProfileName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 62);
static final int TRANSACTION_clearProfileOwner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 63);
static final int TRANSACTION_hasUserSetupCompleted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 64);
static final int TRANSACTION_installCaCert = (android.os.IBinder.FIRST_CALL_TRANSACTION + 65);
static final int TRANSACTION_uninstallCaCert = (android.os.IBinder.FIRST_CALL_TRANSACTION + 66);
static final int TRANSACTION_enforceCanManageCaCerts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 67);
static final int TRANSACTION_installKeyPair = (android.os.IBinder.FIRST_CALL_TRANSACTION + 68);
static final int TRANSACTION_addPersistentPreferredActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 69);
static final int TRANSACTION_clearPackagePersistentPreferredActivities = (android.os.IBinder.FIRST_CALL_TRANSACTION + 70);
static final int TRANSACTION_setApplicationRestrictions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 71);
static final int TRANSACTION_getApplicationRestrictions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 72);
static final int TRANSACTION_setRestrictionsProvider = (android.os.IBinder.FIRST_CALL_TRANSACTION + 73);
static final int TRANSACTION_getRestrictionsProvider = (android.os.IBinder.FIRST_CALL_TRANSACTION + 74);
static final int TRANSACTION_setUserRestriction = (android.os.IBinder.FIRST_CALL_TRANSACTION + 75);
static final int TRANSACTION_addCrossProfileIntentFilter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 76);
static final int TRANSACTION_clearCrossProfileIntentFilters = (android.os.IBinder.FIRST_CALL_TRANSACTION + 77);
static final int TRANSACTION_setPermittedAccessibilityServices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 78);
static final int TRANSACTION_getPermittedAccessibilityServices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 79);
static final int TRANSACTION_getPermittedAccessibilityServicesForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 80);
static final int TRANSACTION_setPermittedInputMethods = (android.os.IBinder.FIRST_CALL_TRANSACTION + 81);
static final int TRANSACTION_getPermittedInputMethods = (android.os.IBinder.FIRST_CALL_TRANSACTION + 82);
static final int TRANSACTION_getPermittedInputMethodsForCurrentUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 83);
static final int TRANSACTION_setApplicationHidden = (android.os.IBinder.FIRST_CALL_TRANSACTION + 84);
static final int TRANSACTION_isApplicationHidden = (android.os.IBinder.FIRST_CALL_TRANSACTION + 85);
static final int TRANSACTION_createUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 86);
static final int TRANSACTION_createAndInitializeUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 87);
static final int TRANSACTION_removeUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 88);
static final int TRANSACTION_switchUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 89);
static final int TRANSACTION_enableSystemApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 90);
static final int TRANSACTION_enableSystemAppWithIntent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 91);
static final int TRANSACTION_setAccountManagementDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 92);
static final int TRANSACTION_getAccountTypesWithManagementDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 93);
static final int TRANSACTION_getAccountTypesWithManagementDisabledAsUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 94);
static final int TRANSACTION_setLockTaskPackages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 95);
static final int TRANSACTION_getLockTaskPackages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 96);
static final int TRANSACTION_isLockTaskPermitted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 97);
static final int TRANSACTION_setGlobalSetting = (android.os.IBinder.FIRST_CALL_TRANSACTION + 98);
static final int TRANSACTION_setSecureSetting = (android.os.IBinder.FIRST_CALL_TRANSACTION + 99);
static final int TRANSACTION_setMasterVolumeMuted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 100);
static final int TRANSACTION_isMasterVolumeMuted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 101);
static final int TRANSACTION_notifyLockTaskModeChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 102);
static final int TRANSACTION_setUninstallBlocked = (android.os.IBinder.FIRST_CALL_TRANSACTION + 103);
static final int TRANSACTION_isUninstallBlocked = (android.os.IBinder.FIRST_CALL_TRANSACTION + 104);
static final int TRANSACTION_setCrossProfileCallerIdDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 105);
static final int TRANSACTION_getCrossProfileCallerIdDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 106);
static final int TRANSACTION_getCrossProfileCallerIdDisabledForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 107);
static final int TRANSACTION_setTrustAgentConfiguration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 108);
static final int TRANSACTION_getTrustAgentConfiguration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 109);
static final int TRANSACTION_addCrossProfileWidgetProvider = (android.os.IBinder.FIRST_CALL_TRANSACTION + 110);
static final int TRANSACTION_removeCrossProfileWidgetProvider = (android.os.IBinder.FIRST_CALL_TRANSACTION + 111);
static final int TRANSACTION_getCrossProfileWidgetProviders = (android.os.IBinder.FIRST_CALL_TRANSACTION + 112);
static final int TRANSACTION_setAutoTimeRequired = (android.os.IBinder.FIRST_CALL_TRANSACTION + 113);
static final int TRANSACTION_getAutoTimeRequired = (android.os.IBinder.FIRST_CALL_TRANSACTION + 114);
static final int TRANSACTION_isRemovingAdmin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 115);
}
public void setPasswordQuality(android.content.ComponentName who, int quality, int userHandle) throws android.os.RemoteException;
public int getPasswordQuality(android.content.ComponentName who, int userHandle) throws android.os.RemoteException;
public void setPasswordMinimumLength(android.content.ComponentName who, int length, int userHandle) throws android.os.RemoteException;
public int getPasswordMinimumLength(android.content.ComponentName who, int userHandle) throws android.os.RemoteException;
public void setPasswordMinimumUpperCase(android.content.ComponentName who, int length, int userHandle) throws android.os.RemoteException;
public int getPasswordMinimumUpperCase(android.content.ComponentName who, int userHandle) throws android.os.RemoteException;
public void setPasswordMinimumLowerCase(android.content.ComponentName who, int length, int userHandle) throws android.os.RemoteException;
public int getPasswordMinimumLowerCase(android.content.ComponentName who, int userHandle) throws android.os.RemoteException;
public void setPasswordMinimumLetters(android.content.ComponentName who, int length, int userHandle) throws android.os.RemoteException;
public int getPasswordMinimumLetters(android.content.ComponentName who, int userHandle) throws android.os.RemoteException;
public void setPasswordMinimumNumeric(android.content.ComponentName who, int length, int userHandle) throws android.os.RemoteException;
public int getPasswordMinimumNumeric(android.content.ComponentName who, int userHandle) throws android.os.RemoteException;
public void setPasswordMinimumSymbols(android.content.ComponentName who, int length, int userHandle) throws android.os.RemoteException;
public int getPasswordMinimumSymbols(android.content.ComponentName who, int userHandle) throws android.os.RemoteException;
public void setPasswordMinimumNonLetter(android.content.ComponentName who, int length, int userHandle) throws android.os.RemoteException;
public int getPasswordMinimumNonLetter(android.content.ComponentName who, int userHandle) throws android.os.RemoteException;
public void setPasswordHistoryLength(android.content.ComponentName who, int length, int userHandle) throws android.os.RemoteException;
public int getPasswordHistoryLength(android.content.ComponentName who, int userHandle) throws android.os.RemoteException;
public void setPasswordExpirationTimeout(android.content.ComponentName who, long expiration, int userHandle) throws android.os.RemoteException;
public long getPasswordExpirationTimeout(android.content.ComponentName who, int userHandle) throws android.os.RemoteException;
public long getPasswordExpiration(android.content.ComponentName who, int userHandle) throws android.os.RemoteException;
public boolean isActivePasswordSufficient(int userHandle) throws android.os.RemoteException;
public int getCurrentFailedPasswordAttempts(int userHandle) throws android.os.RemoteException;
public int getProfileWithMinimumFailedPasswordsForWipe(int userHandle) throws android.os.RemoteException;
public void setMaximumFailedPasswordsForWipe(android.content.ComponentName admin, int num, int userHandle) throws android.os.RemoteException;
public int getMaximumFailedPasswordsForWipe(android.content.ComponentName admin, int userHandle) throws android.os.RemoteException;
public boolean resetPassword(java.lang.String password, int flags, int userHandle) throws android.os.RemoteException;
public void setMaximumTimeToLock(android.content.ComponentName who, long timeMs, int userHandle) throws android.os.RemoteException;
public long getMaximumTimeToLock(android.content.ComponentName who, int userHandle) throws android.os.RemoteException;
public void lockNow() throws android.os.RemoteException;
public void wipeData(int flags, int userHandle) throws android.os.RemoteException;
public android.content.ComponentName setGlobalProxy(android.content.ComponentName admin, java.lang.String proxySpec, java.lang.String exclusionList, int userHandle) throws android.os.RemoteException;
public android.content.ComponentName getGlobalProxyAdmin(int userHandle) throws android.os.RemoteException;
public void setRecommendedGlobalProxy(android.content.ComponentName admin, android.net.ProxyInfo proxyInfo) throws android.os.RemoteException;
public int setStorageEncryption(android.content.ComponentName who, boolean encrypt, int userHandle) throws android.os.RemoteException;
public boolean getStorageEncryption(android.content.ComponentName who, int userHandle) throws android.os.RemoteException;
public int getStorageEncryptionStatus(int userHandle) throws android.os.RemoteException;
public void setCameraDisabled(android.content.ComponentName who, boolean disabled, int userHandle) throws android.os.RemoteException;
public boolean getCameraDisabled(android.content.ComponentName who, int userHandle) throws android.os.RemoteException;
public void setScreenCaptureDisabled(android.content.ComponentName who, int userHandle, boolean disabled) throws android.os.RemoteException;
public boolean getScreenCaptureDisabled(android.content.ComponentName who, int userHandle) throws android.os.RemoteException;
public void setKeyguardDisabledFeatures(android.content.ComponentName who, int which, int userHandle) throws android.os.RemoteException;
public int getKeyguardDisabledFeatures(android.content.ComponentName who, int userHandle) throws android.os.RemoteException;
public void setActiveAdmin(android.content.ComponentName policyReceiver, boolean refreshing, int userHandle) throws android.os.RemoteException;
public boolean isAdminActive(android.content.ComponentName policyReceiver, int userHandle) throws android.os.RemoteException;
public java.util.List<android.content.ComponentName> getActiveAdmins(int userHandle) throws android.os.RemoteException;
public boolean packageHasActiveAdmins(java.lang.String packageName, int userHandle) throws android.os.RemoteException;
public void getRemoveWarning(android.content.ComponentName policyReceiver, android.os.RemoteCallback result, int userHandle) throws android.os.RemoteException;
public void removeActiveAdmin(android.content.ComponentName policyReceiver, int userHandle) throws android.os.RemoteException;
public boolean hasGrantedPolicy(android.content.ComponentName policyReceiver, int usesPolicy, int userHandle) throws android.os.RemoteException;
public void setActivePasswordState(int quality, int length, int letters, int uppercase, int lowercase, int numbers, int symbols, int nonletter, int userHandle) throws android.os.RemoteException;
public void reportFailedPasswordAttempt(int userHandle) throws android.os.RemoteException;
public void reportSuccessfulPasswordAttempt(int userHandle) throws android.os.RemoteException;
public boolean setDeviceOwner(java.lang.String packageName, java.lang.String ownerName) throws android.os.RemoteException;
public boolean isDeviceOwner(java.lang.String packageName) throws android.os.RemoteException;
public java.lang.String getDeviceOwner() throws android.os.RemoteException;
public java.lang.String getDeviceOwnerName() throws android.os.RemoteException;
public void clearDeviceOwner(java.lang.String packageName) throws android.os.RemoteException;
public boolean setProfileOwner(android.content.ComponentName who, java.lang.String ownerName, int userHandle) throws android.os.RemoteException;
public android.content.ComponentName getProfileOwner(int userHandle) throws android.os.RemoteException;
public java.lang.String getProfileOwnerName(int userHandle) throws android.os.RemoteException;
public void setProfileEnabled(android.content.ComponentName who) throws android.os.RemoteException;
public void setProfileName(android.content.ComponentName who, java.lang.String profileName) throws android.os.RemoteException;
public void clearProfileOwner(android.content.ComponentName who) throws android.os.RemoteException;
public boolean hasUserSetupCompleted() throws android.os.RemoteException;
public boolean installCaCert(android.content.ComponentName admin, byte[] certBuffer) throws android.os.RemoteException;
public void uninstallCaCert(android.content.ComponentName admin, java.lang.String alias) throws android.os.RemoteException;
public void enforceCanManageCaCerts(android.content.ComponentName admin) throws android.os.RemoteException;
public boolean installKeyPair(android.content.ComponentName who, byte[] privKeyBuffer, byte[] certBuffer, java.lang.String alias) throws android.os.RemoteException;
public void addPersistentPreferredActivity(android.content.ComponentName admin, android.content.IntentFilter filter, android.content.ComponentName activity) throws android.os.RemoteException;
public void clearPackagePersistentPreferredActivities(android.content.ComponentName admin, java.lang.String packageName) throws android.os.RemoteException;
public void setApplicationRestrictions(android.content.ComponentName who, java.lang.String packageName, android.os.Bundle settings) throws android.os.RemoteException;
public android.os.Bundle getApplicationRestrictions(android.content.ComponentName who, java.lang.String packageName) throws android.os.RemoteException;
public void setRestrictionsProvider(android.content.ComponentName who, android.content.ComponentName provider) throws android.os.RemoteException;
public android.content.ComponentName getRestrictionsProvider(int userHandle) throws android.os.RemoteException;
public void setUserRestriction(android.content.ComponentName who, java.lang.String key, boolean enable) throws android.os.RemoteException;
public void addCrossProfileIntentFilter(android.content.ComponentName admin, android.content.IntentFilter filter, int flags) throws android.os.RemoteException;
public void clearCrossProfileIntentFilters(android.content.ComponentName admin) throws android.os.RemoteException;
public boolean setPermittedAccessibilityServices(android.content.ComponentName admin, java.util.List packageList) throws android.os.RemoteException;
public java.util.List getPermittedAccessibilityServices(android.content.ComponentName admin) throws android.os.RemoteException;
public java.util.List getPermittedAccessibilityServicesForUser(int userId) throws android.os.RemoteException;
public boolean setPermittedInputMethods(android.content.ComponentName admin, java.util.List packageList) throws android.os.RemoteException;
public java.util.List getPermittedInputMethods(android.content.ComponentName admin) throws android.os.RemoteException;
public java.util.List getPermittedInputMethodsForCurrentUser() throws android.os.RemoteException;
public boolean setApplicationHidden(android.content.ComponentName admin, java.lang.String packageName, boolean hidden) throws android.os.RemoteException;
public boolean isApplicationHidden(android.content.ComponentName admin, java.lang.String packageName) throws android.os.RemoteException;
public android.os.UserHandle createUser(android.content.ComponentName who, java.lang.String name) throws android.os.RemoteException;
public android.os.UserHandle createAndInitializeUser(android.content.ComponentName who, java.lang.String name, java.lang.String profileOwnerName, android.content.ComponentName profileOwnerComponent, android.os.Bundle adminExtras) throws android.os.RemoteException;
public boolean removeUser(android.content.ComponentName who, android.os.UserHandle userHandle) throws android.os.RemoteException;
public boolean switchUser(android.content.ComponentName who, android.os.UserHandle userHandle) throws android.os.RemoteException;
public void enableSystemApp(android.content.ComponentName admin, java.lang.String packageName) throws android.os.RemoteException;
public int enableSystemAppWithIntent(android.content.ComponentName admin, android.content.Intent intent) throws android.os.RemoteException;
public void setAccountManagementDisabled(android.content.ComponentName who, java.lang.String accountType, boolean disabled) throws android.os.RemoteException;
public java.lang.String[] getAccountTypesWithManagementDisabled() throws android.os.RemoteException;
public java.lang.String[] getAccountTypesWithManagementDisabledAsUser(int userId) throws android.os.RemoteException;
public void setLockTaskPackages(android.content.ComponentName who, java.lang.String[] packages) throws android.os.RemoteException;
public java.lang.String[] getLockTaskPackages(android.content.ComponentName who) throws android.os.RemoteException;
public boolean isLockTaskPermitted(java.lang.String pkg) throws android.os.RemoteException;
public void setGlobalSetting(android.content.ComponentName who, java.lang.String setting, java.lang.String value) throws android.os.RemoteException;
public void setSecureSetting(android.content.ComponentName who, java.lang.String setting, java.lang.String value) throws android.os.RemoteException;
public void setMasterVolumeMuted(android.content.ComponentName admin, boolean on) throws android.os.RemoteException;
public boolean isMasterVolumeMuted(android.content.ComponentName admin) throws android.os.RemoteException;
public void notifyLockTaskModeChanged(boolean isEnabled, java.lang.String pkg, int userId) throws android.os.RemoteException;
public void setUninstallBlocked(android.content.ComponentName admin, java.lang.String packageName, boolean uninstallBlocked) throws android.os.RemoteException;
public boolean isUninstallBlocked(android.content.ComponentName admin, java.lang.String packageName) throws android.os.RemoteException;
public void setCrossProfileCallerIdDisabled(android.content.ComponentName who, boolean disabled) throws android.os.RemoteException;
public boolean getCrossProfileCallerIdDisabled(android.content.ComponentName who) throws android.os.RemoteException;
public boolean getCrossProfileCallerIdDisabledForUser(int userId) throws android.os.RemoteException;
public void setTrustAgentConfiguration(android.content.ComponentName admin, android.content.ComponentName agent, android.os.PersistableBundle args, int userId) throws android.os.RemoteException;
public java.util.List<android.os.PersistableBundle> getTrustAgentConfiguration(android.content.ComponentName admin, android.content.ComponentName agent, int userId) throws android.os.RemoteException;
public boolean addCrossProfileWidgetProvider(android.content.ComponentName admin, java.lang.String packageName) throws android.os.RemoteException;
public boolean removeCrossProfileWidgetProvider(android.content.ComponentName admin, java.lang.String packageName) throws android.os.RemoteException;
public java.util.List<java.lang.String> getCrossProfileWidgetProviders(android.content.ComponentName admin) throws android.os.RemoteException;
public void setAutoTimeRequired(android.content.ComponentName who, int userHandle, boolean required) throws android.os.RemoteException;
public boolean getAutoTimeRequired() throws android.os.RemoteException;
public boolean isRemovingAdmin(android.content.ComponentName adminReceiver, int userHandle) throws android.os.RemoteException;
}
