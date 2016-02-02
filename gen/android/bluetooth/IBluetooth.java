/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/bluetooth/IBluetooth.aidl
 */
package android.bluetooth;
/**
 * System private API for talking with the Bluetooth service.
 *
 * {@hide}
 */
public interface IBluetooth extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetooth
{
private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetooth";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.bluetooth.IBluetooth interface,
 * generating a proxy if needed.
 */
public static android.bluetooth.IBluetooth asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bluetooth.IBluetooth))) {
return ((android.bluetooth.IBluetooth)iin);
}
return new android.bluetooth.IBluetooth.Stub.Proxy(obj);
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
case TRANSACTION_isEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getState:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getState();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_enable:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.enable();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_enableNoAutoConnect:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.enableNoAutoConnect();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_disable:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.disable();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getAddress:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getAddress();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getUuids:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelUuid[] _result = this.getUuids();
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_setName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.setName(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getScanMode:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getScanMode();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setScanMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.setScanMode(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getDiscoverableTimeout:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getDiscoverableTimeout();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setDiscoverableTimeout:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.setDiscoverableTimeout(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_startDiscovery:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.startDiscovery();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_cancelDiscovery:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.cancelDiscovery();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isDiscovering:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isDiscovering();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getAdapterConnectionState:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getAdapterConnectionState();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getProfileConnectionState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getProfileConnectionState(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getBondedDevices:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice[] _result = this.getBondedDevices();
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_createBond:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _result = this.createBond(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_cancelBondProcess:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.cancelBondProcess(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeBond:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.removeBond(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getBondState:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.getBondState(_arg0);
reply.writeNoException();
reply.writeInt(_result);
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
case TRANSACTION_getRemoteName:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _result = this.getRemoteName(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getRemoteType:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.getRemoteType(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getRemoteAlias:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _result = this.getRemoteAlias(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_setRemoteAlias:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.setRemoteAlias(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getRemoteClass:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.getRemoteClass(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getRemoteUuids:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.ParcelUuid[] _result = this.getRemoteUuids(_arg0);
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_fetchRemoteUuids:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.fetchRemoteUuids(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_fetchRemoteMasInstances:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.fetchRemoteMasInstances(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setPin:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
int _arg2;
_arg2 = data.readInt();
byte[] _arg3;
_arg3 = data.createByteArray();
boolean _result = this.setPin(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setPasskey:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
int _arg2;
_arg2 = data.readInt();
byte[] _arg3;
_arg3 = data.createByteArray();
boolean _result = this.setPasskey(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setPairingConfirmation:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _result = this.setPairingConfirmation(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getPhonebookAccessPermission:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.getPhonebookAccessPermission(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setPhonebookAccessPermission:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _result = this.setPhonebookAccessPermission(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getMessageAccessPermission:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.getMessageAccessPermission(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setMessageAccessPermission:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _result = this.setMessageAccessPermission(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_sendConnectionStateChange:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.sendConnectionStateChange(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_registerCallback:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.IBluetoothCallback _arg0;
_arg0 = android.bluetooth.IBluetoothCallback.Stub.asInterface(data.readStrongBinder());
this.registerCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterCallback:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.IBluetoothCallback _arg0;
_arg0 = android.bluetooth.IBluetoothCallback.Stub.asInterface(data.readStrongBinder());
this.unregisterCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_connectSocket:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
android.os.ParcelUuid _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
android.os.ParcelFileDescriptor _result = this.connectSocket(_arg0, _arg1, _arg2, _arg3, _arg4);
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
case TRANSACTION_createSocketChannel:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
android.os.ParcelUuid _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
android.os.ParcelFileDescriptor _result = this.createSocketChannel(_arg0, _arg1, _arg2, _arg3, _arg4);
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
case TRANSACTION_configHciSnoopLog:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _result = this.configHciSnoopLog(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isMultiAdvertisementSupported:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isMultiAdvertisementSupported();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isPeripheralModeSupported:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isPeripheralModeSupported();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isOffloadedFilteringSupported:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isOffloadedFilteringSupported();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isOffloadedScanBatchingSupported:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isOffloadedScanBatchingSupported();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isActivityAndEnergyReportingSupported:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isActivityAndEnergyReportingSupported();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getActivityEnergyInfoFromController:
{
data.enforceInterface(DESCRIPTOR);
this.getActivityEnergyInfoFromController();
reply.writeNoException();
return true;
}
case TRANSACTION_reportActivityInfo:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothActivityEnergyInfo _result = this.reportActivityInfo();
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
case TRANSACTION_dump:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.dump();
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bluetooth.IBluetooth
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
@Override public boolean isEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean enable() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_enable, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean enableNoAutoConnect() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_enableNoAutoConnect, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean disable() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_disable, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getAddress() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAddress, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.os.ParcelUuid[] getUuids() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.ParcelUuid[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getUuids, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.os.ParcelUuid.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setName(java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_setName, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getScanMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getScanMode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setScanMode(int mode, int duration) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(mode);
_data.writeInt(duration);
mRemote.transact(Stub.TRANSACTION_setScanMode, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getDiscoverableTimeout() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDiscoverableTimeout, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setDiscoverableTimeout(int timeout) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(timeout);
mRemote.transact(Stub.TRANSACTION_setDiscoverableTimeout, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean startDiscovery() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_startDiscovery, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean cancelDiscovery() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_cancelDiscovery, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isDiscovering() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isDiscovering, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getAdapterConnectionState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAdapterConnectionState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getProfileConnectionState(int profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(profile);
mRemote.transact(Stub.TRANSACTION_getProfileConnectionState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.bluetooth.BluetoothDevice[] getBondedDevices() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.bluetooth.BluetoothDevice[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getBondedDevices, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.bluetooth.BluetoothDevice.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean createBond(android.bluetooth.BluetoothDevice device, int transport) throws android.os.RemoteException
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
_data.writeInt(transport);
mRemote.transact(Stub.TRANSACTION_createBond, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean cancelBondProcess(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_cancelBondProcess, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean removeBond(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_removeBond, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getBondState(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_getBondState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
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
@Override public java.lang.String getRemoteName(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getRemoteName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getRemoteType(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_getRemoteType, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getRemoteAlias(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getRemoteAlias, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setRemoteAlias(android.bluetooth.BluetoothDevice device, java.lang.String name) throws android.os.RemoteException
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
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_setRemoteAlias, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getRemoteClass(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_getRemoteClass, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.os.ParcelUuid[] getRemoteUuids(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.ParcelUuid[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getRemoteUuids, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.os.ParcelUuid.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean fetchRemoteUuids(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_fetchRemoteUuids, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean fetchRemoteMasInstances(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_fetchRemoteMasInstances, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setPin(android.bluetooth.BluetoothDevice device, boolean accept, int len, byte[] pinCode) throws android.os.RemoteException
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
_data.writeInt(((accept)?(1):(0)));
_data.writeInt(len);
_data.writeByteArray(pinCode);
mRemote.transact(Stub.TRANSACTION_setPin, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setPasskey(android.bluetooth.BluetoothDevice device, boolean accept, int len, byte[] passkey) throws android.os.RemoteException
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
_data.writeInt(((accept)?(1):(0)));
_data.writeInt(len);
_data.writeByteArray(passkey);
mRemote.transact(Stub.TRANSACTION_setPasskey, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setPairingConfirmation(android.bluetooth.BluetoothDevice device, boolean accept) throws android.os.RemoteException
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
_data.writeInt(((accept)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setPairingConfirmation, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getPhonebookAccessPermission(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_getPhonebookAccessPermission, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setPhonebookAccessPermission(android.bluetooth.BluetoothDevice device, int value) throws android.os.RemoteException
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
_data.writeInt(value);
mRemote.transact(Stub.TRANSACTION_setPhonebookAccessPermission, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getMessageAccessPermission(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_getMessageAccessPermission, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setMessageAccessPermission(android.bluetooth.BluetoothDevice device, int value) throws android.os.RemoteException
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
_data.writeInt(value);
mRemote.transact(Stub.TRANSACTION_setMessageAccessPermission, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void sendConnectionStateChange(android.bluetooth.BluetoothDevice device, int profile, int state, int prevState) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(profile);
_data.writeInt(state);
_data.writeInt(prevState);
mRemote.transact(Stub.TRANSACTION_sendConnectionStateChange, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void registerCallback(android.bluetooth.IBluetoothCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterCallback(android.bluetooth.IBluetoothCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// For Socket

@Override public android.os.ParcelFileDescriptor connectSocket(android.bluetooth.BluetoothDevice device, int type, android.os.ParcelUuid uuid, int port, int flag) throws android.os.RemoteException
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
_data.writeInt(type);
if ((uuid!=null)) {
_data.writeInt(1);
uuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(port);
_data.writeInt(flag);
mRemote.transact(Stub.TRANSACTION_connectSocket, _data, _reply, 0);
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
@Override public android.os.ParcelFileDescriptor createSocketChannel(int type, java.lang.String serviceName, android.os.ParcelUuid uuid, int port, int flag) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.ParcelFileDescriptor _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(type);
_data.writeString(serviceName);
if ((uuid!=null)) {
_data.writeInt(1);
uuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(port);
_data.writeInt(flag);
mRemote.transact(Stub.TRANSACTION_createSocketChannel, _data, _reply, 0);
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
@Override public boolean configHciSnoopLog(boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_configHciSnoopLog, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isMultiAdvertisementSupported() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isMultiAdvertisementSupported, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isPeripheralModeSupported() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isPeripheralModeSupported, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isOffloadedFilteringSupported() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isOffloadedFilteringSupported, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isOffloadedScanBatchingSupported() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isOffloadedScanBatchingSupported, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isActivityAndEnergyReportingSupported() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isActivityAndEnergyReportingSupported, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void getActivityEnergyInfoFromController() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActivityEnergyInfoFromController, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.bluetooth.BluetoothActivityEnergyInfo reportActivityInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.bluetooth.BluetoothActivityEnergyInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_reportActivityInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.bluetooth.BluetoothActivityEnergyInfo.CREATOR.createFromParcel(_reply);
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
// for dumpsys support

@Override public java.lang.String dump() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_dump, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_isEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_enable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_enableNoAutoConnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_disable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getAddress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getUuids = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getScanMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_setScanMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getDiscoverableTimeout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_setDiscoverableTimeout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_startDiscovery = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_cancelDiscovery = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_isDiscovering = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_getAdapterConnectionState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_getProfileConnectionState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_getBondedDevices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_createBond = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_cancelBondProcess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_removeBond = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_getBondState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_getConnectionState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_getRemoteName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_getRemoteType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_getRemoteAlias = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_setRemoteAlias = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_getRemoteClass = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_getRemoteUuids = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_fetchRemoteUuids = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_fetchRemoteMasInstances = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_setPin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_setPasskey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_setPairingConfirmation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
static final int TRANSACTION_getPhonebookAccessPermission = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
static final int TRANSACTION_setPhonebookAccessPermission = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
static final int TRANSACTION_getMessageAccessPermission = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
static final int TRANSACTION_setMessageAccessPermission = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
static final int TRANSACTION_sendConnectionStateChange = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
static final int TRANSACTION_registerCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
static final int TRANSACTION_unregisterCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
static final int TRANSACTION_connectSocket = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
static final int TRANSACTION_createSocketChannel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
static final int TRANSACTION_configHciSnoopLog = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
static final int TRANSACTION_isMultiAdvertisementSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
static final int TRANSACTION_isPeripheralModeSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
static final int TRANSACTION_isOffloadedFilteringSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
static final int TRANSACTION_isOffloadedScanBatchingSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
static final int TRANSACTION_isActivityAndEnergyReportingSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
static final int TRANSACTION_getActivityEnergyInfoFromController = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
static final int TRANSACTION_reportActivityInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 51);
static final int TRANSACTION_dump = (android.os.IBinder.FIRST_CALL_TRANSACTION + 52);
}
public boolean isEnabled() throws android.os.RemoteException;
public int getState() throws android.os.RemoteException;
public boolean enable() throws android.os.RemoteException;
public boolean enableNoAutoConnect() throws android.os.RemoteException;
public boolean disable() throws android.os.RemoteException;
public java.lang.String getAddress() throws android.os.RemoteException;
public android.os.ParcelUuid[] getUuids() throws android.os.RemoteException;
public boolean setName(java.lang.String name) throws android.os.RemoteException;
public java.lang.String getName() throws android.os.RemoteException;
public int getScanMode() throws android.os.RemoteException;
public boolean setScanMode(int mode, int duration) throws android.os.RemoteException;
public int getDiscoverableTimeout() throws android.os.RemoteException;
public boolean setDiscoverableTimeout(int timeout) throws android.os.RemoteException;
public boolean startDiscovery() throws android.os.RemoteException;
public boolean cancelDiscovery() throws android.os.RemoteException;
public boolean isDiscovering() throws android.os.RemoteException;
public int getAdapterConnectionState() throws android.os.RemoteException;
public int getProfileConnectionState(int profile) throws android.os.RemoteException;
public android.bluetooth.BluetoothDevice[] getBondedDevices() throws android.os.RemoteException;
public boolean createBond(android.bluetooth.BluetoothDevice device, int transport) throws android.os.RemoteException;
public boolean cancelBondProcess(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public boolean removeBond(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public int getBondState(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public int getConnectionState(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public java.lang.String getRemoteName(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public int getRemoteType(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public java.lang.String getRemoteAlias(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public boolean setRemoteAlias(android.bluetooth.BluetoothDevice device, java.lang.String name) throws android.os.RemoteException;
public int getRemoteClass(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public android.os.ParcelUuid[] getRemoteUuids(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public boolean fetchRemoteUuids(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public boolean fetchRemoteMasInstances(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public boolean setPin(android.bluetooth.BluetoothDevice device, boolean accept, int len, byte[] pinCode) throws android.os.RemoteException;
public boolean setPasskey(android.bluetooth.BluetoothDevice device, boolean accept, int len, byte[] passkey) throws android.os.RemoteException;
public boolean setPairingConfirmation(android.bluetooth.BluetoothDevice device, boolean accept) throws android.os.RemoteException;
public int getPhonebookAccessPermission(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public boolean setPhonebookAccessPermission(android.bluetooth.BluetoothDevice device, int value) throws android.os.RemoteException;
public int getMessageAccessPermission(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public boolean setMessageAccessPermission(android.bluetooth.BluetoothDevice device, int value) throws android.os.RemoteException;
public void sendConnectionStateChange(android.bluetooth.BluetoothDevice device, int profile, int state, int prevState) throws android.os.RemoteException;
public void registerCallback(android.bluetooth.IBluetoothCallback callback) throws android.os.RemoteException;
public void unregisterCallback(android.bluetooth.IBluetoothCallback callback) throws android.os.RemoteException;
// For Socket

public android.os.ParcelFileDescriptor connectSocket(android.bluetooth.BluetoothDevice device, int type, android.os.ParcelUuid uuid, int port, int flag) throws android.os.RemoteException;
public android.os.ParcelFileDescriptor createSocketChannel(int type, java.lang.String serviceName, android.os.ParcelUuid uuid, int port, int flag) throws android.os.RemoteException;
public boolean configHciSnoopLog(boolean enable) throws android.os.RemoteException;
public boolean isMultiAdvertisementSupported() throws android.os.RemoteException;
public boolean isPeripheralModeSupported() throws android.os.RemoteException;
public boolean isOffloadedFilteringSupported() throws android.os.RemoteException;
public boolean isOffloadedScanBatchingSupported() throws android.os.RemoteException;
public boolean isActivityAndEnergyReportingSupported() throws android.os.RemoteException;
public void getActivityEnergyInfoFromController() throws android.os.RemoteException;
public android.bluetooth.BluetoothActivityEnergyInfo reportActivityInfo() throws android.os.RemoteException;
// for dumpsys support

public java.lang.String dump() throws android.os.RemoteException;
}
