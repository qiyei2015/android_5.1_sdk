/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/hardware/soundtrigger/IRecognitionStatusCallback.aidl
 */
package android.hardware.soundtrigger;
/**
 * @hide
 */
public interface IRecognitionStatusCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.soundtrigger.IRecognitionStatusCallback
{
private static final java.lang.String DESCRIPTOR = "android.hardware.soundtrigger.IRecognitionStatusCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.soundtrigger.IRecognitionStatusCallback interface,
 * generating a proxy if needed.
 */
public static android.hardware.soundtrigger.IRecognitionStatusCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.soundtrigger.IRecognitionStatusCallback))) {
return ((android.hardware.soundtrigger.IRecognitionStatusCallback)iin);
}
return new android.hardware.soundtrigger.IRecognitionStatusCallback.Stub.Proxy(obj);
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
case TRANSACTION_onDetected:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onDetected(_arg0);
return true;
}
case TRANSACTION_onError:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onError(_arg0);
return true;
}
case TRANSACTION_onRecognitionPaused:
{
data.enforceInterface(DESCRIPTOR);
this.onRecognitionPaused();
return true;
}
case TRANSACTION_onRecognitionResumed:
{
data.enforceInterface(DESCRIPTOR);
this.onRecognitionResumed();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.soundtrigger.IRecognitionStatusCallback
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
     * Called when the keyphrase is spoken.
     *
     * @param data Optional trigger audio data, if it was requested and is available.
     */
@Override public void onDetected(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent recognitionEvent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((recognitionEvent!=null)) {
_data.writeInt(1);
recognitionEvent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onDetected, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when the detection fails due to an error.
     *
     * @param status The error code that was seen.
     */
@Override public void onError(int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onError, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when the recognition is paused temporarily for some reason.
     */
@Override public void onRecognitionPaused() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onRecognitionPaused, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when the recognition is resumed after it was temporarily paused.
     */
@Override public void onRecognitionResumed() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onRecognitionResumed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onDetected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onRecognitionPaused = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onRecognitionResumed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
/**
     * Called when the keyphrase is spoken.
     *
     * @param data Optional trigger audio data, if it was requested and is available.
     */
public void onDetected(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent recognitionEvent) throws android.os.RemoteException;
/**
     * Called when the detection fails due to an error.
     *
     * @param status The error code that was seen.
     */
public void onError(int status) throws android.os.RemoteException;
/**
     * Called when the recognition is paused temporarily for some reason.
     */
public void onRecognitionPaused() throws android.os.RemoteException;
/**
     * Called when the recognition is resumed after it was temporarily paused.
     */
public void onRecognitionResumed() throws android.os.RemoteException;
}
