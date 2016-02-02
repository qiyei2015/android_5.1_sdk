/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/view/IWindowManager.aidl
 */
package android.view;
/**
 * System private interface to the window manager.
 *
 * {@hide}
 */
public interface IWindowManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.view.IWindowManager
{
private static final java.lang.String DESCRIPTOR = "android.view.IWindowManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.view.IWindowManager interface,
 * generating a proxy if needed.
 */
public static android.view.IWindowManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.view.IWindowManager))) {
return ((android.view.IWindowManager)iin);
}
return new android.view.IWindowManager.Stub.Proxy(obj);
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
case TRANSACTION_startViewServer:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.startViewServer(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_stopViewServer:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.stopViewServer();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isViewServerRunning:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isViewServerRunning();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_openSession:
{
data.enforceInterface(DESCRIPTOR);
android.view.IWindowSessionCallback _arg0;
_arg0 = android.view.IWindowSessionCallback.Stub.asInterface(data.readStrongBinder());
com.android.internal.view.IInputMethodClient _arg1;
_arg1 = com.android.internal.view.IInputMethodClient.Stub.asInterface(data.readStrongBinder());
com.android.internal.view.IInputContext _arg2;
_arg2 = com.android.internal.view.IInputContext.Stub.asInterface(data.readStrongBinder());
android.view.IWindowSession _result = this.openSession(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_inputMethodClientHasFocus:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.view.IInputMethodClient _arg0;
_arg0 = com.android.internal.view.IInputMethodClient.Stub.asInterface(data.readStrongBinder());
boolean _result = this.inputMethodClientHasFocus(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getInitialDisplaySize:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.graphics.Point _arg1;
_arg1 = new android.graphics.Point();
this.getInitialDisplaySize(_arg0, _arg1);
reply.writeNoException();
if ((_arg1!=null)) {
reply.writeInt(1);
_arg1.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getBaseDisplaySize:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.graphics.Point _arg1;
_arg1 = new android.graphics.Point();
this.getBaseDisplaySize(_arg0, _arg1);
reply.writeNoException();
if ((_arg1!=null)) {
reply.writeInt(1);
_arg1.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_setForcedDisplaySize:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setForcedDisplaySize(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_clearForcedDisplaySize:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.clearForcedDisplaySize(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getInitialDisplayDensity:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getInitialDisplayDensity(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getBaseDisplayDensity:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getBaseDisplayDensity(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setForcedDisplayDensity:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.setForcedDisplayDensity(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_clearForcedDisplayDensity:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.clearForcedDisplayDensity(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setOverscan:
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
this.setOverscan(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_dispatchMouse:
{
data.enforceInterface(DESCRIPTOR);
float _arg0;
_arg0 = data.readFloat();
float _arg1;
_arg1 = data.readFloat();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.dispatchMouse(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_dispatchMouseByCd:
{
data.enforceInterface(DESCRIPTOR);
float _arg0;
_arg0 = data.readFloat();
float _arg1;
_arg1 = data.readFloat();
this.dispatchMouseByCd(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_pauseKeyDispatching:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.pauseKeyDispatching(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_resumeKeyDispatching:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.resumeKeyDispatching(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setEventDispatching:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setEventDispatching(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_addWindowToken:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
this.addWindowToken(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_removeWindowToken:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.removeWindowToken(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_addAppToken:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.view.IApplicationToken _arg1;
_arg1 = android.view.IApplicationToken.Stub.asInterface(data.readStrongBinder());
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
boolean _arg5;
_arg5 = (0!=data.readInt());
boolean _arg6;
_arg6 = (0!=data.readInt());
int _arg7;
_arg7 = data.readInt();
int _arg8;
_arg8 = data.readInt();
boolean _arg9;
_arg9 = (0!=data.readInt());
boolean _arg10;
_arg10 = (0!=data.readInt());
this.addAppToken(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9, _arg10);
reply.writeNoException();
return true;
}
case TRANSACTION_setAppGroupId:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
this.setAppGroupId(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setAppOrientation:
{
data.enforceInterface(DESCRIPTOR);
android.view.IApplicationToken _arg0;
_arg0 = android.view.IApplicationToken.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.setAppOrientation(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getAppOrientation:
{
data.enforceInterface(DESCRIPTOR);
android.view.IApplicationToken _arg0;
_arg0 = android.view.IApplicationToken.Stub.asInterface(data.readStrongBinder());
int _result = this.getAppOrientation(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setFocusedApp:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setFocusedApp(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_prepareAppTransition:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.prepareAppTransition(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getPendingAppTransition:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getPendingAppTransition();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_overridePendingAppTransition:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
android.os.IRemoteCallback _arg3;
_arg3 = android.os.IRemoteCallback.Stub.asInterface(data.readStrongBinder());
this.overridePendingAppTransition(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_overridePendingAppTransitionScaleUp:
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
this.overridePendingAppTransitionScaleUp(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_overridePendingAppTransitionThumb:
{
data.enforceInterface(DESCRIPTOR);
android.graphics.Bitmap _arg0;
if ((0!=data.readInt())) {
_arg0 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
android.os.IRemoteCallback _arg3;
_arg3 = android.os.IRemoteCallback.Stub.asInterface(data.readStrongBinder());
boolean _arg4;
_arg4 = (0!=data.readInt());
this.overridePendingAppTransitionThumb(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_overridePendingAppTransitionAspectScaledThumb:
{
data.enforceInterface(DESCRIPTOR);
android.graphics.Bitmap _arg0;
if ((0!=data.readInt())) {
_arg0 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
android.os.IRemoteCallback _arg5;
_arg5 = android.os.IRemoteCallback.Stub.asInterface(data.readStrongBinder());
boolean _arg6;
_arg6 = (0!=data.readInt());
this.overridePendingAppTransitionAspectScaledThumb(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
return true;
}
case TRANSACTION_overridePendingAppTransitionInPlace:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.overridePendingAppTransitionInPlace(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_executeAppTransition:
{
data.enforceInterface(DESCRIPTOR);
this.executeAppTransition();
reply.writeNoException();
return true;
}
case TRANSACTION_setAppStartingWindow:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
android.content.res.CompatibilityInfo _arg3;
if ((0!=data.readInt())) {
_arg3 = android.content.res.CompatibilityInfo.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
java.lang.CharSequence _arg4;
if ((0!=data.readInt())) {
_arg4 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
int _arg5;
_arg5 = data.readInt();
int _arg6;
_arg6 = data.readInt();
int _arg7;
_arg7 = data.readInt();
int _arg8;
_arg8 = data.readInt();
android.os.IBinder _arg9;
_arg9 = data.readStrongBinder();
boolean _arg10;
_arg10 = (0!=data.readInt());
int _arg11;
_arg11 = data.readInt();
this.setAppStartingWindow(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9, _arg10, _arg11);
reply.writeNoException();
return true;
}
case TRANSACTION_setAppWillBeHidden:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.setAppWillBeHidden(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setAppVisibility:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setAppVisibility(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_startAppFreezingScreen:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
this.startAppFreezingScreen(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_stopAppFreezingScreen:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.stopAppFreezingScreen(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_removeAppToken:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.removeAppToken(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_updateOrientationFromAppTokens:
{
data.enforceInterface(DESCRIPTOR);
android.content.res.Configuration _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.res.Configuration.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
android.content.res.Configuration _result = this.updateOrientationFromAppTokens(_arg0, _arg1);
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
case TRANSACTION_setNewConfiguration:
{
data.enforceInterface(DESCRIPTOR);
android.content.res.Configuration _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.res.Configuration.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setNewConfiguration(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_startFreezingScreen:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.startFreezingScreen(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_stopFreezingScreen:
{
data.enforceInterface(DESCRIPTOR);
this.stopFreezingScreen();
reply.writeNoException();
return true;
}
case TRANSACTION_disableKeyguard:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
java.lang.String _arg1;
_arg1 = data.readString();
this.disableKeyguard(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_reenableKeyguard:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.reenableKeyguard(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_exitKeyguardSecurely:
{
data.enforceInterface(DESCRIPTOR);
android.view.IOnKeyguardExitResult _arg0;
_arg0 = android.view.IOnKeyguardExitResult.Stub.asInterface(data.readStrongBinder());
this.exitKeyguardSecurely(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isKeyguardLocked:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isKeyguardLocked();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isKeyguardSecure:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isKeyguardSecure();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_inKeyguardRestrictedInputMode:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.inKeyguardRestrictedInputMode();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_dismissKeyguard:
{
data.enforceInterface(DESCRIPTOR);
this.dismissKeyguard();
reply.writeNoException();
return true;
}
case TRANSACTION_keyguardGoingAway:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _arg1;
_arg1 = (0!=data.readInt());
this.keyguardGoingAway(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_closeSystemDialogs:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.closeSystemDialogs(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getAnimationScale:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
float _result = this.getAnimationScale(_arg0);
reply.writeNoException();
reply.writeFloat(_result);
return true;
}
case TRANSACTION_getAnimationScales:
{
data.enforceInterface(DESCRIPTOR);
float[] _result = this.getAnimationScales();
reply.writeNoException();
reply.writeFloatArray(_result);
return true;
}
case TRANSACTION_setAnimationScale:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
float _arg1;
_arg1 = data.readFloat();
this.setAnimationScale(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setAnimationScales:
{
data.enforceInterface(DESCRIPTOR);
float[] _arg0;
_arg0 = data.createFloatArray();
this.setAnimationScales(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getCurrentAnimatorScale:
{
data.enforceInterface(DESCRIPTOR);
float _result = this.getCurrentAnimatorScale();
reply.writeNoException();
reply.writeFloat(_result);
return true;
}
case TRANSACTION_setInTouchMode:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setInTouchMode(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_showStrictModeViolation:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.showStrictModeViolation(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setStrictModeVisualIndicatorPreference:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.setStrictModeVisualIndicatorPreference(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setScreenCaptureDisabled:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setScreenCaptureDisabled(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_updateRotation:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _arg1;
_arg1 = (0!=data.readInt());
this.updateRotation(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_updateSurfacesAlpha:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.updateSurfacesAlpha(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_multiWindowUsed:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.multiWindowUsed(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isMultiWindowMode:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isMultiWindowMode();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_updateAllWindowsPositionStretch:
{
data.enforceInterface(DESCRIPTOR);
this.updateAllWindowsPositionStretch();
reply.writeNoException();
return true;
}
case TRANSACTION_updateAllWindowsPositionCompose:
{
data.enforceInterface(DESCRIPTOR);
this.updateAllWindowsPositionCompose();
reply.writeNoException();
return true;
}
case TRANSACTION_updateAllWindowsFullScreenMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.updateAllWindowsFullScreenMode(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_updateAllWindowsHalfScreenMode:
{
data.enforceInterface(DESCRIPTOR);
this.updateAllWindowsHalfScreenMode();
reply.writeNoException();
return true;
}
case TRANSACTION_updateAllWindowsFourScreenMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.updateAllWindowsFourScreenMode(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_multiWindowMenuOperation:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.multiWindowMenuOperation(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_dispatchUnhandledKey:
{
data.enforceInterface(DESCRIPTOR);
android.view.IApplicationToken _arg0;
_arg0 = android.view.IApplicationToken.Stub.asInterface(data.readStrongBinder());
android.view.KeyEvent _arg1;
if ((0!=data.readInt())) {
_arg1 = android.view.KeyEvent.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.dispatchUnhandledKey(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getRotation:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getRotation();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_watchRotation:
{
data.enforceInterface(DESCRIPTOR);
android.view.IRotationWatcher _arg0;
_arg0 = android.view.IRotationWatcher.Stub.asInterface(data.readStrongBinder());
int _result = this.watchRotation(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_removeRotationWatcher:
{
data.enforceInterface(DESCRIPTOR);
android.view.IRotationWatcher _arg0;
_arg0 = android.view.IRotationWatcher.Stub.asInterface(data.readStrongBinder());
this.removeRotationWatcher(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getPreferredOptionsPanelGravity:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getPreferredOptionsPanelGravity();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_freezeRotation:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.freezeRotation(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_thawRotation:
{
data.enforceInterface(DESCRIPTOR);
this.thawRotation();
reply.writeNoException();
return true;
}
case TRANSACTION_isRotationFrozen:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isRotationFrozen();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_screenshotApplications:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
boolean _arg4;
_arg4 = (0!=data.readInt());
android.graphics.Bitmap _result = this.screenshotApplications(_arg0, _arg1, _arg2, _arg3, _arg4);
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
case TRANSACTION_statusBarVisibilityChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.statusBarVisibilityChanged(_arg0);
return true;
}
case TRANSACTION_hasNavigationBar:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.hasNavigationBar();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_lockNow:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.lockNow(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isSafeModeEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isSafeModeEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_enableScreenIfNeeded:
{
data.enforceInterface(DESCRIPTOR);
this.enableScreenIfNeeded();
reply.writeNoException();
return true;
}
case TRANSACTION_clearWindowContentFrameStats:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _result = this.clearWindowContentFrameStats(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getWindowContentFrameStats:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.view.WindowContentFrameStats _result = this.getWindowContentFrameStats(_arg0);
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
case TRANSACTION_getRemoteSensorManager:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.ISensorManager _result = this.getRemoteSensorManager();
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_setJoyStick:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _arg1;
_arg1 = data.createIntArray();
int[] _arg2;
_arg2 = data.createIntArray();
this.setJoyStick(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_changeTitleBar:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.changeTitleBar(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_countHalf:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.countHalf(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_isHardKeyboardA:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isHardKeyboardA();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isTaskShowInExtendDisplay:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _result = this.isTaskShowInExtendDisplay(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_updateDisplayShowSynchronization:
{
data.enforceInterface(DESCRIPTOR);
this.updateDisplayShowSynchronization();
reply.writeNoException();
return true;
}
case TRANSACTION_moveWindowToSecondDisplay:
{
data.enforceInterface(DESCRIPTOR);
this.moveWindowToSecondDisplay();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.view.IWindowManager
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
/**
     * ===== NOTICE =====
     * The first three methods must remain the first three methods. Scripts
     * and tools rely on their transaction number to work properly.
     */// This is used for debugging

@Override public boolean startViewServer(int port) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(port);
mRemote.transact(Stub.TRANSACTION_startViewServer, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Transaction #1

@Override public boolean stopViewServer() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopViewServer, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Transaction #2

@Override public boolean isViewServerRunning() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isViewServerRunning, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Transaction #3

@Override public android.view.IWindowSession openSession(android.view.IWindowSessionCallback callback, com.android.internal.view.IInputMethodClient client, com.android.internal.view.IInputContext inputContext) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.view.IWindowSession _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
_data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
_data.writeStrongBinder((((inputContext!=null))?(inputContext.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_openSession, _data, _reply, 0);
_reply.readException();
_result = android.view.IWindowSession.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean inputMethodClientHasFocus(com.android.internal.view.IInputMethodClient client) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_inputMethodClientHasFocus, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void getInitialDisplaySize(int displayId, android.graphics.Point size) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(displayId);
mRemote.transact(Stub.TRANSACTION_getInitialDisplaySize, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
size.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void getBaseDisplaySize(int displayId, android.graphics.Point size) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(displayId);
mRemote.transact(Stub.TRANSACTION_getBaseDisplaySize, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
size.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setForcedDisplaySize(int displayId, int width, int height) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(displayId);
_data.writeInt(width);
_data.writeInt(height);
mRemote.transact(Stub.TRANSACTION_setForcedDisplaySize, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearForcedDisplaySize(int displayId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(displayId);
mRemote.transact(Stub.TRANSACTION_clearForcedDisplaySize, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getInitialDisplayDensity(int displayId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(displayId);
mRemote.transact(Stub.TRANSACTION_getInitialDisplayDensity, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getBaseDisplayDensity(int displayId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(displayId);
mRemote.transact(Stub.TRANSACTION_getBaseDisplayDensity, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setForcedDisplayDensity(int displayId, int density) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(displayId);
_data.writeInt(density);
mRemote.transact(Stub.TRANSACTION_setForcedDisplayDensity, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearForcedDisplayDensity(int displayId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(displayId);
mRemote.transact(Stub.TRANSACTION_clearForcedDisplayDensity, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setOverscan(int displayId, int left, int top, int right, int bottom) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(displayId);
_data.writeInt(left);
_data.writeInt(top);
_data.writeInt(right);
_data.writeInt(bottom);
mRemote.transact(Stub.TRANSACTION_setOverscan, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
//interfaces for mouse keyevent input

@Override public void dispatchMouse(float x, float y, int w, int h) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeFloat(x);
_data.writeFloat(y);
_data.writeInt(w);
_data.writeInt(h);
mRemote.transact(Stub.TRANSACTION_dispatchMouse, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void dispatchMouseByCd(float x, float y) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeFloat(x);
_data.writeFloat(y);
mRemote.transact(Stub.TRANSACTION_dispatchMouseByCd, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// These can only be called when holding the MANAGE_APP_TOKENS permission.

@Override public void pauseKeyDispatching(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_pauseKeyDispatching, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void resumeKeyDispatching(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_resumeKeyDispatching, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setEventDispatching(boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setEventDispatching, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void addWindowToken(android.os.IBinder token, int type) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(type);
mRemote.transact(Stub.TRANSACTION_addWindowToken, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeWindowToken(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_removeWindowToken, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void addAppToken(int addPos, android.view.IApplicationToken token, int groupId, int stackId, int requestedOrientation, boolean fullscreen, boolean showWhenLocked, int userId, int configChanges, boolean voiceInteraction, boolean launchTaskBehind) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(addPos);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeInt(groupId);
_data.writeInt(stackId);
_data.writeInt(requestedOrientation);
_data.writeInt(((fullscreen)?(1):(0)));
_data.writeInt(((showWhenLocked)?(1):(0)));
_data.writeInt(userId);
_data.writeInt(configChanges);
_data.writeInt(((voiceInteraction)?(1):(0)));
_data.writeInt(((launchTaskBehind)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_addAppToken, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setAppGroupId(android.os.IBinder token, int groupId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(groupId);
mRemote.transact(Stub.TRANSACTION_setAppGroupId, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setAppOrientation(android.view.IApplicationToken token, int requestedOrientation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeInt(requestedOrientation);
mRemote.transact(Stub.TRANSACTION_setAppOrientation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getAppOrientation(android.view.IApplicationToken token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getAppOrientation, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setFocusedApp(android.os.IBinder token, boolean moveFocusNow) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(((moveFocusNow)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setFocusedApp, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void prepareAppTransition(int transit, boolean alwaysKeepCurrent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(transit);
_data.writeInt(((alwaysKeepCurrent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_prepareAppTransition, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPendingAppTransition() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPendingAppTransition, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void overridePendingAppTransition(java.lang.String packageName, int enterAnim, int exitAnim, android.os.IRemoteCallback startedCallback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(enterAnim);
_data.writeInt(exitAnim);
_data.writeStrongBinder((((startedCallback!=null))?(startedCallback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_overridePendingAppTransition, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void overridePendingAppTransitionScaleUp(int startX, int startY, int startWidth, int startHeight) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(startX);
_data.writeInt(startY);
_data.writeInt(startWidth);
_data.writeInt(startHeight);
mRemote.transact(Stub.TRANSACTION_overridePendingAppTransitionScaleUp, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void overridePendingAppTransitionThumb(android.graphics.Bitmap srcThumb, int startX, int startY, android.os.IRemoteCallback startedCallback, boolean scaleUp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((srcThumb!=null)) {
_data.writeInt(1);
srcThumb.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(startX);
_data.writeInt(startY);
_data.writeStrongBinder((((startedCallback!=null))?(startedCallback.asBinder()):(null)));
_data.writeInt(((scaleUp)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_overridePendingAppTransitionThumb, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void overridePendingAppTransitionAspectScaledThumb(android.graphics.Bitmap srcThumb, int startX, int startY, int targetWidth, int targetHeight, android.os.IRemoteCallback startedCallback, boolean scaleUp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((srcThumb!=null)) {
_data.writeInt(1);
srcThumb.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(startX);
_data.writeInt(startY);
_data.writeInt(targetWidth);
_data.writeInt(targetHeight);
_data.writeStrongBinder((((startedCallback!=null))?(startedCallback.asBinder()):(null)));
_data.writeInt(((scaleUp)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_overridePendingAppTransitionAspectScaledThumb, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void overridePendingAppTransitionInPlace(java.lang.String packageName, int anim) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(anim);
mRemote.transact(Stub.TRANSACTION_overridePendingAppTransitionInPlace, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void executeAppTransition() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_executeAppTransition, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setAppStartingWindow(android.os.IBinder token, java.lang.String pkg, int theme, android.content.res.CompatibilityInfo compatInfo, java.lang.CharSequence nonLocalizedLabel, int labelRes, int icon, int logo, int windowFlags, android.os.IBinder transferFrom, boolean createIfNeeded, int align) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeString(pkg);
_data.writeInt(theme);
if ((compatInfo!=null)) {
_data.writeInt(1);
compatInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((nonLocalizedLabel!=null)) {
_data.writeInt(1);
android.text.TextUtils.writeToParcel(nonLocalizedLabel, _data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(labelRes);
_data.writeInt(icon);
_data.writeInt(logo);
_data.writeInt(windowFlags);
_data.writeStrongBinder(transferFrom);
_data.writeInt(((createIfNeeded)?(1):(0)));
_data.writeInt(align);
mRemote.transact(Stub.TRANSACTION_setAppStartingWindow, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setAppWillBeHidden(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_setAppWillBeHidden, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setAppVisibility(android.os.IBinder token, boolean visible) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(((visible)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setAppVisibility, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void startAppFreezingScreen(android.os.IBinder token, int configChanges) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(configChanges);
mRemote.transact(Stub.TRANSACTION_startAppFreezingScreen, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopAppFreezingScreen(android.os.IBinder token, boolean force) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(((force)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_stopAppFreezingScreen, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeAppToken(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_removeAppToken, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Re-evaluate the current orientation from the caller's state.
// If there is a change, the new Configuration is returned and the
// caller must call setNewConfiguration() sometime later.

@Override public android.content.res.Configuration updateOrientationFromAppTokens(android.content.res.Configuration currentConfig, android.os.IBinder freezeThisOneIfNeeded) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.res.Configuration _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((currentConfig!=null)) {
_data.writeInt(1);
currentConfig.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder(freezeThisOneIfNeeded);
mRemote.transact(Stub.TRANSACTION_updateOrientationFromAppTokens, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.res.Configuration.CREATOR.createFromParcel(_reply);
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
@Override public void setNewConfiguration(android.content.res.Configuration config) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((config!=null)) {
_data.writeInt(1);
config.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setNewConfiguration, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void startFreezingScreen(int exitAnim, int enterAnim) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(exitAnim);
_data.writeInt(enterAnim);
mRemote.transact(Stub.TRANSACTION_startFreezingScreen, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopFreezingScreen() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopFreezingScreen, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// these require DISABLE_KEYGUARD permission

@Override public void disableKeyguard(android.os.IBinder token, java.lang.String tag) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeString(tag);
mRemote.transact(Stub.TRANSACTION_disableKeyguard, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void reenableKeyguard(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_reenableKeyguard, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void exitKeyguardSecurely(android.view.IOnKeyguardExitResult callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_exitKeyguardSecurely, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isKeyguardLocked() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isKeyguardLocked, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isKeyguardSecure() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isKeyguardSecure, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean inKeyguardRestrictedInputMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_inKeyguardRestrictedInputMode, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void dismissKeyguard() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_dismissKeyguard, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void keyguardGoingAway(boolean disableWindowAnimations, boolean keyguardGoingToNotificationShade) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((disableWindowAnimations)?(1):(0)));
_data.writeInt(((keyguardGoingToNotificationShade)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_keyguardGoingAway, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void closeSystemDialogs(java.lang.String reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(reason);
mRemote.transact(Stub.TRANSACTION_closeSystemDialogs, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// These can only be called with the SET_ANIMATON_SCALE permission.

@Override public float getAnimationScale(int which) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
float _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(which);
mRemote.transact(Stub.TRANSACTION_getAnimationScale, _data, _reply, 0);
_reply.readException();
_result = _reply.readFloat();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public float[] getAnimationScales() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
float[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAnimationScales, _data, _reply, 0);
_reply.readException();
_result = _reply.createFloatArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setAnimationScale(int which, float scale) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(which);
_data.writeFloat(scale);
mRemote.transact(Stub.TRANSACTION_setAnimationScale, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setAnimationScales(float[] scales) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeFloatArray(scales);
mRemote.transact(Stub.TRANSACTION_setAnimationScales, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public float getCurrentAnimatorScale() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
float _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCurrentAnimatorScale, _data, _reply, 0);
_reply.readException();
_result = _reply.readFloat();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// For testing

@Override public void setInTouchMode(boolean showFocus) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((showFocus)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setInTouchMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// For StrictMode flashing a red border on violations from the UI
// thread.  The uid/pid is implicit from the Binder call, and the Window
// Manager uses that to determine whether or not the red border should
// actually be shown.  (it will be ignored that pid doesn't have windows
// on screen)

@Override public void showStrictModeViolation(boolean on) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((on)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_showStrictModeViolation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Proxy to set the system property for whether the flashing
// should be enabled.  The 'enabled' value is null or blank for
// the system default (differs per build variant) or any valid
// boolean string as parsed by SystemProperties.getBoolean().

@Override public void setStrictModeVisualIndicatorPreference(java.lang.String enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(enabled);
mRemote.transact(Stub.TRANSACTION_setStrictModeVisualIndicatorPreference, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Set whether screen capture is disabled for all windows of a specific user
     */
@Override public void setScreenCaptureDisabled(int userId, boolean disabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
_data.writeInt(((disabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setScreenCaptureDisabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// These can only be called with the SET_ORIENTATION permission.
/**
     * Update the current screen rotation based on the current state of
     * the world.
     * @param alwaysSendConfiguration Flag to force a new configuration to
     * be evaluated.  This can be used when there are other parameters in
     * configuration that are changing.
     * @param forceRelayout If true, the window manager will always do a relayout
     * of its windows even if the rotation hasn't changed.
     */
@Override public void updateRotation(boolean alwaysSendConfiguration, boolean forceRelayout) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((alwaysSendConfiguration)?(1):(0)));
_data.writeInt(((forceRelayout)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_updateRotation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void updateSurfacesAlpha(boolean change) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((change)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_updateSurfacesAlpha, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void multiWindowUsed(boolean used) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((used)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_multiWindowUsed, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isMultiWindowMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isMultiWindowMode, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void updateAllWindowsPositionStretch() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_updateAllWindowsPositionStretch, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void updateAllWindowsPositionCompose() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_updateAllWindowsPositionCompose, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void updateAllWindowsFullScreenMode(int taskId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(taskId);
mRemote.transact(Stub.TRANSACTION_updateAllWindowsFullScreenMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void updateAllWindowsHalfScreenMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_updateAllWindowsHalfScreenMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void updateAllWindowsFourScreenMode(int taskId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(taskId);
mRemote.transact(Stub.TRANSACTION_updateAllWindowsFourScreenMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void multiWindowMenuOperation(java.lang.String actionString) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(actionString);
mRemote.transact(Stub.TRANSACTION_multiWindowMenuOperation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void dispatchUnhandledKey(android.view.IApplicationToken token, android.view.KeyEvent event) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
if ((event!=null)) {
_data.writeInt(1);
event.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_dispatchUnhandledKey, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Retrieve the current screen orientation, constants as per
     * {@link android.view.Surface}.
     */
@Override public int getRotation() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getRotation, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Watch the rotation of the screen.  Returns the current rotation,
     * calls back when it changes.
     */
@Override public int watchRotation(android.view.IRotationWatcher watcher) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((watcher!=null))?(watcher.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_watchRotation, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Remove a rotation watcher set using watchRotation.
     * @hide
     */
@Override public void removeRotationWatcher(android.view.IRotationWatcher watcher) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((watcher!=null))?(watcher.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_removeRotationWatcher, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Determine the preferred edge of the screen to pin the compact options menu against.
     * @return a Gravity value for the options menu panel
     * @hide
     */
@Override public int getPreferredOptionsPanelGravity() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPreferredOptionsPanelGravity, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Lock the device orientation to the specified rotation, or to the
     * current rotation if -1.  Sensor input will be ignored until
     * thawRotation() is called.
     * @hide
     */
@Override public void freezeRotation(int rotation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(rotation);
mRemote.transact(Stub.TRANSACTION_freezeRotation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Release the orientation lock imposed by freezeRotation().
     * @hide
     */
@Override public void thawRotation() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_thawRotation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Gets whether the rotation is frozen.
     *
     * @return Whether the rotation is frozen.
     */
@Override public boolean isRotationFrozen() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isRotationFrozen, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Create a screenshot of the applications currently displayed.
     */
@Override public android.graphics.Bitmap screenshotApplications(android.os.IBinder appToken, int displayId, int maxWidth, int maxHeight, boolean force565) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.graphics.Bitmap _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(appToken);
_data.writeInt(displayId);
_data.writeInt(maxWidth);
_data.writeInt(maxHeight);
_data.writeInt(((force565)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_screenshotApplications, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.graphics.Bitmap.CREATOR.createFromParcel(_reply);
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
/**
     * Called by the status bar to notify Views of changes to System UI visiblity.
     */
@Override public void statusBarVisibilityChanged(int visibility) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(visibility);
mRemote.transact(Stub.TRANSACTION_statusBarVisibilityChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Device has a software navigation bar (separate from the status bar).
     */
@Override public boolean hasNavigationBar() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_hasNavigationBar, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Lock the device immediately with the specified options (can be null).
     */
@Override public void lockNow(android.os.Bundle options) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((options!=null)) {
_data.writeInt(1);
options.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_lockNow, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Device is in safe mode.
     */
@Override public boolean isSafeModeEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isSafeModeEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Enables the screen if all conditions are met.
     */
@Override public void enableScreenIfNeeded() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_enableScreenIfNeeded, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Clears the frame statistics for a given window.
     *
     * @param token The window token.
     * @return Whether the frame statistics were cleared.
     */
@Override public boolean clearWindowContentFrameStats(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_clearWindowContentFrameStats, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Gets the content frame statistics for a given window.
     *
     * @param token The window token.
     * @return The frame statistics or null if the window does not exist.
     */
@Override public android.view.WindowContentFrameStats getWindowContentFrameStats(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.view.WindowContentFrameStats _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_getWindowContentFrameStats, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.view.WindowContentFrameStats.CREATOR.createFromParcel(_reply);
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
//$_rbox_$_modify_$_chenxiao_begin,add for remotecontrol

@Override public android.hardware.ISensorManager getRemoteSensorManager() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.ISensorManager _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getRemoteSensorManager, _data, _reply, 0);
_reply.readException();
_result = android.hardware.ISensorManager.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setJoyStick(int index, int[] position, int[] size) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(index);
_data.writeIntArray(position);
_data.writeIntArray(size);
mRemote.transact(Stub.TRANSACTION_setJoyStick, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
//$_rbox_$_modify_$_end
//$_rockchip_$_modify_$_huangjc begin,add show/hide TitleBar interface for statusbar

@Override public void changeTitleBar(boolean isShow) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isShow)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_changeTitleBar, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int countHalf(int id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(id);
mRemote.transact(Stub.TRANSACTION_countHalf, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isHardKeyboardA() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isHardKeyboardA, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//$_rockchip_$_modify_$_end

@Override public boolean isTaskShowInExtendDisplay(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_isTaskShowInExtendDisplay, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void updateDisplayShowSynchronization() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_updateDisplayShowSynchronization, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void moveWindowToSecondDisplay() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_moveWindowToSecondDisplay, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_startViewServer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_stopViewServer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_isViewServerRunning = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_openSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_inputMethodClientHasFocus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getInitialDisplaySize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getBaseDisplaySize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setForcedDisplaySize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_clearForcedDisplaySize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getInitialDisplayDensity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getBaseDisplayDensity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_setForcedDisplayDensity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_clearForcedDisplayDensity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_setOverscan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_dispatchMouse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_dispatchMouseByCd = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_pauseKeyDispatching = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_resumeKeyDispatching = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_setEventDispatching = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_addWindowToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_removeWindowToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_addAppToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_setAppGroupId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_setAppOrientation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_getAppOrientation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_setFocusedApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_prepareAppTransition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_getPendingAppTransition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_overridePendingAppTransition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_overridePendingAppTransitionScaleUp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_overridePendingAppTransitionThumb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_overridePendingAppTransitionAspectScaledThumb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_overridePendingAppTransitionInPlace = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_executeAppTransition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_setAppStartingWindow = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
static final int TRANSACTION_setAppWillBeHidden = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
static final int TRANSACTION_setAppVisibility = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
static final int TRANSACTION_startAppFreezingScreen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
static final int TRANSACTION_stopAppFreezingScreen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
static final int TRANSACTION_removeAppToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
static final int TRANSACTION_updateOrientationFromAppTokens = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
static final int TRANSACTION_setNewConfiguration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
static final int TRANSACTION_startFreezingScreen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
static final int TRANSACTION_stopFreezingScreen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
static final int TRANSACTION_disableKeyguard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
static final int TRANSACTION_reenableKeyguard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
static final int TRANSACTION_exitKeyguardSecurely = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
static final int TRANSACTION_isKeyguardLocked = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
static final int TRANSACTION_isKeyguardSecure = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
static final int TRANSACTION_inKeyguardRestrictedInputMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
static final int TRANSACTION_dismissKeyguard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
static final int TRANSACTION_keyguardGoingAway = (android.os.IBinder.FIRST_CALL_TRANSACTION + 51);
static final int TRANSACTION_closeSystemDialogs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 52);
static final int TRANSACTION_getAnimationScale = (android.os.IBinder.FIRST_CALL_TRANSACTION + 53);
static final int TRANSACTION_getAnimationScales = (android.os.IBinder.FIRST_CALL_TRANSACTION + 54);
static final int TRANSACTION_setAnimationScale = (android.os.IBinder.FIRST_CALL_TRANSACTION + 55);
static final int TRANSACTION_setAnimationScales = (android.os.IBinder.FIRST_CALL_TRANSACTION + 56);
static final int TRANSACTION_getCurrentAnimatorScale = (android.os.IBinder.FIRST_CALL_TRANSACTION + 57);
static final int TRANSACTION_setInTouchMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 58);
static final int TRANSACTION_showStrictModeViolation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 59);
static final int TRANSACTION_setStrictModeVisualIndicatorPreference = (android.os.IBinder.FIRST_CALL_TRANSACTION + 60);
static final int TRANSACTION_setScreenCaptureDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 61);
static final int TRANSACTION_updateRotation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 62);
static final int TRANSACTION_updateSurfacesAlpha = (android.os.IBinder.FIRST_CALL_TRANSACTION + 63);
static final int TRANSACTION_multiWindowUsed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 64);
static final int TRANSACTION_isMultiWindowMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 65);
static final int TRANSACTION_updateAllWindowsPositionStretch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 66);
static final int TRANSACTION_updateAllWindowsPositionCompose = (android.os.IBinder.FIRST_CALL_TRANSACTION + 67);
static final int TRANSACTION_updateAllWindowsFullScreenMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 68);
static final int TRANSACTION_updateAllWindowsHalfScreenMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 69);
static final int TRANSACTION_updateAllWindowsFourScreenMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 70);
static final int TRANSACTION_multiWindowMenuOperation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 71);
static final int TRANSACTION_dispatchUnhandledKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 72);
static final int TRANSACTION_getRotation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 73);
static final int TRANSACTION_watchRotation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 74);
static final int TRANSACTION_removeRotationWatcher = (android.os.IBinder.FIRST_CALL_TRANSACTION + 75);
static final int TRANSACTION_getPreferredOptionsPanelGravity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 76);
static final int TRANSACTION_freezeRotation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 77);
static final int TRANSACTION_thawRotation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 78);
static final int TRANSACTION_isRotationFrozen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 79);
static final int TRANSACTION_screenshotApplications = (android.os.IBinder.FIRST_CALL_TRANSACTION + 80);
static final int TRANSACTION_statusBarVisibilityChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 81);
static final int TRANSACTION_hasNavigationBar = (android.os.IBinder.FIRST_CALL_TRANSACTION + 82);
static final int TRANSACTION_lockNow = (android.os.IBinder.FIRST_CALL_TRANSACTION + 83);
static final int TRANSACTION_isSafeModeEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 84);
static final int TRANSACTION_enableScreenIfNeeded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 85);
static final int TRANSACTION_clearWindowContentFrameStats = (android.os.IBinder.FIRST_CALL_TRANSACTION + 86);
static final int TRANSACTION_getWindowContentFrameStats = (android.os.IBinder.FIRST_CALL_TRANSACTION + 87);
static final int TRANSACTION_getRemoteSensorManager = (android.os.IBinder.FIRST_CALL_TRANSACTION + 88);
static final int TRANSACTION_setJoyStick = (android.os.IBinder.FIRST_CALL_TRANSACTION + 89);
static final int TRANSACTION_changeTitleBar = (android.os.IBinder.FIRST_CALL_TRANSACTION + 90);
static final int TRANSACTION_countHalf = (android.os.IBinder.FIRST_CALL_TRANSACTION + 91);
static final int TRANSACTION_isHardKeyboardA = (android.os.IBinder.FIRST_CALL_TRANSACTION + 92);
static final int TRANSACTION_isTaskShowInExtendDisplay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 93);
static final int TRANSACTION_updateDisplayShowSynchronization = (android.os.IBinder.FIRST_CALL_TRANSACTION + 94);
static final int TRANSACTION_moveWindowToSecondDisplay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 95);
}
/**
     * ===== NOTICE =====
     * The first three methods must remain the first three methods. Scripts
     * and tools rely on their transaction number to work properly.
     */// This is used for debugging

public boolean startViewServer(int port) throws android.os.RemoteException;
// Transaction #1

public boolean stopViewServer() throws android.os.RemoteException;
// Transaction #2

public boolean isViewServerRunning() throws android.os.RemoteException;
// Transaction #3

public android.view.IWindowSession openSession(android.view.IWindowSessionCallback callback, com.android.internal.view.IInputMethodClient client, com.android.internal.view.IInputContext inputContext) throws android.os.RemoteException;
public boolean inputMethodClientHasFocus(com.android.internal.view.IInputMethodClient client) throws android.os.RemoteException;
public void getInitialDisplaySize(int displayId, android.graphics.Point size) throws android.os.RemoteException;
public void getBaseDisplaySize(int displayId, android.graphics.Point size) throws android.os.RemoteException;
public void setForcedDisplaySize(int displayId, int width, int height) throws android.os.RemoteException;
public void clearForcedDisplaySize(int displayId) throws android.os.RemoteException;
public int getInitialDisplayDensity(int displayId) throws android.os.RemoteException;
public int getBaseDisplayDensity(int displayId) throws android.os.RemoteException;
public void setForcedDisplayDensity(int displayId, int density) throws android.os.RemoteException;
public void clearForcedDisplayDensity(int displayId) throws android.os.RemoteException;
public void setOverscan(int displayId, int left, int top, int right, int bottom) throws android.os.RemoteException;
//interfaces for mouse keyevent input

public void dispatchMouse(float x, float y, int w, int h) throws android.os.RemoteException;
public void dispatchMouseByCd(float x, float y) throws android.os.RemoteException;
// These can only be called when holding the MANAGE_APP_TOKENS permission.

public void pauseKeyDispatching(android.os.IBinder token) throws android.os.RemoteException;
public void resumeKeyDispatching(android.os.IBinder token) throws android.os.RemoteException;
public void setEventDispatching(boolean enabled) throws android.os.RemoteException;
public void addWindowToken(android.os.IBinder token, int type) throws android.os.RemoteException;
public void removeWindowToken(android.os.IBinder token) throws android.os.RemoteException;
public void addAppToken(int addPos, android.view.IApplicationToken token, int groupId, int stackId, int requestedOrientation, boolean fullscreen, boolean showWhenLocked, int userId, int configChanges, boolean voiceInteraction, boolean launchTaskBehind) throws android.os.RemoteException;
public void setAppGroupId(android.os.IBinder token, int groupId) throws android.os.RemoteException;
public void setAppOrientation(android.view.IApplicationToken token, int requestedOrientation) throws android.os.RemoteException;
public int getAppOrientation(android.view.IApplicationToken token) throws android.os.RemoteException;
public void setFocusedApp(android.os.IBinder token, boolean moveFocusNow) throws android.os.RemoteException;
public void prepareAppTransition(int transit, boolean alwaysKeepCurrent) throws android.os.RemoteException;
public int getPendingAppTransition() throws android.os.RemoteException;
public void overridePendingAppTransition(java.lang.String packageName, int enterAnim, int exitAnim, android.os.IRemoteCallback startedCallback) throws android.os.RemoteException;
public void overridePendingAppTransitionScaleUp(int startX, int startY, int startWidth, int startHeight) throws android.os.RemoteException;
public void overridePendingAppTransitionThumb(android.graphics.Bitmap srcThumb, int startX, int startY, android.os.IRemoteCallback startedCallback, boolean scaleUp) throws android.os.RemoteException;
public void overridePendingAppTransitionAspectScaledThumb(android.graphics.Bitmap srcThumb, int startX, int startY, int targetWidth, int targetHeight, android.os.IRemoteCallback startedCallback, boolean scaleUp) throws android.os.RemoteException;
public void overridePendingAppTransitionInPlace(java.lang.String packageName, int anim) throws android.os.RemoteException;
public void executeAppTransition() throws android.os.RemoteException;
public void setAppStartingWindow(android.os.IBinder token, java.lang.String pkg, int theme, android.content.res.CompatibilityInfo compatInfo, java.lang.CharSequence nonLocalizedLabel, int labelRes, int icon, int logo, int windowFlags, android.os.IBinder transferFrom, boolean createIfNeeded, int align) throws android.os.RemoteException;
public void setAppWillBeHidden(android.os.IBinder token) throws android.os.RemoteException;
public void setAppVisibility(android.os.IBinder token, boolean visible) throws android.os.RemoteException;
public void startAppFreezingScreen(android.os.IBinder token, int configChanges) throws android.os.RemoteException;
public void stopAppFreezingScreen(android.os.IBinder token, boolean force) throws android.os.RemoteException;
public void removeAppToken(android.os.IBinder token) throws android.os.RemoteException;
// Re-evaluate the current orientation from the caller's state.
// If there is a change, the new Configuration is returned and the
// caller must call setNewConfiguration() sometime later.

public android.content.res.Configuration updateOrientationFromAppTokens(android.content.res.Configuration currentConfig, android.os.IBinder freezeThisOneIfNeeded) throws android.os.RemoteException;
public void setNewConfiguration(android.content.res.Configuration config) throws android.os.RemoteException;
public void startFreezingScreen(int exitAnim, int enterAnim) throws android.os.RemoteException;
public void stopFreezingScreen() throws android.os.RemoteException;
// these require DISABLE_KEYGUARD permission

public void disableKeyguard(android.os.IBinder token, java.lang.String tag) throws android.os.RemoteException;
public void reenableKeyguard(android.os.IBinder token) throws android.os.RemoteException;
public void exitKeyguardSecurely(android.view.IOnKeyguardExitResult callback) throws android.os.RemoteException;
public boolean isKeyguardLocked() throws android.os.RemoteException;
public boolean isKeyguardSecure() throws android.os.RemoteException;
public boolean inKeyguardRestrictedInputMode() throws android.os.RemoteException;
public void dismissKeyguard() throws android.os.RemoteException;
public void keyguardGoingAway(boolean disableWindowAnimations, boolean keyguardGoingToNotificationShade) throws android.os.RemoteException;
public void closeSystemDialogs(java.lang.String reason) throws android.os.RemoteException;
// These can only be called with the SET_ANIMATON_SCALE permission.

public float getAnimationScale(int which) throws android.os.RemoteException;
public float[] getAnimationScales() throws android.os.RemoteException;
public void setAnimationScale(int which, float scale) throws android.os.RemoteException;
public void setAnimationScales(float[] scales) throws android.os.RemoteException;
public float getCurrentAnimatorScale() throws android.os.RemoteException;
// For testing

public void setInTouchMode(boolean showFocus) throws android.os.RemoteException;
// For StrictMode flashing a red border on violations from the UI
// thread.  The uid/pid is implicit from the Binder call, and the Window
// Manager uses that to determine whether or not the red border should
// actually be shown.  (it will be ignored that pid doesn't have windows
// on screen)

public void showStrictModeViolation(boolean on) throws android.os.RemoteException;
// Proxy to set the system property for whether the flashing
// should be enabled.  The 'enabled' value is null or blank for
// the system default (differs per build variant) or any valid
// boolean string as parsed by SystemProperties.getBoolean().

public void setStrictModeVisualIndicatorPreference(java.lang.String enabled) throws android.os.RemoteException;
/**
     * Set whether screen capture is disabled for all windows of a specific user
     */
public void setScreenCaptureDisabled(int userId, boolean disabled) throws android.os.RemoteException;
// These can only be called with the SET_ORIENTATION permission.
/**
     * Update the current screen rotation based on the current state of
     * the world.
     * @param alwaysSendConfiguration Flag to force a new configuration to
     * be evaluated.  This can be used when there are other parameters in
     * configuration that are changing.
     * @param forceRelayout If true, the window manager will always do a relayout
     * of its windows even if the rotation hasn't changed.
     */
public void updateRotation(boolean alwaysSendConfiguration, boolean forceRelayout) throws android.os.RemoteException;
public void updateSurfacesAlpha(boolean change) throws android.os.RemoteException;
public void multiWindowUsed(boolean used) throws android.os.RemoteException;
public boolean isMultiWindowMode() throws android.os.RemoteException;
public void updateAllWindowsPositionStretch() throws android.os.RemoteException;
public void updateAllWindowsPositionCompose() throws android.os.RemoteException;
public void updateAllWindowsFullScreenMode(int taskId) throws android.os.RemoteException;
public void updateAllWindowsHalfScreenMode() throws android.os.RemoteException;
public void updateAllWindowsFourScreenMode(int taskId) throws android.os.RemoteException;
public void multiWindowMenuOperation(java.lang.String actionString) throws android.os.RemoteException;
public void dispatchUnhandledKey(android.view.IApplicationToken token, android.view.KeyEvent event) throws android.os.RemoteException;
/**
     * Retrieve the current screen orientation, constants as per
     * {@link android.view.Surface}.
     */
public int getRotation() throws android.os.RemoteException;
/**
     * Watch the rotation of the screen.  Returns the current rotation,
     * calls back when it changes.
     */
public int watchRotation(android.view.IRotationWatcher watcher) throws android.os.RemoteException;
/**
     * Remove a rotation watcher set using watchRotation.
     * @hide
     */
public void removeRotationWatcher(android.view.IRotationWatcher watcher) throws android.os.RemoteException;
/**
     * Determine the preferred edge of the screen to pin the compact options menu against.
     * @return a Gravity value for the options menu panel
     * @hide
     */
public int getPreferredOptionsPanelGravity() throws android.os.RemoteException;
/**
     * Lock the device orientation to the specified rotation, or to the
     * current rotation if -1.  Sensor input will be ignored until
     * thawRotation() is called.
     * @hide
     */
public void freezeRotation(int rotation) throws android.os.RemoteException;
/**
     * Release the orientation lock imposed by freezeRotation().
     * @hide
     */
public void thawRotation() throws android.os.RemoteException;
/**
     * Gets whether the rotation is frozen.
     *
     * @return Whether the rotation is frozen.
     */
public boolean isRotationFrozen() throws android.os.RemoteException;
/**
     * Create a screenshot of the applications currently displayed.
     */
public android.graphics.Bitmap screenshotApplications(android.os.IBinder appToken, int displayId, int maxWidth, int maxHeight, boolean force565) throws android.os.RemoteException;
/**
     * Called by the status bar to notify Views of changes to System UI visiblity.
     */
public void statusBarVisibilityChanged(int visibility) throws android.os.RemoteException;
/**
     * Device has a software navigation bar (separate from the status bar).
     */
public boolean hasNavigationBar() throws android.os.RemoteException;
/**
     * Lock the device immediately with the specified options (can be null).
     */
public void lockNow(android.os.Bundle options) throws android.os.RemoteException;
/**
     * Device is in safe mode.
     */
public boolean isSafeModeEnabled() throws android.os.RemoteException;
/**
     * Enables the screen if all conditions are met.
     */
public void enableScreenIfNeeded() throws android.os.RemoteException;
/**
     * Clears the frame statistics for a given window.
     *
     * @param token The window token.
     * @return Whether the frame statistics were cleared.
     */
public boolean clearWindowContentFrameStats(android.os.IBinder token) throws android.os.RemoteException;
/**
     * Gets the content frame statistics for a given window.
     *
     * @param token The window token.
     * @return The frame statistics or null if the window does not exist.
     */
public android.view.WindowContentFrameStats getWindowContentFrameStats(android.os.IBinder token) throws android.os.RemoteException;
//$_rbox_$_modify_$_chenxiao_begin,add for remotecontrol

public android.hardware.ISensorManager getRemoteSensorManager() throws android.os.RemoteException;
public void setJoyStick(int index, int[] position, int[] size) throws android.os.RemoteException;
//$_rbox_$_modify_$_end
//$_rockchip_$_modify_$_huangjc begin,add show/hide TitleBar interface for statusbar

public void changeTitleBar(boolean isShow) throws android.os.RemoteException;
public int countHalf(int id) throws android.os.RemoteException;
public boolean isHardKeyboardA() throws android.os.RemoteException;
//$_rockchip_$_modify_$_end

public boolean isTaskShowInExtendDisplay(android.os.IBinder token) throws android.os.RemoteException;
public void updateDisplayShowSynchronization() throws android.os.RemoteException;
public void moveWindowToSecondDisplay() throws android.os.RemoteException;
}
