/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/keystore/java/android/security/IKeyChainService.aidl
 */
package android.security;
/**
 * Caller is required to ensure that {@link KeyStore#unlock
 * KeyStore.unlock} was successful.
 *
 * @hide
 */
public interface IKeyChainService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.security.IKeyChainService
{
private static final java.lang.String DESCRIPTOR = "android.security.IKeyChainService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.security.IKeyChainService interface,
 * generating a proxy if needed.
 */
public static android.security.IKeyChainService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.security.IKeyChainService))) {
return ((android.security.IKeyChainService)iin);
}
return new android.security.IKeyChainService.Stub.Proxy(obj);
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
case TRANSACTION_requestPrivateKey:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.requestPrivateKey(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getCertificate:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
byte[] _result = this.getCertificate(_arg0);
reply.writeNoException();
reply.writeByteArray(_result);
return true;
}
case TRANSACTION_installCaCertificate:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
this.installCaCertificate(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_installKeyPair:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
byte[] _arg1;
_arg1 = data.createByteArray();
java.lang.String _arg2;
_arg2 = data.readString();
boolean _result = this.installKeyPair(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_deleteCaCertificate:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.deleteCaCertificate(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_reset:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.reset();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getUserCaAliases:
{
data.enforceInterface(DESCRIPTOR);
android.content.pm.ParceledListSlice _result = this.getUserCaAliases();
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
case TRANSACTION_getSystemCaAliases:
{
data.enforceInterface(DESCRIPTOR);
android.content.pm.ParceledListSlice _result = this.getSystemCaAliases();
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
case TRANSACTION_containsCaAlias:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.containsCaAlias(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getEncodedCaCertificate:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
byte[] _result = this.getEncodedCaCertificate(_arg0, _arg1);
reply.writeNoException();
reply.writeByteArray(_result);
return true;
}
case TRANSACTION_getCaCertificateChainAliases:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
java.util.List<java.lang.String> _result = this.getCaCertificateChainAliases(_arg0, _arg1);
reply.writeNoException();
reply.writeStringList(_result);
return true;
}
case TRANSACTION_setGrant:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setGrant(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_hasGrant:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.hasGrant(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.security.IKeyChainService
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
// APIs used by KeyChain

@Override public java.lang.String requestPrivateKey(java.lang.String alias) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(alias);
mRemote.transact(Stub.TRANSACTION_requestPrivateKey, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public byte[] getCertificate(java.lang.String alias) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
byte[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(alias);
mRemote.transact(Stub.TRANSACTION_getCertificate, _data, _reply, 0);
_reply.readException();
_result = _reply.createByteArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// APIs used by CertInstaller

@Override public void installCaCertificate(byte[] caCertificate) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(caCertificate);
mRemote.transact(Stub.TRANSACTION_installCaCertificate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// APIs used by DevicePolicyManager

@Override public boolean installKeyPair(byte[] privateKey, byte[] userCert, java.lang.String alias) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(privateKey);
_data.writeByteArray(userCert);
_data.writeString(alias);
mRemote.transact(Stub.TRANSACTION_installKeyPair, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// APIs used by Settings

@Override public boolean deleteCaCertificate(java.lang.String alias) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(alias);
mRemote.transact(Stub.TRANSACTION_deleteCaCertificate, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean reset() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_reset, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.pm.ParceledListSlice getUserCaAliases() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ParceledListSlice _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getUserCaAliases, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(_reply);
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
@Override public android.content.pm.ParceledListSlice getSystemCaAliases() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ParceledListSlice _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSystemCaAliases, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(_reply);
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
@Override public boolean containsCaAlias(java.lang.String alias) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(alias);
mRemote.transact(Stub.TRANSACTION_containsCaAlias, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public byte[] getEncodedCaCertificate(java.lang.String alias, boolean includeDeletedSystem) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
byte[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(alias);
_data.writeInt(((includeDeletedSystem)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getEncodedCaCertificate, _data, _reply, 0);
_reply.readException();
_result = _reply.createByteArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<java.lang.String> getCaCertificateChainAliases(java.lang.String rootAlias, boolean includeDeletedSystem) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<java.lang.String> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(rootAlias);
_data.writeInt(((includeDeletedSystem)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getCaCertificateChainAliases, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArrayList();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// APIs used by KeyChainActivity

@Override public void setGrant(int uid, java.lang.String alias, boolean value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeString(alias);
_data.writeInt(((value)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setGrant, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean hasGrant(int uid, java.lang.String alias) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeString(alias);
mRemote.transact(Stub.TRANSACTION_hasGrant, _data, _reply, 0);
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
static final int TRANSACTION_requestPrivateKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getCertificate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_installCaCertificate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_installKeyPair = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_deleteCaCertificate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_reset = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getUserCaAliases = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getSystemCaAliases = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_containsCaAlias = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getEncodedCaCertificate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getCaCertificateChainAliases = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_setGrant = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_hasGrant = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
}
// APIs used by KeyChain

public java.lang.String requestPrivateKey(java.lang.String alias) throws android.os.RemoteException;
public byte[] getCertificate(java.lang.String alias) throws android.os.RemoteException;
// APIs used by CertInstaller

public void installCaCertificate(byte[] caCertificate) throws android.os.RemoteException;
// APIs used by DevicePolicyManager

public boolean installKeyPair(byte[] privateKey, byte[] userCert, java.lang.String alias) throws android.os.RemoteException;
// APIs used by Settings

public boolean deleteCaCertificate(java.lang.String alias) throws android.os.RemoteException;
public boolean reset() throws android.os.RemoteException;
public android.content.pm.ParceledListSlice getUserCaAliases() throws android.os.RemoteException;
public android.content.pm.ParceledListSlice getSystemCaAliases() throws android.os.RemoteException;
public boolean containsCaAlias(java.lang.String alias) throws android.os.RemoteException;
public byte[] getEncodedCaCertificate(java.lang.String alias, boolean includeDeletedSystem) throws android.os.RemoteException;
public java.util.List<java.lang.String> getCaCertificateChainAliases(java.lang.String rootAlias, boolean includeDeletedSystem) throws android.os.RemoteException;
// APIs used by KeyChainActivity

public void setGrant(int uid, java.lang.String alias, boolean value) throws android.os.RemoteException;
public boolean hasGrant(int uid, java.lang.String alias) throws android.os.RemoteException;
}
