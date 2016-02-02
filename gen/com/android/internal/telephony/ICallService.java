/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/telephony/java/com/android/internal/telephony/ICallService.aidl
 */
package com.android.internal.telephony;
/**
 * Service interface for services which would like to provide calls to be
 * managed by the system in-call UI.
 *
 * This interface provides methods that the android framework can use to deliver commands
 * for calls provided by this call service including making new calls and disconnecting
 * existing ones. A binding to ICallService implementations exists for two conditions:
 * 1) There exists one or more live calls for that call service,
 * 2) Prior to an outbound call to test if this call service is compatible with the outgoing call.
 */
public interface ICallService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.ICallService
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.ICallService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.telephony.ICallService interface,
 * generating a proxy if needed.
 */
public static com.android.internal.telephony.ICallService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.telephony.ICallService))) {
return ((com.android.internal.telephony.ICallService)iin);
}
return new com.android.internal.telephony.ICallService.Stub.Proxy(obj);
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
case TRANSACTION_isCompatibleWith:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.isCompatibleWith(_arg0);
return true;
}
case TRANSACTION_call:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.call(_arg0);
return true;
}
case TRANSACTION_disconnect:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.disconnect(_arg0);
return true;
}
case TRANSACTION_setCallServiceAdapter:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.telephony.ICallServiceAdapter _arg0;
_arg0 = com.android.internal.telephony.ICallServiceAdapter.Stub.asInterface(data.readStrongBinder());
this.setCallServiceAdapter(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.telephony.ICallService
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
     * Determines if the CallService can make calls to the handle.
     * TODO(santoscordon): Move this method into its own service interface long term.
     * TODO(santoscordon): Add response callback parameter.
     */
@Override public void isCompatibleWith(java.lang.String handle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(handle);
mRemote.transact(Stub.TRANSACTION_isCompatibleWith, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Attempts to call the relevant party using the specified handle, be it a phone number,
     * SIP address, or some other kind of user ID.  Note that the set of handle types is
     * dynamically extensible since call providers should be able to implement arbitrary
     * handle-calling systems.  See {@link #isCompatibleWith}.
     * TODO(santoscordon): Should this have a response attached to it to ensure that the call
     * service actually plans to make the call?
     */
@Override public void call(java.lang.String handle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(handle);
mRemote.transact(Stub.TRANSACTION_call, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Disconnects the call identified by callId.
     */
@Override public void disconnect(java.lang.String callId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
mRemote.transact(Stub.TRANSACTION_disconnect, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Sets an implementation of ICallServiceAdapter which the call service can use to add new calls
     * and communicate state changes of existing calls. This is the first method that is called
     * after a the framework binds to the call service.
     */
@Override public void setCallServiceAdapter(com.android.internal.telephony.ICallServiceAdapter callServiceAdapter) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callServiceAdapter!=null))?(callServiceAdapter.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setCallServiceAdapter, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_isCompatibleWith = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_call = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_disconnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setCallServiceAdapter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
/**
     * Determines if the CallService can make calls to the handle.
     * TODO(santoscordon): Move this method into its own service interface long term.
     * TODO(santoscordon): Add response callback parameter.
     */
public void isCompatibleWith(java.lang.String handle) throws android.os.RemoteException;
/**
     * Attempts to call the relevant party using the specified handle, be it a phone number,
     * SIP address, or some other kind of user ID.  Note that the set of handle types is
     * dynamically extensible since call providers should be able to implement arbitrary
     * handle-calling systems.  See {@link #isCompatibleWith}.
     * TODO(santoscordon): Should this have a response attached to it to ensure that the call
     * service actually plans to make the call?
     */
public void call(java.lang.String handle) throws android.os.RemoteException;
/**
     * Disconnects the call identified by callId.
     */
public void disconnect(java.lang.String callId) throws android.os.RemoteException;
/**
     * Sets an implementation of ICallServiceAdapter which the call service can use to add new calls
     * and communicate state changes of existing calls. This is the first method that is called
     * after a the framework binds to the call service.
     */
public void setCallServiceAdapter(com.android.internal.telephony.ICallServiceAdapter callServiceAdapter) throws android.os.RemoteException;
}
