/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/os/IVibratorService.aidl
 */
package android.os;
/** {@hide} */
public interface IVibratorService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.IVibratorService
{
private static final java.lang.String DESCRIPTOR = "android.os.IVibratorService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.IVibratorService interface,
 * generating a proxy if needed.
 */
public static android.os.IVibratorService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.IVibratorService))) {
return ((android.os.IVibratorService)iin);
}
return new android.os.IVibratorService.Stub.Proxy(obj);
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
case TRANSACTION_hasVibrator:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.hasVibrator();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_vibrate:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
long _arg2;
_arg2 = data.readLong();
int _arg3;
_arg3 = data.readInt();
android.os.IBinder _arg4;
_arg4 = data.readStrongBinder();
this.vibrate(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_vibratePattern:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
long[] _arg2;
_arg2 = data.createLongArray();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
android.os.IBinder _arg5;
_arg5 = data.readStrongBinder();
this.vibratePattern(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_cancelVibrate:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.cancelVibrate(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.IVibratorService
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
@Override public boolean hasVibrator() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_hasVibrator, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void vibrate(int uid, java.lang.String opPkg, long milliseconds, int usageHint, android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeString(opPkg);
_data.writeLong(milliseconds);
_data.writeInt(usageHint);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_vibrate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void vibratePattern(int uid, java.lang.String opPkg, long[] pattern, int repeat, int usageHint, android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeString(opPkg);
_data.writeLongArray(pattern);
_data.writeInt(repeat);
_data.writeInt(usageHint);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_vibratePattern, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void cancelVibrate(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_cancelVibrate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_hasVibrator = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_vibrate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_vibratePattern = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_cancelVibrate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public boolean hasVibrator() throws android.os.RemoteException;
public void vibrate(int uid, java.lang.String opPkg, long milliseconds, int usageHint, android.os.IBinder token) throws android.os.RemoteException;
public void vibratePattern(int uid, java.lang.String opPkg, long[] pattern, int repeat, int usageHint, android.os.IBinder token) throws android.os.RemoteException;
public void cancelVibrate(android.os.IBinder token) throws android.os.RemoteException;
}
