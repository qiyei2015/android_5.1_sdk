/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/bluetooth/IBluetoothManager.aidl
 */
package android.bluetooth;
/**
 * System private API for talking with the Bluetooth service.
 *
 * {@hide}
 */
public interface IBluetoothManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothManager
{
private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.bluetooth.IBluetoothManager interface,
 * generating a proxy if needed.
 */
public static android.bluetooth.IBluetoothManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bluetooth.IBluetoothManager))) {
return ((android.bluetooth.IBluetoothManager)iin);
}
return new android.bluetooth.IBluetoothManager.Stub.Proxy(obj);
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
case TRANSACTION_registerAdapter:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.IBluetoothManagerCallback _arg0;
_arg0 = android.bluetooth.IBluetoothManagerCallback.Stub.asInterface(data.readStrongBinder());
android.bluetooth.IBluetooth _result = this.registerAdapter(_arg0);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_unregisterAdapter:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.IBluetoothManagerCallback _arg0;
_arg0 = android.bluetooth.IBluetoothManagerCallback.Stub.asInterface(data.readStrongBinder());
this.unregisterAdapter(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_registerStateChangeCallback:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.IBluetoothStateChangeCallback _arg0;
_arg0 = android.bluetooth.IBluetoothStateChangeCallback.Stub.asInterface(data.readStrongBinder());
this.registerStateChangeCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterStateChangeCallback:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.IBluetoothStateChangeCallback _arg0;
_arg0 = android.bluetooth.IBluetoothStateChangeCallback.Stub.asInterface(data.readStrongBinder());
this.unregisterStateChangeCallback(_arg0);
reply.writeNoException();
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
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _result = this.disable(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getBluetoothGatt:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.IBluetoothGatt _result = this.getBluetoothGatt();
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_bindBluetoothProfileService:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.bluetooth.IBluetoothProfileServiceConnection _arg1;
_arg1 = android.bluetooth.IBluetoothProfileServiceConnection.Stub.asInterface(data.readStrongBinder());
boolean _result = this.bindBluetoothProfileService(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_unbindBluetoothProfileService:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.bluetooth.IBluetoothProfileServiceConnection _arg1;
_arg1 = android.bluetooth.IBluetoothProfileServiceConnection.Stub.asInterface(data.readStrongBinder());
this.unbindBluetoothProfileService(_arg0, _arg1);
reply.writeNoException();
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
case TRANSACTION_getName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bluetooth.IBluetoothManager
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
@Override public android.bluetooth.IBluetooth registerAdapter(android.bluetooth.IBluetoothManagerCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.bluetooth.IBluetooth _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerAdapter, _data, _reply, 0);
_reply.readException();
_result = android.bluetooth.IBluetooth.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void unregisterAdapter(android.bluetooth.IBluetoothManagerCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterAdapter, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void registerStateChangeCallback(android.bluetooth.IBluetoothStateChangeCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerStateChangeCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterStateChangeCallback(android.bluetooth.IBluetoothStateChangeCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterStateChangeCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
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
@Override public boolean disable(boolean persist) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((persist)?(1):(0)));
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
@Override public android.bluetooth.IBluetoothGatt getBluetoothGatt() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.bluetooth.IBluetoothGatt _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getBluetoothGatt, _data, _reply, 0);
_reply.readException();
_result = android.bluetooth.IBluetoothGatt.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean bindBluetoothProfileService(int profile, android.bluetooth.IBluetoothProfileServiceConnection proxy) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(profile);
_data.writeStrongBinder((((proxy!=null))?(proxy.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_bindBluetoothProfileService, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void unbindBluetoothProfileService(int profile, android.bluetooth.IBluetoothProfileServiceConnection proxy) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(profile);
_data.writeStrongBinder((((proxy!=null))?(proxy.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unbindBluetoothProfileService, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
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
}
static final int TRANSACTION_registerAdapter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterAdapter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_registerStateChangeCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_unregisterStateChangeCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_isEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_enable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_enableNoAutoConnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_disable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getBluetoothGatt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_bindBluetoothProfileService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_unbindBluetoothProfileService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getAddress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
}
public android.bluetooth.IBluetooth registerAdapter(android.bluetooth.IBluetoothManagerCallback callback) throws android.os.RemoteException;
public void unregisterAdapter(android.bluetooth.IBluetoothManagerCallback callback) throws android.os.RemoteException;
public void registerStateChangeCallback(android.bluetooth.IBluetoothStateChangeCallback callback) throws android.os.RemoteException;
public void unregisterStateChangeCallback(android.bluetooth.IBluetoothStateChangeCallback callback) throws android.os.RemoteException;
public boolean isEnabled() throws android.os.RemoteException;
public boolean enable() throws android.os.RemoteException;
public boolean enableNoAutoConnect() throws android.os.RemoteException;
public boolean disable(boolean persist) throws android.os.RemoteException;
public android.bluetooth.IBluetoothGatt getBluetoothGatt() throws android.os.RemoteException;
public boolean bindBluetoothProfileService(int profile, android.bluetooth.IBluetoothProfileServiceConnection proxy) throws android.os.RemoteException;
public void unbindBluetoothProfileService(int profile, android.bluetooth.IBluetoothProfileServiceConnection proxy) throws android.os.RemoteException;
public java.lang.String getAddress() throws android.os.RemoteException;
public java.lang.String getName() throws android.os.RemoteException;
}
