/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/com/android/internal/app/IVoiceInteractor.aidl
 */
package com.android.internal.app;
/**
 * IPC interface for an application to perform calls through a VoiceInteractor.
 */
public interface IVoiceInteractor extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IVoiceInteractor
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.app.IVoiceInteractor";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.app.IVoiceInteractor interface,
 * generating a proxy if needed.
 */
public static com.android.internal.app.IVoiceInteractor asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.app.IVoiceInteractor))) {
return ((com.android.internal.app.IVoiceInteractor)iin);
}
return new com.android.internal.app.IVoiceInteractor.Stub.Proxy(obj);
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
case TRANSACTION_startConfirmation:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.android.internal.app.IVoiceInteractorCallback _arg1;
_arg1 = com.android.internal.app.IVoiceInteractorCallback.Stub.asInterface(data.readStrongBinder());
java.lang.CharSequence _arg2;
if ((0!=data.readInt())) {
_arg2 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
android.os.Bundle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
com.android.internal.app.IVoiceInteractorRequest _result = this.startConfirmation(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_startCompleteVoice:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.android.internal.app.IVoiceInteractorCallback _arg1;
_arg1 = com.android.internal.app.IVoiceInteractorCallback.Stub.asInterface(data.readStrongBinder());
java.lang.CharSequence _arg2;
if ((0!=data.readInt())) {
_arg2 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
android.os.Bundle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
com.android.internal.app.IVoiceInteractorRequest _result = this.startCompleteVoice(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_startAbortVoice:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.android.internal.app.IVoiceInteractorCallback _arg1;
_arg1 = com.android.internal.app.IVoiceInteractorCallback.Stub.asInterface(data.readStrongBinder());
java.lang.CharSequence _arg2;
if ((0!=data.readInt())) {
_arg2 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
android.os.Bundle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
com.android.internal.app.IVoiceInteractorRequest _result = this.startAbortVoice(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_startCommand:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.android.internal.app.IVoiceInteractorCallback _arg1;
_arg1 = com.android.internal.app.IVoiceInteractorCallback.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg2;
_arg2 = data.readString();
android.os.Bundle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
com.android.internal.app.IVoiceInteractorRequest _result = this.startCommand(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_supportsCommands:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String[] _arg1;
_arg1 = data.createStringArray();
boolean[] _result = this.supportsCommands(_arg0, _arg1);
reply.writeNoException();
reply.writeBooleanArray(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.app.IVoiceInteractor
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
@Override public com.android.internal.app.IVoiceInteractorRequest startConfirmation(java.lang.String callingPackage, com.android.internal.app.IVoiceInteractorCallback callback, java.lang.CharSequence prompt, android.os.Bundle extras) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.internal.app.IVoiceInteractorRequest _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
if ((prompt!=null)) {
_data.writeInt(1);
android.text.TextUtils.writeToParcel(prompt, _data, 0);
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
mRemote.transact(Stub.TRANSACTION_startConfirmation, _data, _reply, 0);
_reply.readException();
_result = com.android.internal.app.IVoiceInteractorRequest.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.android.internal.app.IVoiceInteractorRequest startCompleteVoice(java.lang.String callingPackage, com.android.internal.app.IVoiceInteractorCallback callback, java.lang.CharSequence message, android.os.Bundle extras) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.internal.app.IVoiceInteractorRequest _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
if ((message!=null)) {
_data.writeInt(1);
android.text.TextUtils.writeToParcel(message, _data, 0);
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
mRemote.transact(Stub.TRANSACTION_startCompleteVoice, _data, _reply, 0);
_reply.readException();
_result = com.android.internal.app.IVoiceInteractorRequest.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.android.internal.app.IVoiceInteractorRequest startAbortVoice(java.lang.String callingPackage, com.android.internal.app.IVoiceInteractorCallback callback, java.lang.CharSequence message, android.os.Bundle extras) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.internal.app.IVoiceInteractorRequest _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
if ((message!=null)) {
_data.writeInt(1);
android.text.TextUtils.writeToParcel(message, _data, 0);
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
mRemote.transact(Stub.TRANSACTION_startAbortVoice, _data, _reply, 0);
_reply.readException();
_result = com.android.internal.app.IVoiceInteractorRequest.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.android.internal.app.IVoiceInteractorRequest startCommand(java.lang.String callingPackage, com.android.internal.app.IVoiceInteractorCallback callback, java.lang.String command, android.os.Bundle extras) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.internal.app.IVoiceInteractorRequest _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
_data.writeString(command);
if ((extras!=null)) {
_data.writeInt(1);
extras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startCommand, _data, _reply, 0);
_reply.readException();
_result = com.android.internal.app.IVoiceInteractorRequest.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean[] supportsCommands(java.lang.String callingPackage, java.lang.String[] commands) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
_data.writeStringArray(commands);
mRemote.transact(Stub.TRANSACTION_supportsCommands, _data, _reply, 0);
_reply.readException();
_result = _reply.createBooleanArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_startConfirmation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_startCompleteVoice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_startAbortVoice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_startCommand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_supportsCommands = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public com.android.internal.app.IVoiceInteractorRequest startConfirmation(java.lang.String callingPackage, com.android.internal.app.IVoiceInteractorCallback callback, java.lang.CharSequence prompt, android.os.Bundle extras) throws android.os.RemoteException;
public com.android.internal.app.IVoiceInteractorRequest startCompleteVoice(java.lang.String callingPackage, com.android.internal.app.IVoiceInteractorCallback callback, java.lang.CharSequence message, android.os.Bundle extras) throws android.os.RemoteException;
public com.android.internal.app.IVoiceInteractorRequest startAbortVoice(java.lang.String callingPackage, com.android.internal.app.IVoiceInteractorCallback callback, java.lang.CharSequence message, android.os.Bundle extras) throws android.os.RemoteException;
public com.android.internal.app.IVoiceInteractorRequest startCommand(java.lang.String callingPackage, com.android.internal.app.IVoiceInteractorCallback callback, java.lang.String command, android.os.Bundle extras) throws android.os.RemoteException;
public boolean[] supportsCommands(java.lang.String callingPackage, java.lang.String[] commands) throws android.os.RemoteException;
}
