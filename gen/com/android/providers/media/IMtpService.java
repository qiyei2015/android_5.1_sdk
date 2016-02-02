/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/packages/providers/MediaProvider/src/com/android/providers/media/IMtpService.aidl
 */
package com.android.providers.media;
public interface IMtpService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.providers.media.IMtpService
{
private static final java.lang.String DESCRIPTOR = "com.android.providers.media.IMtpService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.providers.media.IMtpService interface,
 * generating a proxy if needed.
 */
public static com.android.providers.media.IMtpService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.providers.media.IMtpService))) {
return ((com.android.providers.media.IMtpService)iin);
}
return new com.android.providers.media.IMtpService.Stub.Proxy(obj);
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
case TRANSACTION_sendObjectAdded:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.sendObjectAdded(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_sendObjectRemoved:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.sendObjectRemoved(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.providers.media.IMtpService
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
@Override public void sendObjectAdded(int objectHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(objectHandle);
mRemote.transact(Stub.TRANSACTION_sendObjectAdded, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void sendObjectRemoved(int objectHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(objectHandle);
mRemote.transact(Stub.TRANSACTION_sendObjectRemoved, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_sendObjectAdded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_sendObjectRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void sendObjectAdded(int objectHandle) throws android.os.RemoteException;
public void sendObjectRemoved(int objectHandle) throws android.os.RemoteException;
}
