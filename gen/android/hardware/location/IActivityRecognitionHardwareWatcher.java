/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/hardware/location/IActivityRecognitionHardwareWatcher.aidl
 */
package android.hardware.location;
/**
 * Activity Recognition Hardware watcher. This interface can be used to receive interfaces to
 * implementations of {@link IActivityRecognitionHardware}.
 *
 * @hide
 */
public interface IActivityRecognitionHardwareWatcher extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.location.IActivityRecognitionHardwareWatcher
{
private static final java.lang.String DESCRIPTOR = "android.hardware.location.IActivityRecognitionHardwareWatcher";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.location.IActivityRecognitionHardwareWatcher interface,
 * generating a proxy if needed.
 */
public static android.hardware.location.IActivityRecognitionHardwareWatcher asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.location.IActivityRecognitionHardwareWatcher))) {
return ((android.hardware.location.IActivityRecognitionHardwareWatcher)iin);
}
return new android.hardware.location.IActivityRecognitionHardwareWatcher.Stub.Proxy(obj);
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
case TRANSACTION_onInstanceChanged:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.location.IActivityRecognitionHardware _arg0;
_arg0 = android.hardware.location.IActivityRecognitionHardware.Stub.asInterface(data.readStrongBinder());
this.onInstanceChanged(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.location.IActivityRecognitionHardwareWatcher
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
     * Hardware Activity-Recognition availability event.
     */
@Override public void onInstanceChanged(android.hardware.location.IActivityRecognitionHardware instance) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((instance!=null))?(instance.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_onInstanceChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onInstanceChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * Hardware Activity-Recognition availability event.
     */
public void onInstanceChanged(android.hardware.location.IActivityRecognitionHardware instance) throws android.os.RemoteException;
}
