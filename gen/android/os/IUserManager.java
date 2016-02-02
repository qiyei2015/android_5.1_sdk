/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/os/IUserManager.aidl
 */
package android.os;
/**
 *  {@hide}
 */
public interface IUserManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.IUserManager
{
private static final java.lang.String DESCRIPTOR = "android.os.IUserManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.IUserManager interface,
 * generating a proxy if needed.
 */
public static android.os.IUserManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.IUserManager))) {
return ((android.os.IUserManager)iin);
}
return new android.os.IUserManager.Stub.Proxy(obj);
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
case TRANSACTION_createUser:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.content.pm.UserInfo _result = this.createUser(_arg0, _arg1);
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
case TRANSACTION_createProfileForUser:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
android.content.pm.UserInfo _result = this.createProfileForUser(_arg0, _arg1, _arg2);
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
case TRANSACTION_setUserEnabled:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setUserEnabled(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_removeUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.removeUser(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setUserName:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.setUserName(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setUserIcon:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.graphics.Bitmap _arg1;
if ((0!=data.readInt())) {
_arg1 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setUserIcon(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getUserIcon:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.graphics.Bitmap _result = this.getUserIcon(_arg0);
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
case TRANSACTION_getUsers:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
java.util.List<android.content.pm.UserInfo> _result = this.getUsers(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getProfiles:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
java.util.List<android.content.pm.UserInfo> _result = this.getProfiles(_arg0, _arg1);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getProfileParent:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.content.pm.UserInfo _result = this.getProfileParent(_arg0);
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
case TRANSACTION_getUserInfo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.content.pm.UserInfo _result = this.getUserInfo(_arg0);
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
case TRANSACTION_isRestricted:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isRestricted();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getUserSerialNumber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getUserSerialNumber(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getUserHandle:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getUserHandle(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getUserRestrictions:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.os.Bundle _result = this.getUserRestrictions(_arg0);
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
case TRANSACTION_hasUserRestriction:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.hasUserRestriction(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setUserRestrictions:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.setUserRestrictions(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setApplicationRestrictions:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.Bundle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
this.setApplicationRestrictions(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getApplicationRestrictions:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.Bundle _result = this.getApplicationRestrictions(_arg0);
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
case TRANSACTION_getApplicationRestrictionsForUser:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.os.Bundle _result = this.getApplicationRestrictionsForUser(_arg0, _arg1);
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
case TRANSACTION_setRestrictionsChallenge:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.setRestrictionsChallenge(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_checkRestrictionsChallenge:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.checkRestrictionsChallenge(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_hasRestrictionsChallenge:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.hasRestrictionsChallenge();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeRestrictions:
{
data.enforceInterface(DESCRIPTOR);
this.removeRestrictions();
reply.writeNoException();
return true;
}
case TRANSACTION_setDefaultGuestRestrictions:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setDefaultGuestRestrictions(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getDefaultGuestRestrictions:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _result = this.getDefaultGuestRestrictions();
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
case TRANSACTION_markGuestForDeletion:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.markGuestForDeletion(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.IUserManager
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
@Override public android.content.pm.UserInfo createUser(java.lang.String name, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.UserInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_createUser, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.UserInfo.CREATOR.createFromParcel(_reply);
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
@Override public android.content.pm.UserInfo createProfileForUser(java.lang.String name, int flags, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.UserInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeInt(flags);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_createProfileForUser, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.UserInfo.CREATOR.createFromParcel(_reply);
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
@Override public void setUserEnabled(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setUserEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean removeUser(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_removeUser, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setUserName(int userHandle, java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_setUserName, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setUserIcon(int userHandle, android.graphics.Bitmap icon) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
if ((icon!=null)) {
_data.writeInt(1);
icon.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setUserIcon, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.graphics.Bitmap getUserIcon(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.graphics.Bitmap _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getUserIcon, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.graphics.Bitmap.CREATOR.createFromParcel(_reply);
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
@Override public java.util.List<android.content.pm.UserInfo> getUsers(boolean excludeDying) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.pm.UserInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((excludeDying)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getUsers, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.pm.UserInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.content.pm.UserInfo> getProfiles(int userHandle, boolean enabledOnly) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.pm.UserInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
_data.writeInt(((enabledOnly)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getProfiles, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.pm.UserInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.pm.UserInfo getProfileParent(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.UserInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getProfileParent, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.UserInfo.CREATOR.createFromParcel(_reply);
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
@Override public android.content.pm.UserInfo getUserInfo(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.UserInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getUserInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.UserInfo.CREATOR.createFromParcel(_reply);
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
@Override public boolean isRestricted() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isRestricted, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getUserSerialNumber(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getUserSerialNumber, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getUserHandle(int userSerialNumber) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userSerialNumber);
mRemote.transact(Stub.TRANSACTION_getUserHandle, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.os.Bundle getUserRestrictions(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getUserRestrictions, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
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
@Override public boolean hasUserRestriction(java.lang.String restrictionKey, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(restrictionKey);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_hasUserRestriction, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setUserRestrictions(android.os.Bundle restrictions, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((restrictions!=null)) {
_data.writeInt(1);
restrictions.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setUserRestrictions, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setApplicationRestrictions(java.lang.String packageName, android.os.Bundle restrictions, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
if ((restrictions!=null)) {
_data.writeInt(1);
restrictions.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setApplicationRestrictions, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.os.Bundle getApplicationRestrictions(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_getApplicationRestrictions, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
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
@Override public android.os.Bundle getApplicationRestrictionsForUser(java.lang.String packageName, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getApplicationRestrictionsForUser, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
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
@Override public boolean setRestrictionsChallenge(java.lang.String newPin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(newPin);
mRemote.transact(Stub.TRANSACTION_setRestrictionsChallenge, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int checkRestrictionsChallenge(java.lang.String pin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pin);
mRemote.transact(Stub.TRANSACTION_checkRestrictionsChallenge, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean hasRestrictionsChallenge() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_hasRestrictionsChallenge, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void removeRestrictions() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_removeRestrictions, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setDefaultGuestRestrictions(android.os.Bundle restrictions) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((restrictions!=null)) {
_data.writeInt(1);
restrictions.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setDefaultGuestRestrictions, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.os.Bundle getDefaultGuestRestrictions() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDefaultGuestRestrictions, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
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
@Override public boolean markGuestForDeletion(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_markGuestForDeletion, _data, _reply, 0);
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
static final int TRANSACTION_createUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_createProfileForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setUserEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_removeUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setUserName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setUserIcon = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getUserIcon = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getUsers = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getProfiles = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getProfileParent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getUserInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_isRestricted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getUserSerialNumber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_getUserHandle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_getUserRestrictions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_hasUserRestriction = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_setUserRestrictions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_setApplicationRestrictions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_getApplicationRestrictions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_getApplicationRestrictionsForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_setRestrictionsChallenge = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_checkRestrictionsChallenge = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_hasRestrictionsChallenge = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_removeRestrictions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_setDefaultGuestRestrictions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_getDefaultGuestRestrictions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_markGuestForDeletion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
}
public android.content.pm.UserInfo createUser(java.lang.String name, int flags) throws android.os.RemoteException;
public android.content.pm.UserInfo createProfileForUser(java.lang.String name, int flags, int userHandle) throws android.os.RemoteException;
public void setUserEnabled(int userHandle) throws android.os.RemoteException;
public boolean removeUser(int userHandle) throws android.os.RemoteException;
public void setUserName(int userHandle, java.lang.String name) throws android.os.RemoteException;
public void setUserIcon(int userHandle, android.graphics.Bitmap icon) throws android.os.RemoteException;
public android.graphics.Bitmap getUserIcon(int userHandle) throws android.os.RemoteException;
public java.util.List<android.content.pm.UserInfo> getUsers(boolean excludeDying) throws android.os.RemoteException;
public java.util.List<android.content.pm.UserInfo> getProfiles(int userHandle, boolean enabledOnly) throws android.os.RemoteException;
public android.content.pm.UserInfo getProfileParent(int userHandle) throws android.os.RemoteException;
public android.content.pm.UserInfo getUserInfo(int userHandle) throws android.os.RemoteException;
public boolean isRestricted() throws android.os.RemoteException;
public int getUserSerialNumber(int userHandle) throws android.os.RemoteException;
public int getUserHandle(int userSerialNumber) throws android.os.RemoteException;
public android.os.Bundle getUserRestrictions(int userHandle) throws android.os.RemoteException;
public boolean hasUserRestriction(java.lang.String restrictionKey, int userHandle) throws android.os.RemoteException;
public void setUserRestrictions(android.os.Bundle restrictions, int userHandle) throws android.os.RemoteException;
public void setApplicationRestrictions(java.lang.String packageName, android.os.Bundle restrictions, int userHandle) throws android.os.RemoteException;
public android.os.Bundle getApplicationRestrictions(java.lang.String packageName) throws android.os.RemoteException;
public android.os.Bundle getApplicationRestrictionsForUser(java.lang.String packageName, int userHandle) throws android.os.RemoteException;
public boolean setRestrictionsChallenge(java.lang.String newPin) throws android.os.RemoteException;
public int checkRestrictionsChallenge(java.lang.String pin) throws android.os.RemoteException;
public boolean hasRestrictionsChallenge() throws android.os.RemoteException;
public void removeRestrictions() throws android.os.RemoteException;
public void setDefaultGuestRestrictions(android.os.Bundle restrictions) throws android.os.RemoteException;
public android.os.Bundle getDefaultGuestRestrictions() throws android.os.RemoteException;
public boolean markGuestForDeletion(int userHandle) throws android.os.RemoteException;
}
