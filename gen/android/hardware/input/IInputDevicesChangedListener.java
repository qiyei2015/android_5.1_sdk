/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/hardware/input/IInputDevicesChangedListener.aidl
 */
package android.hardware.input;
/** @hide */
public interface IInputDevicesChangedListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.input.IInputDevicesChangedListener
{
private static final java.lang.String DESCRIPTOR = "android.hardware.input.IInputDevicesChangedListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.input.IInputDevicesChangedListener interface,
 * generating a proxy if needed.
 */
public static android.hardware.input.IInputDevicesChangedListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.input.IInputDevicesChangedListener))) {
return ((android.hardware.input.IInputDevicesChangedListener)iin);
}
return new android.hardware.input.IInputDevicesChangedListener.Stub.Proxy(obj);
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
case TRANSACTION_onInputDevicesChanged:
{
data.enforceInterface(DESCRIPTOR);
int[] _arg0;
_arg0 = data.createIntArray();
this.onInputDevicesChanged(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.input.IInputDevicesChangedListener
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
/* Called when input devices changed, such as a device being added,
     * removed or changing configuration.
     *
     * The parameter is an array of pairs (deviceId, generation) indicating the current
     * device id and generation of all input devices.  The client can determine what
     * has happened by comparing the result to its prior observations.
     */
@Override public void onInputDevicesChanged(int[] deviceIdAndGeneration) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeIntArray(deviceIdAndGeneration);
mRemote.transact(Stub.TRANSACTION_onInputDevicesChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onInputDevicesChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/* Called when input devices changed, such as a device being added,
     * removed or changing configuration.
     *
     * The parameter is an array of pairs (deviceId, generation) indicating the current
     * device id and generation of all input devices.  The client can determine what
     * has happened by comparing the result to its prior observations.
     */
public void onInputDevicesChanged(int[] deviceIdAndGeneration) throws android.os.RemoteException;
}
