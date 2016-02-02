/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/packages/experimental/RpcPerformance/src/com/android/rpc_performance/IService.aidl
 */
package com.android.rpc_performance;
public interface IService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.rpc_performance.IService
{
private static final java.lang.String DESCRIPTOR = "com.android.rpc_performance.IService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.rpc_performance.IService interface,
 * generating a proxy if needed.
 */
public static com.android.rpc_performance.IService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.rpc_performance.IService))) {
return ((com.android.rpc_performance.IService)iin);
}
return new com.android.rpc_performance.IService.Stub.Proxy(obj);
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
case TRANSACTION_pingString:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.pingString(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_pingVoid:
{
data.enforceInterface(DESCRIPTOR);
this.pingVoid();
reply.writeNoException();
return true;
}
case TRANSACTION_startTracing:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.startTracing(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_stopTracing:
{
data.enforceInterface(DESCRIPTOR);
this.stopTracing();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.rpc_performance.IService
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
@Override public java.lang.String pingString(java.lang.String v) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(v);
mRemote.transact(Stub.TRANSACTION_pingString, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void pingVoid() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_pingVoid, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void startTracing(java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_startTracing, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopTracing() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopTracing, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_pingString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_pingVoid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_startTracing = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_stopTracing = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public java.lang.String pingString(java.lang.String v) throws android.os.RemoteException;
public void pingVoid() throws android.os.RemoteException;
public void startTracing(java.lang.String name) throws android.os.RemoteException;
public void stopTracing() throws android.os.RemoteException;
}
