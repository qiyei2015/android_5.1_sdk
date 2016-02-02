/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/packages/apps/KeyChain/support/src/com/android/keychain/tests/support/IKeyChainServiceTestSupport.aidl
 */
package com.android.keychain.tests.support;
/**
 * Service that runs as the system user for the use of the
 * KeyChainServiceTest which needs to run as a regular app user, but
 * needs to automate some steps only permissable to the system
 * user. In particular, revokeAppPermission and grantAppPermission
 * must be run within the system_server itself. In a real application,
 * the user is prompted to perform these steps via the
 * com.android.credentials.UNLOCK Intent and
 * KeyChainActivity.
 *
 * @hide
 */
public interface IKeyChainServiceTestSupport extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.keychain.tests.support.IKeyChainServiceTestSupport
{
private static final java.lang.String DESCRIPTOR = "com.android.keychain.tests.support.IKeyChainServiceTestSupport";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.keychain.tests.support.IKeyChainServiceTestSupport interface,
 * generating a proxy if needed.
 */
public static com.android.keychain.tests.support.IKeyChainServiceTestSupport asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.keychain.tests.support.IKeyChainServiceTestSupport))) {
return ((com.android.keychain.tests.support.IKeyChainServiceTestSupport)iin);
}
return new com.android.keychain.tests.support.IKeyChainServiceTestSupport.Stub.Proxy(obj);
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
case TRANSACTION_keystoreReset:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.keystoreReset();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_keystorePassword:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.keystorePassword(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_keystorePut:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
byte[] _arg1;
_arg1 = data.createByteArray();
boolean _result = this.keystorePut(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_keystoreImportKey:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
byte[] _arg1;
_arg1 = data.createByteArray();
boolean _result = this.keystoreImportKey(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_revokeAppPermission:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.revokeAppPermission(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_grantAppPermission:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.grantAppPermission(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.keychain.tests.support.IKeyChainServiceTestSupport
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
@Override public boolean keystoreReset() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_keystoreReset, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean keystorePassword(java.lang.String password) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(password);
mRemote.transact(Stub.TRANSACTION_keystorePassword, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean keystorePut(java.lang.String key, byte[] value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeByteArray(value);
mRemote.transact(Stub.TRANSACTION_keystorePut, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean keystoreImportKey(java.lang.String key, byte[] value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeByteArray(value);
mRemote.transact(Stub.TRANSACTION_keystoreImportKey, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void revokeAppPermission(int uid, java.lang.String alias) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeString(alias);
mRemote.transact(Stub.TRANSACTION_revokeAppPermission, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void grantAppPermission(int uid, java.lang.String alias) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeString(alias);
mRemote.transact(Stub.TRANSACTION_grantAppPermission, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_keystoreReset = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_keystorePassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_keystorePut = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_keystoreImportKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_revokeAppPermission = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_grantAppPermission = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
}
public boolean keystoreReset() throws android.os.RemoteException;
public boolean keystorePassword(java.lang.String password) throws android.os.RemoteException;
public boolean keystorePut(java.lang.String key, byte[] value) throws android.os.RemoteException;
public boolean keystoreImportKey(java.lang.String key, byte[] value) throws android.os.RemoteException;
public void revokeAppPermission(int uid, java.lang.String alias) throws android.os.RemoteException;
public void grantAppPermission(int uid, java.lang.String alias) throws android.os.RemoteException;
}
