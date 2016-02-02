/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/app/IUserSwitchObserver.aidl
 */
package android.app;
/** {@hide} */
public interface IUserSwitchObserver extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.IUserSwitchObserver
{
private static final java.lang.String DESCRIPTOR = "android.app.IUserSwitchObserver";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.IUserSwitchObserver interface,
 * generating a proxy if needed.
 */
public static android.app.IUserSwitchObserver asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.IUserSwitchObserver))) {
return ((android.app.IUserSwitchObserver)iin);
}
return new android.app.IUserSwitchObserver.Stub.Proxy(obj);
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
case TRANSACTION_onUserSwitching:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.os.IRemoteCallback _arg1;
_arg1 = android.os.IRemoteCallback.Stub.asInterface(data.readStrongBinder());
this.onUserSwitching(_arg0, _arg1);
return true;
}
case TRANSACTION_onUserSwitchComplete:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onUserSwitchComplete(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.IUserSwitchObserver
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
@Override public void onUserSwitching(int newUserId, android.os.IRemoteCallback reply) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(newUserId);
_data.writeStrongBinder((((reply!=null))?(reply.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_onUserSwitching, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onUserSwitchComplete(int newUserId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(newUserId);
mRemote.transact(Stub.TRANSACTION_onUserSwitchComplete, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onUserSwitching = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onUserSwitchComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void onUserSwitching(int newUserId, android.os.IRemoteCallback reply) throws android.os.RemoteException;
public void onUserSwitchComplete(int newUserId) throws android.os.RemoteException;
}
