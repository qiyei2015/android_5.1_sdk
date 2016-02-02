/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/hardware/IConsumerIrService.aidl
 */
package android.hardware;
/** {@hide} */
public interface IConsumerIrService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.IConsumerIrService
{
private static final java.lang.String DESCRIPTOR = "android.hardware.IConsumerIrService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.IConsumerIrService interface,
 * generating a proxy if needed.
 */
public static android.hardware.IConsumerIrService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.IConsumerIrService))) {
return ((android.hardware.IConsumerIrService)iin);
}
return new android.hardware.IConsumerIrService.Stub.Proxy(obj);
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
case TRANSACTION_hasIrEmitter:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.hasIrEmitter();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_transmit:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int[] _arg2;
_arg2 = data.createIntArray();
this.transmit(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getCarrierFrequencies:
{
data.enforceInterface(DESCRIPTOR);
int[] _result = this.getCarrierFrequencies();
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.IConsumerIrService
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
@Override public boolean hasIrEmitter() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_hasIrEmitter, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void transmit(java.lang.String packageName, int carrierFrequency, int[] pattern) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(carrierFrequency);
_data.writeIntArray(pattern);
mRemote.transact(Stub.TRANSACTION_transmit, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int[] getCarrierFrequencies() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCarrierFrequencies, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_hasIrEmitter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_transmit = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getCarrierFrequencies = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public boolean hasIrEmitter() throws android.os.RemoteException;
public void transmit(java.lang.String packageName, int carrierFrequency, int[] pattern) throws android.os.RemoteException;
public int[] getCarrierFrequencies() throws android.os.RemoteException;
}
