/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/location/java/android/location/IFusedProvider.aidl
 */
package android.location;
/**
 * Interface definition for Location providers that require FLP services.
 * @hide
 */
public interface IFusedProvider extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.location.IFusedProvider
{
private static final java.lang.String DESCRIPTOR = "android.location.IFusedProvider";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.location.IFusedProvider interface,
 * generating a proxy if needed.
 */
public static android.location.IFusedProvider asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.location.IFusedProvider))) {
return ((android.location.IFusedProvider)iin);
}
return new android.location.IFusedProvider.Stub.Proxy(obj);
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
case TRANSACTION_onFusedLocationHardwareChange:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.location.IFusedLocationHardware _arg0;
_arg0 = android.hardware.location.IFusedLocationHardware.Stub.asInterface(data.readStrongBinder());
this.onFusedLocationHardwareChange(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.location.IFusedProvider
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
     * Provides access to a FusedLocationHardware instance needed for the provider to work.
     *
     * @param instance      The FusedLocationHardware available for the provider to use.
     */
@Override public void onFusedLocationHardwareChange(android.hardware.location.IFusedLocationHardware instance) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((instance!=null))?(instance.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_onFusedLocationHardwareChange, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onFusedLocationHardwareChange = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * Provides access to a FusedLocationHardware instance needed for the provider to work.
     *
     * @param instance      The FusedLocationHardware available for the provider to use.
     */
public void onFusedLocationHardwareChange(android.hardware.location.IFusedLocationHardware instance) throws android.os.RemoteException;
}
