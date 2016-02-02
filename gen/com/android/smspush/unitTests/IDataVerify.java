/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/packages/WAPPushManager/tests/src/com/android/smspush/unitTests/IDataVerify.aidl
 */
package com.android.smspush.unitTests;
/**
 * Interface to receiver application data verifyer class
 */
public interface IDataVerify extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.smspush.unitTests.IDataVerify
{
private static final java.lang.String DESCRIPTOR = "com.android.smspush.unitTests.IDataVerify";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.smspush.unitTests.IDataVerify interface,
 * generating a proxy if needed.
 */
public static com.android.smspush.unitTests.IDataVerify asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.smspush.unitTests.IDataVerify))) {
return ((com.android.smspush.unitTests.IDataVerify)iin);
}
return new com.android.smspush.unitTests.IDataVerify.Stub.Proxy(obj);
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
case TRANSACTION_verifyData:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
boolean _result = this.verifyData(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_resetData:
{
data.enforceInterface(DESCRIPTOR);
this.resetData();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.smspush.unitTests.IDataVerify
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
     * Verify data
     */
@Override public boolean verifyData(byte[] pdu) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(pdu);
mRemote.transact(Stub.TRANSACTION_verifyData, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Initialize data
     */
@Override public void resetData() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_resetData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_verifyData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_resetData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
/**
     * Verify data
     */
public boolean verifyData(byte[] pdu) throws android.os.RemoteException;
/**
     * Initialize data
     */
public void resetData() throws android.os.RemoteException;
}
