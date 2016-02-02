/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/bluetooth/IBluetoothProfileServiceConnection.aidl
 */
package android.bluetooth;
/**
 * Callback for bluetooth profile connections.
 *
 * {@hide}
 */
public interface IBluetoothProfileServiceConnection extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothProfileServiceConnection
{
private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothProfileServiceConnection";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.bluetooth.IBluetoothProfileServiceConnection interface,
 * generating a proxy if needed.
 */
public static android.bluetooth.IBluetoothProfileServiceConnection asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bluetooth.IBluetoothProfileServiceConnection))) {
return ((android.bluetooth.IBluetoothProfileServiceConnection)iin);
}
return new android.bluetooth.IBluetoothProfileServiceConnection.Stub.Proxy(obj);
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
case TRANSACTION_onServiceConnected:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
this.onServiceConnected(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onServiceDisconnected:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onServiceDisconnected(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bluetooth.IBluetoothProfileServiceConnection
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
@Override public void onServiceConnected(android.content.ComponentName comp, android.os.IBinder service) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((comp!=null)) {
_data.writeInt(1);
comp.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder(service);
mRemote.transact(Stub.TRANSACTION_onServiceConnected, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onServiceDisconnected(android.content.ComponentName comp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((comp!=null)) {
_data.writeInt(1);
comp.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onServiceDisconnected, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onServiceConnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onServiceDisconnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void onServiceConnected(android.content.ComponentName comp, android.os.IBinder service) throws android.os.RemoteException;
public void onServiceDisconnected(android.content.ComponentName comp) throws android.os.RemoteException;
}
