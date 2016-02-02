/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/hardware/hdmi/IHdmiRecordListener.aidl
 */
package android.hardware.hdmi;
/**
 * @hide
 */
public interface IHdmiRecordListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.hdmi.IHdmiRecordListener
{
private static final java.lang.String DESCRIPTOR = "android.hardware.hdmi.IHdmiRecordListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.hdmi.IHdmiRecordListener interface,
 * generating a proxy if needed.
 */
public static android.hardware.hdmi.IHdmiRecordListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.hdmi.IHdmiRecordListener))) {
return ((android.hardware.hdmi.IHdmiRecordListener)iin);
}
return new android.hardware.hdmi.IHdmiRecordListener.Stub.Proxy(obj);
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
case TRANSACTION_getOneTouchRecordSource:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
byte[] _result = this.getOneTouchRecordSource(_arg0);
reply.writeNoException();
reply.writeByteArray(_result);
return true;
}
case TRANSACTION_onOneTouchRecordResult:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onOneTouchRecordResult(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onTimerRecordingResult:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onTimerRecordingResult(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onClearTimerRecordingResult:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onClearTimerRecordingResult(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.hdmi.IHdmiRecordListener
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
/**
      * Called when TV received one touch record request from record device.
      *
      * @param recorderAddress
      * @return record source in byte array.
      */
@Override public byte[] getOneTouchRecordSource(int recorderAddress) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
byte[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(recorderAddress);
mRemote.transact(Stub.TRANSACTION_getOneTouchRecordSource, _data, _reply, 0);
_reply.readException();
_result = _reply.createByteArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
      * Called when one touch record is started or failed during initialization.
      *
      * @param recorderAddress An address of recorder that reports result of one touch record
      *            request
      * @param result result code for one touch record
      */
@Override public void onOneTouchRecordResult(int recorderAddress, int result) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(recorderAddress);
_data.writeInt(result);
mRemote.transact(Stub.TRANSACTION_onOneTouchRecordResult, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
      * Called when timer recording is started or failed during initialization.
      *
      * @param recorderAddress An address of recorder that reports result of timer recording
      *            request
      * @param result result code for timer recording
      */
@Override public void onTimerRecordingResult(int recorderAddress, int result) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(recorderAddress);
_data.writeInt(result);
mRemote.transact(Stub.TRANSACTION_onTimerRecordingResult, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
      * Called when receiving result for clear timer recording request.
      *
      * @param recorderAddress An address of recorder that reports result of clear timer recording
      *            request
      * @param result result of clear timer
      */
@Override public void onClearTimerRecordingResult(int recorderAddress, int result) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(recorderAddress);
_data.writeInt(result);
mRemote.transact(Stub.TRANSACTION_onClearTimerRecordingResult, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getOneTouchRecordSource = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onOneTouchRecordResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onTimerRecordingResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onClearTimerRecordingResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
/**
      * Called when TV received one touch record request from record device.
      *
      * @param recorderAddress
      * @return record source in byte array.
      */
public byte[] getOneTouchRecordSource(int recorderAddress) throws android.os.RemoteException;
/**
      * Called when one touch record is started or failed during initialization.
      *
      * @param recorderAddress An address of recorder that reports result of one touch record
      *            request
      * @param result result code for one touch record
      */
public void onOneTouchRecordResult(int recorderAddress, int result) throws android.os.RemoteException;
/**
      * Called when timer recording is started or failed during initialization.
      *
      * @param recorderAddress An address of recorder that reports result of timer recording
      *            request
      * @param result result code for timer recording
      */
public void onTimerRecordingResult(int recorderAddress, int result) throws android.os.RemoteException;
/**
      * Called when receiving result for clear timer recording request.
      *
      * @param recorderAddress An address of recorder that reports result of clear timer recording
      *            request
      * @param result result of clear timer
      */
public void onClearTimerRecordingResult(int recorderAddress, int result) throws android.os.RemoteException;
}
