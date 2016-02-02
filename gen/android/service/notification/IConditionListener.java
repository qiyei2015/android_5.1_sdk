/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/service/notification/IConditionListener.aidl
 */
package android.service.notification;
/** @hide */
public interface IConditionListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.notification.IConditionListener
{
private static final java.lang.String DESCRIPTOR = "android.service.notification.IConditionListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.notification.IConditionListener interface,
 * generating a proxy if needed.
 */
public static android.service.notification.IConditionListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.notification.IConditionListener))) {
return ((android.service.notification.IConditionListener)iin);
}
return new android.service.notification.IConditionListener.Stub.Proxy(obj);
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
case TRANSACTION_onConditionsReceived:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.Condition[] _arg0;
_arg0 = data.createTypedArray(android.service.notification.Condition.CREATOR);
this.onConditionsReceived(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.notification.IConditionListener
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
@Override public void onConditionsReceived(android.service.notification.Condition[] conditions) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedArray(conditions, 0);
mRemote.transact(Stub.TRANSACTION_onConditionsReceived, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onConditionsReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onConditionsReceived(android.service.notification.Condition[] conditions) throws android.os.RemoteException;
}
