/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/service/voice/IVoiceInteractionSession.aidl
 */
package android.service.voice;
/**
 * @hide
 */
public interface IVoiceInteractionSession extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.voice.IVoiceInteractionSession
{
private static final java.lang.String DESCRIPTOR = "android.service.voice.IVoiceInteractionSession";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.voice.IVoiceInteractionSession interface,
 * generating a proxy if needed.
 */
public static android.service.voice.IVoiceInteractionSession asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.voice.IVoiceInteractionSession))) {
return ((android.service.voice.IVoiceInteractionSession)iin);
}
return new android.service.voice.IVoiceInteractionSession.Stub.Proxy(obj);
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
case TRANSACTION_taskStarted:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.taskStarted(_arg0, _arg1);
return true;
}
case TRANSACTION_taskFinished:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.taskFinished(_arg0, _arg1);
return true;
}
case TRANSACTION_closeSystemDialogs:
{
data.enforceInterface(DESCRIPTOR);
this.closeSystemDialogs();
return true;
}
case TRANSACTION_destroy:
{
data.enforceInterface(DESCRIPTOR);
this.destroy();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.voice.IVoiceInteractionSession
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
@Override public void taskStarted(android.content.Intent intent, int taskId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(taskId);
mRemote.transact(Stub.TRANSACTION_taskStarted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void taskFinished(android.content.Intent intent, int taskId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(taskId);
mRemote.transact(Stub.TRANSACTION_taskFinished, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void closeSystemDialogs() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_closeSystemDialogs, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void destroy() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_destroy, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_taskStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_taskFinished = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_closeSystemDialogs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_destroy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public void taskStarted(android.content.Intent intent, int taskId) throws android.os.RemoteException;
public void taskFinished(android.content.Intent intent, int taskId) throws android.os.RemoteException;
public void closeSystemDialogs() throws android.os.RemoteException;
public void destroy() throws android.os.RemoteException;
}
