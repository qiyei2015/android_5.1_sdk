/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/telephony/java/com/android/internal/telephony/ICallServiceAdapter.aidl
 */
package com.android.internal.telephony;
/**
 * Provides methods for ICallService implementations to interact with the system phone app.
 */
public interface ICallServiceAdapter extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.ICallServiceAdapter
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.ICallServiceAdapter";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.telephony.ICallServiceAdapter interface,
 * generating a proxy if needed.
 */
public static com.android.internal.telephony.ICallServiceAdapter asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.telephony.ICallServiceAdapter))) {
return ((com.android.internal.telephony.ICallServiceAdapter)iin);
}
return new com.android.internal.telephony.ICallServiceAdapter.Stub.Proxy(obj);
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
case TRANSACTION_getNextCallId:
{
data.enforceInterface(DESCRIPTOR);
this.getNextCallId();
return true;
}
case TRANSACTION_newIncomingCall:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.android.internal.telephony.CallInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.internal.telephony.CallInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.newIncomingCall(_arg0, _arg1);
return true;
}
case TRANSACTION_newOutgoingCall:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.android.internal.telephony.CallInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.internal.telephony.CallInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.newOutgoingCall(_arg0, _arg1);
return true;
}
case TRANSACTION_setActive:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.setActive(_arg0);
return true;
}
case TRANSACTION_setRinging:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.setRinging(_arg0);
return true;
}
case TRANSACTION_setDialing:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.setDialing(_arg0);
return true;
}
case TRANSACTION_setDisconnected:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.setDisconnected(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.telephony.ICallServiceAdapter
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
     * Retrieves a new unique call id for use with newOutgoingCall and newIncomingCall.
     */
@Override public void getNextCallId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getNextCallId, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Tells CallsManager of a new incoming call.
     */
@Override public void newIncomingCall(java.lang.String callId, com.android.internal.telephony.CallInfo info) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
if ((info!=null)) {
_data.writeInt(1);
info.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_newIncomingCall, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Tells CallsManager of a new outgoing call.
     */
@Override public void newOutgoingCall(java.lang.String callId, com.android.internal.telephony.CallInfo info) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
if ((info!=null)) {
_data.writeInt(1);
info.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_newOutgoingCall, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Sets a call's state to active (e.g., an ongoing call where two parties can actively
     * communicate).
     */
@Override public void setActive(java.lang.String callId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
mRemote.transact(Stub.TRANSACTION_setActive, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Sets a call's state to ringing (e.g., an inbound ringing call).
     */
@Override public void setRinging(java.lang.String callId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
mRemote.transact(Stub.TRANSACTION_setRinging, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Sets a call's state to dialing (e.g., dialing an outbound call).
     */
@Override public void setDialing(java.lang.String callId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
mRemote.transact(Stub.TRANSACTION_setDialing, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Sets a call's state to disconnected.
     */
@Override public void setDisconnected(java.lang.String callId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
mRemote.transact(Stub.TRANSACTION_setDisconnected, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_getNextCallId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_newIncomingCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_newOutgoingCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setActive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setRinging = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setDialing = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setDisconnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
/**
     * Retrieves a new unique call id for use with newOutgoingCall and newIncomingCall.
     */
public void getNextCallId() throws android.os.RemoteException;
/**
     * Tells CallsManager of a new incoming call.
     */
public void newIncomingCall(java.lang.String callId, com.android.internal.telephony.CallInfo info) throws android.os.RemoteException;
/**
     * Tells CallsManager of a new outgoing call.
     */
public void newOutgoingCall(java.lang.String callId, com.android.internal.telephony.CallInfo info) throws android.os.RemoteException;
/**
     * Sets a call's state to active (e.g., an ongoing call where two parties can actively
     * communicate).
     */
public void setActive(java.lang.String callId) throws android.os.RemoteException;
/**
     * Sets a call's state to ringing (e.g., an inbound ringing call).
     */
public void setRinging(java.lang.String callId) throws android.os.RemoteException;
/**
     * Sets a call's state to dialing (e.g., dialing an outbound call).
     */
public void setDialing(java.lang.String callId) throws android.os.RemoteException;
/**
     * Sets a call's state to disconnected.
     */
public void setDisconnected(java.lang.String callId) throws android.os.RemoteException;
}
