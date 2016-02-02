/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/telecomm/java/com/android/internal/telecom/IConnectionServiceAdapter.aidl
 */
package com.android.internal.telecom;
/**
 * Internal remote callback interface for connection services.
 *
 * @see android.telecom.ConnectionServiceAdapter
 *
 * {@hide}
 */
public interface IConnectionServiceAdapter extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.IConnectionServiceAdapter
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.IConnectionServiceAdapter";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.telecom.IConnectionServiceAdapter interface,
 * generating a proxy if needed.
 */
public static com.android.internal.telecom.IConnectionServiceAdapter asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.telecom.IConnectionServiceAdapter))) {
return ((com.android.internal.telecom.IConnectionServiceAdapter)iin);
}
return new com.android.internal.telecom.IConnectionServiceAdapter.Stub.Proxy(obj);
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
case TRANSACTION_handleCreateConnectionComplete:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.telecom.ConnectionRequest _arg1;
if ((0!=data.readInt())) {
_arg1 = android.telecom.ConnectionRequest.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.telecom.ParcelableConnection _arg2;
if ((0!=data.readInt())) {
_arg2 = android.telecom.ParcelableConnection.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.handleCreateConnectionComplete(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_setActive:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.setActive(_arg0);
return true;
}
case TRANSACTION_setRinging:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.setRinging(_arg0);
return true;
}
case TRANSACTION_setDialing:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.setDialing(_arg0);
return true;
}
case TRANSACTION_setDisconnected:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.telecom.DisconnectCause _arg1;
if ((0!=data.readInt())) {
_arg1 = android.telecom.DisconnectCause.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setDisconnected(_arg0, _arg1);
return true;
}
case TRANSACTION_setOnHold:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.setOnHold(_arg0);
return true;
}
case TRANSACTION_setRingbackRequested:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setRingbackRequested(_arg0, _arg1);
return true;
}
case TRANSACTION_setConnectionCapabilities:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.setConnectionCapabilities(_arg0, _arg1);
return true;
}
case TRANSACTION_setIsConferenced:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.setIsConferenced(_arg0, _arg1);
return true;
}
case TRANSACTION_addConferenceCall:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.telecom.ParcelableConference _arg1;
if ((0!=data.readInt())) {
_arg1 = android.telecom.ParcelableConference.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.addConferenceCall(_arg0, _arg1);
return true;
}
case TRANSACTION_removeCall:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.removeCall(_arg0);
return true;
}
case TRANSACTION_onPostDialWait:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.onPostDialWait(_arg0, _arg1);
return true;
}
case TRANSACTION_onPostDialChar:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
char _arg1;
_arg1 = (char)data.readInt();
this.onPostDialChar(_arg0, _arg1);
return true;
}
case TRANSACTION_queryRemoteConnectionServices:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.telecom.RemoteServiceCallback _arg0;
_arg0 = com.android.internal.telecom.RemoteServiceCallback.Stub.asInterface(data.readStrongBinder());
this.queryRemoteConnectionServices(_arg0);
return true;
}
case TRANSACTION_setVideoProvider:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.android.internal.telecom.IVideoProvider _arg1;
_arg1 = com.android.internal.telecom.IVideoProvider.Stub.asInterface(data.readStrongBinder());
this.setVideoProvider(_arg0, _arg1);
return true;
}
case TRANSACTION_setVideoState:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.setVideoState(_arg0, _arg1);
return true;
}
case TRANSACTION_setIsVoipAudioMode:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setIsVoipAudioMode(_arg0, _arg1);
return true;
}
case TRANSACTION_setStatusHints:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.telecom.StatusHints _arg1;
if ((0!=data.readInt())) {
_arg1 = android.telecom.StatusHints.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setStatusHints(_arg0, _arg1);
return true;
}
case TRANSACTION_setAddress:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.net.Uri _arg1;
if ((0!=data.readInt())) {
_arg1 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
this.setAddress(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_setCallerDisplayName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
this.setCallerDisplayName(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_setConferenceableConnections:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.List<java.lang.String> _arg1;
_arg1 = data.createStringArrayList();
this.setConferenceableConnections(_arg0, _arg1);
return true;
}
case TRANSACTION_addExistingConnection:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.telecom.ParcelableConnection _arg1;
if ((0!=data.readInt())) {
_arg1 = android.telecom.ParcelableConnection.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.addExistingConnection(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.telecom.IConnectionServiceAdapter
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
@Override public void handleCreateConnectionComplete(java.lang.String callId, android.telecom.ConnectionRequest request, android.telecom.ParcelableConnection connection) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
if ((request!=null)) {
_data.writeInt(1);
request.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((connection!=null)) {
_data.writeInt(1);
connection.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_handleCreateConnectionComplete, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setActive(java.lang.String callId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
mRemote.transact(Stub.TRANSACTION_setActive, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setRinging(java.lang.String callId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
mRemote.transact(Stub.TRANSACTION_setRinging, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setDialing(java.lang.String callId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
mRemote.transact(Stub.TRANSACTION_setDialing, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setDisconnected(java.lang.String callId, android.telecom.DisconnectCause disconnectCause) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
if ((disconnectCause!=null)) {
_data.writeInt(1);
disconnectCause.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setDisconnected, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setOnHold(java.lang.String callId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
mRemote.transact(Stub.TRANSACTION_setOnHold, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setRingbackRequested(java.lang.String callId, boolean ringing) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
_data.writeInt(((ringing)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setRingbackRequested, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setConnectionCapabilities(java.lang.String callId, int connectionCapabilities) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
_data.writeInt(connectionCapabilities);
mRemote.transact(Stub.TRANSACTION_setConnectionCapabilities, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setIsConferenced(java.lang.String callId, java.lang.String conferenceCallId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
_data.writeString(conferenceCallId);
mRemote.transact(Stub.TRANSACTION_setIsConferenced, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void addConferenceCall(java.lang.String callId, android.telecom.ParcelableConference conference) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
if ((conference!=null)) {
_data.writeInt(1);
conference.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addConferenceCall, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void removeCall(java.lang.String callId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
mRemote.transact(Stub.TRANSACTION_removeCall, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onPostDialWait(java.lang.String callId, java.lang.String remaining) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
_data.writeString(remaining);
mRemote.transact(Stub.TRANSACTION_onPostDialWait, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onPostDialChar(java.lang.String callId, char nextChar) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
_data.writeInt(((int)nextChar));
mRemote.transact(Stub.TRANSACTION_onPostDialChar, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void queryRemoteConnectionServices(com.android.internal.telecom.RemoteServiceCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_queryRemoteConnectionServices, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setVideoProvider(java.lang.String callId, com.android.internal.telecom.IVideoProvider videoProvider) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
_data.writeStrongBinder((((videoProvider!=null))?(videoProvider.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setVideoProvider, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setVideoState(java.lang.String callId, int videoState) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
_data.writeInt(videoState);
mRemote.transact(Stub.TRANSACTION_setVideoState, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setIsVoipAudioMode(java.lang.String callId, boolean isVoip) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
_data.writeInt(((isVoip)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setIsVoipAudioMode, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setStatusHints(java.lang.String callId, android.telecom.StatusHints statusHints) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
if ((statusHints!=null)) {
_data.writeInt(1);
statusHints.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setStatusHints, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setAddress(java.lang.String callId, android.net.Uri address, int presentation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
if ((address!=null)) {
_data.writeInt(1);
address.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(presentation);
mRemote.transact(Stub.TRANSACTION_setAddress, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setCallerDisplayName(java.lang.String callId, java.lang.String callerDisplayName, int presentation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
_data.writeString(callerDisplayName);
_data.writeInt(presentation);
mRemote.transact(Stub.TRANSACTION_setCallerDisplayName, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setConferenceableConnections(java.lang.String callId, java.util.List<java.lang.String> conferenceableCallIds) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
_data.writeStringList(conferenceableCallIds);
mRemote.transact(Stub.TRANSACTION_setConferenceableConnections, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void addExistingConnection(java.lang.String callId, android.telecom.ParcelableConnection connection) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
if ((connection!=null)) {
_data.writeInt(1);
connection.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addExistingConnection, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_handleCreateConnectionComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setActive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setRinging = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setDialing = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setDisconnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setOnHold = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setRingbackRequested = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setConnectionCapabilities = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_setIsConferenced = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_addConferenceCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_removeCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_onPostDialWait = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_onPostDialChar = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_queryRemoteConnectionServices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_setVideoProvider = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_setVideoState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_setIsVoipAudioMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_setStatusHints = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_setAddress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_setCallerDisplayName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_setConferenceableConnections = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_addExistingConnection = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
}
public void handleCreateConnectionComplete(java.lang.String callId, android.telecom.ConnectionRequest request, android.telecom.ParcelableConnection connection) throws android.os.RemoteException;
public void setActive(java.lang.String callId) throws android.os.RemoteException;
public void setRinging(java.lang.String callId) throws android.os.RemoteException;
public void setDialing(java.lang.String callId) throws android.os.RemoteException;
public void setDisconnected(java.lang.String callId, android.telecom.DisconnectCause disconnectCause) throws android.os.RemoteException;
public void setOnHold(java.lang.String callId) throws android.os.RemoteException;
public void setRingbackRequested(java.lang.String callId, boolean ringing) throws android.os.RemoteException;
public void setConnectionCapabilities(java.lang.String callId, int connectionCapabilities) throws android.os.RemoteException;
public void setIsConferenced(java.lang.String callId, java.lang.String conferenceCallId) throws android.os.RemoteException;
public void addConferenceCall(java.lang.String callId, android.telecom.ParcelableConference conference) throws android.os.RemoteException;
public void removeCall(java.lang.String callId) throws android.os.RemoteException;
public void onPostDialWait(java.lang.String callId, java.lang.String remaining) throws android.os.RemoteException;
public void onPostDialChar(java.lang.String callId, char nextChar) throws android.os.RemoteException;
public void queryRemoteConnectionServices(com.android.internal.telecom.RemoteServiceCallback callback) throws android.os.RemoteException;
public void setVideoProvider(java.lang.String callId, com.android.internal.telecom.IVideoProvider videoProvider) throws android.os.RemoteException;
public void setVideoState(java.lang.String callId, int videoState) throws android.os.RemoteException;
public void setIsVoipAudioMode(java.lang.String callId, boolean isVoip) throws android.os.RemoteException;
public void setStatusHints(java.lang.String callId, android.telecom.StatusHints statusHints) throws android.os.RemoteException;
public void setAddress(java.lang.String callId, android.net.Uri address, int presentation) throws android.os.RemoteException;
public void setCallerDisplayName(java.lang.String callId, java.lang.String callerDisplayName, int presentation) throws android.os.RemoteException;
public void setConferenceableConnections(java.lang.String callId, java.util.List<java.lang.String> conferenceableCallIds) throws android.os.RemoteException;
public void addExistingConnection(java.lang.String callId, android.telecom.ParcelableConnection connection) throws android.os.RemoteException;
}
