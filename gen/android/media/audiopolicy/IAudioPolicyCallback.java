/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/media/java/android/media/audiopolicy/IAudioPolicyCallback.aidl
 */
package android.media.audiopolicy;
/**
 * @hide
 */
public interface IAudioPolicyCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.media.audiopolicy.IAudioPolicyCallback
{
private static final java.lang.String DESCRIPTOR = "android.media.audiopolicy.IAudioPolicyCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.media.audiopolicy.IAudioPolicyCallback interface,
 * generating a proxy if needed.
 */
public static android.media.audiopolicy.IAudioPolicyCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.media.audiopolicy.IAudioPolicyCallback))) {
return ((android.media.audiopolicy.IAudioPolicyCallback)iin);
}
return new android.media.audiopolicy.IAudioPolicyCallback.Stub.Proxy(obj);
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
case TRANSACTION_notifyAudioFocusGrant:
{
data.enforceInterface(DESCRIPTOR);
android.media.AudioFocusInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.media.AudioFocusInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.notifyAudioFocusGrant(_arg0, _arg1);
return true;
}
case TRANSACTION_notifyAudioFocusLoss:
{
data.enforceInterface(DESCRIPTOR);
android.media.AudioFocusInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.media.AudioFocusInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
this.notifyAudioFocusLoss(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.media.audiopolicy.IAudioPolicyCallback
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
// callbacks for audio focus

@Override public void notifyAudioFocusGrant(android.media.AudioFocusInfo afi, int requestResult) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((afi!=null)) {
_data.writeInt(1);
afi.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(requestResult);
mRemote.transact(Stub.TRANSACTION_notifyAudioFocusGrant, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void notifyAudioFocusLoss(android.media.AudioFocusInfo afi, boolean wasNotified) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((afi!=null)) {
_data.writeInt(1);
afi.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((wasNotified)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_notifyAudioFocusLoss, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_notifyAudioFocusGrant = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_notifyAudioFocusLoss = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
// callbacks for audio focus

public void notifyAudioFocusGrant(android.media.AudioFocusInfo afi, int requestResult) throws android.os.RemoteException;
public void notifyAudioFocusLoss(android.media.AudioFocusInfo afi, boolean wasNotified) throws android.os.RemoteException;
}
