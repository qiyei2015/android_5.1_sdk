/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/com/android/internal/app/IVoiceInteractionManagerService.aidl
 */
package com.android.internal.app;
public interface IVoiceInteractionManagerService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IVoiceInteractionManagerService
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.app.IVoiceInteractionManagerService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.app.IVoiceInteractionManagerService interface,
 * generating a proxy if needed.
 */
public static com.android.internal.app.IVoiceInteractionManagerService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.app.IVoiceInteractionManagerService))) {
return ((com.android.internal.app.IVoiceInteractionManagerService)iin);
}
return new com.android.internal.app.IVoiceInteractionManagerService.Stub.Proxy(obj);
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
case TRANSACTION_startSession:
{
data.enforceInterface(DESCRIPTOR);
android.service.voice.IVoiceInteractionService _arg0;
_arg0 = android.service.voice.IVoiceInteractionService.Stub.asInterface(data.readStrongBinder());
android.os.Bundle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.startSession(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_deliverNewSession:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.service.voice.IVoiceInteractionSession _arg1;
_arg1 = android.service.voice.IVoiceInteractionSession.Stub.asInterface(data.readStrongBinder());
com.android.internal.app.IVoiceInteractor _arg2;
_arg2 = com.android.internal.app.IVoiceInteractor.Stub.asInterface(data.readStrongBinder());
boolean _result = this.deliverNewSession(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_startVoiceActivity:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.content.Intent _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String _arg2;
_arg2 = data.readString();
int _result = this.startVoiceActivity(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_finish:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.finish(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getKeyphraseSoundModel:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel _result = this.getKeyphraseSoundModel(_arg0, _arg1);
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
case TRANSACTION_updateKeyphraseSoundModel:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel _arg0;
if ((0!=data.readInt())) {
_arg0 = android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.updateKeyphraseSoundModel(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_deleteKeyphraseSoundModel:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.deleteKeyphraseSoundModel(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getDspModuleProperties:
{
data.enforceInterface(DESCRIPTOR);
android.service.voice.IVoiceInteractionService _arg0;
_arg0 = android.service.voice.IVoiceInteractionService.Stub.asInterface(data.readStrongBinder());
android.hardware.soundtrigger.SoundTrigger.ModuleProperties _result = this.getDspModuleProperties(_arg0);
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
case TRANSACTION_isEnrolledForKeyphrase:
{
data.enforceInterface(DESCRIPTOR);
android.service.voice.IVoiceInteractionService _arg0;
_arg0 = android.service.voice.IVoiceInteractionService.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
boolean _result = this.isEnrolledForKeyphrase(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_startRecognition:
{
data.enforceInterface(DESCRIPTOR);
android.service.voice.IVoiceInteractionService _arg0;
_arg0 = android.service.voice.IVoiceInteractionService.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
android.hardware.soundtrigger.IRecognitionStatusCallback _arg3;
_arg3 = android.hardware.soundtrigger.IRecognitionStatusCallback.Stub.asInterface(data.readStrongBinder());
android.hardware.soundtrigger.SoundTrigger.RecognitionConfig _arg4;
if ((0!=data.readInt())) {
_arg4 = android.hardware.soundtrigger.SoundTrigger.RecognitionConfig.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
int _result = this.startRecognition(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_stopRecognition:
{
data.enforceInterface(DESCRIPTOR);
android.service.voice.IVoiceInteractionService _arg0;
_arg0 = android.service.voice.IVoiceInteractionService.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
android.hardware.soundtrigger.IRecognitionStatusCallback _arg2;
_arg2 = android.hardware.soundtrigger.IRecognitionStatusCallback.Stub.asInterface(data.readStrongBinder());
int _result = this.stopRecognition(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.app.IVoiceInteractionManagerService
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
@Override public void startSession(android.service.voice.IVoiceInteractionService service, android.os.Bundle sessionArgs) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((service!=null))?(service.asBinder()):(null)));
if ((sessionArgs!=null)) {
_data.writeInt(1);
sessionArgs.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startSession, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean deliverNewSession(android.os.IBinder token, android.service.voice.IVoiceInteractionSession session, com.android.internal.app.IVoiceInteractor interactor) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
_data.writeStrongBinder((((interactor!=null))?(interactor.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_deliverNewSession, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int startVoiceActivity(android.os.IBinder token, android.content.Intent intent, java.lang.String resolvedType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(resolvedType);
mRemote.transact(Stub.TRANSACTION_startVoiceActivity, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void finish(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_finish, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Gets the registered Sound model for keyphrase detection for the current user.
     * May be null if no matching sound model exists.
     *
     * @param keyphraseId The unique identifier for the keyphrase.
     * @param bcp47Locale The BCP47 language tag  for the keyphrase's locale.
     */
@Override public android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel getKeyphraseSoundModel(int keyphraseId, java.lang.String bcp47Locale) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(keyphraseId);
_data.writeString(bcp47Locale);
mRemote.transact(Stub.TRANSACTION_getKeyphraseSoundModel, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel.CREATOR.createFromParcel(_reply);
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
     * Add/Update the given keyphrase sound model.
     */
@Override public int updateKeyphraseSoundModel(android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel model) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((model!=null)) {
_data.writeInt(1);
model.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateKeyphraseSoundModel, _data, _reply, 0);
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
     * Deletes the given keyphrase sound model for the current user.
     *
     * @param keyphraseId The unique identifier for the keyphrase.
     * @param bcp47Locale The BCP47 language tag  for the keyphrase's locale.
     */
@Override public int deleteKeyphraseSoundModel(int keyphraseId, java.lang.String bcp47Locale) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(keyphraseId);
_data.writeString(bcp47Locale);
mRemote.transact(Stub.TRANSACTION_deleteKeyphraseSoundModel, _data, _reply, 0);
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
     * Gets the properties of the DSP hardware on this device, null if not present.
     */
@Override public android.hardware.soundtrigger.SoundTrigger.ModuleProperties getDspModuleProperties(android.service.voice.IVoiceInteractionService service) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.soundtrigger.SoundTrigger.ModuleProperties _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((service!=null))?(service.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getDspModuleProperties, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.hardware.soundtrigger.SoundTrigger.ModuleProperties.CREATOR.createFromParcel(_reply);
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
     * Indicates if there's a keyphrase sound model available for the given keyphrase ID.
     * This performs the check for the current user.
     *
     * @param service The current VoiceInteractionService.
     * @param keyphraseId The unique identifier for the keyphrase.
     * @param bcp47Locale The BCP47 language tag  for the keyphrase's locale.
     */
@Override public boolean isEnrolledForKeyphrase(android.service.voice.IVoiceInteractionService service, int keyphraseId, java.lang.String bcp47Locale) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((service!=null))?(service.asBinder()):(null)));
_data.writeInt(keyphraseId);
_data.writeString(bcp47Locale);
mRemote.transact(Stub.TRANSACTION_isEnrolledForKeyphrase, _data, _reply, 0);
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
     * Starts a recognition for the given keyphrase.
     */
@Override public int startRecognition(android.service.voice.IVoiceInteractionService service, int keyphraseId, java.lang.String bcp47Locale, android.hardware.soundtrigger.IRecognitionStatusCallback callback, android.hardware.soundtrigger.SoundTrigger.RecognitionConfig recognitionConfig) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((service!=null))?(service.asBinder()):(null)));
_data.writeInt(keyphraseId);
_data.writeString(bcp47Locale);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
if ((recognitionConfig!=null)) {
_data.writeInt(1);
recognitionConfig.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startRecognition, _data, _reply, 0);
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
     * Stops a recognition for the given keyphrase.
     */
@Override public int stopRecognition(android.service.voice.IVoiceInteractionService service, int keyphraseId, android.hardware.soundtrigger.IRecognitionStatusCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((service!=null))?(service.asBinder()):(null)));
_data.writeInt(keyphraseId);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_stopRecognition, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_startSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_deliverNewSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_startVoiceActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_finish = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getKeyphraseSoundModel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_updateKeyphraseSoundModel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_deleteKeyphraseSoundModel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getDspModuleProperties = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_isEnrolledForKeyphrase = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_startRecognition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_stopRecognition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
}
public void startSession(android.service.voice.IVoiceInteractionService service, android.os.Bundle sessionArgs) throws android.os.RemoteException;
public boolean deliverNewSession(android.os.IBinder token, android.service.voice.IVoiceInteractionSession session, com.android.internal.app.IVoiceInteractor interactor) throws android.os.RemoteException;
public int startVoiceActivity(android.os.IBinder token, android.content.Intent intent, java.lang.String resolvedType) throws android.os.RemoteException;
public void finish(android.os.IBinder token) throws android.os.RemoteException;
/**
     * Gets the registered Sound model for keyphrase detection for the current user.
     * May be null if no matching sound model exists.
     *
     * @param keyphraseId The unique identifier for the keyphrase.
     * @param bcp47Locale The BCP47 language tag  for the keyphrase's locale.
     */
public android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel getKeyphraseSoundModel(int keyphraseId, java.lang.String bcp47Locale) throws android.os.RemoteException;
/**
     * Add/Update the given keyphrase sound model.
     */
public int updateKeyphraseSoundModel(android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel model) throws android.os.RemoteException;
/**
     * Deletes the given keyphrase sound model for the current user.
     *
     * @param keyphraseId The unique identifier for the keyphrase.
     * @param bcp47Locale The BCP47 language tag  for the keyphrase's locale.
     */
public int deleteKeyphraseSoundModel(int keyphraseId, java.lang.String bcp47Locale) throws android.os.RemoteException;
/**
     * Gets the properties of the DSP hardware on this device, null if not present.
     */
public android.hardware.soundtrigger.SoundTrigger.ModuleProperties getDspModuleProperties(android.service.voice.IVoiceInteractionService service) throws android.os.RemoteException;
/**
     * Indicates if there's a keyphrase sound model available for the given keyphrase ID.
     * This performs the check for the current user.
     *
     * @param service The current VoiceInteractionService.
     * @param keyphraseId The unique identifier for the keyphrase.
     * @param bcp47Locale The BCP47 language tag  for the keyphrase's locale.
     */
public boolean isEnrolledForKeyphrase(android.service.voice.IVoiceInteractionService service, int keyphraseId, java.lang.String bcp47Locale) throws android.os.RemoteException;
/**
     * Starts a recognition for the given keyphrase.
     */
public int startRecognition(android.service.voice.IVoiceInteractionService service, int keyphraseId, java.lang.String bcp47Locale, android.hardware.soundtrigger.IRecognitionStatusCallback callback, android.hardware.soundtrigger.SoundTrigger.RecognitionConfig recognitionConfig) throws android.os.RemoteException;
/**
     * Stops a recognition for the given keyphrase.
     */
public int stopRecognition(android.service.voice.IVoiceInteractionService service, int keyphraseId, android.hardware.soundtrigger.IRecognitionStatusCallback callback) throws android.os.RemoteException;
}
