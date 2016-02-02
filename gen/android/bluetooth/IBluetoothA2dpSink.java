/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/bluetooth/IBluetoothA2dpSink.aidl
 */
package android.bluetooth;
/**
 * APIs for Bluetooth A2DP sink service
 *
 * @hide
 */
public interface IBluetoothA2dpSink extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothA2dpSink
{
private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothA2dpSink";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.bluetooth.IBluetoothA2dpSink interface,
 * generating a proxy if needed.
 */
public static android.bluetooth.IBluetoothA2dpSink asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bluetooth.IBluetoothA2dpSink))) {
return ((android.bluetooth.IBluetoothA2dpSink)iin);
}
return new android.bluetooth.IBluetoothA2dpSink.Stub.Proxy(obj);
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
case TRANSACTION_connect:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.connect(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_disconnect:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.disconnect(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getConnectedDevices:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.bluetooth.BluetoothDevice> _result = this.getConnectedDevices();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getDevicesMatchingConnectionStates:
{
data.enforceInterface(DESCRIPTOR);
int[] _arg0;
_arg0 = data.createIntArray();
java.util.List<android.bluetooth.BluetoothDevice> _result = this.getDevicesMatchingConnectionStates(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getConnectionState:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.getConnectionState(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getAudioConfig:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.bluetooth.BluetoothAudioConfig _result = this.getAudioConfig(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bluetooth.IBluetoothA2dpSink
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
@Override public boolean connect(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_connect, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean disconnect(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_disconnect, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.bluetooth.BluetoothDevice> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getConnectedDevices, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.bluetooth.BluetoothDevice.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] states) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.bluetooth.BluetoothDevice> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeIntArray(states);
mRemote.transact(Stub.TRANSACTION_getDevicesMatchingConnectionStates, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.bluetooth.BluetoothDevice.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getConnectionState(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getConnectionState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.bluetooth.BluetoothAudioConfig getAudioConfig(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.bluetooth.BluetoothAudioConfig _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getAudioConfig, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.bluetooth.BluetoothAudioConfig.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_connect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_disconnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getConnectedDevices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getDevicesMatchingConnectionStates = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getConnectionState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getAudioConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
}
public boolean connect(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public boolean disconnect(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException;
public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] states) throws android.os.RemoteException;
public int getConnectionState(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public android.bluetooth.BluetoothAudioConfig getAudioConfig(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
}
