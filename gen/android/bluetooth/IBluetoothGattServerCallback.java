/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/bluetooth/IBluetoothGattServerCallback.aidl
 */
package android.bluetooth;
/**
 * Callback definitions for interacting with BLE / GATT
 * @hide
 */
public interface IBluetoothGattServerCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothGattServerCallback
{
private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothGattServerCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.bluetooth.IBluetoothGattServerCallback interface,
 * generating a proxy if needed.
 */
public static android.bluetooth.IBluetoothGattServerCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bluetooth.IBluetoothGattServerCallback))) {
return ((android.bluetooth.IBluetoothGattServerCallback)iin);
}
return new android.bluetooth.IBluetoothGattServerCallback.Stub.Proxy(obj);
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
case TRANSACTION_onServerRegistered:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onServerRegistered(_arg0, _arg1);
return true;
}
case TRANSACTION_onScanResult:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
byte[] _arg2;
_arg2 = data.createByteArray();
this.onScanResult(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onServerConnectionState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
java.lang.String _arg3;
_arg3 = data.readString();
this.onServerConnectionState(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_onServiceAdded:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
android.os.ParcelUuid _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.onServiceAdded(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_onCharacteristicReadRequest:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
boolean _arg3;
_arg3 = (0!=data.readInt());
int _arg4;
_arg4 = data.readInt();
int _arg5;
_arg5 = data.readInt();
android.os.ParcelUuid _arg6;
if ((0!=data.readInt())) {
_arg6 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg6 = null;
}
int _arg7;
_arg7 = data.readInt();
android.os.ParcelUuid _arg8;
if ((0!=data.readInt())) {
_arg8 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg8 = null;
}
this.onCharacteristicReadRequest(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8);
return true;
}
case TRANSACTION_onDescriptorReadRequest:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
boolean _arg3;
_arg3 = (0!=data.readInt());
int _arg4;
_arg4 = data.readInt();
int _arg5;
_arg5 = data.readInt();
android.os.ParcelUuid _arg6;
if ((0!=data.readInt())) {
_arg6 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg6 = null;
}
int _arg7;
_arg7 = data.readInt();
android.os.ParcelUuid _arg8;
if ((0!=data.readInt())) {
_arg8 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg8 = null;
}
android.os.ParcelUuid _arg9;
if ((0!=data.readInt())) {
_arg9 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg9 = null;
}
this.onDescriptorReadRequest(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9);
return true;
}
case TRANSACTION_onCharacteristicWriteRequest:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
boolean _arg4;
_arg4 = (0!=data.readInt());
boolean _arg5;
_arg5 = (0!=data.readInt());
int _arg6;
_arg6 = data.readInt();
int _arg7;
_arg7 = data.readInt();
android.os.ParcelUuid _arg8;
if ((0!=data.readInt())) {
_arg8 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg8 = null;
}
int _arg9;
_arg9 = data.readInt();
android.os.ParcelUuid _arg10;
if ((0!=data.readInt())) {
_arg10 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg10 = null;
}
byte[] _arg11;
_arg11 = data.createByteArray();
this.onCharacteristicWriteRequest(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9, _arg10, _arg11);
return true;
}
case TRANSACTION_onDescriptorWriteRequest:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
boolean _arg4;
_arg4 = (0!=data.readInt());
boolean _arg5;
_arg5 = (0!=data.readInt());
int _arg6;
_arg6 = data.readInt();
int _arg7;
_arg7 = data.readInt();
android.os.ParcelUuid _arg8;
if ((0!=data.readInt())) {
_arg8 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg8 = null;
}
int _arg9;
_arg9 = data.readInt();
android.os.ParcelUuid _arg10;
if ((0!=data.readInt())) {
_arg10 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg10 = null;
}
android.os.ParcelUuid _arg11;
if ((0!=data.readInt())) {
_arg11 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg11 = null;
}
byte[] _arg12;
_arg12 = data.createByteArray();
this.onDescriptorWriteRequest(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9, _arg10, _arg11, _arg12);
return true;
}
case TRANSACTION_onExecuteWrite:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.onExecuteWrite(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onNotificationSent:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.onNotificationSent(_arg0, _arg1);
return true;
}
case TRANSACTION_onMtuChanged:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.onMtuChanged(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bluetooth.IBluetoothGattServerCallback
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
@Override public void onServerRegistered(int status, int serverIf) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
_data.writeInt(serverIf);
mRemote.transact(Stub.TRANSACTION_onServerRegistered, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onScanResult(java.lang.String address, int rssi, byte[] advData) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(rssi);
_data.writeByteArray(advData);
mRemote.transact(Stub.TRANSACTION_onScanResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onServerConnectionState(int status, int serverIf, boolean connected, java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
_data.writeInt(serverIf);
_data.writeInt(((connected)?(1):(0)));
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_onServerConnectionState, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onServiceAdded(int status, int srvcType, int srvcInstId, android.os.ParcelUuid srvcId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
_data.writeInt(srvcType);
_data.writeInt(srvcInstId);
if ((srvcId!=null)) {
_data.writeInt(1);
srvcId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onServiceAdded, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onCharacteristicReadRequest(java.lang.String address, int transId, int offset, boolean isLong, int srvcType, int srvcInstId, android.os.ParcelUuid srvcId, int charInstId, android.os.ParcelUuid charId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(transId);
_data.writeInt(offset);
_data.writeInt(((isLong)?(1):(0)));
_data.writeInt(srvcType);
_data.writeInt(srvcInstId);
if ((srvcId!=null)) {
_data.writeInt(1);
srvcId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(charInstId);
if ((charId!=null)) {
_data.writeInt(1);
charId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onCharacteristicReadRequest, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onDescriptorReadRequest(java.lang.String address, int transId, int offset, boolean isLong, int srvcType, int srvcInstId, android.os.ParcelUuid srvcId, int charInstId, android.os.ParcelUuid charId, android.os.ParcelUuid descrId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(transId);
_data.writeInt(offset);
_data.writeInt(((isLong)?(1):(0)));
_data.writeInt(srvcType);
_data.writeInt(srvcInstId);
if ((srvcId!=null)) {
_data.writeInt(1);
srvcId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(charInstId);
if ((charId!=null)) {
_data.writeInt(1);
charId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((descrId!=null)) {
_data.writeInt(1);
descrId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onDescriptorReadRequest, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onCharacteristicWriteRequest(java.lang.String address, int transId, int offset, int length, boolean isPrep, boolean needRsp, int srvcType, int srvcInstId, android.os.ParcelUuid srvcId, int charInstId, android.os.ParcelUuid charId, byte[] value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(transId);
_data.writeInt(offset);
_data.writeInt(length);
_data.writeInt(((isPrep)?(1):(0)));
_data.writeInt(((needRsp)?(1):(0)));
_data.writeInt(srvcType);
_data.writeInt(srvcInstId);
if ((srvcId!=null)) {
_data.writeInt(1);
srvcId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(charInstId);
if ((charId!=null)) {
_data.writeInt(1);
charId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeByteArray(value);
mRemote.transact(Stub.TRANSACTION_onCharacteristicWriteRequest, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onDescriptorWriteRequest(java.lang.String address, int transId, int offset, int length, boolean isPrep, boolean needRsp, int srvcType, int srvcInstId, android.os.ParcelUuid srvcId, int charInstId, android.os.ParcelUuid charId, android.os.ParcelUuid descrId, byte[] value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(transId);
_data.writeInt(offset);
_data.writeInt(length);
_data.writeInt(((isPrep)?(1):(0)));
_data.writeInt(((needRsp)?(1):(0)));
_data.writeInt(srvcType);
_data.writeInt(srvcInstId);
if ((srvcId!=null)) {
_data.writeInt(1);
srvcId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(charInstId);
if ((charId!=null)) {
_data.writeInt(1);
charId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((descrId!=null)) {
_data.writeInt(1);
descrId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeByteArray(value);
mRemote.transact(Stub.TRANSACTION_onDescriptorWriteRequest, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onExecuteWrite(java.lang.String address, int transId, boolean execWrite) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(transId);
_data.writeInt(((execWrite)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onExecuteWrite, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onNotificationSent(java.lang.String address, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onNotificationSent, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onMtuChanged(java.lang.String address, int mtu) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(mtu);
mRemote.transact(Stub.TRANSACTION_onMtuChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onServerRegistered = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onScanResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onServerConnectionState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onServiceAdded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onCharacteristicReadRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onDescriptorReadRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onCharacteristicWriteRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onDescriptorWriteRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_onExecuteWrite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_onNotificationSent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_onMtuChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
}
public void onServerRegistered(int status, int serverIf) throws android.os.RemoteException;
public void onScanResult(java.lang.String address, int rssi, byte[] advData) throws android.os.RemoteException;
public void onServerConnectionState(int status, int serverIf, boolean connected, java.lang.String address) throws android.os.RemoteException;
public void onServiceAdded(int status, int srvcType, int srvcInstId, android.os.ParcelUuid srvcId) throws android.os.RemoteException;
public void onCharacteristicReadRequest(java.lang.String address, int transId, int offset, boolean isLong, int srvcType, int srvcInstId, android.os.ParcelUuid srvcId, int charInstId, android.os.ParcelUuid charId) throws android.os.RemoteException;
public void onDescriptorReadRequest(java.lang.String address, int transId, int offset, boolean isLong, int srvcType, int srvcInstId, android.os.ParcelUuid srvcId, int charInstId, android.os.ParcelUuid charId, android.os.ParcelUuid descrId) throws android.os.RemoteException;
public void onCharacteristicWriteRequest(java.lang.String address, int transId, int offset, int length, boolean isPrep, boolean needRsp, int srvcType, int srvcInstId, android.os.ParcelUuid srvcId, int charInstId, android.os.ParcelUuid charId, byte[] value) throws android.os.RemoteException;
public void onDescriptorWriteRequest(java.lang.String address, int transId, int offset, int length, boolean isPrep, boolean needRsp, int srvcType, int srvcInstId, android.os.ParcelUuid srvcId, int charInstId, android.os.ParcelUuid charId, android.os.ParcelUuid descrId, byte[] value) throws android.os.RemoteException;
public void onExecuteWrite(java.lang.String address, int transId, boolean execWrite) throws android.os.RemoteException;
public void onNotificationSent(java.lang.String address, int status) throws android.os.RemoteException;
public void onMtuChanged(java.lang.String address, int mtu) throws android.os.RemoteException;
}
