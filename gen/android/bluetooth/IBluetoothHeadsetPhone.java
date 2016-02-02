/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/bluetooth/IBluetoothHeadsetPhone.aidl
 */
package android.bluetooth;
/**
 * API for Bluetooth Headset Phone Service in phone app
 *
 * {@hide}
 */
public interface IBluetoothHeadsetPhone extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothHeadsetPhone
{
private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothHeadsetPhone";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.bluetooth.IBluetoothHeadsetPhone interface,
 * generating a proxy if needed.
 */
public static android.bluetooth.IBluetoothHeadsetPhone asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bluetooth.IBluetoothHeadsetPhone))) {
return ((android.bluetooth.IBluetoothHeadsetPhone)iin);
}
return new android.bluetooth.IBluetoothHeadsetPhone.Stub.Proxy(obj);
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
case TRANSACTION_answerCall:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.answerCall();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_hangupCall:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.hangupCall();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_sendDtmf:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.sendDtmf(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_processChld:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.processChld(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getNetworkOperator:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getNetworkOperator();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getSubscriberNumber:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getSubscriberNumber();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_listCurrentCalls:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.listCurrentCalls();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_queryPhoneState:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.queryPhoneState();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_updateBtHandsfreeAfterRadioTechnologyChange:
{
data.enforceInterface(DESCRIPTOR);
this.updateBtHandsfreeAfterRadioTechnologyChange();
reply.writeNoException();
return true;
}
case TRANSACTION_cdmaSwapSecondCallState:
{
data.enforceInterface(DESCRIPTOR);
this.cdmaSwapSecondCallState();
reply.writeNoException();
return true;
}
case TRANSACTION_cdmaSetSecondCallState:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.cdmaSetSecondCallState(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bluetooth.IBluetoothHeadsetPhone
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
// Internal functions, not be made public

@Override public boolean answerCall() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_answerCall, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean hangupCall() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_hangupCall, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean sendDtmf(int dtmf) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(dtmf);
mRemote.transact(Stub.TRANSACTION_sendDtmf, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean processChld(int chld) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(chld);
mRemote.transact(Stub.TRANSACTION_processChld, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getNetworkOperator() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getNetworkOperator, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getSubscriberNumber() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSubscriberNumber, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean listCurrentCalls() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_listCurrentCalls, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean queryPhoneState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_queryPhoneState, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Internal for phone app to call

@Override public void updateBtHandsfreeAfterRadioTechnologyChange() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_updateBtHandsfreeAfterRadioTechnologyChange, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void cdmaSwapSecondCallState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_cdmaSwapSecondCallState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void cdmaSetSecondCallState(boolean state) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((state)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_cdmaSetSecondCallState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_answerCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_hangupCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_sendDtmf = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_processChld = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getNetworkOperator = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getSubscriberNumber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_listCurrentCalls = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_queryPhoneState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_updateBtHandsfreeAfterRadioTechnologyChange = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_cdmaSwapSecondCallState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_cdmaSetSecondCallState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
}
// Internal functions, not be made public

public boolean answerCall() throws android.os.RemoteException;
public boolean hangupCall() throws android.os.RemoteException;
public boolean sendDtmf(int dtmf) throws android.os.RemoteException;
public boolean processChld(int chld) throws android.os.RemoteException;
public java.lang.String getNetworkOperator() throws android.os.RemoteException;
public java.lang.String getSubscriberNumber() throws android.os.RemoteException;
public boolean listCurrentCalls() throws android.os.RemoteException;
public boolean queryPhoneState() throws android.os.RemoteException;
// Internal for phone app to call

public void updateBtHandsfreeAfterRadioTechnologyChange() throws android.os.RemoteException;
public void cdmaSwapSecondCallState() throws android.os.RemoteException;
public void cdmaSetSecondCallState(boolean state) throws android.os.RemoteException;
}
