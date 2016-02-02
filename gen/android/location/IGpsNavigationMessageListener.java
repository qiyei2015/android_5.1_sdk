/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/location/java/android/location/IGpsNavigationMessageListener.aidl
 */
package android.location;
/**
 * {@hide}
 */
public interface IGpsNavigationMessageListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.location.IGpsNavigationMessageListener
{
private static final java.lang.String DESCRIPTOR = "android.location.IGpsNavigationMessageListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.location.IGpsNavigationMessageListener interface,
 * generating a proxy if needed.
 */
public static android.location.IGpsNavigationMessageListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.location.IGpsNavigationMessageListener))) {
return ((android.location.IGpsNavigationMessageListener)iin);
}
return new android.location.IGpsNavigationMessageListener.Stub.Proxy(obj);
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
case TRANSACTION_onGpsNavigationMessageReceived:
{
data.enforceInterface(DESCRIPTOR);
android.location.GpsNavigationMessageEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.location.GpsNavigationMessageEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onGpsNavigationMessageReceived(_arg0);
return true;
}
case TRANSACTION_onStatusChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onStatusChanged(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.location.IGpsNavigationMessageListener
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
@Override public void onGpsNavigationMessageReceived(android.location.GpsNavigationMessageEvent event) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((event!=null)) {
_data.writeInt(1);
event.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onGpsNavigationMessageReceived, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onStatusChanged(int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onStatusChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onGpsNavigationMessageReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onStatusChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void onGpsNavigationMessageReceived(android.location.GpsNavigationMessageEvent event) throws android.os.RemoteException;
public void onStatusChanged(int status) throws android.os.RemoteException;
}
