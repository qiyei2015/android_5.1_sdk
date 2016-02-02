/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/com/android/internal/app/IProcessStats.aidl
 */
package com.android.internal.app;
public interface IProcessStats extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IProcessStats
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.app.IProcessStats";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.app.IProcessStats interface,
 * generating a proxy if needed.
 */
public static com.android.internal.app.IProcessStats asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.app.IProcessStats))) {
return ((com.android.internal.app.IProcessStats)iin);
}
return new com.android.internal.app.IProcessStats.Stub.Proxy(obj);
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
case TRANSACTION_getCurrentStats:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.os.ParcelFileDescriptor> _arg0;
_arg0 = new java.util.ArrayList<android.os.ParcelFileDescriptor>();
byte[] _result = this.getCurrentStats(_arg0);
reply.writeNoException();
reply.writeByteArray(_result);
reply.writeTypedList(_arg0);
return true;
}
case TRANSACTION_getStatsOverTime:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
android.os.ParcelFileDescriptor _result = this.getStatsOverTime(_arg0);
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
case TRANSACTION_getCurrentMemoryState:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getCurrentMemoryState();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.app.IProcessStats
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
@Override public byte[] getCurrentStats(java.util.List<android.os.ParcelFileDescriptor> historic) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
byte[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCurrentStats, _data, _reply, 0);
_reply.readException();
_result = _reply.createByteArray();
_reply.readTypedList(historic, android.os.ParcelFileDescriptor.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.os.ParcelFileDescriptor getStatsOverTime(long minTime) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.ParcelFileDescriptor _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(minTime);
mRemote.transact(Stub.TRANSACTION_getStatsOverTime, _data, _reply, 0);
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
@Override public int getCurrentMemoryState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCurrentMemoryState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getCurrentStats = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getStatsOverTime = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getCurrentMemoryState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public byte[] getCurrentStats(java.util.List<android.os.ParcelFileDescriptor> historic) throws android.os.RemoteException;
public android.os.ParcelFileDescriptor getStatsOverTime(long minTime) throws android.os.RemoteException;
public int getCurrentMemoryState() throws android.os.RemoteException;
}
