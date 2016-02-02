/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/hardware/display/IDisplayManager.aidl
 */
package android.hardware.display;
/** @hide */
public interface IDisplayManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.display.IDisplayManager
{
private static final java.lang.String DESCRIPTOR = "android.hardware.display.IDisplayManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.display.IDisplayManager interface,
 * generating a proxy if needed.
 */
public static android.hardware.display.IDisplayManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.display.IDisplayManager))) {
return ((android.hardware.display.IDisplayManager)iin);
}
return new android.hardware.display.IDisplayManager.Stub.Proxy(obj);
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
case TRANSACTION_getDisplayInfo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.view.DisplayInfo _result = this.getDisplayInfo(_arg0);
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
case TRANSACTION_getDisplayIds:
{
data.enforceInterface(DESCRIPTOR);
int[] _result = this.getDisplayIds();
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_registerCallback:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.display.IDisplayManagerCallback _arg0;
_arg0 = android.hardware.display.IDisplayManagerCallback.Stub.asInterface(data.readStrongBinder());
this.registerCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_startWifiDisplayScan:
{
data.enforceInterface(DESCRIPTOR);
this.startWifiDisplayScan();
reply.writeNoException();
return true;
}
case TRANSACTION_stopWifiDisplayScan:
{
data.enforceInterface(DESCRIPTOR);
this.stopWifiDisplayScan();
reply.writeNoException();
return true;
}
case TRANSACTION_connectWifiDisplay:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.connectWifiDisplay(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_disconnectWifiDisplay:
{
data.enforceInterface(DESCRIPTOR);
this.disconnectWifiDisplay();
reply.writeNoException();
return true;
}
case TRANSACTION_renameWifiDisplay:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.renameWifiDisplay(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_forgetWifiDisplay:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.forgetWifiDisplay(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_pauseWifiDisplay:
{
data.enforceInterface(DESCRIPTOR);
this.pauseWifiDisplay();
reply.writeNoException();
return true;
}
case TRANSACTION_resumeWifiDisplay:
{
data.enforceInterface(DESCRIPTOR);
this.resumeWifiDisplay();
reply.writeNoException();
return true;
}
case TRANSACTION_getWifiDisplayStatus:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.display.WifiDisplayStatus _result = this.getWifiDisplayStatus();
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
case TRANSACTION_createVirtualDisplay:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.display.IVirtualDisplayCallback _arg0;
_arg0 = android.hardware.display.IVirtualDisplayCallback.Stub.asInterface(data.readStrongBinder());
android.media.projection.IMediaProjection _arg1;
_arg1 = android.media.projection.IMediaProjection.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
int _arg4;
_arg4 = data.readInt();
int _arg5;
_arg5 = data.readInt();
int _arg6;
_arg6 = data.readInt();
android.view.Surface _arg7;
if ((0!=data.readInt())) {
_arg7 = android.view.Surface.CREATOR.createFromParcel(data);
}
else {
_arg7 = null;
}
int _arg8;
_arg8 = data.readInt();
int _result = this.createVirtualDisplay(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_resizeVirtualDisplay:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.display.IVirtualDisplayCallback _arg0;
_arg0 = android.hardware.display.IVirtualDisplayCallback.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.resizeVirtualDisplay(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_setVirtualDisplaySurface:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.display.IVirtualDisplayCallback _arg0;
_arg0 = android.hardware.display.IVirtualDisplayCallback.Stub.asInterface(data.readStrongBinder());
android.view.Surface _arg1;
if ((0!=data.readInt())) {
_arg1 = android.view.Surface.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setVirtualDisplaySurface(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_releaseVirtualDisplay:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.display.IVirtualDisplayCallback _arg0;
_arg0 = android.hardware.display.IVirtualDisplayCallback.Stub.asInterface(data.readStrongBinder());
this.releaseVirtualDisplay(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.display.IDisplayManager
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
@Override public android.view.DisplayInfo getDisplayInfo(int displayId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.view.DisplayInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(displayId);
mRemote.transact(Stub.TRANSACTION_getDisplayInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.view.DisplayInfo.CREATOR.createFromParcel(_reply);
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
@Override public int[] getDisplayIds() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDisplayIds, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void registerCallback(android.hardware.display.IDisplayManagerCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Requires CONFIGURE_WIFI_DISPLAY permission.
// The process must have previously registered a callback.

@Override public void startWifiDisplayScan() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_startWifiDisplayScan, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Requires CONFIGURE_WIFI_DISPLAY permission.

@Override public void stopWifiDisplayScan() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopWifiDisplayScan, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Requires CONFIGURE_WIFI_DISPLAY permission.

@Override public void connectWifiDisplay(java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_connectWifiDisplay, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// No permissions required.

@Override public void disconnectWifiDisplay() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_disconnectWifiDisplay, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Requires CONFIGURE_WIFI_DISPLAY permission.

@Override public void renameWifiDisplay(java.lang.String address, java.lang.String alias) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeString(alias);
mRemote.transact(Stub.TRANSACTION_renameWifiDisplay, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Requires CONFIGURE_WIFI_DISPLAY permission.

@Override public void forgetWifiDisplay(java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_forgetWifiDisplay, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Requires CONFIGURE_WIFI_DISPLAY permission.

@Override public void pauseWifiDisplay() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_pauseWifiDisplay, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Requires CONFIGURE_WIFI_DISPLAY permission.

@Override public void resumeWifiDisplay() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_resumeWifiDisplay, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// No permissions required.

@Override public android.hardware.display.WifiDisplayStatus getWifiDisplayStatus() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.display.WifiDisplayStatus _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getWifiDisplayStatus, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.hardware.display.WifiDisplayStatus.CREATOR.createFromParcel(_reply);
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
// Requires CAPTURE_VIDEO_OUTPUT, CAPTURE_SECURE_VIDEO_OUTPUT, or an appropriate
// MediaProjection token for certain combinations of flags.

@Override public int createVirtualDisplay(android.hardware.display.IVirtualDisplayCallback callback, android.media.projection.IMediaProjection projectionToken, java.lang.String packageName, java.lang.String name, int width, int height, int densityDpi, android.view.Surface surface, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
_data.writeStrongBinder((((projectionToken!=null))?(projectionToken.asBinder()):(null)));
_data.writeString(packageName);
_data.writeString(name);
_data.writeInt(width);
_data.writeInt(height);
_data.writeInt(densityDpi);
if ((surface!=null)) {
_data.writeInt(1);
surface.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_createVirtualDisplay, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// No permissions required, but must be same Uid as the creator.

@Override public void resizeVirtualDisplay(android.hardware.display.IVirtualDisplayCallback token, int width, int height, int densityDpi) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeInt(width);
_data.writeInt(height);
_data.writeInt(densityDpi);
mRemote.transact(Stub.TRANSACTION_resizeVirtualDisplay, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// No permissions required but must be same Uid as the creator.

@Override public void setVirtualDisplaySurface(android.hardware.display.IVirtualDisplayCallback token, android.view.Surface surface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
if ((surface!=null)) {
_data.writeInt(1);
surface.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setVirtualDisplaySurface, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// No permissions required but must be same Uid as the creator.

@Override public void releaseVirtualDisplay(android.hardware.display.IVirtualDisplayCallback token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_releaseVirtualDisplay, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getDisplayInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getDisplayIds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_registerCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_startWifiDisplayScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_stopWifiDisplayScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_connectWifiDisplay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_disconnectWifiDisplay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_renameWifiDisplay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_forgetWifiDisplay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_pauseWifiDisplay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_resumeWifiDisplay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getWifiDisplayStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_createVirtualDisplay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_resizeVirtualDisplay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_setVirtualDisplaySurface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_releaseVirtualDisplay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
}
public android.view.DisplayInfo getDisplayInfo(int displayId) throws android.os.RemoteException;
public int[] getDisplayIds() throws android.os.RemoteException;
public void registerCallback(android.hardware.display.IDisplayManagerCallback callback) throws android.os.RemoteException;
// Requires CONFIGURE_WIFI_DISPLAY permission.
// The process must have previously registered a callback.

public void startWifiDisplayScan() throws android.os.RemoteException;
// Requires CONFIGURE_WIFI_DISPLAY permission.

public void stopWifiDisplayScan() throws android.os.RemoteException;
// Requires CONFIGURE_WIFI_DISPLAY permission.

public void connectWifiDisplay(java.lang.String address) throws android.os.RemoteException;
// No permissions required.

public void disconnectWifiDisplay() throws android.os.RemoteException;
// Requires CONFIGURE_WIFI_DISPLAY permission.

public void renameWifiDisplay(java.lang.String address, java.lang.String alias) throws android.os.RemoteException;
// Requires CONFIGURE_WIFI_DISPLAY permission.

public void forgetWifiDisplay(java.lang.String address) throws android.os.RemoteException;
// Requires CONFIGURE_WIFI_DISPLAY permission.

public void pauseWifiDisplay() throws android.os.RemoteException;
// Requires CONFIGURE_WIFI_DISPLAY permission.

public void resumeWifiDisplay() throws android.os.RemoteException;
// No permissions required.

public android.hardware.display.WifiDisplayStatus getWifiDisplayStatus() throws android.os.RemoteException;
// Requires CAPTURE_VIDEO_OUTPUT, CAPTURE_SECURE_VIDEO_OUTPUT, or an appropriate
// MediaProjection token for certain combinations of flags.

public int createVirtualDisplay(android.hardware.display.IVirtualDisplayCallback callback, android.media.projection.IMediaProjection projectionToken, java.lang.String packageName, java.lang.String name, int width, int height, int densityDpi, android.view.Surface surface, int flags) throws android.os.RemoteException;
// No permissions required, but must be same Uid as the creator.

public void resizeVirtualDisplay(android.hardware.display.IVirtualDisplayCallback token, int width, int height, int densityDpi) throws android.os.RemoteException;
// No permissions required but must be same Uid as the creator.

public void setVirtualDisplaySurface(android.hardware.display.IVirtualDisplayCallback token, android.view.Surface surface) throws android.os.RemoteException;
// No permissions required but must be same Uid as the creator.

public void releaseVirtualDisplay(android.hardware.display.IVirtualDisplayCallback token) throws android.os.RemoteException;
}
