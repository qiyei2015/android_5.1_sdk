/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/hardware/hdmi/IHdmiSystemAudioModeChangeListener.aidl
 */
package android.hardware.hdmi;
/**
 * Callback interface definition for HDMI client to get informed of
 * "System Audio" mode change.
 *
 * @hide
 */
public interface IHdmiSystemAudioModeChangeListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.hdmi.IHdmiSystemAudioModeChangeListener
{
private static final java.lang.String DESCRIPTOR = "android.hardware.hdmi.IHdmiSystemAudioModeChangeListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.hdmi.IHdmiSystemAudioModeChangeListener interface,
 * generating a proxy if needed.
 */
public static android.hardware.hdmi.IHdmiSystemAudioModeChangeListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.hdmi.IHdmiSystemAudioModeChangeListener))) {
return ((android.hardware.hdmi.IHdmiSystemAudioModeChangeListener)iin);
}
return new android.hardware.hdmi.IHdmiSystemAudioModeChangeListener.Stub.Proxy(obj);
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
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onStatusChanged(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.hdmi.IHdmiSystemAudioModeChangeListener
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
     * @param enabled true if the device gets activated
     */
@Override public void onStatusChanged(boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enabled)?(1):(0)));
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
     * @param enabled true if the device gets activated
     */
public void onStatusChanged(boolean enabled) throws android.os.RemoteException;
}
