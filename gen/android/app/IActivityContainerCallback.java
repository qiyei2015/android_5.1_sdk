/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/app/IActivityContainerCallback.aidl
 */
package android.app;
/** @hide */
public interface IActivityContainerCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.IActivityContainerCallback
{
private static final java.lang.String DESCRIPTOR = "android.app.IActivityContainerCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.IActivityContainerCallback interface,
 * generating a proxy if needed.
 */
public static android.app.IActivityContainerCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.IActivityContainerCallback))) {
return ((android.app.IActivityContainerCallback)iin);
}
return new android.app.IActivityContainerCallback.Stub.Proxy(obj);
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
case TRANSACTION_setVisible:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setVisible(_arg0, _arg1);
return true;
}
case TRANSACTION_onAllActivitiesComplete:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.onAllActivitiesComplete(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.IActivityContainerCallback
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
@Override public void setVisible(android.os.IBinder container, boolean visible) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(container);
_data.writeInt(((visible)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setVisible, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onAllActivitiesComplete(android.os.IBinder container) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(container);
mRemote.transact(Stub.TRANSACTION_onAllActivitiesComplete, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_setVisible = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onAllActivitiesComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void setVisible(android.os.IBinder container, boolean visible) throws android.os.RemoteException;
public void onAllActivitiesComplete(android.os.IBinder container) throws android.os.RemoteException;
}
