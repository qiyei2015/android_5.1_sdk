/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/service/persistentdata/IPersistentDataBlockService.aidl
 */
package android.service.persistentdata;
/**
 * Internal interface through which to communicate to the
 * PersistentDataBlockService. The persistent data block allows writing
 * raw data and setting the OEM unlock enabled/disabled bit contained
 * in the partition.
 *
 * @hide
 */
public interface IPersistentDataBlockService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.persistentdata.IPersistentDataBlockService
{
private static final java.lang.String DESCRIPTOR = "android.service.persistentdata.IPersistentDataBlockService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.persistentdata.IPersistentDataBlockService interface,
 * generating a proxy if needed.
 */
public static android.service.persistentdata.IPersistentDataBlockService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.persistentdata.IPersistentDataBlockService))) {
return ((android.service.persistentdata.IPersistentDataBlockService)iin);
}
return new android.service.persistentdata.IPersistentDataBlockService.Stub.Proxy(obj);
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
case TRANSACTION_write:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
int _result = this.write(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_read:
{
data.enforceInterface(DESCRIPTOR);
byte[] _result = this.read();
reply.writeNoException();
reply.writeByteArray(_result);
return true;
}
case TRANSACTION_wipe:
{
data.enforceInterface(DESCRIPTOR);
this.wipe();
reply.writeNoException();
return true;
}
case TRANSACTION_getDataBlockSize:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getDataBlockSize();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getMaximumDataBlockSize:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getMaximumDataBlockSize();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_setOemUnlockEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setOemUnlockEnabled(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getOemUnlockEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getOemUnlockEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.persistentdata.IPersistentDataBlockService
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
@Override public int write(byte[] data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(data);
mRemote.transact(Stub.TRANSACTION_write, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public byte[] read() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
byte[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_read, _data, _reply, 0);
_reply.readException();
_result = _reply.createByteArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void wipe() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_wipe, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getDataBlockSize() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDataBlockSize, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getMaximumDataBlockSize() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getMaximumDataBlockSize, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setOemUnlockEnabled(boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setOemUnlockEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean getOemUnlockEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getOemUnlockEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_write = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_read = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_wipe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getDataBlockSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getMaximumDataBlockSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setOemUnlockEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getOemUnlockEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
public int write(byte[] data) throws android.os.RemoteException;
public byte[] read() throws android.os.RemoteException;
public void wipe() throws android.os.RemoteException;
public int getDataBlockSize() throws android.os.RemoteException;
public long getMaximumDataBlockSize() throws android.os.RemoteException;
public void setOemUnlockEnabled(boolean enabled) throws android.os.RemoteException;
public boolean getOemUnlockEnabled() throws android.os.RemoteException;
}
