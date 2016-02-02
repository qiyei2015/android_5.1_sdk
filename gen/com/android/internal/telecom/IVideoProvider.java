/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/telecomm/java/com/android/internal/telecom/IVideoProvider.aidl
 */
package com.android.internal.telecom;
/**
 * Internal remote interface for a video call provider.
 * @see android.telecom.VideoProvider
 * @hide
 */
public interface IVideoProvider extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.IVideoProvider
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.IVideoProvider";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.telecom.IVideoProvider interface,
 * generating a proxy if needed.
 */
public static com.android.internal.telecom.IVideoProvider asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.telecom.IVideoProvider))) {
return ((com.android.internal.telecom.IVideoProvider)iin);
}
return new com.android.internal.telecom.IVideoProvider.Stub.Proxy(obj);
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
case TRANSACTION_setVideoCallback:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.setVideoCallback(_arg0);
return true;
}
case TRANSACTION_setCamera:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.setCamera(_arg0);
return true;
}
case TRANSACTION_setPreviewSurface:
{
data.enforceInterface(DESCRIPTOR);
android.view.Surface _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.Surface.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setPreviewSurface(_arg0);
return true;
}
case TRANSACTION_setDisplaySurface:
{
data.enforceInterface(DESCRIPTOR);
android.view.Surface _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.Surface.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setDisplaySurface(_arg0);
return true;
}
case TRANSACTION_setDeviceOrientation:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setDeviceOrientation(_arg0);
return true;
}
case TRANSACTION_setZoom:
{
data.enforceInterface(DESCRIPTOR);
float _arg0;
_arg0 = data.readFloat();
this.setZoom(_arg0);
return true;
}
case TRANSACTION_sendSessionModifyRequest:
{
data.enforceInterface(DESCRIPTOR);
android.telecom.VideoProfile _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telecom.VideoProfile.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.sendSessionModifyRequest(_arg0);
return true;
}
case TRANSACTION_sendSessionModifyResponse:
{
data.enforceInterface(DESCRIPTOR);
android.telecom.VideoProfile _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telecom.VideoProfile.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.sendSessionModifyResponse(_arg0);
return true;
}
case TRANSACTION_requestCameraCapabilities:
{
data.enforceInterface(DESCRIPTOR);
this.requestCameraCapabilities();
return true;
}
case TRANSACTION_requestCallDataUsage:
{
data.enforceInterface(DESCRIPTOR);
this.requestCallDataUsage();
return true;
}
case TRANSACTION_setPauseImage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.setPauseImage(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.telecom.IVideoProvider
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
@Override public void setVideoCallback(android.os.IBinder videoCallbackBinder) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(videoCallbackBinder);
mRemote.transact(Stub.TRANSACTION_setVideoCallback, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setCamera(java.lang.String cameraId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(cameraId);
mRemote.transact(Stub.TRANSACTION_setCamera, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setPreviewSurface(android.view.Surface surface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((surface!=null)) {
_data.writeInt(1);
surface.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setPreviewSurface, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setDisplaySurface(android.view.Surface surface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((surface!=null)) {
_data.writeInt(1);
surface.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setDisplaySurface, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setDeviceOrientation(int rotation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(rotation);
mRemote.transact(Stub.TRANSACTION_setDeviceOrientation, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setZoom(float value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeFloat(value);
mRemote.transact(Stub.TRANSACTION_setZoom, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void sendSessionModifyRequest(android.telecom.VideoProfile reqProfile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((reqProfile!=null)) {
_data.writeInt(1);
reqProfile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendSessionModifyRequest, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void sendSessionModifyResponse(android.telecom.VideoProfile responseProfile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((responseProfile!=null)) {
_data.writeInt(1);
responseProfile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendSessionModifyResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void requestCameraCapabilities() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_requestCameraCapabilities, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void requestCallDataUsage() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_requestCallDataUsage, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setPauseImage(java.lang.String uri) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(uri);
mRemote.transact(Stub.TRANSACTION_setPauseImage, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_setVideoCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setCamera = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setPreviewSurface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setDisplaySurface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setDeviceOrientation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setZoom = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_sendSessionModifyRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_sendSessionModifyResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_requestCameraCapabilities = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_requestCallDataUsage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_setPauseImage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
}
public void setVideoCallback(android.os.IBinder videoCallbackBinder) throws android.os.RemoteException;
public void setCamera(java.lang.String cameraId) throws android.os.RemoteException;
public void setPreviewSurface(android.view.Surface surface) throws android.os.RemoteException;
public void setDisplaySurface(android.view.Surface surface) throws android.os.RemoteException;
public void setDeviceOrientation(int rotation) throws android.os.RemoteException;
public void setZoom(float value) throws android.os.RemoteException;
public void sendSessionModifyRequest(android.telecom.VideoProfile reqProfile) throws android.os.RemoteException;
public void sendSessionModifyResponse(android.telecom.VideoProfile responseProfile) throws android.os.RemoteException;
public void requestCameraCapabilities() throws android.os.RemoteException;
public void requestCallDataUsage() throws android.os.RemoteException;
public void setPauseImage(java.lang.String uri) throws android.os.RemoteException;
}
