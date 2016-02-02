/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/cts/apps/CtsVerifier/src/com/android/cts/verifier/projection/IProjectionService.aidl
 */
package com.android.cts.verifier.projection;
public interface IProjectionService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.cts.verifier.projection.IProjectionService
{
private static final java.lang.String DESCRIPTOR = "com.android.cts.verifier.projection.IProjectionService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.cts.verifier.projection.IProjectionService interface,
 * generating a proxy if needed.
 */
public static com.android.cts.verifier.projection.IProjectionService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.cts.verifier.projection.IProjectionService))) {
return ((com.android.cts.verifier.projection.IProjectionService)iin);
}
return new com.android.cts.verifier.projection.IProjectionService.Stub.Proxy(obj);
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
case TRANSACTION_startRendering:
{
data.enforceInterface(DESCRIPTOR);
android.view.Surface _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.Surface.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
this.startRendering(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_stopRendering:
{
data.enforceInterface(DESCRIPTOR);
this.stopRendering();
reply.writeNoException();
return true;
}
case TRANSACTION_onTouchEvent:
{
data.enforceInterface(DESCRIPTOR);
android.view.MotionEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.MotionEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onTouchEvent(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onKeyEvent:
{
data.enforceInterface(DESCRIPTOR);
android.view.KeyEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.KeyEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onKeyEvent(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.cts.verifier.projection.IProjectionService
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
@Override public void startRendering(android.view.Surface surface, int width, int height, int density, int viewType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((surface!=null)) {
_data.writeInt(1);
surface.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(width);
_data.writeInt(height);
_data.writeInt(density);
_data.writeInt(viewType);
mRemote.transact(Stub.TRANSACTION_startRendering, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopRendering() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopRendering, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onTouchEvent(android.view.MotionEvent event) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((event!=null)) {
_data.writeInt(1);
event.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onTouchEvent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onKeyEvent(android.view.KeyEvent event) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((event!=null)) {
_data.writeInt(1);
event.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onKeyEvent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_startRendering = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_stopRendering = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onTouchEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onKeyEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public void startRendering(android.view.Surface surface, int width, int height, int density, int viewType) throws android.os.RemoteException;
public void stopRendering() throws android.os.RemoteException;
public void onTouchEvent(android.view.MotionEvent event) throws android.os.RemoteException;
public void onKeyEvent(android.view.KeyEvent event) throws android.os.RemoteException;
}
