/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/bluetooth/IBluetoothHealth.aidl
 */
package android.bluetooth;
/**
 * API for Bluetooth Health service
 *
 * {@hide}
 */
public interface IBluetoothHealth extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothHealth
{
private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothHealth";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.bluetooth.IBluetoothHealth interface,
 * generating a proxy if needed.
 */
public static android.bluetooth.IBluetoothHealth asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bluetooth.IBluetoothHealth))) {
return ((android.bluetooth.IBluetoothHealth)iin);
}
return new android.bluetooth.IBluetoothHealth.Stub.Proxy(obj);
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
case TRANSACTION_registerAppConfiguration:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothHealthAppConfiguration _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothHealthAppConfiguration.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.bluetooth.IBluetoothHealthCallback _arg1;
_arg1 = android.bluetooth.IBluetoothHealthCallback.Stub.asInterface(data.readStrongBinder());
boolean _result = this.registerAppConfiguration(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_unregisterAppConfiguration:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothHealthAppConfiguration _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothHealthAppConfiguration.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.unregisterAppConfiguration(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_connectChannelToSource:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.bluetooth.BluetoothHealthAppConfiguration _arg1;
if ((0!=data.readInt())) {
_arg1 = android.bluetooth.BluetoothHealthAppConfiguration.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _result = this.connectChannelToSource(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_connectChannelToSink:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.bluetooth.BluetoothHealthAppConfiguration _arg1;
if ((0!=data.readInt())) {
_arg1 = android.bluetooth.BluetoothHealthAppConfiguration.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
boolean _result = this.connectChannelToSink(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_disconnectChannel:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.bluetooth.BluetoothHealthAppConfiguration _arg1;
if ((0!=data.readInt())) {
_arg1 = android.bluetooth.BluetoothHealthAppConfiguration.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
boolean _result = this.disconnectChannel(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getMainChannelFd:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.bluetooth.BluetoothHealthAppConfiguration _arg1;
if ((0!=data.readInt())) {
_arg1 = android.bluetooth.BluetoothHealthAppConfiguration.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.os.ParcelFileDescriptor _result = this.getMainChannelFd(_arg0, _arg1);
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
case TRANSACTION_getConnectedHealthDevices:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.bluetooth.BluetoothDevice> _result = this.getConnectedHealthDevices();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getHealthDevicesMatchingConnectionStates:
{
data.enforceInterface(DESCRIPTOR);
int[] _arg0;
_arg0 = data.createIntArray();
java.util.List<android.bluetooth.BluetoothDevice> _result = this.getHealthDevicesMatchingConnectionStates(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getHealthDeviceConnectionState:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.getHealthDeviceConnectionState(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bluetooth.IBluetoothHealth
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
@Override public boolean registerAppConfiguration(android.bluetooth.BluetoothHealthAppConfiguration config, android.bluetooth.IBluetoothHealthCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((config!=null)) {
_data.writeInt(1);
config.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerAppConfiguration, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean unregisterAppConfiguration(android.bluetooth.BluetoothHealthAppConfiguration config) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((config!=null)) {
_data.writeInt(1);
config.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_unregisterAppConfiguration, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean connectChannelToSource(android.bluetooth.BluetoothDevice device, android.bluetooth.BluetoothHealthAppConfiguration config) throws android.os.RemoteException
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
if ((config!=null)) {
_data.writeInt(1);
config.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_connectChannelToSource, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean connectChannelToSink(android.bluetooth.BluetoothDevice device, android.bluetooth.BluetoothHealthAppConfiguration config, int channelType) throws android.os.RemoteException
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
if ((config!=null)) {
_data.writeInt(1);
config.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(channelType);
mRemote.transact(Stub.TRANSACTION_connectChannelToSink, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean disconnectChannel(android.bluetooth.BluetoothDevice device, android.bluetooth.BluetoothHealthAppConfiguration config, int id) throws android.os.RemoteException
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
if ((config!=null)) {
_data.writeInt(1);
config.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(id);
mRemote.transact(Stub.TRANSACTION_disconnectChannel, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.os.ParcelFileDescriptor getMainChannelFd(android.bluetooth.BluetoothDevice device, android.bluetooth.BluetoothHealthAppConfiguration config) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.ParcelFileDescriptor _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((config!=null)) {
_data.writeInt(1);
config.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getMainChannelFd, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(_reply);
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
@Override public java.util.List<android.bluetooth.BluetoothDevice> getConnectedHealthDevices() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.bluetooth.BluetoothDevice> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getConnectedHealthDevices, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.bluetooth.BluetoothDevice.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.bluetooth.BluetoothDevice> getHealthDevicesMatchingConnectionStates(int[] states) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.bluetooth.BluetoothDevice> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeIntArray(states);
mRemote.transact(Stub.TRANSACTION_getHealthDevicesMatchingConnectionStates, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.bluetooth.BluetoothDevice.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getHealthDeviceConnectionState(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_getHealthDeviceConnectionState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_registerAppConfiguration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterAppConfiguration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_connectChannelToSource = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_connectChannelToSink = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_disconnectChannel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getMainChannelFd = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getConnectedHealthDevices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getHealthDevicesMatchingConnectionStates = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getHealthDeviceConnectionState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
}
public boolean registerAppConfiguration(android.bluetooth.BluetoothHealthAppConfiguration config, android.bluetooth.IBluetoothHealthCallback callback) throws android.os.RemoteException;
public boolean unregisterAppConfiguration(android.bluetooth.BluetoothHealthAppConfiguration config) throws android.os.RemoteException;
public boolean connectChannelToSource(android.bluetooth.BluetoothDevice device, android.bluetooth.BluetoothHealthAppConfiguration config) throws android.os.RemoteException;
public boolean connectChannelToSink(android.bluetooth.BluetoothDevice device, android.bluetooth.BluetoothHealthAppConfiguration config, int channelType) throws android.os.RemoteException;
public boolean disconnectChannel(android.bluetooth.BluetoothDevice device, android.bluetooth.BluetoothHealthAppConfiguration config, int id) throws android.os.RemoteException;
public android.os.ParcelFileDescriptor getMainChannelFd(android.bluetooth.BluetoothDevice device, android.bluetooth.BluetoothHealthAppConfiguration config) throws android.os.RemoteException;
public java.util.List<android.bluetooth.BluetoothDevice> getConnectedHealthDevices() throws android.os.RemoteException;
public java.util.List<android.bluetooth.BluetoothDevice> getHealthDevicesMatchingConnectionStates(int[] states) throws android.os.RemoteException;
public int getHealthDeviceConnectionState(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
}
