/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/content/pm/IPackageInstallerSession.aidl
 */
package android.content.pm;
/** {@hide} */
public interface IPackageInstallerSession extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.content.pm.IPackageInstallerSession
{
private static final java.lang.String DESCRIPTOR = "android.content.pm.IPackageInstallerSession";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.content.pm.IPackageInstallerSession interface,
 * generating a proxy if needed.
 */
public static android.content.pm.IPackageInstallerSession asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.content.pm.IPackageInstallerSession))) {
return ((android.content.pm.IPackageInstallerSession)iin);
}
return new android.content.pm.IPackageInstallerSession.Stub.Proxy(obj);
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
case TRANSACTION_setClientProgress:
{
data.enforceInterface(DESCRIPTOR);
float _arg0;
_arg0 = data.readFloat();
this.setClientProgress(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_addClientProgress:
{
data.enforceInterface(DESCRIPTOR);
float _arg0;
_arg0 = data.readFloat();
this.addClientProgress(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getNames:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getNames();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_openWrite:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
long _arg2;
_arg2 = data.readLong();
android.os.ParcelFileDescriptor _result = this.openWrite(_arg0, _arg1, _arg2);
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
case TRANSACTION_openRead:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.ParcelFileDescriptor _result = this.openRead(_arg0);
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
case TRANSACTION_close:
{
data.enforceInterface(DESCRIPTOR);
this.close();
reply.writeNoException();
return true;
}
case TRANSACTION_commit:
{
data.enforceInterface(DESCRIPTOR);
android.content.IntentSender _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.IntentSender.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.commit(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_abandon:
{
data.enforceInterface(DESCRIPTOR);
this.abandon();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.content.pm.IPackageInstallerSession
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
@Override public void setClientProgress(float progress) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeFloat(progress);
mRemote.transact(Stub.TRANSACTION_setClientProgress, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void addClientProgress(float progress) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeFloat(progress);
mRemote.transact(Stub.TRANSACTION_addClientProgress, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String[] getNames() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getNames, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.os.ParcelFileDescriptor openWrite(java.lang.String name, long offsetBytes, long lengthBytes) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.ParcelFileDescriptor _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeLong(offsetBytes);
_data.writeLong(lengthBytes);
mRemote.transact(Stub.TRANSACTION_openWrite, _data, _reply, 0);
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
@Override public android.os.ParcelFileDescriptor openRead(java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.ParcelFileDescriptor _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_openRead, _data, _reply, 0);
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
@Override public void close() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_close, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void commit(android.content.IntentSender statusReceiver) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((statusReceiver!=null)) {
_data.writeInt(1);
statusReceiver.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_commit, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void abandon() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_abandon, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_setClientProgress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_addClientProgress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getNames = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_openWrite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_openRead = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_close = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_commit = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_abandon = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
public void setClientProgress(float progress) throws android.os.RemoteException;
public void addClientProgress(float progress) throws android.os.RemoteException;
public java.lang.String[] getNames() throws android.os.RemoteException;
public android.os.ParcelFileDescriptor openWrite(java.lang.String name, long offsetBytes, long lengthBytes) throws android.os.RemoteException;
public android.os.ParcelFileDescriptor openRead(java.lang.String name) throws android.os.RemoteException;
public void close() throws android.os.RemoteException;
public void commit(android.content.IntentSender statusReceiver) throws android.os.RemoteException;
public void abandon() throws android.os.RemoteException;
}
