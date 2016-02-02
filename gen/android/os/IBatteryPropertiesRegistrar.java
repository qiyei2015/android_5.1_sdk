/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/os/IBatteryPropertiesRegistrar.aidl
 */
package android.os;
/**
 * {@hide}
 */
public interface IBatteryPropertiesRegistrar extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.IBatteryPropertiesRegistrar
{
private static final java.lang.String DESCRIPTOR = "android.os.IBatteryPropertiesRegistrar";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.IBatteryPropertiesRegistrar interface,
 * generating a proxy if needed.
 */
public static android.os.IBatteryPropertiesRegistrar asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.IBatteryPropertiesRegistrar))) {
return ((android.os.IBatteryPropertiesRegistrar)iin);
}
return new android.os.IBatteryPropertiesRegistrar.Stub.Proxy(obj);
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
case TRANSACTION_registerListener:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBatteryPropertiesListener _arg0;
_arg0 = android.os.IBatteryPropertiesListener.Stub.asInterface(data.readStrongBinder());
this.registerListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterListener:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBatteryPropertiesListener _arg0;
_arg0 = android.os.IBatteryPropertiesListener.Stub.asInterface(data.readStrongBinder());
this.unregisterListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getProperty:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.os.BatteryProperty _arg1;
_arg1 = new android.os.BatteryProperty();
int _result = this.getProperty(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
if ((_arg1!=null)) {
reply.writeInt(1);
_arg1.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.IBatteryPropertiesRegistrar
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
@Override public void registerListener(android.os.IBatteryPropertiesListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterListener(android.os.IBatteryPropertiesListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getProperty(int id, android.os.BatteryProperty prop) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(id);
mRemote.transact(Stub.TRANSACTION_getProperty, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
if ((0!=_reply.readInt())) {
prop.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_registerListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getProperty = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public void registerListener(android.os.IBatteryPropertiesListener listener) throws android.os.RemoteException;
public void unregisterListener(android.os.IBatteryPropertiesListener listener) throws android.os.RemoteException;
public int getProperty(int id, android.os.BatteryProperty prop) throws android.os.RemoteException;
}
