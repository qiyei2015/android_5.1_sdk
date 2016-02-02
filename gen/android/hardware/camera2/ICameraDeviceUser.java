/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/hardware/camera2/ICameraDeviceUser.aidl
 */
package android.hardware.camera2;
/** @hide */
public interface ICameraDeviceUser extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.camera2.ICameraDeviceUser
{
private static final java.lang.String DESCRIPTOR = "android.hardware.camera2.ICameraDeviceUser";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.camera2.ICameraDeviceUser interface,
 * generating a proxy if needed.
 */
public static android.hardware.camera2.ICameraDeviceUser asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.camera2.ICameraDeviceUser))) {
return ((android.hardware.camera2.ICameraDeviceUser)iin);
}
return new android.hardware.camera2.ICameraDeviceUser.Stub.Proxy(obj);
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
case TRANSACTION_disconnect:
{
data.enforceInterface(DESCRIPTOR);
this.disconnect();
reply.writeNoException();
return true;
}
case TRANSACTION_submitRequest:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.camera2.CaptureRequest _arg0;
if ((0!=data.readInt())) {
_arg0 = android.hardware.camera2.CaptureRequest.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
android.hardware.camera2.utils.LongParcelable _arg2;
_arg2 = new android.hardware.camera2.utils.LongParcelable();
int _result = this.submitRequest(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
if ((_arg2!=null)) {
reply.writeInt(1);
_arg2.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_submitRequestList:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.hardware.camera2.CaptureRequest> _arg0;
_arg0 = data.createTypedArrayList(android.hardware.camera2.CaptureRequest.CREATOR);
boolean _arg1;
_arg1 = (0!=data.readInt());
android.hardware.camera2.utils.LongParcelable _arg2;
_arg2 = new android.hardware.camera2.utils.LongParcelable();
int _result = this.submitRequestList(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
if ((_arg2!=null)) {
reply.writeInt(1);
_arg2.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_cancelRequest:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.hardware.camera2.utils.LongParcelable _arg1;
_arg1 = new android.hardware.camera2.utils.LongParcelable();
int _result = this.cancelRequest(_arg0, _arg1);
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
case TRANSACTION_beginConfigure:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.beginConfigure();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_endConfigure:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.endConfigure();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_deleteStream:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.deleteStream(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_createStream:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
android.view.Surface _arg3;
if ((0!=data.readInt())) {
_arg3 = android.view.Surface.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
int _result = this.createStream(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_createDefaultRequest:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.hardware.camera2.impl.CameraMetadataNative _arg1;
_arg1 = new android.hardware.camera2.impl.CameraMetadataNative();
int _result = this.createDefaultRequest(_arg0, _arg1);
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
case TRANSACTION_getCameraInfo:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.camera2.impl.CameraMetadataNative _arg0;
_arg0 = new android.hardware.camera2.impl.CameraMetadataNative();
int _result = this.getCameraInfo(_arg0);
reply.writeNoException();
reply.writeInt(_result);
if ((_arg0!=null)) {
reply.writeInt(1);
_arg0.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_waitUntilIdle:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.waitUntilIdle();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_flush:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.camera2.utils.LongParcelable _arg0;
_arg0 = new android.hardware.camera2.utils.LongParcelable();
int _result = this.flush(_arg0);
reply.writeNoException();
reply.writeInt(_result);
if ((_arg0!=null)) {
reply.writeInt(1);
_arg0.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.camera2.ICameraDeviceUser
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
     * Keep up-to-date with frameworks/av/include/camera/camera2/ICameraDeviceUser.h and
     * frameworks/base/core/java/android/hardware/camera2/legacy/CameraDeviceUserShim.java
     */
@Override public void disconnect() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_disconnect, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// ints here are status_t
// non-negative value is the requestId. negative value is status_t

@Override public int submitRequest(android.hardware.camera2.CaptureRequest request, boolean streaming, android.hardware.camera2.utils.LongParcelable lastFrameNumber) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((request!=null)) {
_data.writeInt(1);
request.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((streaming)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_submitRequest, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
if ((0!=_reply.readInt())) {
lastFrameNumber.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int submitRequestList(java.util.List<android.hardware.camera2.CaptureRequest> requestList, boolean streaming, android.hardware.camera2.utils.LongParcelable lastFrameNumber) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(requestList);
_data.writeInt(((streaming)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_submitRequestList, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
if ((0!=_reply.readInt())) {
lastFrameNumber.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int cancelRequest(int requestId, android.hardware.camera2.utils.LongParcelable lastFrameNumber) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(requestId);
mRemote.transact(Stub.TRANSACTION_cancelRequest, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
if ((0!=_reply.readInt())) {
lastFrameNumber.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Begin the device configuration.
     *
     * <p>
     * beginConfigure must be called before any call to deleteStream, createStream,
     * or endConfigure.  It is not valid to call this when the device is not idle.
     * <p>
     */
@Override public int beginConfigure() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_beginConfigure, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * End the device configuration.
     *
     * <p>
     * endConfigure must be called after stream configuration is complete (i.e. after
     * a call to beginConfigure and subsequent createStream/deleteStream calls).  This
     * must be called before any requests can be submitted.
     * <p>
     */
@Override public int endConfigure() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_endConfigure, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int deleteStream(int streamId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(streamId);
mRemote.transact(Stub.TRANSACTION_deleteStream, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// non-negative value is the stream ID. negative value is status_t

@Override public int createStream(int width, int height, int format, android.view.Surface surface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(width);
_data.writeInt(height);
_data.writeInt(format);
if ((surface!=null)) {
_data.writeInt(1);
surface.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_createStream, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int createDefaultRequest(int templateId, android.hardware.camera2.impl.CameraMetadataNative request) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(templateId);
mRemote.transact(Stub.TRANSACTION_createDefaultRequest, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
if ((0!=_reply.readInt())) {
request.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getCameraInfo(android.hardware.camera2.impl.CameraMetadataNative info) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCameraInfo, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
if ((0!=_reply.readInt())) {
info.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int waitUntilIdle() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_waitUntilIdle, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int flush(android.hardware.camera2.utils.LongParcelable lastFrameNumber) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_flush, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
if ((0!=_reply.readInt())) {
lastFrameNumber.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_disconnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_submitRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_submitRequestList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_cancelRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_beginConfigure = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_endConfigure = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_deleteStream = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_createStream = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_createDefaultRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getCameraInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_waitUntilIdle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_flush = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
}
/**
     * Keep up-to-date with frameworks/av/include/camera/camera2/ICameraDeviceUser.h and
     * frameworks/base/core/java/android/hardware/camera2/legacy/CameraDeviceUserShim.java
     */
public void disconnect() throws android.os.RemoteException;
// ints here are status_t
// non-negative value is the requestId. negative value is status_t

public int submitRequest(android.hardware.camera2.CaptureRequest request, boolean streaming, android.hardware.camera2.utils.LongParcelable lastFrameNumber) throws android.os.RemoteException;
public int submitRequestList(java.util.List<android.hardware.camera2.CaptureRequest> requestList, boolean streaming, android.hardware.camera2.utils.LongParcelable lastFrameNumber) throws android.os.RemoteException;
public int cancelRequest(int requestId, android.hardware.camera2.utils.LongParcelable lastFrameNumber) throws android.os.RemoteException;
/**
     * Begin the device configuration.
     *
     * <p>
     * beginConfigure must be called before any call to deleteStream, createStream,
     * or endConfigure.  It is not valid to call this when the device is not idle.
     * <p>
     */
public int beginConfigure() throws android.os.RemoteException;
/**
     * End the device configuration.
     *
     * <p>
     * endConfigure must be called after stream configuration is complete (i.e. after
     * a call to beginConfigure and subsequent createStream/deleteStream calls).  This
     * must be called before any requests can be submitted.
     * <p>
     */
public int endConfigure() throws android.os.RemoteException;
public int deleteStream(int streamId) throws android.os.RemoteException;
// non-negative value is the stream ID. negative value is status_t

public int createStream(int width, int height, int format, android.view.Surface surface) throws android.os.RemoteException;
public int createDefaultRequest(int templateId, android.hardware.camera2.impl.CameraMetadataNative request) throws android.os.RemoteException;
public int getCameraInfo(android.hardware.camera2.impl.CameraMetadataNative info) throws android.os.RemoteException;
public int waitUntilIdle() throws android.os.RemoteException;
public int flush(android.hardware.camera2.utils.LongParcelable lastFrameNumber) throws android.os.RemoteException;
}
