/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/telephony/java/com/android/internal/telephony/ITelephonyRegistry.aidl
 */
package com.android.internal.telephony;
public interface ITelephonyRegistry extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.ITelephonyRegistry
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.ITelephonyRegistry";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.telephony.ITelephonyRegistry interface,
 * generating a proxy if needed.
 */
public static com.android.internal.telephony.ITelephonyRegistry asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.telephony.ITelephonyRegistry))) {
return ((com.android.internal.telephony.ITelephonyRegistry)iin);
}
return new com.android.internal.telephony.ITelephonyRegistry.Stub.Proxy(obj);
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
case TRANSACTION_addOnSubscriptionsChangedListener:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.android.internal.telephony.IOnSubscriptionsChangedListener _arg1;
_arg1 = com.android.internal.telephony.IOnSubscriptionsChangedListener.Stub.asInterface(data.readStrongBinder());
this.addOnSubscriptionsChangedListener(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_removeOnSubscriptionsChangedListener:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.android.internal.telephony.IOnSubscriptionsChangedListener _arg1;
_arg1 = com.android.internal.telephony.IOnSubscriptionsChangedListener.Stub.asInterface(data.readStrongBinder());
this.removeOnSubscriptionsChangedListener(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_listen:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.android.internal.telephony.IPhoneStateListener _arg1;
_arg1 = com.android.internal.telephony.IPhoneStateListener.Stub.asInterface(data.readStrongBinder());
int _arg2;
_arg2 = data.readInt();
boolean _arg3;
_arg3 = (0!=data.readInt());
this.listen(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_listenForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
com.android.internal.telephony.IPhoneStateListener _arg2;
_arg2 = com.android.internal.telephony.IPhoneStateListener.Stub.asInterface(data.readStrongBinder());
int _arg3;
_arg3 = data.readInt();
boolean _arg4;
_arg4 = (0!=data.readInt());
this.listenForSubscriber(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyCallState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.notifyCallState(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyCallStateForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
this.notifyCallStateForSubscriber(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyServiceStateForPhoneId:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
android.telephony.ServiceState _arg2;
if ((0!=data.readInt())) {
_arg2 = android.telephony.ServiceState.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.notifyServiceStateForPhoneId(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_notifySignalStrength:
{
data.enforceInterface(DESCRIPTOR);
android.telephony.SignalStrength _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telephony.SignalStrength.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.notifySignalStrength(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_notifySignalStrengthForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.telephony.SignalStrength _arg1;
if ((0!=data.readInt())) {
_arg1 = android.telephony.SignalStrength.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.notifySignalStrengthForSubscriber(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyMessageWaitingChangedForPhoneId:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.notifyMessageWaitingChangedForPhoneId(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyCallForwardingChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.notifyCallForwardingChanged(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyCallForwardingChangedForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.notifyCallForwardingChangedForSubscriber(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyDataActivity:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.notifyDataActivity(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyDataActivityForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.notifyDataActivityForSubscriber(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyDataConnection:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
java.lang.String _arg4;
_arg4 = data.readString();
android.net.LinkProperties _arg5;
if ((0!=data.readInt())) {
_arg5 = android.net.LinkProperties.CREATOR.createFromParcel(data);
}
else {
_arg5 = null;
}
android.net.NetworkCapabilities _arg6;
if ((0!=data.readInt())) {
_arg6 = android.net.NetworkCapabilities.CREATOR.createFromParcel(data);
}
else {
_arg6 = null;
}
int _arg7;
_arg7 = data.readInt();
boolean _arg8;
_arg8 = (0!=data.readInt());
this.notifyDataConnection(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyDataConnectionForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
java.lang.String _arg3;
_arg3 = data.readString();
java.lang.String _arg4;
_arg4 = data.readString();
java.lang.String _arg5;
_arg5 = data.readString();
android.net.LinkProperties _arg6;
if ((0!=data.readInt())) {
_arg6 = android.net.LinkProperties.CREATOR.createFromParcel(data);
}
else {
_arg6 = null;
}
android.net.NetworkCapabilities _arg7;
if ((0!=data.readInt())) {
_arg7 = android.net.NetworkCapabilities.CREATOR.createFromParcel(data);
}
else {
_arg7 = null;
}
int _arg8;
_arg8 = data.readInt();
boolean _arg9;
_arg9 = (0!=data.readInt());
this.notifyDataConnectionForSubscriber(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyDataConnectionFailed:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.notifyDataConnectionFailed(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyDataConnectionFailedForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.notifyDataConnectionFailedForSubscriber(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyCellLocation:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.notifyCellLocation(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyCellLocationForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.os.Bundle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.notifyCellLocationForSubscriber(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyOtaspChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.notifyOtaspChanged(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyCellInfo:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.telephony.CellInfo> _arg0;
_arg0 = data.createTypedArrayList(android.telephony.CellInfo.CREATOR);
this.notifyCellInfo(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyPreciseCallState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.notifyPreciseCallState(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyDisconnectCause:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.notifyDisconnectCause(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyPreciseDataConnectionFailed:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
this.notifyPreciseDataConnectionFailed(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyCellInfoForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List<android.telephony.CellInfo> _arg1;
_arg1 = data.createTypedArrayList(android.telephony.CellInfo.CREATOR);
this.notifyCellInfoForSubscriber(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyDataConnectionRealTimeInfo:
{
data.enforceInterface(DESCRIPTOR);
android.telephony.DataConnectionRealTimeInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telephony.DataConnectionRealTimeInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.notifyDataConnectionRealTimeInfo(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyVoLteServiceStateChanged:
{
data.enforceInterface(DESCRIPTOR);
android.telephony.VoLteServiceState _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telephony.VoLteServiceState.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.notifyVoLteServiceStateChanged(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyOemHookRawEventForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
byte[] _arg1;
_arg1 = data.createByteArray();
this.notifyOemHookRawEventForSubscriber(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_notifySubscriptionInfoChanged:
{
data.enforceInterface(DESCRIPTOR);
this.notifySubscriptionInfoChanged();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.telephony.ITelephonyRegistry
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
@Override public void addOnSubscriptionsChangedListener(java.lang.String pkg, com.android.internal.telephony.IOnSubscriptionsChangedListener callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_addOnSubscriptionsChangedListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeOnSubscriptionsChangedListener(java.lang.String pkg, com.android.internal.telephony.IOnSubscriptionsChangedListener callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_removeOnSubscriptionsChangedListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void listen(java.lang.String pkg, com.android.internal.telephony.IPhoneStateListener callback, int events, boolean notifyNow) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
_data.writeInt(events);
_data.writeInt(((notifyNow)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_listen, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void listenForSubscriber(int subId, java.lang.String pkg, com.android.internal.telephony.IPhoneStateListener callback, int events, boolean notifyNow) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(pkg);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
_data.writeInt(events);
_data.writeInt(((notifyNow)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_listenForSubscriber, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyCallState(int state, java.lang.String incomingNumber) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(state);
_data.writeString(incomingNumber);
mRemote.transact(Stub.TRANSACTION_notifyCallState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyCallStateForSubscriber(int subId, int state, java.lang.String incomingNumber) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeInt(state);
_data.writeString(incomingNumber);
mRemote.transact(Stub.TRANSACTION_notifyCallStateForSubscriber, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyServiceStateForPhoneId(int phoneId, int subId, android.telephony.ServiceState state) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(phoneId);
_data.writeInt(subId);
if ((state!=null)) {
_data.writeInt(1);
state.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_notifyServiceStateForPhoneId, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifySignalStrength(android.telephony.SignalStrength signalStrength) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((signalStrength!=null)) {
_data.writeInt(1);
signalStrength.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_notifySignalStrength, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifySignalStrengthForSubscriber(int subId, android.telephony.SignalStrength signalStrength) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
if ((signalStrength!=null)) {
_data.writeInt(1);
signalStrength.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_notifySignalStrengthForSubscriber, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyMessageWaitingChangedForPhoneId(int phoneId, int subId, boolean mwi) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(phoneId);
_data.writeInt(subId);
_data.writeInt(((mwi)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_notifyMessageWaitingChangedForPhoneId, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyCallForwardingChanged(boolean cfi) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((cfi)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_notifyCallForwardingChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyCallForwardingChangedForSubscriber(int subId, boolean cfi) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeInt(((cfi)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_notifyCallForwardingChangedForSubscriber, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyDataActivity(int state) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(state);
mRemote.transact(Stub.TRANSACTION_notifyDataActivity, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyDataActivityForSubscriber(int subId, int state) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeInt(state);
mRemote.transact(Stub.TRANSACTION_notifyDataActivityForSubscriber, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyDataConnection(int state, boolean isDataConnectivityPossible, java.lang.String reason, java.lang.String apn, java.lang.String apnType, android.net.LinkProperties linkProperties, android.net.NetworkCapabilities networkCapabilities, int networkType, boolean roaming) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(state);
_data.writeInt(((isDataConnectivityPossible)?(1):(0)));
_data.writeString(reason);
_data.writeString(apn);
_data.writeString(apnType);
if ((linkProperties!=null)) {
_data.writeInt(1);
linkProperties.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((networkCapabilities!=null)) {
_data.writeInt(1);
networkCapabilities.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(networkType);
_data.writeInt(((roaming)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_notifyDataConnection, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyDataConnectionForSubscriber(int subId, int state, boolean isDataConnectivityPossible, java.lang.String reason, java.lang.String apn, java.lang.String apnType, android.net.LinkProperties linkProperties, android.net.NetworkCapabilities networkCapabilities, int networkType, boolean roaming) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeInt(state);
_data.writeInt(((isDataConnectivityPossible)?(1):(0)));
_data.writeString(reason);
_data.writeString(apn);
_data.writeString(apnType);
if ((linkProperties!=null)) {
_data.writeInt(1);
linkProperties.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((networkCapabilities!=null)) {
_data.writeInt(1);
networkCapabilities.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(networkType);
_data.writeInt(((roaming)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_notifyDataConnectionForSubscriber, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyDataConnectionFailed(java.lang.String reason, java.lang.String apnType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(reason);
_data.writeString(apnType);
mRemote.transact(Stub.TRANSACTION_notifyDataConnectionFailed, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyDataConnectionFailedForSubscriber(int subId, java.lang.String reason, java.lang.String apnType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(reason);
_data.writeString(apnType);
mRemote.transact(Stub.TRANSACTION_notifyDataConnectionFailedForSubscriber, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyCellLocation(android.os.Bundle cellLocation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((cellLocation!=null)) {
_data.writeInt(1);
cellLocation.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_notifyCellLocation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyCellLocationForSubscriber(int subId, android.os.Bundle cellLocation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
if ((cellLocation!=null)) {
_data.writeInt(1);
cellLocation.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_notifyCellLocationForSubscriber, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyOtaspChanged(int otaspMode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(otaspMode);
mRemote.transact(Stub.TRANSACTION_notifyOtaspChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyCellInfo(java.util.List<android.telephony.CellInfo> cellInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(cellInfo);
mRemote.transact(Stub.TRANSACTION_notifyCellInfo, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyPreciseCallState(int ringingCallState, int foregroundCallState, int backgroundCallState) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(ringingCallState);
_data.writeInt(foregroundCallState);
_data.writeInt(backgroundCallState);
mRemote.transact(Stub.TRANSACTION_notifyPreciseCallState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyDisconnectCause(int disconnectCause, int preciseDisconnectCause) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(disconnectCause);
_data.writeInt(preciseDisconnectCause);
mRemote.transact(Stub.TRANSACTION_notifyDisconnectCause, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyPreciseDataConnectionFailed(java.lang.String reason, java.lang.String apnType, java.lang.String apn, java.lang.String failCause) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(reason);
_data.writeString(apnType);
_data.writeString(apn);
_data.writeString(failCause);
mRemote.transact(Stub.TRANSACTION_notifyPreciseDataConnectionFailed, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyCellInfoForSubscriber(int subId, java.util.List<android.telephony.CellInfo> cellInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeTypedList(cellInfo);
mRemote.transact(Stub.TRANSACTION_notifyCellInfoForSubscriber, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyDataConnectionRealTimeInfo(android.telephony.DataConnectionRealTimeInfo dcRtInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((dcRtInfo!=null)) {
_data.writeInt(1);
dcRtInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_notifyDataConnectionRealTimeInfo, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyVoLteServiceStateChanged(android.telephony.VoLteServiceState lteState) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((lteState!=null)) {
_data.writeInt(1);
lteState.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_notifyVoLteServiceStateChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyOemHookRawEventForSubscriber(int subId, byte[] rawData) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeByteArray(rawData);
mRemote.transact(Stub.TRANSACTION_notifyOemHookRawEventForSubscriber, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifySubscriptionInfoChanged() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_notifySubscriptionInfoChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_addOnSubscriptionsChangedListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_removeOnSubscriptionsChangedListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_listen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_listenForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_notifyCallState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_notifyCallStateForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_notifyServiceStateForPhoneId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_notifySignalStrength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_notifySignalStrengthForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_notifyMessageWaitingChangedForPhoneId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_notifyCallForwardingChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_notifyCallForwardingChangedForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_notifyDataActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_notifyDataActivityForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_notifyDataConnection = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_notifyDataConnectionForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_notifyDataConnectionFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_notifyDataConnectionFailedForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_notifyCellLocation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_notifyCellLocationForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_notifyOtaspChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_notifyCellInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_notifyPreciseCallState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_notifyDisconnectCause = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_notifyPreciseDataConnectionFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_notifyCellInfoForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_notifyDataConnectionRealTimeInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_notifyVoLteServiceStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_notifyOemHookRawEventForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_notifySubscriptionInfoChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
}
public void addOnSubscriptionsChangedListener(java.lang.String pkg, com.android.internal.telephony.IOnSubscriptionsChangedListener callback) throws android.os.RemoteException;
public void removeOnSubscriptionsChangedListener(java.lang.String pkg, com.android.internal.telephony.IOnSubscriptionsChangedListener callback) throws android.os.RemoteException;
public void listen(java.lang.String pkg, com.android.internal.telephony.IPhoneStateListener callback, int events, boolean notifyNow) throws android.os.RemoteException;
public void listenForSubscriber(int subId, java.lang.String pkg, com.android.internal.telephony.IPhoneStateListener callback, int events, boolean notifyNow) throws android.os.RemoteException;
public void notifyCallState(int state, java.lang.String incomingNumber) throws android.os.RemoteException;
public void notifyCallStateForSubscriber(int subId, int state, java.lang.String incomingNumber) throws android.os.RemoteException;
public void notifyServiceStateForPhoneId(int phoneId, int subId, android.telephony.ServiceState state) throws android.os.RemoteException;
public void notifySignalStrength(android.telephony.SignalStrength signalStrength) throws android.os.RemoteException;
public void notifySignalStrengthForSubscriber(int subId, android.telephony.SignalStrength signalStrength) throws android.os.RemoteException;
public void notifyMessageWaitingChangedForPhoneId(int phoneId, int subId, boolean mwi) throws android.os.RemoteException;
public void notifyCallForwardingChanged(boolean cfi) throws android.os.RemoteException;
public void notifyCallForwardingChangedForSubscriber(int subId, boolean cfi) throws android.os.RemoteException;
public void notifyDataActivity(int state) throws android.os.RemoteException;
public void notifyDataActivityForSubscriber(int subId, int state) throws android.os.RemoteException;
public void notifyDataConnection(int state, boolean isDataConnectivityPossible, java.lang.String reason, java.lang.String apn, java.lang.String apnType, android.net.LinkProperties linkProperties, android.net.NetworkCapabilities networkCapabilities, int networkType, boolean roaming) throws android.os.RemoteException;
public void notifyDataConnectionForSubscriber(int subId, int state, boolean isDataConnectivityPossible, java.lang.String reason, java.lang.String apn, java.lang.String apnType, android.net.LinkProperties linkProperties, android.net.NetworkCapabilities networkCapabilities, int networkType, boolean roaming) throws android.os.RemoteException;
public void notifyDataConnectionFailed(java.lang.String reason, java.lang.String apnType) throws android.os.RemoteException;
public void notifyDataConnectionFailedForSubscriber(int subId, java.lang.String reason, java.lang.String apnType) throws android.os.RemoteException;
public void notifyCellLocation(android.os.Bundle cellLocation) throws android.os.RemoteException;
public void notifyCellLocationForSubscriber(int subId, android.os.Bundle cellLocation) throws android.os.RemoteException;
public void notifyOtaspChanged(int otaspMode) throws android.os.RemoteException;
public void notifyCellInfo(java.util.List<android.telephony.CellInfo> cellInfo) throws android.os.RemoteException;
public void notifyPreciseCallState(int ringingCallState, int foregroundCallState, int backgroundCallState) throws android.os.RemoteException;
public void notifyDisconnectCause(int disconnectCause, int preciseDisconnectCause) throws android.os.RemoteException;
public void notifyPreciseDataConnectionFailed(java.lang.String reason, java.lang.String apnType, java.lang.String apn, java.lang.String failCause) throws android.os.RemoteException;
public void notifyCellInfoForSubscriber(int subId, java.util.List<android.telephony.CellInfo> cellInfo) throws android.os.RemoteException;
public void notifyDataConnectionRealTimeInfo(android.telephony.DataConnectionRealTimeInfo dcRtInfo) throws android.os.RemoteException;
public void notifyVoLteServiceStateChanged(android.telephony.VoLteServiceState lteState) throws android.os.RemoteException;
public void notifyOemHookRawEventForSubscriber(int subId, byte[] rawData) throws android.os.RemoteException;
public void notifySubscriptionInfoChanged() throws android.os.RemoteException;
}
