/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/hardware/ISerialManager.aidl
 */
package android.hardware;
/** @hide */
public interface ISerialManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.ISerialManager
{
private static final java.lang.String DESCRIPTOR = "android.hardware.ISerialManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.ISerialManager interface,
 * generating a proxy if needed.
 */
public static android.hardware.ISerialManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.ISerialManager))) {
return ((android.hardware.ISerialManager)iin);
}
return new android.hardware.ISerialManager.Stub.Proxy(obj);
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
case TRANSACTION_getSerialPorts:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getSerialPorts();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_openSerialPort:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.ParcelFileDescriptor _result = this.openSerialPort(_arg0);
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
private static class Proxy implements android.hardware.ISerialManager
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
/* Returns a list of all available serial ports */
@Override public java.lang.String[] getSerialPorts() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSerialPorts, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/* Returns a file descriptor for the serial port. */
@Override public android.os.ParcelFileDescriptor openSerialPort(java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.ParcelFileDescriptor _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_openSerialPort, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(_reply);
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
static final int TRANSACTION_getSerialPorts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_openSerialPort = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
/* Returns a list of all available serial ports */
public java.lang.String[] getSerialPorts() throws android.os.RemoteException;
/* Returns a file descriptor for the serial port. */
public android.os.ParcelFileDescriptor openSerialPort(java.lang.String name) throws android.os.RemoteException;
}
