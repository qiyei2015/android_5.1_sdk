/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/app/IUiAutomationConnection.aidl
 */
package android.app;
/**
 * This interface contains privileged operations a shell program can perform
 * on behalf of an instrumentation that it runs. These operations require
 * special permissions which the shell user has but the instrumentation does
 * not. Running privileged operations by the shell user on behalf of an
 * instrumentation is needed for running UiTestCases.
 *
 * {@hide}
 */
public interface IUiAutomationConnection extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.IUiAutomationConnection
{
private static final java.lang.String DESCRIPTOR = "android.app.IUiAutomationConnection";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.IUiAutomationConnection interface,
 * generating a proxy if needed.
 */
public static android.app.IUiAutomationConnection asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.IUiAutomationConnection))) {
return ((android.app.IUiAutomationConnection)iin);
}
return new android.app.IUiAutomationConnection.Stub.Proxy(obj);
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
case TRANSACTION_connect:
{
data.enforceInterface(DESCRIPTOR);
android.accessibilityservice.IAccessibilityServiceClient _arg0;
_arg0 = android.accessibilityservice.IAccessibilityServiceClient.Stub.asInterface(data.readStrongBinder());
this.connect(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_disconnect:
{
data.enforceInterface(DESCRIPTOR);
this.disconnect();
reply.writeNoException();
return true;
}
case TRANSACTION_injectInputEvent:
{
data.enforceInterface(DESCRIPTOR);
android.view.InputEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.InputEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _result = this.injectInputEvent(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setRotation:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.setRotation(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_takeScreenshot:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
android.graphics.Bitmap _result = this.takeScreenshot(_arg0, _arg1);
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
case TRANSACTION_shutdown:
{
data.enforceInterface(DESCRIPTOR);
this.shutdown();
reply.writeNoException();
return true;
}
case TRANSACTION_clearWindowContentFrameStats:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.clearWindowContentFrameStats(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getWindowContentFrameStats:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
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
case TRANSACTION_clearWindowAnimationFrameStats:
{
data.enforceInterface(DESCRIPTOR);
this.clearWindowAnimationFrameStats();
reply.writeNoException();
return true;
}
case TRANSACTION_getWindowAnimationFrameStats:
{
data.enforceInterface(DESCRIPTOR);
android.view.WindowAnimationFrameStats _result = this.getWindowAnimationFrameStats();
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
case TRANSACTION_executeShellCommand:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.ParcelFileDescriptor _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.executeShellCommand(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.IUiAutomationConnection
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
@Override public void connect(android.accessibilityservice.IAccessibilityServiceClient client) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_connect, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void disconnect() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_disconnect, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean injectInputEvent(android.view.InputEvent event, boolean sync) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((event!=null)) {
_data.writeInt(1);
event.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((sync)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_injectInputEvent, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setRotation(int rotation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(rotation);
mRemote.transact(Stub.TRANSACTION_setRotation, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.graphics.Bitmap takeScreenshot(int width, int height) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.graphics.Bitmap _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(width);
_data.writeInt(height);
mRemote.transact(Stub.TRANSACTION_takeScreenshot, _data, _reply, 0);
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
@Override public void shutdown() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_shutdown, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean clearWindowContentFrameStats(int windowId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(windowId);
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
@Override public android.view.WindowContentFrameStats getWindowContentFrameStats(int windowId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.view.WindowContentFrameStats _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(windowId);
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
@Override public void clearWindowAnimationFrameStats() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_clearWindowAnimationFrameStats, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.view.WindowAnimationFrameStats getWindowAnimationFrameStats() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.view.WindowAnimationFrameStats _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getWindowAnimationFrameStats, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.view.WindowAnimationFrameStats.CREATOR.createFromParcel(_reply);
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
@Override public void executeShellCommand(java.lang.String command, android.os.ParcelFileDescriptor fd) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(command);
if ((fd!=null)) {
_data.writeInt(1);
fd.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_executeShellCommand, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_connect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_disconnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_injectInputEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setRotation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_takeScreenshot = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_shutdown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_clearWindowContentFrameStats = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getWindowContentFrameStats = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_clearWindowAnimationFrameStats = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getWindowAnimationFrameStats = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_executeShellCommand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
}
public void connect(android.accessibilityservice.IAccessibilityServiceClient client) throws android.os.RemoteException;
public void disconnect() throws android.os.RemoteException;
public boolean injectInputEvent(android.view.InputEvent event, boolean sync) throws android.os.RemoteException;
public boolean setRotation(int rotation) throws android.os.RemoteException;
public android.graphics.Bitmap takeScreenshot(int width, int height) throws android.os.RemoteException;
public void shutdown() throws android.os.RemoteException;
public boolean clearWindowContentFrameStats(int windowId) throws android.os.RemoteException;
public android.view.WindowContentFrameStats getWindowContentFrameStats(int windowId) throws android.os.RemoteException;
public void clearWindowAnimationFrameStats() throws android.os.RemoteException;
public android.view.WindowAnimationFrameStats getWindowAnimationFrameStats() throws android.os.RemoteException;
public void executeShellCommand(java.lang.String command, android.os.ParcelFileDescriptor fd) throws android.os.RemoteException;
}
