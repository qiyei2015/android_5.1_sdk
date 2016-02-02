/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/telephony/java/com/android/ims/internal/IImsCallSessionListener.aidl
 */
package com.android.ims.internal;
/**
 * A listener type for receiving notification on IMS call session events.
 * When an event is generated for an {@link IImsCallSession}, the application is notified
 * by having one of the methods called on the {@link IImsCallSessionListener}.
 * {@hide}
 */
public interface IImsCallSessionListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsCallSessionListener
{
private static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsCallSessionListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.ims.internal.IImsCallSessionListener interface,
 * generating a proxy if needed.
 */
public static com.android.ims.internal.IImsCallSessionListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.ims.internal.IImsCallSessionListener))) {
return ((com.android.ims.internal.IImsCallSessionListener)iin);
}
return new com.android.ims.internal.IImsCallSessionListener.Stub.Proxy(obj);
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
case TRANSACTION_callSessionProgressing:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsStreamMediaProfile _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsStreamMediaProfile.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionProgressing(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionStarted:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsCallProfile _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionStarted(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionStartFailed:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsReasonInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionStartFailed(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionTerminated:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsReasonInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionTerminated(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionHeld:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsCallProfile _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionHeld(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionHoldFailed:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsReasonInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionHoldFailed(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionHoldReceived:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsCallProfile _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionHoldReceived(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionResumed:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsCallProfile _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionResumed(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionResumeFailed:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsReasonInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionResumeFailed(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionResumeReceived:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsCallProfile _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionResumeReceived(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionMergeStarted:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.internal.IImsCallSession _arg1;
_arg1 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsCallProfile _arg2;
if ((0!=data.readInt())) {
_arg2 = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.callSessionMergeStarted(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionMergeComplete:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
this.callSessionMergeComplete(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionMergeFailed:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsReasonInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionMergeFailed(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionUpdated:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsCallProfile _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionUpdated(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionUpdateFailed:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsReasonInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionUpdateFailed(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionUpdateReceived:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsCallProfile _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionUpdateReceived(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionConferenceExtended:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.internal.IImsCallSession _arg1;
_arg1 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsCallProfile _arg2;
if ((0!=data.readInt())) {
_arg2 = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.callSessionConferenceExtended(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionConferenceExtendFailed:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsReasonInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionConferenceExtendFailed(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionConferenceExtendReceived:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.internal.IImsCallSession _arg1;
_arg1 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsCallProfile _arg2;
if ((0!=data.readInt())) {
_arg2 = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.callSessionConferenceExtendReceived(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionInviteParticipantsRequestDelivered:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
this.callSessionInviteParticipantsRequestDelivered(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionInviteParticipantsRequestFailed:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsReasonInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionInviteParticipantsRequestFailed(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionRemoveParticipantsRequestDelivered:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
this.callSessionRemoveParticipantsRequestDelivered(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionRemoveParticipantsRequestFailed:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsReasonInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionRemoveParticipantsRequestFailed(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionConferenceStateUpdated:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsConferenceState _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsConferenceState.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionConferenceStateUpdated(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionUssdMessageReceived:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
this.callSessionUssdMessageReceived(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionHandover:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
com.android.ims.ImsReasonInfo _arg3;
if ((0!=data.readInt())) {
_arg3 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.callSessionHandover(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionHandoverFailed:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
com.android.ims.ImsReasonInfo _arg3;
if ((0!=data.readInt())) {
_arg3 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.callSessionHandoverFailed(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_callSessionTtyModeReceived:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.callSessionTtyModeReceived(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.ims.internal.IImsCallSessionListener
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
     * Notifies the result of the basic session operation (setup / terminate).
     */
@Override public void callSessionProgressing(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsStreamMediaProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionProgressing, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void callSessionStarted(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionStarted, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void callSessionStartFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((reasonInfo!=null)) {
_data.writeInt(1);
reasonInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionStartFailed, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void callSessionTerminated(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((reasonInfo!=null)) {
_data.writeInt(1);
reasonInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionTerminated, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notifies the result of the call hold/resume operation.
     */
@Override public void callSessionHeld(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionHeld, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void callSessionHoldFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((reasonInfo!=null)) {
_data.writeInt(1);
reasonInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionHoldFailed, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void callSessionHoldReceived(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionHoldReceived, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void callSessionResumed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionResumed, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void callSessionResumeFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((reasonInfo!=null)) {
_data.writeInt(1);
reasonInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionResumeFailed, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void callSessionResumeReceived(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionResumeReceived, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notifies the result of call merge operation.
     */
@Override public void callSessionMergeStarted(com.android.ims.internal.IImsCallSession session, com.android.ims.internal.IImsCallSession newSession, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
_data.writeStrongBinder((((newSession!=null))?(newSession.asBinder()):(null)));
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionMergeStarted, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void callSessionMergeComplete(com.android.ims.internal.IImsCallSession session) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_callSessionMergeComplete, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void callSessionMergeFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((reasonInfo!=null)) {
_data.writeInt(1);
reasonInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionMergeFailed, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notifies the result of call upgrade / downgrade or any other call updates.
     */
@Override public void callSessionUpdated(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionUpdated, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void callSessionUpdateFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((reasonInfo!=null)) {
_data.writeInt(1);
reasonInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionUpdateFailed, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void callSessionUpdateReceived(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionUpdateReceived, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notifies the result of conference extension.
     */
@Override public void callSessionConferenceExtended(com.android.ims.internal.IImsCallSession session, com.android.ims.internal.IImsCallSession newSession, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
_data.writeStrongBinder((((newSession!=null))?(newSession.asBinder()):(null)));
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionConferenceExtended, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void callSessionConferenceExtendFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((reasonInfo!=null)) {
_data.writeInt(1);
reasonInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionConferenceExtendFailed, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void callSessionConferenceExtendReceived(com.android.ims.internal.IImsCallSession session, com.android.ims.internal.IImsCallSession newSession, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
_data.writeStrongBinder((((newSession!=null))?(newSession.asBinder()):(null)));
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionConferenceExtendReceived, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notifies the result of the participant invitation / removal to/from the conference session.
     */
@Override public void callSessionInviteParticipantsRequestDelivered(com.android.ims.internal.IImsCallSession session) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_callSessionInviteParticipantsRequestDelivered, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void callSessionInviteParticipantsRequestFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((reasonInfo!=null)) {
_data.writeInt(1);
reasonInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionInviteParticipantsRequestFailed, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void callSessionRemoveParticipantsRequestDelivered(com.android.ims.internal.IImsCallSession session) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_callSessionRemoveParticipantsRequestDelivered, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void callSessionRemoveParticipantsRequestFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((reasonInfo!=null)) {
_data.writeInt(1);
reasonInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionRemoveParticipantsRequestFailed, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notifies the changes of the conference info. in the conference session.
     */
@Override public void callSessionConferenceStateUpdated(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsConferenceState state) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((state!=null)) {
_data.writeInt(1);
state.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionConferenceStateUpdated, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notifies the incoming USSD message.
     */
@Override public void callSessionUssdMessageReceived(com.android.ims.internal.IImsCallSession session, int mode, java.lang.String ussdMessage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
_data.writeInt(mode);
_data.writeString(ussdMessage);
mRemote.transact(Stub.TRANSACTION_callSessionUssdMessageReceived, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notifies of handover information for this call
     */
@Override public void callSessionHandover(com.android.ims.internal.IImsCallSession session, int srcAccessTech, int targetAccessTech, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
_data.writeInt(srcAccessTech);
_data.writeInt(targetAccessTech);
if ((reasonInfo!=null)) {
_data.writeInt(1);
reasonInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionHandover, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void callSessionHandoverFailed(com.android.ims.internal.IImsCallSession session, int srcAccessTech, int targetAccessTech, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
_data.writeInt(srcAccessTech);
_data.writeInt(targetAccessTech);
if ((reasonInfo!=null)) {
_data.writeInt(1);
reasonInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionHandoverFailed, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notifies the TTY mode change by remote party.
     * @param mode one of the following:
     * - {@link com.android.internal.telephony.Phone#TTY_MODE_OFF}
     * - {@link com.android.internal.telephony.Phone#TTY_MODE_FULL}
     * - {@link com.android.internal.telephony.Phone#TTY_MODE_HCO}
     * - {@link com.android.internal.telephony.Phone#TTY_MODE_VCO}
     */
@Override public void callSessionTtyModeReceived(com.android.ims.internal.IImsCallSession session, int mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
_data.writeInt(mode);
mRemote.transact(Stub.TRANSACTION_callSessionTtyModeReceived, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_callSessionProgressing = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_callSessionStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_callSessionStartFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_callSessionTerminated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_callSessionHeld = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_callSessionHoldFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_callSessionHoldReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_callSessionResumed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_callSessionResumeFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_callSessionResumeReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_callSessionMergeStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_callSessionMergeComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_callSessionMergeFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_callSessionUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_callSessionUpdateFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_callSessionUpdateReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_callSessionConferenceExtended = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_callSessionConferenceExtendFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_callSessionConferenceExtendReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_callSessionInviteParticipantsRequestDelivered = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_callSessionInviteParticipantsRequestFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_callSessionRemoveParticipantsRequestDelivered = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_callSessionRemoveParticipantsRequestFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_callSessionConferenceStateUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_callSessionUssdMessageReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_callSessionHandover = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_callSessionHandoverFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_callSessionTtyModeReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
}
/**
     * Notifies the result of the basic session operation (setup / terminate).
     */
public void callSessionProgressing(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsStreamMediaProfile profile) throws android.os.RemoteException;
public void callSessionStarted(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException;
public void callSessionStartFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException;
public void callSessionTerminated(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException;
/**
     * Notifies the result of the call hold/resume operation.
     */
public void callSessionHeld(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException;
public void callSessionHoldFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException;
public void callSessionHoldReceived(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException;
public void callSessionResumed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException;
public void callSessionResumeFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException;
public void callSessionResumeReceived(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException;
/**
     * Notifies the result of call merge operation.
     */
public void callSessionMergeStarted(com.android.ims.internal.IImsCallSession session, com.android.ims.internal.IImsCallSession newSession, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException;
public void callSessionMergeComplete(com.android.ims.internal.IImsCallSession session) throws android.os.RemoteException;
public void callSessionMergeFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException;
/**
     * Notifies the result of call upgrade / downgrade or any other call updates.
     */
public void callSessionUpdated(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException;
public void callSessionUpdateFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException;
public void callSessionUpdateReceived(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException;
/**
     * Notifies the result of conference extension.
     */
public void callSessionConferenceExtended(com.android.ims.internal.IImsCallSession session, com.android.ims.internal.IImsCallSession newSession, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException;
public void callSessionConferenceExtendFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException;
public void callSessionConferenceExtendReceived(com.android.ims.internal.IImsCallSession session, com.android.ims.internal.IImsCallSession newSession, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException;
/**
     * Notifies the result of the participant invitation / removal to/from the conference session.
     */
public void callSessionInviteParticipantsRequestDelivered(com.android.ims.internal.IImsCallSession session) throws android.os.RemoteException;
public void callSessionInviteParticipantsRequestFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException;
public void callSessionRemoveParticipantsRequestDelivered(com.android.ims.internal.IImsCallSession session) throws android.os.RemoteException;
public void callSessionRemoveParticipantsRequestFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException;
/**
     * Notifies the changes of the conference info. in the conference session.
     */
public void callSessionConferenceStateUpdated(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsConferenceState state) throws android.os.RemoteException;
/**
     * Notifies the incoming USSD message.
     */
public void callSessionUssdMessageReceived(com.android.ims.internal.IImsCallSession session, int mode, java.lang.String ussdMessage) throws android.os.RemoteException;
/**
     * Notifies of handover information for this call
     */
public void callSessionHandover(com.android.ims.internal.IImsCallSession session, int srcAccessTech, int targetAccessTech, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException;
public void callSessionHandoverFailed(com.android.ims.internal.IImsCallSession session, int srcAccessTech, int targetAccessTech, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException;
/**
     * Notifies the TTY mode change by remote party.
     * @param mode one of the following:
     * - {@link com.android.internal.telephony.Phone#TTY_MODE_OFF}
     * - {@link com.android.internal.telephony.Phone#TTY_MODE_FULL}
     * - {@link com.android.internal.telephony.Phone#TTY_MODE_HCO}
     * - {@link com.android.internal.telephony.Phone#TTY_MODE_VCO}
     */
public void callSessionTtyModeReceived(com.android.ims.internal.IImsCallSession session, int mode) throws android.os.RemoteException;
}
