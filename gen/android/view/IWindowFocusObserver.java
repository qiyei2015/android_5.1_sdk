/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/view/IWindowFocusObserver.aidl
 */
package android.view;
/** {@hide} */
public interface IWindowFocusObserver extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.view.IWindowFocusObserver
{
private static final java.lang.String DESCRIPTOR = "android.view.IWindowFocusObserver";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.view.IWindowFocusObserver interface,
 * generating a proxy if needed.
 */
public static android.view.IWindowFocusObserver asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.view.IWindowFocusObserver))) {
return ((android.view.IWindowFocusObserver)iin);
}
return new android.view.IWindowFocusObserver.Stub.Proxy(obj);
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
case TRANSACTION_focusGained:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.focusGained(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_focusLost:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.focusLost(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.view.IWindowFocusObserver
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
@Override public void focusGained(android.os.IBinder inputToken) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(inputToken);
mRemote.transact(Stub.TRANSACTION_focusGained, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void focusLost(android.os.IBinder inputToken) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(inputToken);
mRemote.transact(Stub.TRANSACTION_focusLost, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_focusGained = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_focusLost = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void focusGained(android.os.IBinder inputToken) throws android.os.RemoteException;
public void focusLost(android.os.IBinder inputToken) throws android.os.RemoteException;
}
