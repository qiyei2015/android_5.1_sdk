/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/accounts/IAccountManager.aidl
 */
package android.accounts;
/**
 * Central application service that provides account management.
 * @hide
 */
public interface IAccountManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.accounts.IAccountManager
{
private static final java.lang.String DESCRIPTOR = "android.accounts.IAccountManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.accounts.IAccountManager interface,
 * generating a proxy if needed.
 */
public static android.accounts.IAccountManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.accounts.IAccountManager))) {
return ((android.accounts.IAccountManager)iin);
}
return new android.accounts.IAccountManager.Stub.Proxy(obj);
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
case TRANSACTION_getPassword:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.Account _arg0;
if ((0!=data.readInt())) {
_arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _result = this.getPassword(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getUserData:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.Account _arg0;
if ((0!=data.readInt())) {
_arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _result = this.getUserData(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getAuthenticatorTypes:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.accounts.AuthenticatorDescription[] _result = this.getAuthenticatorTypes(_arg0);
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_getAccounts:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.accounts.Account[] _result = this.getAccounts(_arg0);
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_getAccountsForPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.accounts.Account[] _result = this.getAccountsForPackage(_arg0, _arg1);
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_getAccountsByTypeForPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
android.accounts.Account[] _result = this.getAccountsByTypeForPackage(_arg0, _arg1);
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_getAccountsAsUser:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.accounts.Account[] _result = this.getAccountsAsUser(_arg0, _arg1);
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_hasFeatures:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountManagerResponse _arg0;
_arg0 = android.accounts.IAccountManagerResponse.Stub.asInterface(data.readStrongBinder());
android.accounts.Account _arg1;
if ((0!=data.readInt())) {
_arg1 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String[] _arg2;
_arg2 = data.createStringArray();
this.hasFeatures(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getAccountsByFeatures:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountManagerResponse _arg0;
_arg0 = android.accounts.IAccountManagerResponse.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String[] _arg2;
_arg2 = data.createStringArray();
this.getAccountsByFeatures(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_addAccountExplicitly:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.Account _arg0;
if ((0!=data.readInt())) {
_arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
android.os.Bundle _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
boolean _result = this.addAccountExplicitly(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeAccount:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountManagerResponse _arg0;
_arg0 = android.accounts.IAccountManagerResponse.Stub.asInterface(data.readStrongBinder());
android.accounts.Account _arg1;
if ((0!=data.readInt())) {
_arg1 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _arg2;
_arg2 = (0!=data.readInt());
this.removeAccount(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_removeAccountAsUser:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountManagerResponse _arg0;
_arg0 = android.accounts.IAccountManagerResponse.Stub.asInterface(data.readStrongBinder());
android.accounts.Account _arg1;
if ((0!=data.readInt())) {
_arg1 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _arg2;
_arg2 = (0!=data.readInt());
int _arg3;
_arg3 = data.readInt();
this.removeAccountAsUser(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_removeAccountExplicitly:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.Account _arg0;
if ((0!=data.readInt())) {
_arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.removeAccountExplicitly(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_copyAccountToUser:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountManagerResponse _arg0;
_arg0 = android.accounts.IAccountManagerResponse.Stub.asInterface(data.readStrongBinder());
android.accounts.Account _arg1;
if ((0!=data.readInt())) {
_arg1 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.copyAccountToUser(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_invalidateAuthToken:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.invalidateAuthToken(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_peekAuthToken:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.Account _arg0;
if ((0!=data.readInt())) {
_arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _result = this.peekAuthToken(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_setAuthToken:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.Account _arg0;
if ((0!=data.readInt())) {
_arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.setAuthToken(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setPassword:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.Account _arg0;
if ((0!=data.readInt())) {
_arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
this.setPassword(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_clearPassword:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.Account _arg0;
if ((0!=data.readInt())) {
_arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.clearPassword(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setUserData:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.Account _arg0;
if ((0!=data.readInt())) {
_arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.setUserData(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_updateAppPermission:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.Account _arg0;
if ((0!=data.readInt())) {
_arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
boolean _arg3;
_arg3 = (0!=data.readInt());
this.updateAppPermission(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_getAuthToken:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountManagerResponse _arg0;
_arg0 = android.accounts.IAccountManagerResponse.Stub.asInterface(data.readStrongBinder());
android.accounts.Account _arg1;
if ((0!=data.readInt())) {
_arg1 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String _arg2;
_arg2 = data.readString();
boolean _arg3;
_arg3 = (0!=data.readInt());
boolean _arg4;
_arg4 = (0!=data.readInt());
android.os.Bundle _arg5;
if ((0!=data.readInt())) {
_arg5 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg5 = null;
}
this.getAuthToken(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_addAccount:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountManagerResponse _arg0;
_arg0 = android.accounts.IAccountManagerResponse.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String[] _arg3;
_arg3 = data.createStringArray();
boolean _arg4;
_arg4 = (0!=data.readInt());
android.os.Bundle _arg5;
if ((0!=data.readInt())) {
_arg5 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg5 = null;
}
this.addAccount(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_addAccountAsUser:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountManagerResponse _arg0;
_arg0 = android.accounts.IAccountManagerResponse.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String[] _arg3;
_arg3 = data.createStringArray();
boolean _arg4;
_arg4 = (0!=data.readInt());
android.os.Bundle _arg5;
if ((0!=data.readInt())) {
_arg5 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg5 = null;
}
int _arg6;
_arg6 = data.readInt();
this.addAccountAsUser(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
return true;
}
case TRANSACTION_updateCredentials:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountManagerResponse _arg0;
_arg0 = android.accounts.IAccountManagerResponse.Stub.asInterface(data.readStrongBinder());
android.accounts.Account _arg1;
if ((0!=data.readInt())) {
_arg1 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String _arg2;
_arg2 = data.readString();
boolean _arg3;
_arg3 = (0!=data.readInt());
android.os.Bundle _arg4;
if ((0!=data.readInt())) {
_arg4 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
this.updateCredentials(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_editProperties:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountManagerResponse _arg0;
_arg0 = android.accounts.IAccountManagerResponse.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.editProperties(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_confirmCredentialsAsUser:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountManagerResponse _arg0;
_arg0 = android.accounts.IAccountManagerResponse.Stub.asInterface(data.readStrongBinder());
android.accounts.Account _arg1;
if ((0!=data.readInt())) {
_arg1 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.os.Bundle _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
boolean _arg3;
_arg3 = (0!=data.readInt());
int _arg4;
_arg4 = data.readInt();
this.confirmCredentialsAsUser(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_getAuthTokenLabel:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountManagerResponse _arg0;
_arg0 = android.accounts.IAccountManagerResponse.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.getAuthTokenLabel(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_addSharedAccountAsUser:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.Account _arg0;
if ((0!=data.readInt())) {
_arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _result = this.addSharedAccountAsUser(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getSharedAccountsAsUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.accounts.Account[] _result = this.getSharedAccountsAsUser(_arg0);
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_removeSharedAccountAsUser:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.Account _arg0;
if ((0!=data.readInt())) {
_arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _result = this.removeSharedAccountAsUser(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_renameAccount:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountManagerResponse _arg0;
_arg0 = android.accounts.IAccountManagerResponse.Stub.asInterface(data.readStrongBinder());
android.accounts.Account _arg1;
if ((0!=data.readInt())) {
_arg1 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String _arg2;
_arg2 = data.readString();
this.renameAccount(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPreviousName:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.Account _arg0;
if ((0!=data.readInt())) {
_arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _result = this.getPreviousName(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_renameSharedAccountAsUser:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.Account _arg0;
if ((0!=data.readInt())) {
_arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
boolean _result = this.renameSharedAccountAsUser(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.accounts.IAccountManager
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
@Override public java.lang.String getPassword(android.accounts.Account account) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getPassword, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getUserData(android.accounts.Account account, java.lang.String key) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(key);
mRemote.transact(Stub.TRANSACTION_getUserData, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.accounts.AuthenticatorDescription[] getAuthenticatorTypes(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.accounts.AuthenticatorDescription[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getAuthenticatorTypes, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.accounts.AuthenticatorDescription.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.accounts.Account[] getAccounts(java.lang.String accountType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.accounts.Account[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(accountType);
mRemote.transact(Stub.TRANSACTION_getAccounts, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.accounts.Account.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.accounts.Account[] getAccountsForPackage(java.lang.String packageName, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.accounts.Account[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_getAccountsForPackage, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.accounts.Account.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.accounts.Account[] getAccountsByTypeForPackage(java.lang.String type, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.accounts.Account[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(type);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_getAccountsByTypeForPackage, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.accounts.Account.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.accounts.Account[] getAccountsAsUser(java.lang.String accountType, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.accounts.Account[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(accountType);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getAccountsAsUser, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.accounts.Account.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void hasFeatures(android.accounts.IAccountManagerResponse response, android.accounts.Account account, java.lang.String[] features) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStringArray(features);
mRemote.transact(Stub.TRANSACTION_hasFeatures, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void getAccountsByFeatures(android.accounts.IAccountManagerResponse response, java.lang.String accountType, java.lang.String[] features) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
_data.writeString(accountType);
_data.writeStringArray(features);
mRemote.transact(Stub.TRANSACTION_getAccountsByFeatures, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean addAccountExplicitly(android.accounts.Account account, java.lang.String password, android.os.Bundle extras) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(password);
if ((extras!=null)) {
_data.writeInt(1);
extras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addAccountExplicitly, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void removeAccount(android.accounts.IAccountManagerResponse response, android.accounts.Account account, boolean expectActivityLaunch) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((expectActivityLaunch)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_removeAccount, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeAccountAsUser(android.accounts.IAccountManagerResponse response, android.accounts.Account account, boolean expectActivityLaunch, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((expectActivityLaunch)?(1):(0)));
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_removeAccountAsUser, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean removeAccountExplicitly(android.accounts.Account account) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_removeAccountExplicitly, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void copyAccountToUser(android.accounts.IAccountManagerResponse response, android.accounts.Account account, int userFrom, int userTo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userFrom);
_data.writeInt(userTo);
mRemote.transact(Stub.TRANSACTION_copyAccountToUser, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void invalidateAuthToken(java.lang.String accountType, java.lang.String authToken) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(accountType);
_data.writeString(authToken);
mRemote.transact(Stub.TRANSACTION_invalidateAuthToken, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String peekAuthToken(android.accounts.Account account, java.lang.String authTokenType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(authTokenType);
mRemote.transact(Stub.TRANSACTION_peekAuthToken, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setAuthToken(android.accounts.Account account, java.lang.String authTokenType, java.lang.String authToken) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(authTokenType);
_data.writeString(authToken);
mRemote.transact(Stub.TRANSACTION_setAuthToken, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setPassword(android.accounts.Account account, java.lang.String password) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(password);
mRemote.transact(Stub.TRANSACTION_setPassword, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearPassword(android.accounts.Account account) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_clearPassword, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setUserData(android.accounts.Account account, java.lang.String key, java.lang.String value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(key);
_data.writeString(value);
mRemote.transact(Stub.TRANSACTION_setUserData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void updateAppPermission(android.accounts.Account account, java.lang.String authTokenType, int uid, boolean value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(authTokenType);
_data.writeInt(uid);
_data.writeInt(((value)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_updateAppPermission, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void getAuthToken(android.accounts.IAccountManagerResponse response, android.accounts.Account account, java.lang.String authTokenType, boolean notifyOnAuthFailure, boolean expectActivityLaunch, android.os.Bundle options) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(authTokenType);
_data.writeInt(((notifyOnAuthFailure)?(1):(0)));
_data.writeInt(((expectActivityLaunch)?(1):(0)));
if ((options!=null)) {
_data.writeInt(1);
options.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getAuthToken, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void addAccount(android.accounts.IAccountManagerResponse response, java.lang.String accountType, java.lang.String authTokenType, java.lang.String[] requiredFeatures, boolean expectActivityLaunch, android.os.Bundle options) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
_data.writeString(accountType);
_data.writeString(authTokenType);
_data.writeStringArray(requiredFeatures);
_data.writeInt(((expectActivityLaunch)?(1):(0)));
if ((options!=null)) {
_data.writeInt(1);
options.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addAccount, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void addAccountAsUser(android.accounts.IAccountManagerResponse response, java.lang.String accountType, java.lang.String authTokenType, java.lang.String[] requiredFeatures, boolean expectActivityLaunch, android.os.Bundle options, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
_data.writeString(accountType);
_data.writeString(authTokenType);
_data.writeStringArray(requiredFeatures);
_data.writeInt(((expectActivityLaunch)?(1):(0)));
if ((options!=null)) {
_data.writeInt(1);
options.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_addAccountAsUser, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void updateCredentials(android.accounts.IAccountManagerResponse response, android.accounts.Account account, java.lang.String authTokenType, boolean expectActivityLaunch, android.os.Bundle options) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(authTokenType);
_data.writeInt(((expectActivityLaunch)?(1):(0)));
if ((options!=null)) {
_data.writeInt(1);
options.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateCredentials, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void editProperties(android.accounts.IAccountManagerResponse response, java.lang.String accountType, boolean expectActivityLaunch) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
_data.writeString(accountType);
_data.writeInt(((expectActivityLaunch)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_editProperties, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void confirmCredentialsAsUser(android.accounts.IAccountManagerResponse response, android.accounts.Account account, android.os.Bundle options, boolean expectActivityLaunch, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((options!=null)) {
_data.writeInt(1);
options.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((expectActivityLaunch)?(1):(0)));
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_confirmCredentialsAsUser, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void getAuthTokenLabel(android.accounts.IAccountManagerResponse response, java.lang.String accountType, java.lang.String authTokenType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
_data.writeString(accountType);
_data.writeString(authTokenType);
mRemote.transact(Stub.TRANSACTION_getAuthTokenLabel, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* Shared accounts */
@Override public boolean addSharedAccountAsUser(android.accounts.Account account, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_addSharedAccountAsUser, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.accounts.Account[] getSharedAccountsAsUser(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.accounts.Account[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getSharedAccountsAsUser, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.accounts.Account.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean removeSharedAccountAsUser(android.accounts.Account account, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_removeSharedAccountAsUser, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/* Account renaming. */
@Override public void renameAccount(android.accounts.IAccountManagerResponse response, android.accounts.Account accountToRename, java.lang.String newName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
if ((accountToRename!=null)) {
_data.writeInt(1);
accountToRename.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(newName);
mRemote.transact(Stub.TRANSACTION_renameAccount, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String getPreviousName(android.accounts.Account account) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getPreviousName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean renameSharedAccountAsUser(android.accounts.Account accountToRename, java.lang.String newName, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((accountToRename!=null)) {
_data.writeInt(1);
accountToRename.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(newName);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_renameSharedAccountAsUser, _data, _reply, 0);
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
static final int TRANSACTION_getPassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getUserData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getAuthenticatorTypes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getAccounts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getAccountsForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getAccountsByTypeForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getAccountsAsUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_hasFeatures = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getAccountsByFeatures = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_addAccountExplicitly = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_removeAccount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_removeAccountAsUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_removeAccountExplicitly = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_copyAccountToUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_invalidateAuthToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_peekAuthToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_setAuthToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_setPassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_clearPassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_setUserData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_updateAppPermission = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_getAuthToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_addAccount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_addAccountAsUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_updateCredentials = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_editProperties = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_confirmCredentialsAsUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_getAuthTokenLabel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_addSharedAccountAsUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_getSharedAccountsAsUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_removeSharedAccountAsUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_renameAccount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_getPreviousName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_renameSharedAccountAsUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
}
public java.lang.String getPassword(android.accounts.Account account) throws android.os.RemoteException;
public java.lang.String getUserData(android.accounts.Account account, java.lang.String key) throws android.os.RemoteException;
public android.accounts.AuthenticatorDescription[] getAuthenticatorTypes(int userId) throws android.os.RemoteException;
public android.accounts.Account[] getAccounts(java.lang.String accountType) throws android.os.RemoteException;
public android.accounts.Account[] getAccountsForPackage(java.lang.String packageName, int uid) throws android.os.RemoteException;
public android.accounts.Account[] getAccountsByTypeForPackage(java.lang.String type, java.lang.String packageName) throws android.os.RemoteException;
public android.accounts.Account[] getAccountsAsUser(java.lang.String accountType, int userId) throws android.os.RemoteException;
public void hasFeatures(android.accounts.IAccountManagerResponse response, android.accounts.Account account, java.lang.String[] features) throws android.os.RemoteException;
public void getAccountsByFeatures(android.accounts.IAccountManagerResponse response, java.lang.String accountType, java.lang.String[] features) throws android.os.RemoteException;
public boolean addAccountExplicitly(android.accounts.Account account, java.lang.String password, android.os.Bundle extras) throws android.os.RemoteException;
public void removeAccount(android.accounts.IAccountManagerResponse response, android.accounts.Account account, boolean expectActivityLaunch) throws android.os.RemoteException;
public void removeAccountAsUser(android.accounts.IAccountManagerResponse response, android.accounts.Account account, boolean expectActivityLaunch, int userId) throws android.os.RemoteException;
public boolean removeAccountExplicitly(android.accounts.Account account) throws android.os.RemoteException;
public void copyAccountToUser(android.accounts.IAccountManagerResponse response, android.accounts.Account account, int userFrom, int userTo) throws android.os.RemoteException;
public void invalidateAuthToken(java.lang.String accountType, java.lang.String authToken) throws android.os.RemoteException;
public java.lang.String peekAuthToken(android.accounts.Account account, java.lang.String authTokenType) throws android.os.RemoteException;
public void setAuthToken(android.accounts.Account account, java.lang.String authTokenType, java.lang.String authToken) throws android.os.RemoteException;
public void setPassword(android.accounts.Account account, java.lang.String password) throws android.os.RemoteException;
public void clearPassword(android.accounts.Account account) throws android.os.RemoteException;
public void setUserData(android.accounts.Account account, java.lang.String key, java.lang.String value) throws android.os.RemoteException;
public void updateAppPermission(android.accounts.Account account, java.lang.String authTokenType, int uid, boolean value) throws android.os.RemoteException;
public void getAuthToken(android.accounts.IAccountManagerResponse response, android.accounts.Account account, java.lang.String authTokenType, boolean notifyOnAuthFailure, boolean expectActivityLaunch, android.os.Bundle options) throws android.os.RemoteException;
public void addAccount(android.accounts.IAccountManagerResponse response, java.lang.String accountType, java.lang.String authTokenType, java.lang.String[] requiredFeatures, boolean expectActivityLaunch, android.os.Bundle options) throws android.os.RemoteException;
public void addAccountAsUser(android.accounts.IAccountManagerResponse response, java.lang.String accountType, java.lang.String authTokenType, java.lang.String[] requiredFeatures, boolean expectActivityLaunch, android.os.Bundle options, int userId) throws android.os.RemoteException;
public void updateCredentials(android.accounts.IAccountManagerResponse response, android.accounts.Account account, java.lang.String authTokenType, boolean expectActivityLaunch, android.os.Bundle options) throws android.os.RemoteException;
public void editProperties(android.accounts.IAccountManagerResponse response, java.lang.String accountType, boolean expectActivityLaunch) throws android.os.RemoteException;
public void confirmCredentialsAsUser(android.accounts.IAccountManagerResponse response, android.accounts.Account account, android.os.Bundle options, boolean expectActivityLaunch, int userId) throws android.os.RemoteException;
public void getAuthTokenLabel(android.accounts.IAccountManagerResponse response, java.lang.String accountType, java.lang.String authTokenType) throws android.os.RemoteException;
/* Shared accounts */
public boolean addSharedAccountAsUser(android.accounts.Account account, int userId) throws android.os.RemoteException;
public android.accounts.Account[] getSharedAccountsAsUser(int userId) throws android.os.RemoteException;
public boolean removeSharedAccountAsUser(android.accounts.Account account, int userId) throws android.os.RemoteException;
/* Account renaming. */
public void renameAccount(android.accounts.IAccountManagerResponse response, android.accounts.Account accountToRename, java.lang.String newName) throws android.os.RemoteException;
public java.lang.String getPreviousName(android.accounts.Account account) throws android.os.RemoteException;
public boolean renameSharedAccountAsUser(android.accounts.Account accountToRename, java.lang.String newName, int userId) throws android.os.RemoteException;
}
