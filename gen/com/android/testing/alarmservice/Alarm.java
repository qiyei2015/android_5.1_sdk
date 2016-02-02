/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/tests/utils/SleepUtils/AlarmService/src/com/android/testing/alarmservice/Alarm.aidl
 */
package com.android.testing.alarmservice;
public interface Alarm extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.testing.alarmservice.Alarm
{
private static final java.lang.String DESCRIPTOR = "com.android.testing.alarmservice.Alarm";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.testing.alarmservice.Alarm interface,
 * generating a proxy if needed.
 */
public static com.android.testing.alarmservice.Alarm asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.testing.alarmservice.Alarm))) {
return ((com.android.testing.alarmservice.Alarm)iin);
}
return new com.android.testing.alarmservice.Alarm.Stub.Proxy(obj);
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
case TRANSACTION_prepare:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.prepare();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setAlarmAndWait:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _result = this.setAlarmAndWait(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_done:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.done();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.testing.alarmservice.Alarm
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
@Override public int prepare() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_prepare, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int setAlarmAndWait(long timeoutMills) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(timeoutMills);
mRemote.transact(Stub.TRANSACTION_setAlarmAndWait, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int done() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_done, _data, _reply, 0);
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
static final int TRANSACTION_prepare = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setAlarmAndWait = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_done = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public int prepare() throws android.os.RemoteException;
public int setAlarmAndWait(long timeoutMills) throws android.os.RemoteException;
public int done() throws android.os.RemoteException;
}
