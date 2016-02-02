/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/hardware/hdmi/IHdmiInputChangeListener.aidl
 */
package android.hardware.hdmi;
/**
 * Callback interface definition for TV to get informed of
 * the input change event coming from other device.
 *
 * @hide
 */
public interface IHdmiInputChangeListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.hdmi.IHdmiInputChangeListener
{
private static final java.lang.String DESCRIPTOR = "android.hardware.hdmi.IHdmiInputChangeListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.hdmi.IHdmiInputChangeListener interface,
 * generating a proxy if needed.
 */
public static android.hardware.hdmi.IHdmiInputChangeListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.hdmi.IHdmiInputChangeListener))) {
return ((android.hardware.hdmi.IHdmiInputChangeListener)iin);
}
return new android.hardware.hdmi.IHdmiInputChangeListener.Stub.Proxy(obj);
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
case TRANSACTION_onChanged:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.hdmi.HdmiDeviceInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.hardware.hdmi.HdmiDeviceInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onChanged(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.hdmi.IHdmiInputChangeListener
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
@Override public void onChanged(android.hardware.hdmi.HdmiDeviceInfo device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onChanged(android.hardware.hdmi.HdmiDeviceInfo device) throws android.os.RemoteException;
}
