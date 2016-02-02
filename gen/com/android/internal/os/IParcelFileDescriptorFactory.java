/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/com/android/internal/os/IParcelFileDescriptorFactory.aidl
 */
package com.android.internal.os;
/** {@hide} */
public interface IParcelFileDescriptorFactory extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.os.IParcelFileDescriptorFactory
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.os.IParcelFileDescriptorFactory";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.os.IParcelFileDescriptorFactory interface,
 * generating a proxy if needed.
 */
public static com.android.internal.os.IParcelFileDescriptorFactory asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.os.IParcelFileDescriptorFactory))) {
return ((com.android.internal.os.IParcelFileDescriptorFactory)iin);
}
return new com.android.internal.os.IParcelFileDescriptorFactory.Stub.Proxy(obj);
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
case TRANSACTION_open:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.os.ParcelFileDescriptor _result = this.open(_arg0, _arg1);
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
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.os.IParcelFileDescriptorFactory
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
// NOTE: implementors should carefully sanitize the incoming name
// using something like FileUtils.isValidExtFilename()

@Override public android.os.ParcelFileDescriptor open(java.lang.String name, int mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.ParcelFileDescriptor _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeInt(mode);
mRemote.transact(Stub.TRANSACTION_open, _data, _reply, 0);
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
}
static final int TRANSACTION_open = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
// NOTE: implementors should carefully sanitize the incoming name
// using something like FileUtils.isValidExtFilename()

public android.os.ParcelFileDescriptor open(java.lang.String name, int mode) throws android.os.RemoteException;
}
