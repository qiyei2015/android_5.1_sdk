/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/os/IBatteryPropertiesListener.aidl
 */
package android.os;
/**
 * {@hide}
 */
public interface IBatteryPropertiesListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.IBatteryPropertiesListener
{
private static final java.lang.String DESCRIPTOR = "android.os.IBatteryPropertiesListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.IBatteryPropertiesListener interface,
 * generating a proxy if needed.
 */
public static android.os.IBatteryPropertiesListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.IBatteryPropertiesListener))) {
return ((android.os.IBatteryPropertiesListener)iin);
}
return new android.os.IBatteryPropertiesListener.Stub.Proxy(obj);
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
case TRANSACTION_batteryPropertiesChanged:
{
data.enforceInterface(DESCRIPTOR);
android.os.BatteryProperties _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.BatteryProperties.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.batteryPropertiesChanged(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.IBatteryPropertiesListener
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
@Override public void batteryPropertiesChanged(android.os.BatteryProperties props) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((props!=null)) {
_data.writeInt(1);
props.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_batteryPropertiesChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_batteryPropertiesChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void batteryPropertiesChanged(android.os.BatteryProperties props) throws android.os.RemoteException;
}
