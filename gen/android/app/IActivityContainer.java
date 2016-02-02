/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/app/IActivityContainer.aidl
 */
package android.app;
/** @hide */
public interface IActivityContainer extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.IActivityContainer
{
private static final java.lang.String DESCRIPTOR = "android.app.IActivityContainer";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.IActivityContainer interface,
 * generating a proxy if needed.
 */
public static android.app.IActivityContainer asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.IActivityContainer))) {
return ((android.app.IActivityContainer)iin);
}
return new android.app.IActivityContainer.Stub.Proxy(obj);
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
case TRANSACTION_attachToDisplay:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.attachToDisplay(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setSurface:
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
this.setSurface(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_startActivity:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.startActivity(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_startActivityIntentSender:
{
data.enforceInterface(DESCRIPTOR);
android.content.IIntentSender _arg0;
_arg0 = android.content.IIntentSender.Stub.asInterface(data.readStrongBinder());
int _result = this.startActivityIntentSender(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_checkEmbeddedAllowed:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.checkEmbeddedAllowed(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_checkEmbeddedAllowedIntentSender:
{
data.enforceInterface(DESCRIPTOR);
android.content.IIntentSender _arg0;
_arg0 = android.content.IIntentSender.Stub.asInterface(data.readStrongBinder());
this.checkEmbeddedAllowedIntentSender(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getDisplayId:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getDisplayId();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_injectEvent:
{
data.enforceInterface(DESCRIPTOR);
android.view.InputEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.InputEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.injectEvent(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_release:
{
data.enforceInterface(DESCRIPTOR);
this.release();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.IActivityContainer
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
@Override public void attachToDisplay(int displayId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(displayId);
mRemote.transact(Stub.TRANSACTION_attachToDisplay, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setSurface(android.view.Surface surface, int width, int height, int density) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_setSurface, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int startActivity(android.content.Intent intent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startActivity, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int startActivityIntentSender(android.content.IIntentSender intentSender) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((intentSender!=null))?(intentSender.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_startActivityIntentSender, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void checkEmbeddedAllowed(android.content.Intent intent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_checkEmbeddedAllowed, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void checkEmbeddedAllowedIntentSender(android.content.IIntentSender intentSender) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((intentSender!=null))?(intentSender.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_checkEmbeddedAllowedIntentSender, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getDisplayId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDisplayId, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean injectEvent(android.view.InputEvent event) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((event!=null)) {
_data.writeInt(1);
event.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_injectEvent, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void release() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_release, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_attachToDisplay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setSurface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_startActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_startActivityIntentSender = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_checkEmbeddedAllowed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_checkEmbeddedAllowedIntentSender = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getDisplayId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_injectEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_release = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
}
public void attachToDisplay(int displayId) throws android.os.RemoteException;
public void setSurface(android.view.Surface surface, int width, int height, int density) throws android.os.RemoteException;
public int startActivity(android.content.Intent intent) throws android.os.RemoteException;
public int startActivityIntentSender(android.content.IIntentSender intentSender) throws android.os.RemoteException;
public void checkEmbeddedAllowed(android.content.Intent intent) throws android.os.RemoteException;
public void checkEmbeddedAllowedIntentSender(android.content.IIntentSender intentSender) throws android.os.RemoteException;
public int getDisplayId() throws android.os.RemoteException;
public boolean injectEvent(android.view.InputEvent event) throws android.os.RemoteException;
public void release() throws android.os.RemoteException;
}
