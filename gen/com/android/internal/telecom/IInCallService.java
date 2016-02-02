/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/telecomm/java/com/android/internal/telecom/IInCallService.aidl
 */
package com.android.internal.telecom;
/**
 * Internal remote interface for in-call services.
 *
 * @see android.telecom.InCallService
 *
 * {@hide}
 */
public interface IInCallService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.IInCallService
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.IInCallService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.telecom.IInCallService interface,
 * generating a proxy if needed.
 */
public static com.android.internal.telecom.IInCallService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.telecom.IInCallService))) {
return ((com.android.internal.telecom.IInCallService)iin);
}
return new com.android.internal.telecom.IInCallService.Stub.Proxy(obj);
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
case TRANSACTION_setInCallAdapter:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.telecom.IInCallAdapter _arg0;
_arg0 = com.android.internal.telecom.IInCallAdapter.Stub.asInterface(data.readStrongBinder());
this.setInCallAdapter(_arg0);
return true;
}
case TRANSACTION_addCall:
{
data.enforceInterface(DESCRIPTOR);
android.telecom.ParcelableCall _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telecom.ParcelableCall.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.addCall(_arg0);
return true;
}
case TRANSACTION_updateCall:
{
data.enforceInterface(DESCRIPTOR);
android.telecom.ParcelableCall _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telecom.ParcelableCall.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.updateCall(_arg0);
return true;
}
case TRANSACTION_setPostDial:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.setPostDial(_arg0, _arg1);
return true;
}
case TRANSACTION_setPostDialWait:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.setPostDialWait(_arg0, _arg1);
return true;
}
case TRANSACTION_onAudioStateChanged:
{
data.enforceInterface(DESCRIPTOR);
android.telecom.AudioState _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telecom.AudioState.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onAudioStateChanged(_arg0);
return true;
}
case TRANSACTION_bringToForeground:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.bringToForeground(_arg0);
return true;
}
case TRANSACTION_onCanAddCallChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onCanAddCallChanged(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.telecom.IInCallService
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
@Override public void setInCallAdapter(com.android.internal.telecom.IInCallAdapter inCallAdapter) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((inCallAdapter!=null))?(inCallAdapter.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setInCallAdapter, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void addCall(android.telecom.ParcelableCall call) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((call!=null)) {
_data.writeInt(1);
call.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addCall, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void updateCall(android.telecom.ParcelableCall call) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((call!=null)) {
_data.writeInt(1);
call.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateCall, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setPostDial(java.lang.String callId, java.lang.String remaining) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
_data.writeString(remaining);
mRemote.transact(Stub.TRANSACTION_setPostDial, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setPostDialWait(java.lang.String callId, java.lang.String remaining) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
_data.writeString(remaining);
mRemote.transact(Stub.TRANSACTION_setPostDialWait, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onAudioStateChanged(android.telecom.AudioState audioState) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((audioState!=null)) {
_data.writeInt(1);
audioState.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onAudioStateChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void bringToForeground(boolean showDialpad) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((showDialpad)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_bringToForeground, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onCanAddCallChanged(boolean canAddCall) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((canAddCall)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onCanAddCallChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_setInCallAdapter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_addCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_updateCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setPostDial = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setPostDialWait = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onAudioStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_bringToForeground = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onCanAddCallChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
public void setInCallAdapter(com.android.internal.telecom.IInCallAdapter inCallAdapter) throws android.os.RemoteException;
public void addCall(android.telecom.ParcelableCall call) throws android.os.RemoteException;
public void updateCall(android.telecom.ParcelableCall call) throws android.os.RemoteException;
public void setPostDial(java.lang.String callId, java.lang.String remaining) throws android.os.RemoteException;
public void setPostDialWait(java.lang.String callId, java.lang.String remaining) throws android.os.RemoteException;
public void onAudioStateChanged(android.telecom.AudioState audioState) throws android.os.RemoteException;
public void bringToForeground(boolean showDialpad) throws android.os.RemoteException;
public void onCanAddCallChanged(boolean canAddCall) throws android.os.RemoteException;
}
