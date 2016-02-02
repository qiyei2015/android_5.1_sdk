/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/view/IApplicationToken.aidl
 */
package android.view;
/** {@hide} */
public interface IApplicationToken extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.view.IApplicationToken
{
private static final java.lang.String DESCRIPTOR = "android.view.IApplicationToken";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.view.IApplicationToken interface,
 * generating a proxy if needed.
 */
public static android.view.IApplicationToken asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.view.IApplicationToken))) {
return ((android.view.IApplicationToken)iin);
}
return new android.view.IApplicationToken.Stub.Proxy(obj);
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
case TRANSACTION_windowsDrawn:
{
data.enforceInterface(DESCRIPTOR);
this.windowsDrawn();
reply.writeNoException();
return true;
}
case TRANSACTION_windowsVisible:
{
data.enforceInterface(DESCRIPTOR);
this.windowsVisible();
reply.writeNoException();
return true;
}
case TRANSACTION_windowsGone:
{
data.enforceInterface(DESCRIPTOR);
this.windowsGone();
reply.writeNoException();
return true;
}
case TRANSACTION_keyDispatchingTimedOut:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.keyDispatchingTimedOut(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getKeyDispatchingTimeout:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getKeyDispatchingTimeout();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getLastLaunchTimeout:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getLastLaunchTimeout();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_isHomeActivity:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isHomeActivity();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isSupportHalfScreen:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isSupportHalfScreen();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getAppPackageName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getAppPackageName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.view.IApplicationToken
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
@Override public void windowsDrawn() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_windowsDrawn, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void windowsVisible() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_windowsVisible, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void windowsGone() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_windowsGone, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean keyDispatchingTimedOut(java.lang.String reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(reason);
mRemote.transact(Stub.TRANSACTION_keyDispatchingTimedOut, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getKeyDispatchingTimeout() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getKeyDispatchingTimeout, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getLastLaunchTimeout() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLastLaunchTimeout, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isHomeActivity() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isHomeActivity, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isSupportHalfScreen() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isSupportHalfScreen, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getAppPackageName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAppPackageName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_windowsDrawn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_windowsVisible = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_windowsGone = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_keyDispatchingTimedOut = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getKeyDispatchingTimeout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getLastLaunchTimeout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_isHomeActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_isSupportHalfScreen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getAppPackageName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
}
public void windowsDrawn() throws android.os.RemoteException;
public void windowsVisible() throws android.os.RemoteException;
public void windowsGone() throws android.os.RemoteException;
public boolean keyDispatchingTimedOut(java.lang.String reason) throws android.os.RemoteException;
public long getKeyDispatchingTimeout() throws android.os.RemoteException;
public long getLastLaunchTimeout() throws android.os.RemoteException;
public boolean isHomeActivity() throws android.os.RemoteException;
public boolean isSupportHalfScreen() throws android.os.RemoteException;
public java.lang.String getAppPackageName() throws android.os.RemoteException;
}
