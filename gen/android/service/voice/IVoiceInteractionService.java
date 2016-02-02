/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/service/voice/IVoiceInteractionService.aidl
 */
package android.service.voice;
/**
 * @hide
 */
public interface IVoiceInteractionService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.voice.IVoiceInteractionService
{
private static final java.lang.String DESCRIPTOR = "android.service.voice.IVoiceInteractionService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.voice.IVoiceInteractionService interface,
 * generating a proxy if needed.
 */
public static android.service.voice.IVoiceInteractionService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.voice.IVoiceInteractionService))) {
return ((android.service.voice.IVoiceInteractionService)iin);
}
return new android.service.voice.IVoiceInteractionService.Stub.Proxy(obj);
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
case TRANSACTION_ready:
{
data.enforceInterface(DESCRIPTOR);
this.ready();
return true;
}
case TRANSACTION_soundModelsChanged:
{
data.enforceInterface(DESCRIPTOR);
this.soundModelsChanged();
return true;
}
case TRANSACTION_shutdown:
{
data.enforceInterface(DESCRIPTOR);
this.shutdown();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.voice.IVoiceInteractionService
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
@Override public void ready() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_ready, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void soundModelsChanged() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_soundModelsChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void shutdown() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_shutdown, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_ready = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_soundModelsChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_shutdown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public void ready() throws android.os.RemoteException;
public void soundModelsChanged() throws android.os.RemoteException;
public void shutdown() throws android.os.RemoteException;
}
