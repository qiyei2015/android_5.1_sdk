/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/packages/experimental/StrictModeTest/src/com/android/strictmodetest/IService.aidl
 */
package com.android.strictmodetest;
public interface IService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.strictmodetest.IService
{
private static final java.lang.String DESCRIPTOR = "com.android.strictmodetest.IService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.strictmodetest.IService interface,
 * generating a proxy if needed.
 */
public static com.android.strictmodetest.IService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.strictmodetest.IService))) {
return ((com.android.strictmodetest.IService)iin);
}
return new com.android.strictmodetest.IService.Stub.Proxy(obj);
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
case TRANSACTION_getThreadPolicy:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getThreadPolicy();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_doDiskWrite:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.doDiskWrite(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_doDiskOneWay:
{
data.enforceInterface(DESCRIPTOR);
this.doDiskOneWay();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.strictmodetest.IService
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
@Override public int getThreadPolicy() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getThreadPolicy, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean doDiskWrite(int dummyValue) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(dummyValue);
mRemote.transact(Stub.TRANSACTION_doDiskWrite, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Test that one-way calls don't fire.

@Override public void doDiskOneWay() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_doDiskOneWay, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_getThreadPolicy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_doDiskWrite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_doDiskOneWay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public int getThreadPolicy() throws android.os.RemoteException;
public boolean doDiskWrite(int dummyValue) throws android.os.RemoteException;
// Test that one-way calls don't fire.

public void doDiskOneWay() throws android.os.RemoteException;
}
