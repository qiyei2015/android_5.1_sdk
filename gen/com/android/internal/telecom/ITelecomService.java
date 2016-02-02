/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/telecomm/java/com/android/internal/telecom/ITelecomService.aidl
 */
package com.android.internal.telecom;
/**
 * Interface used to interact with Telecom. Mostly this is used by TelephonyManager for passing
 * commands that were previously handled by ITelephony.
 * {@hide}
 */
public interface ITelecomService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.ITelecomService
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.ITelecomService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.telecom.ITelecomService interface,
 * generating a proxy if needed.
 */
public static com.android.internal.telecom.ITelecomService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.telecom.ITelecomService))) {
return ((com.android.internal.telecom.ITelecomService)iin);
}
return new com.android.internal.telecom.ITelecomService.Stub.Proxy(obj);
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
case TRANSACTION_showInCallScreen:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.showInCallScreen(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getDefaultOutgoingPhoneAccount:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.telecom.PhoneAccountHandle _result = this.getDefaultOutgoingPhoneAccount(_arg0);
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
case TRANSACTION_getUserSelectedOutgoingPhoneAccount:
{
data.enforceInterface(DESCRIPTOR);
android.telecom.PhoneAccountHandle _result = this.getUserSelectedOutgoingPhoneAccount();
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
case TRANSACTION_setUserSelectedOutgoingPhoneAccount:
{
data.enforceInterface(DESCRIPTOR);
android.telecom.PhoneAccountHandle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telecom.PhoneAccountHandle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setUserSelectedOutgoingPhoneAccount(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getCallCapablePhoneAccounts:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.telecom.PhoneAccountHandle> _result = this.getCallCapablePhoneAccounts();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getPhoneAccountsSupportingScheme:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.List<android.telecom.PhoneAccountHandle> _result = this.getPhoneAccountsSupportingScheme(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getPhoneAccountsForPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.List<android.telecom.PhoneAccountHandle> _result = this.getPhoneAccountsForPackage(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getPhoneAccount:
{
data.enforceInterface(DESCRIPTOR);
android.telecom.PhoneAccountHandle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telecom.PhoneAccountHandle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.telecom.PhoneAccount _result = this.getPhoneAccount(_arg0);
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
case TRANSACTION_getAllPhoneAccountsCount:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getAllPhoneAccountsCount();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getAllPhoneAccounts:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.telecom.PhoneAccount> _result = this.getAllPhoneAccounts();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getAllPhoneAccountHandles:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.telecom.PhoneAccountHandle> _result = this.getAllPhoneAccountHandles();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getSimCallManager:
{
data.enforceInterface(DESCRIPTOR);
android.telecom.PhoneAccountHandle _result = this.getSimCallManager();
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
case TRANSACTION_setSimCallManager:
{
data.enforceInterface(DESCRIPTOR);
android.telecom.PhoneAccountHandle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telecom.PhoneAccountHandle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setSimCallManager(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getSimCallManagers:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.telecom.PhoneAccountHandle> _result = this.getSimCallManagers();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_registerPhoneAccount:
{
data.enforceInterface(DESCRIPTOR);
android.telecom.PhoneAccount _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telecom.PhoneAccount.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.registerPhoneAccount(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterPhoneAccount:
{
data.enforceInterface(DESCRIPTOR);
android.telecom.PhoneAccountHandle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telecom.PhoneAccountHandle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.unregisterPhoneAccount(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_clearAccounts:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.clearAccounts(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isVoiceMailNumber:
{
data.enforceInterface(DESCRIPTOR);
android.telecom.PhoneAccountHandle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telecom.PhoneAccountHandle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.isVoiceMailNumber(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_hasVoiceMailNumber:
{
data.enforceInterface(DESCRIPTOR);
android.telecom.PhoneAccountHandle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telecom.PhoneAccountHandle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.hasVoiceMailNumber(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getLine1Number:
{
data.enforceInterface(DESCRIPTOR);
android.telecom.PhoneAccountHandle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telecom.PhoneAccountHandle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _result = this.getLine1Number(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getDefaultPhoneApp:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _result = this.getDefaultPhoneApp();
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
case TRANSACTION_silenceRinger:
{
data.enforceInterface(DESCRIPTOR);
this.silenceRinger();
reply.writeNoException();
return true;
}
case TRANSACTION_isInCall:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isInCall();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isRinging:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isRinging();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getCallState:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getCallState();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_endCall:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.endCall();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_acceptRingingCall:
{
data.enforceInterface(DESCRIPTOR);
this.acceptRingingCall();
reply.writeNoException();
return true;
}
case TRANSACTION_cancelMissedCallsNotification:
{
data.enforceInterface(DESCRIPTOR);
this.cancelMissedCallsNotification();
reply.writeNoException();
return true;
}
case TRANSACTION_handlePinMmi:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.handlePinMmi(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_handlePinMmiForPhoneAccount:
{
data.enforceInterface(DESCRIPTOR);
android.telecom.PhoneAccountHandle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telecom.PhoneAccountHandle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.handlePinMmiForPhoneAccount(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getAdnUriForPhoneAccount:
{
data.enforceInterface(DESCRIPTOR);
android.telecom.PhoneAccountHandle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telecom.PhoneAccountHandle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.net.Uri _result = this.getAdnUriForPhoneAccount(_arg0);
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
case TRANSACTION_isTtySupported:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isTtySupported();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getCurrentTtyMode:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getCurrentTtyMode();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_addNewIncomingCall:
{
data.enforceInterface(DESCRIPTOR);
android.telecom.PhoneAccountHandle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telecom.PhoneAccountHandle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.Bundle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.addNewIncomingCall(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_addNewUnknownCall:
{
data.enforceInterface(DESCRIPTOR);
android.telecom.PhoneAccountHandle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telecom.PhoneAccountHandle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.Bundle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.addNewUnknownCall(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.telecom.ITelecomService
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
/**
     * Brings the in-call screen to the foreground if there is an active call.
     *
     * @param showDialpad if true, make the dialpad visible initially.
     */
@Override public void showInCallScreen(boolean showDialpad) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((showDialpad)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_showInCallScreen, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * @see TelecomServiceImpl#getDefaultOutgoingPhoneAccount
     */
@Override public android.telecom.PhoneAccountHandle getDefaultOutgoingPhoneAccount(java.lang.String uriScheme) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.telecom.PhoneAccountHandle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(uriScheme);
mRemote.transact(Stub.TRANSACTION_getDefaultOutgoingPhoneAccount, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.telecom.PhoneAccountHandle.CREATOR.createFromParcel(_reply);
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
/**
     * @see TelecomServiceImpl#getUserSelectedOutgoingPhoneAccount
     */
@Override public android.telecom.PhoneAccountHandle getUserSelectedOutgoingPhoneAccount() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.telecom.PhoneAccountHandle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getUserSelectedOutgoingPhoneAccount, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.telecom.PhoneAccountHandle.CREATOR.createFromParcel(_reply);
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
/**
     * @see TelecomServiceImpl#setUserSelectedOutgoingPhoneAccount
     */
@Override public void setUserSelectedOutgoingPhoneAccount(android.telecom.PhoneAccountHandle account) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_setUserSelectedOutgoingPhoneAccount, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * @see TelecomServiceImpl#getCallCapablePhoneAccounts
     */
@Override public java.util.List<android.telecom.PhoneAccountHandle> getCallCapablePhoneAccounts() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.telecom.PhoneAccountHandle> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCallCapablePhoneAccounts, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.telecom.PhoneAccountHandle.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @see TelecomManager#getPhoneAccountsSupportingScheme
     */
@Override public java.util.List<android.telecom.PhoneAccountHandle> getPhoneAccountsSupportingScheme(java.lang.String uriScheme) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.telecom.PhoneAccountHandle> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(uriScheme);
mRemote.transact(Stub.TRANSACTION_getPhoneAccountsSupportingScheme, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.telecom.PhoneAccountHandle.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @see TelecomManager#getPhoneAccountsForPackage
     */
@Override public java.util.List<android.telecom.PhoneAccountHandle> getPhoneAccountsForPackage(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.telecom.PhoneAccountHandle> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_getPhoneAccountsForPackage, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.telecom.PhoneAccountHandle.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @see TelecomManager#getPhoneAccount
     */
@Override public android.telecom.PhoneAccount getPhoneAccount(android.telecom.PhoneAccountHandle account) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.telecom.PhoneAccount _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getPhoneAccount, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.telecom.PhoneAccount.CREATOR.createFromParcel(_reply);
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
/**
     * @see TelecomManager#getAllPhoneAccountsCount
     */
@Override public int getAllPhoneAccountsCount() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAllPhoneAccountsCount, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @see TelecomManager#getAllPhoneAccounts
     */
@Override public java.util.List<android.telecom.PhoneAccount> getAllPhoneAccounts() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.telecom.PhoneAccount> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAllPhoneAccounts, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.telecom.PhoneAccount.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @see TelecomManager#getAllPhoneAccountHandles
     */
@Override public java.util.List<android.telecom.PhoneAccountHandle> getAllPhoneAccountHandles() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.telecom.PhoneAccountHandle> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAllPhoneAccountHandles, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.telecom.PhoneAccountHandle.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @see TelecomServiceImpl#getSimCallManager
     */
@Override public android.telecom.PhoneAccountHandle getSimCallManager() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.telecom.PhoneAccountHandle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSimCallManager, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.telecom.PhoneAccountHandle.CREATOR.createFromParcel(_reply);
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
/**
     * @see TelecomServiceImpl#setSimCallManager
     */
@Override public void setSimCallManager(android.telecom.PhoneAccountHandle account) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_setSimCallManager, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * @see TelecomServiceImpl#getSimCallManagers
     */
@Override public java.util.List<android.telecom.PhoneAccountHandle> getSimCallManagers() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.telecom.PhoneAccountHandle> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSimCallManagers, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.telecom.PhoneAccountHandle.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @see TelecomServiceImpl#registerPhoneAccount
     */
@Override public void registerPhoneAccount(android.telecom.PhoneAccount metadata) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((metadata!=null)) {
_data.writeInt(1);
metadata.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_registerPhoneAccount, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * @see TelecomServiceImpl#unregisterPhoneAccount
     */
@Override public void unregisterPhoneAccount(android.telecom.PhoneAccountHandle account) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_unregisterPhoneAccount, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * @see TelecomServiceImpl#clearAccounts
     */
@Override public void clearAccounts(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_clearAccounts, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * @see TelecomServiceImpl#isVoiceMailNumber
     */
@Override public boolean isVoiceMailNumber(android.telecom.PhoneAccountHandle accountHandle, java.lang.String number) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((accountHandle!=null)) {
_data.writeInt(1);
accountHandle.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(number);
mRemote.transact(Stub.TRANSACTION_isVoiceMailNumber, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @see TelecomServiceImpl#hasVoiceMailNumber
     */
@Override public boolean hasVoiceMailNumber(android.telecom.PhoneAccountHandle accountHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((accountHandle!=null)) {
_data.writeInt(1);
accountHandle.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_hasVoiceMailNumber, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @see TelecomServiceImpl#getLine1Number
     */
@Override public java.lang.String getLine1Number(android.telecom.PhoneAccountHandle accountHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((accountHandle!=null)) {
_data.writeInt(1);
accountHandle.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getLine1Number, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @see TelecomServiceImpl#getDefaultPhoneApp
     */
@Override public android.content.ComponentName getDefaultPhoneApp() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.ComponentName _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDefaultPhoneApp, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.ComponentName.CREATOR.createFromParcel(_reply);
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
//
// Internal system apis relating to call management.
//
/**
     * @see TelecomServiceImpl#silenceRinger
     */
@Override public void silenceRinger() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_silenceRinger, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * @see TelecomServiceImpl#isInCall
     */
@Override public boolean isInCall() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isInCall, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @see TelecomServiceImpl#isRinging
     */
@Override public boolean isRinging() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isRinging, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @see TelecomServiceImpl#getCallState
     */
@Override public int getCallState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCallState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @see TelecomServiceImpl#endCall
     */
@Override public boolean endCall() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_endCall, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @see TelecomServiceImpl#acceptRingingCall
     */
@Override public void acceptRingingCall() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_acceptRingingCall, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * @see TelecomServiceImpl#cancelMissedCallsNotification
     */
@Override public void cancelMissedCallsNotification() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_cancelMissedCallsNotification, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * @see TelecomServiceImpl#handleMmi
     */
@Override public boolean handlePinMmi(java.lang.String dialString) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(dialString);
mRemote.transact(Stub.TRANSACTION_handlePinMmi, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @see TelecomServiceImpl#handleMmi
     */
@Override public boolean handlePinMmiForPhoneAccount(android.telecom.PhoneAccountHandle accountHandle, java.lang.String dialString) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((accountHandle!=null)) {
_data.writeInt(1);
accountHandle.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(dialString);
mRemote.transact(Stub.TRANSACTION_handlePinMmiForPhoneAccount, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @see TelecomServiceImpl#getAdnUriForPhoneAccount
     */
@Override public android.net.Uri getAdnUriForPhoneAccount(android.telecom.PhoneAccountHandle accountHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.Uri _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((accountHandle!=null)) {
_data.writeInt(1);
accountHandle.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getAdnUriForPhoneAccount, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.Uri.CREATOR.createFromParcel(_reply);
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
/**
     * @see TelecomServiceImpl#isTtySupported
     */
@Override public boolean isTtySupported() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isTtySupported, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @see TelecomServiceImpl#getCurrentTtyMode
     */
@Override public int getCurrentTtyMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCurrentTtyMode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @see TelecomServiceImpl#addNewIncomingCall
     */
@Override public void addNewIncomingCall(android.telecom.PhoneAccountHandle phoneAccount, android.os.Bundle extras) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((phoneAccount!=null)) {
_data.writeInt(1);
phoneAccount.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((extras!=null)) {
_data.writeInt(1);
extras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addNewIncomingCall, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * @see TelecomServiceImpl#addNewUnknownCall
     */
@Override public void addNewUnknownCall(android.telecom.PhoneAccountHandle phoneAccount, android.os.Bundle extras) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((phoneAccount!=null)) {
_data.writeInt(1);
phoneAccount.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((extras!=null)) {
_data.writeInt(1);
extras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addNewUnknownCall, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_showInCallScreen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getDefaultOutgoingPhoneAccount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getUserSelectedOutgoingPhoneAccount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setUserSelectedOutgoingPhoneAccount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getCallCapablePhoneAccounts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getPhoneAccountsSupportingScheme = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getPhoneAccountsForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getPhoneAccount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getAllPhoneAccountsCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getAllPhoneAccounts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getAllPhoneAccountHandles = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getSimCallManager = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_setSimCallManager = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_getSimCallManagers = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_registerPhoneAccount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_unregisterPhoneAccount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_clearAccounts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_isVoiceMailNumber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_hasVoiceMailNumber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_getLine1Number = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_getDefaultPhoneApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_silenceRinger = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_isInCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_isRinging = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_getCallState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_endCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_acceptRingingCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_cancelMissedCallsNotification = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_handlePinMmi = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_handlePinMmiForPhoneAccount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_getAdnUriForPhoneAccount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_isTtySupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_getCurrentTtyMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_addNewIncomingCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_addNewUnknownCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
}
/**
     * Brings the in-call screen to the foreground if there is an active call.
     *
     * @param showDialpad if true, make the dialpad visible initially.
     */
public void showInCallScreen(boolean showDialpad) throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#getDefaultOutgoingPhoneAccount
     */
public android.telecom.PhoneAccountHandle getDefaultOutgoingPhoneAccount(java.lang.String uriScheme) throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#getUserSelectedOutgoingPhoneAccount
     */
public android.telecom.PhoneAccountHandle getUserSelectedOutgoingPhoneAccount() throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#setUserSelectedOutgoingPhoneAccount
     */
public void setUserSelectedOutgoingPhoneAccount(android.telecom.PhoneAccountHandle account) throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#getCallCapablePhoneAccounts
     */
public java.util.List<android.telecom.PhoneAccountHandle> getCallCapablePhoneAccounts() throws android.os.RemoteException;
/**
     * @see TelecomManager#getPhoneAccountsSupportingScheme
     */
public java.util.List<android.telecom.PhoneAccountHandle> getPhoneAccountsSupportingScheme(java.lang.String uriScheme) throws android.os.RemoteException;
/**
     * @see TelecomManager#getPhoneAccountsForPackage
     */
public java.util.List<android.telecom.PhoneAccountHandle> getPhoneAccountsForPackage(java.lang.String packageName) throws android.os.RemoteException;
/**
     * @see TelecomManager#getPhoneAccount
     */
public android.telecom.PhoneAccount getPhoneAccount(android.telecom.PhoneAccountHandle account) throws android.os.RemoteException;
/**
     * @see TelecomManager#getAllPhoneAccountsCount
     */
public int getAllPhoneAccountsCount() throws android.os.RemoteException;
/**
     * @see TelecomManager#getAllPhoneAccounts
     */
public java.util.List<android.telecom.PhoneAccount> getAllPhoneAccounts() throws android.os.RemoteException;
/**
     * @see TelecomManager#getAllPhoneAccountHandles
     */
public java.util.List<android.telecom.PhoneAccountHandle> getAllPhoneAccountHandles() throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#getSimCallManager
     */
public android.telecom.PhoneAccountHandle getSimCallManager() throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#setSimCallManager
     */
public void setSimCallManager(android.telecom.PhoneAccountHandle account) throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#getSimCallManagers
     */
public java.util.List<android.telecom.PhoneAccountHandle> getSimCallManagers() throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#registerPhoneAccount
     */
public void registerPhoneAccount(android.telecom.PhoneAccount metadata) throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#unregisterPhoneAccount
     */
public void unregisterPhoneAccount(android.telecom.PhoneAccountHandle account) throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#clearAccounts
     */
public void clearAccounts(java.lang.String packageName) throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#isVoiceMailNumber
     */
public boolean isVoiceMailNumber(android.telecom.PhoneAccountHandle accountHandle, java.lang.String number) throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#hasVoiceMailNumber
     */
public boolean hasVoiceMailNumber(android.telecom.PhoneAccountHandle accountHandle) throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#getLine1Number
     */
public java.lang.String getLine1Number(android.telecom.PhoneAccountHandle accountHandle) throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#getDefaultPhoneApp
     */
public android.content.ComponentName getDefaultPhoneApp() throws android.os.RemoteException;
//
// Internal system apis relating to call management.
//
/**
     * @see TelecomServiceImpl#silenceRinger
     */
public void silenceRinger() throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#isInCall
     */
public boolean isInCall() throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#isRinging
     */
public boolean isRinging() throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#getCallState
     */
public int getCallState() throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#endCall
     */
public boolean endCall() throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#acceptRingingCall
     */
public void acceptRingingCall() throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#cancelMissedCallsNotification
     */
public void cancelMissedCallsNotification() throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#handleMmi
     */
public boolean handlePinMmi(java.lang.String dialString) throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#handleMmi
     */
public boolean handlePinMmiForPhoneAccount(android.telecom.PhoneAccountHandle accountHandle, java.lang.String dialString) throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#getAdnUriForPhoneAccount
     */
public android.net.Uri getAdnUriForPhoneAccount(android.telecom.PhoneAccountHandle accountHandle) throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#isTtySupported
     */
public boolean isTtySupported() throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#getCurrentTtyMode
     */
public int getCurrentTtyMode() throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#addNewIncomingCall
     */
public void addNewIncomingCall(android.telecom.PhoneAccountHandle phoneAccount, android.os.Bundle extras) throws android.os.RemoteException;
/**
     * @see TelecomServiceImpl#addNewUnknownCall
     */
public void addNewUnknownCall(android.telecom.PhoneAccountHandle phoneAccount, android.os.Bundle extras) throws android.os.RemoteException;
}
