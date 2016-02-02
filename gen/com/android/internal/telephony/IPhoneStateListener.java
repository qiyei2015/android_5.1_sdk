/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/telephony/java/com/android/internal/telephony/IPhoneStateListener.aidl
 */
package com.android.internal.telephony;
public interface IPhoneStateListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.IPhoneStateListener
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.IPhoneStateListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.telephony.IPhoneStateListener interface,
 * generating a proxy if needed.
 */
public static com.android.internal.telephony.IPhoneStateListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.telephony.IPhoneStateListener))) {
return ((com.android.internal.telephony.IPhoneStateListener)iin);
}
return new com.android.internal.telephony.IPhoneStateListener.Stub.Proxy(obj);
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
case TRANSACTION_onServiceStateChanged:
{
data.enforceInterface(DESCRIPTOR);
android.telephony.ServiceState _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telephony.ServiceState.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onServiceStateChanged(_arg0);
return true;
}
case TRANSACTION_onSignalStrengthChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onSignalStrengthChanged(_arg0);
return true;
}
case TRANSACTION_onMessageWaitingIndicatorChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onMessageWaitingIndicatorChanged(_arg0);
return true;
}
case TRANSACTION_onCallForwardingIndicatorChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onCallForwardingIndicatorChanged(_arg0);
return true;
}
case TRANSACTION_onCellLocationChanged:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onCellLocationChanged(_arg0);
return true;
}
case TRANSACTION_onCallStateChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.onCallStateChanged(_arg0, _arg1);
return true;
}
case TRANSACTION_onDataConnectionStateChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onDataConnectionStateChanged(_arg0, _arg1);
return true;
}
case TRANSACTION_onDataActivity:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onDataActivity(_arg0);
return true;
}
case TRANSACTION_onSignalStrengthsChanged:
{
data.enforceInterface(DESCRIPTOR);
android.telephony.SignalStrength _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telephony.SignalStrength.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onSignalStrengthsChanged(_arg0);
return true;
}
case TRANSACTION_onOtaspChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onOtaspChanged(_arg0);
return true;
}
case TRANSACTION_onCellInfoChanged:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.telephony.CellInfo> _arg0;
_arg0 = data.createTypedArrayList(android.telephony.CellInfo.CREATOR);
this.onCellInfoChanged(_arg0);
return true;
}
case TRANSACTION_onPreciseCallStateChanged:
{
data.enforceInterface(DESCRIPTOR);
android.telephony.PreciseCallState _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telephony.PreciseCallState.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onPreciseCallStateChanged(_arg0);
return true;
}
case TRANSACTION_onPreciseDataConnectionStateChanged:
{
data.enforceInterface(DESCRIPTOR);
android.telephony.PreciseDataConnectionState _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telephony.PreciseDataConnectionState.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onPreciseDataConnectionStateChanged(_arg0);
return true;
}
case TRANSACTION_onDataConnectionRealTimeInfoChanged:
{
data.enforceInterface(DESCRIPTOR);
android.telephony.DataConnectionRealTimeInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telephony.DataConnectionRealTimeInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onDataConnectionRealTimeInfoChanged(_arg0);
return true;
}
case TRANSACTION_onVoLteServiceStateChanged:
{
data.enforceInterface(DESCRIPTOR);
android.telephony.VoLteServiceState _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telephony.VoLteServiceState.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onVoLteServiceStateChanged(_arg0);
return true;
}
case TRANSACTION_onOemHookRawEvent:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
this.onOemHookRawEvent(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.telephony.IPhoneStateListener
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
@Override public void onServiceStateChanged(android.telephony.ServiceState serviceState) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((serviceState!=null)) {
_data.writeInt(1);
serviceState.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onServiceStateChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onSignalStrengthChanged(int asu) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(asu);
mRemote.transact(Stub.TRANSACTION_onSignalStrengthChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onMessageWaitingIndicatorChanged(boolean mwi) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((mwi)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onMessageWaitingIndicatorChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onCallForwardingIndicatorChanged(boolean cfi) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((cfi)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onCallForwardingIndicatorChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// we use bundle here instead of CellLocation so it can get the right subclass

@Override public void onCellLocationChanged(android.os.Bundle location) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((location!=null)) {
_data.writeInt(1);
location.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onCellLocationChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onCallStateChanged(int state, java.lang.String incomingNumber) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(state);
_data.writeString(incomingNumber);
mRemote.transact(Stub.TRANSACTION_onCallStateChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onDataConnectionStateChanged(int state, int networkType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(state);
_data.writeInt(networkType);
mRemote.transact(Stub.TRANSACTION_onDataConnectionStateChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onDataActivity(int direction) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(direction);
mRemote.transact(Stub.TRANSACTION_onDataActivity, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onSignalStrengthsChanged(android.telephony.SignalStrength signalStrength) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((signalStrength!=null)) {
_data.writeInt(1);
signalStrength.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onSignalStrengthsChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onOtaspChanged(int otaspMode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(otaspMode);
mRemote.transact(Stub.TRANSACTION_onOtaspChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onCellInfoChanged(java.util.List<android.telephony.CellInfo> cellInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(cellInfo);
mRemote.transact(Stub.TRANSACTION_onCellInfoChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onPreciseCallStateChanged(android.telephony.PreciseCallState callState) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((callState!=null)) {
_data.writeInt(1);
callState.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onPreciseCallStateChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onPreciseDataConnectionStateChanged(android.telephony.PreciseDataConnectionState dataConnectionState) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((dataConnectionState!=null)) {
_data.writeInt(1);
dataConnectionState.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onPreciseDataConnectionStateChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onDataConnectionRealTimeInfoChanged(android.telephony.DataConnectionRealTimeInfo dcRtInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((dcRtInfo!=null)) {
_data.writeInt(1);
dcRtInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onDataConnectionRealTimeInfoChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onVoLteServiceStateChanged(android.telephony.VoLteServiceState lteState) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((lteState!=null)) {
_data.writeInt(1);
lteState.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onVoLteServiceStateChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onOemHookRawEvent(byte[] rawData) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(rawData);
mRemote.transact(Stub.TRANSACTION_onOemHookRawEvent, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onServiceStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onSignalStrengthChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onMessageWaitingIndicatorChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onCallForwardingIndicatorChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onCellLocationChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onCallStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onDataConnectionStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onDataActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_onSignalStrengthsChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_onOtaspChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_onCellInfoChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_onPreciseCallStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_onPreciseDataConnectionStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_onDataConnectionRealTimeInfoChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_onVoLteServiceStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_onOemHookRawEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
}
public void onServiceStateChanged(android.telephony.ServiceState serviceState) throws android.os.RemoteException;
public void onSignalStrengthChanged(int asu) throws android.os.RemoteException;
public void onMessageWaitingIndicatorChanged(boolean mwi) throws android.os.RemoteException;
public void onCallForwardingIndicatorChanged(boolean cfi) throws android.os.RemoteException;
// we use bundle here instead of CellLocation so it can get the right subclass

public void onCellLocationChanged(android.os.Bundle location) throws android.os.RemoteException;
public void onCallStateChanged(int state, java.lang.String incomingNumber) throws android.os.RemoteException;
public void onDataConnectionStateChanged(int state, int networkType) throws android.os.RemoteException;
public void onDataActivity(int direction) throws android.os.RemoteException;
public void onSignalStrengthsChanged(android.telephony.SignalStrength signalStrength) throws android.os.RemoteException;
public void onOtaspChanged(int otaspMode) throws android.os.RemoteException;
public void onCellInfoChanged(java.util.List<android.telephony.CellInfo> cellInfo) throws android.os.RemoteException;
public void onPreciseCallStateChanged(android.telephony.PreciseCallState callState) throws android.os.RemoteException;
public void onPreciseDataConnectionStateChanged(android.telephony.PreciseDataConnectionState dataConnectionState) throws android.os.RemoteException;
public void onDataConnectionRealTimeInfoChanged(android.telephony.DataConnectionRealTimeInfo dcRtInfo) throws android.os.RemoteException;
public void onVoLteServiceStateChanged(android.telephony.VoLteServiceState lteState) throws android.os.RemoteException;
public void onOemHookRawEvent(byte[] rawData) throws android.os.RemoteException;
}
