/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/app/ITaskStackListener.aidl
 */
package android.app;
/** @hide */
public interface ITaskStackListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.ITaskStackListener
{
private static final java.lang.String DESCRIPTOR = "android.app.ITaskStackListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.ITaskStackListener interface,
 * generating a proxy if needed.
 */
public static android.app.ITaskStackListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.ITaskStackListener))) {
return ((android.app.ITaskStackListener)iin);
}
return new android.app.ITaskStackListener.Stub.Proxy(obj);
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
case TRANSACTION_onTaskStackChanged:
{
data.enforceInterface(DESCRIPTOR);
this.onTaskStackChanged();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.ITaskStackListener
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
@Override public void onTaskStackChanged() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onTaskStackChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onTaskStackChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onTaskStackChanged() throws android.os.RemoteException;
}
