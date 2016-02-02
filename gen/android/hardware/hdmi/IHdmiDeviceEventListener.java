/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/hardware/hdmi/IHdmiDeviceEventListener.aidl
 */
package android.hardware.hdmi;
/**
 * Callback interface definition for HDMI client to get informed of
 * the CEC logical device status change event.
 *
 * @hide
 */
public interface IHdmiDeviceEventListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.hdmi.IHdmiDeviceEventListener
{
private static final java.lang.String DESCRIPTOR = "android.hardware.hdmi.IHdmiDeviceEventListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.hdmi.IHdmiDeviceEventListener interface,
 * generating a proxy if needed.
 */
public static android.hardware.hdmi.IHdmiDeviceEventListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.hdmi.IHdmiDeviceEventListener))) {
return ((android.hardware.hdmi.IHdmiDeviceEventListener)iin);
}
return new android.hardware.hdmi.IHdmiDeviceEventListener.Stub.Proxy(obj);
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
case TRANSACTION_onStatusChanged:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.hdmi.HdmiDeviceInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.hardware.hdmi.HdmiDeviceInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.onStatusChanged(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.hdmi.IHdmiDeviceEventListener
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
     * @param deviceInfo {@link HdmiDeviceInfo} of the logical device whose
     *                   status has changed
     * @param status device status. It should be one of the following values
     *        <ul>
     *        <li>{@link HdmiControlManager#DEVICE_EVENT_ADD_DEVICE}
     *        <li>{@link HdmiControlManager#DEVICE_EVENT_REMOVE_DEVICE}
     *        <li>{@link HdmiControlManager#DEVICE_EVENT_UPDATE_DEVICE}
     *        </ul>
     */
@Override public void onStatusChanged(android.hardware.hdmi.HdmiDeviceInfo deviceInfo, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((deviceInfo!=null)) {
_data.writeInt(1);
deviceInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onStatusChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onStatusChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * @param deviceInfo {@link HdmiDeviceInfo} of the logical device whose
     *                   status has changed
     * @param status device status. It should be one of the following values
     *        <ul>
     *        <li>{@link HdmiControlManager#DEVICE_EVENT_ADD_DEVICE}
     *        <li>{@link HdmiControlManager#DEVICE_EVENT_REMOVE_DEVICE}
     *        <li>{@link HdmiControlManager#DEVICE_EVENT_UPDATE_DEVICE}
     *        </ul>
     */
public void onStatusChanged(android.hardware.hdmi.HdmiDeviceInfo deviceInfo, int status) throws android.os.RemoteException;
}
