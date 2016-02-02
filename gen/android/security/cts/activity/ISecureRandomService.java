/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/cts/tests/tests/security/src/android/security/cts/activity/ISecureRandomService.aidl
 */
package android.security.cts.activity;
public interface ISecureRandomService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.security.cts.activity.ISecureRandomService
{
private static final java.lang.String DESCRIPTOR = "android.security.cts.activity.ISecureRandomService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.security.cts.activity.ISecureRandomService interface,
 * generating a proxy if needed.
 */
public static android.security.cts.activity.ISecureRandomService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.security.cts.activity.ISecureRandomService))) {
return ((android.security.cts.activity.ISecureRandomService)iin);
}
return new android.security.cts.activity.ISecureRandomService.Stub.Proxy(obj);
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
case TRANSACTION_getRandomBytesAndPid:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
int _result = this.getRandomBytesAndPid(_arg0);
reply.writeNoException();
reply.writeInt(_result);
reply.writeByteArray(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.security.cts.activity.ISecureRandomService
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
@Override public int getRandomBytesAndPid(byte[] randomBytes) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(randomBytes);
mRemote.transact(Stub.TRANSACTION_getRandomBytesAndPid, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
_reply.readByteArray(randomBytes);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getRandomBytesAndPid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public int getRandomBytesAndPid(byte[] randomBytes) throws android.os.RemoteException;
}
