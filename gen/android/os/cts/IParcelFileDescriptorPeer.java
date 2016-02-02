/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/cts/tests/tests/os/src/android/os/cts/IParcelFileDescriptorPeer.aidl
 */
package android.os.cts;
public interface IParcelFileDescriptorPeer extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.cts.IParcelFileDescriptorPeer
{
private static final java.lang.String DESCRIPTOR = "android.os.cts.IParcelFileDescriptorPeer";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.cts.IParcelFileDescriptorPeer interface,
 * generating a proxy if needed.
 */
public static android.os.cts.IParcelFileDescriptorPeer asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.cts.IParcelFileDescriptorPeer))) {
return ((android.os.cts.IParcelFileDescriptorPeer)iin);
}
return new android.os.cts.IParcelFileDescriptorPeer.Stub.Proxy(obj);
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
case TRANSACTION_setPeer:
{
data.enforceInterface(DESCRIPTOR);
android.os.cts.IParcelFileDescriptorPeer _arg0;
_arg0 = android.os.cts.IParcelFileDescriptorPeer.Stub.asInterface(data.readStrongBinder());
this.setPeer(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setupReadPipe:
{
data.enforceInterface(DESCRIPTOR);
this.setupReadPipe();
reply.writeNoException();
return true;
}
case TRANSACTION_setupWritePipe:
{
data.enforceInterface(DESCRIPTOR);
this.setupWritePipe();
reply.writeNoException();
return true;
}
case TRANSACTION_setupSocket:
{
data.enforceInterface(DESCRIPTOR);
this.setupSocket();
reply.writeNoException();
return true;
}
case TRANSACTION_setupFile:
{
data.enforceInterface(DESCRIPTOR);
this.setupFile();
reply.writeNoException();
return true;
}
case TRANSACTION_get:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelFileDescriptor _result = this.get();
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
case TRANSACTION_set:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelFileDescriptor _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.set(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_doGet:
{
data.enforceInterface(DESCRIPTOR);
this.doGet();
reply.writeNoException();
return true;
}
case TRANSACTION_doSet:
{
data.enforceInterface(DESCRIPTOR);
this.doSet();
reply.writeNoException();
return true;
}
case TRANSACTION_read:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.read();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_write:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.write(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_close:
{
data.enforceInterface(DESCRIPTOR);
this.close();
reply.writeNoException();
return true;
}
case TRANSACTION_closeWithError:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.closeWithError(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_detachFd:
{
data.enforceInterface(DESCRIPTOR);
this.detachFd();
reply.writeNoException();
return true;
}
case TRANSACTION_leak:
{
data.enforceInterface(DESCRIPTOR);
this.leak();
reply.writeNoException();
return true;
}
case TRANSACTION_crash:
{
data.enforceInterface(DESCRIPTOR);
this.crash();
reply.writeNoException();
return true;
}
case TRANSACTION_checkError:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.checkError();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_checkListener:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.checkListener();
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.cts.IParcelFileDescriptorPeer
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
@Override public void setPeer(android.os.cts.IParcelFileDescriptorPeer peer) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((peer!=null))?(peer.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setPeer, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* Setup internal local and remote FDs */
@Override public void setupReadPipe() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_setupReadPipe, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setupWritePipe() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_setupWritePipe, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setupSocket() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_setupSocket, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setupFile() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_setupFile, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.os.ParcelFileDescriptor get() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.ParcelFileDescriptor _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_get, _data, _reply, 0);
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
@Override public void set(android.os.ParcelFileDescriptor pfd) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((pfd!=null)) {
_data.writeInt(1);
pfd.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_set, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* Ask this peer to get their remote FD from another */
@Override public void doGet() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_doGet, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* Ask this peer to set their remote FD to another */
@Override public void doSet() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_doSet, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int read() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_read, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void write(int oneByte) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(oneByte);
mRemote.transact(Stub.TRANSACTION_write, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
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
@Override public void closeWithError(java.lang.String msg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(msg);
mRemote.transact(Stub.TRANSACTION_closeWithError, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void detachFd() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_detachFd, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void leak() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_leak, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void crash() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_crash, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String checkError() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_checkError, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String checkListener() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_checkListener, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_setPeer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setupReadPipe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setupWritePipe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setupSocket = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setupFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_get = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_set = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_doGet = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_doSet = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_read = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_write = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_close = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_closeWithError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_detachFd = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_leak = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_crash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_checkError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_checkListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
}
public void setPeer(android.os.cts.IParcelFileDescriptorPeer peer) throws android.os.RemoteException;
/* Setup internal local and remote FDs */
public void setupReadPipe() throws android.os.RemoteException;
public void setupWritePipe() throws android.os.RemoteException;
public void setupSocket() throws android.os.RemoteException;
public void setupFile() throws android.os.RemoteException;
public android.os.ParcelFileDescriptor get() throws android.os.RemoteException;
public void set(android.os.ParcelFileDescriptor pfd) throws android.os.RemoteException;
/* Ask this peer to get their remote FD from another */
public void doGet() throws android.os.RemoteException;
/* Ask this peer to set their remote FD to another */
public void doSet() throws android.os.RemoteException;
public int read() throws android.os.RemoteException;
public void write(int oneByte) throws android.os.RemoteException;
public void close() throws android.os.RemoteException;
public void closeWithError(java.lang.String msg) throws android.os.RemoteException;
public void detachFd() throws android.os.RemoteException;
public void leak() throws android.os.RemoteException;
public void crash() throws android.os.RemoteException;
public java.lang.String checkError() throws android.os.RemoteException;
public java.lang.String checkListener() throws android.os.RemoteException;
}
