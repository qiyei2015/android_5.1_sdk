/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/nfc/IAppCallback.aidl
 */
package android.nfc;
/**
 * @hide
 */
public interface IAppCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.nfc.IAppCallback
{
private static final java.lang.String DESCRIPTOR = "android.nfc.IAppCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.nfc.IAppCallback interface,
 * generating a proxy if needed.
 */
public static android.nfc.IAppCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.nfc.IAppCallback))) {
return ((android.nfc.IAppCallback)iin);
}
return new android.nfc.IAppCallback.Stub.Proxy(obj);
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
case TRANSACTION_createBeamShareData:
{
data.enforceInterface(DESCRIPTOR);
android.nfc.BeamShareData _result = this.createBeamShareData();
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
case TRANSACTION_onNdefPushComplete:
{
data.enforceInterface(DESCRIPTOR);
this.onNdefPushComplete();
reply.writeNoException();
return true;
}
case TRANSACTION_onTagDiscovered:
{
data.enforceInterface(DESCRIPTOR);
android.nfc.Tag _arg0;
if ((0!=data.readInt())) {
_arg0 = android.nfc.Tag.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onTagDiscovered(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.nfc.IAppCallback
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
@Override public android.nfc.BeamShareData createBeamShareData() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.nfc.BeamShareData _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_createBeamShareData, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.nfc.BeamShareData.CREATOR.createFromParcel(_reply);
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
@Override public void onNdefPushComplete() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onNdefPushComplete, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onTagDiscovered(android.nfc.Tag tag) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((tag!=null)) {
_data.writeInt(1);
tag.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onTagDiscovered, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_createBeamShareData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onNdefPushComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onTagDiscovered = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public android.nfc.BeamShareData createBeamShareData() throws android.os.RemoteException;
public void onNdefPushComplete() throws android.os.RemoteException;
public void onTagDiscovered(android.nfc.Tag tag) throws android.os.RemoteException;
}
