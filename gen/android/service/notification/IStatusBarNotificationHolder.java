/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/service/notification/IStatusBarNotificationHolder.aidl
 */
package android.service.notification;
/** @hide */
public interface IStatusBarNotificationHolder extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.notification.IStatusBarNotificationHolder
{
private static final java.lang.String DESCRIPTOR = "android.service.notification.IStatusBarNotificationHolder";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.notification.IStatusBarNotificationHolder interface,
 * generating a proxy if needed.
 */
public static android.service.notification.IStatusBarNotificationHolder asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.notification.IStatusBarNotificationHolder))) {
return ((android.service.notification.IStatusBarNotificationHolder)iin);
}
return new android.service.notification.IStatusBarNotificationHolder.Stub.Proxy(obj);
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
case TRANSACTION_get:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.StatusBarNotification _result = this.get();
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
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.notification.IStatusBarNotificationHolder
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
/** Fetch the held StatusBarNotification. This method should only be called once per Holder */
@Override public android.service.notification.StatusBarNotification get() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.service.notification.StatusBarNotification _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_get, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.service.notification.StatusBarNotification.CREATOR.createFromParcel(_reply);
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
}
static final int TRANSACTION_get = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/** Fetch the held StatusBarNotification. This method should only be called once per Holder */
public android.service.notification.StatusBarNotification get() throws android.os.RemoteException;
}
