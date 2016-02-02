/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/hardware/ISensorManager.aidl
 */
package android.hardware;
/**
 * System private interface to the remote sensor manager.
 *
 * {@hide}
 */
public interface ISensorManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.ISensorManager
{
private static final java.lang.String DESCRIPTOR = "android.hardware.ISensorManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.ISensorManager interface,
 * generating a proxy if needed.
 */
public static android.hardware.ISensorManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.ISensorManager))) {
return ((android.hardware.ISensorManager)iin);
}
return new android.hardware.ISensorManager.Stub.Proxy(obj);
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
case TRANSACTION_getRemoteSensorType:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getRemoteSensorType();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_obtainSensorEvent:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.hardware.SensorParcel _result = this.obtainSensorEvent(_arg0);
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
case TRANSACTION_createSensorQueue:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.createSensorQueue();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_destroySensorQueue:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.destroySensorQueue(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.ISensorManager
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
@Override public int getRemoteSensorType() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getRemoteSensorType, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.hardware.SensorParcel obtainSensorEvent(int queue) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.SensorParcel _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(queue);
mRemote.transact(Stub.TRANSACTION_obtainSensorEvent, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.hardware.SensorParcel.CREATOR.createFromParcel(_reply);
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
@Override public int createSensorQueue() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_createSensorQueue, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void destroySensorQueue(int queue) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(queue);
mRemote.transact(Stub.TRANSACTION_destroySensorQueue, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getRemoteSensorType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_obtainSensorEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_createSensorQueue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_destroySensorQueue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public int getRemoteSensorType() throws android.os.RemoteException;
public android.hardware.SensorParcel obtainSensorEvent(int queue) throws android.os.RemoteException;
public int createSensorQueue() throws android.os.RemoteException;
public void destroySensorQueue(int queue) throws android.os.RemoteException;
}
