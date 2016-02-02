/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/hardware/location/IActivityRecognitionHardwareSink.aidl
 */
package android.hardware.location;
/**
 * Activity Recognition Hardware provider Sink interface.
 * This interface can be used to implement sinks to receive activity notifications.
 *
 * @hide
 */
public interface IActivityRecognitionHardwareSink extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.location.IActivityRecognitionHardwareSink
{
private static final java.lang.String DESCRIPTOR = "android.hardware.location.IActivityRecognitionHardwareSink";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.location.IActivityRecognitionHardwareSink interface,
 * generating a proxy if needed.
 */
public static android.hardware.location.IActivityRecognitionHardwareSink asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.location.IActivityRecognitionHardwareSink))) {
return ((android.hardware.location.IActivityRecognitionHardwareSink)iin);
}
return new android.hardware.location.IActivityRecognitionHardwareSink.Stub.Proxy(obj);
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
case TRANSACTION_onActivityChanged:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.location.ActivityChangedEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.hardware.location.ActivityChangedEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onActivityChanged(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.location.IActivityRecognitionHardwareSink
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
     * Activity changed event.
     */
@Override public void onActivityChanged(android.hardware.location.ActivityChangedEvent event) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_onActivityChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onActivityChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * Activity changed event.
     */
public void onActivityChanged(android.hardware.location.ActivityChangedEvent event) throws android.os.RemoteException;
}
