/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/com/android/internal/app/IBatteryStats.aidl
 */
package com.android.internal.app;
public interface IBatteryStats extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IBatteryStats
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.app.IBatteryStats";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.app.IBatteryStats interface,
 * generating a proxy if needed.
 */
public static com.android.internal.app.IBatteryStats asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.app.IBatteryStats))) {
return ((com.android.internal.app.IBatteryStats)iin);
}
return new com.android.internal.app.IBatteryStats.Stub.Proxy(obj);
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
case TRANSACTION_noteStartSensor:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.noteStartSensor(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_noteStopSensor:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.noteStopSensor(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_noteStartVideo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteStartVideo(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteStopVideo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteStopVideo(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteStartAudio:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteStartAudio(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteStopAudio:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteStopAudio(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteResetVideo:
{
data.enforceInterface(DESCRIPTOR);
this.noteResetVideo();
reply.writeNoException();
return true;
}
case TRANSACTION_noteResetAudio:
{
data.enforceInterface(DESCRIPTOR);
this.noteResetAudio();
reply.writeNoException();
return true;
}
case TRANSACTION_getStatistics:
{
data.enforceInterface(DESCRIPTOR);
byte[] _result = this.getStatistics();
reply.writeNoException();
reply.writeByteArray(_result);
return true;
}
case TRANSACTION_getStatisticsStream:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelFileDescriptor _result = this.getStatisticsStream();
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
case TRANSACTION_computeBatteryTimeRemaining:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.computeBatteryTimeRemaining();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_computeChargeTimeRemaining:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.computeChargeTimeRemaining();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_noteEvent:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
this.noteEvent(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_noteSyncStart:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.noteSyncStart(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_noteSyncFinish:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.noteSyncFinish(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_noteJobStart:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.noteJobStart(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_noteJobFinish:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.noteJobFinish(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_noteStartWakelock:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
int _arg4;
_arg4 = data.readInt();
boolean _arg5;
_arg5 = (0!=data.readInt());
this.noteStartWakelock(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_noteStopWakelock:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
int _arg4;
_arg4 = data.readInt();
this.noteStopWakelock(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_noteStartWakelockFromSource:
{
data.enforceInterface(DESCRIPTOR);
android.os.WorkSource _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.WorkSource.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
int _arg4;
_arg4 = data.readInt();
boolean _arg5;
_arg5 = (0!=data.readInt());
this.noteStartWakelockFromSource(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_noteChangeWakelockFromSource:
{
data.enforceInterface(DESCRIPTOR);
android.os.WorkSource _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.WorkSource.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
int _arg4;
_arg4 = data.readInt();
android.os.WorkSource _arg5;
if ((0!=data.readInt())) {
_arg5 = android.os.WorkSource.CREATOR.createFromParcel(data);
}
else {
_arg5 = null;
}
int _arg6;
_arg6 = data.readInt();
java.lang.String _arg7;
_arg7 = data.readString();
java.lang.String _arg8;
_arg8 = data.readString();
int _arg9;
_arg9 = data.readInt();
boolean _arg10;
_arg10 = (0!=data.readInt());
this.noteChangeWakelockFromSource(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9, _arg10);
reply.writeNoException();
return true;
}
case TRANSACTION_noteStopWakelockFromSource:
{
data.enforceInterface(DESCRIPTOR);
android.os.WorkSource _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.WorkSource.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
int _arg4;
_arg4 = data.readInt();
this.noteStopWakelockFromSource(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_noteVibratorOn:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
long _arg1;
_arg1 = data.readLong();
this.noteVibratorOn(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_noteVibratorOff:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteVibratorOff(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteFlashlightOn:
{
data.enforceInterface(DESCRIPTOR);
this.noteFlashlightOn();
reply.writeNoException();
return true;
}
case TRANSACTION_noteFlashlightOff:
{
data.enforceInterface(DESCRIPTOR);
this.noteFlashlightOff();
reply.writeNoException();
return true;
}
case TRANSACTION_noteStartGps:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteStartGps(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteStopGps:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteStopGps(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteScreenState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteScreenState(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteScreenBrightness:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteScreenBrightness(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteUserActivity:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.noteUserActivity(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_noteInteractive:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.noteInteractive(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteConnectivityChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.noteConnectivityChanged(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_noteMobileRadioPowerState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
long _arg1;
_arg1 = data.readLong();
this.noteMobileRadioPowerState(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_notePhoneOn:
{
data.enforceInterface(DESCRIPTOR);
this.notePhoneOn();
reply.writeNoException();
return true;
}
case TRANSACTION_notePhoneOff:
{
data.enforceInterface(DESCRIPTOR);
this.notePhoneOff();
reply.writeNoException();
return true;
}
case TRANSACTION_notePhoneSignalStrength:
{
data.enforceInterface(DESCRIPTOR);
android.telephony.SignalStrength _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telephony.SignalStrength.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.notePhoneSignalStrength(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_notePhoneDataConnectionState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.notePhoneDataConnectionState(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_notePhoneState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.notePhoneState(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteWifiOn:
{
data.enforceInterface(DESCRIPTOR);
this.noteWifiOn();
reply.writeNoException();
return true;
}
case TRANSACTION_noteWifiOff:
{
data.enforceInterface(DESCRIPTOR);
this.noteWifiOff();
reply.writeNoException();
return true;
}
case TRANSACTION_noteWifiRunning:
{
data.enforceInterface(DESCRIPTOR);
android.os.WorkSource _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.WorkSource.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.noteWifiRunning(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteWifiRunningChanged:
{
data.enforceInterface(DESCRIPTOR);
android.os.WorkSource _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.WorkSource.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.WorkSource _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.WorkSource.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.noteWifiRunningChanged(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_noteWifiStopped:
{
data.enforceInterface(DESCRIPTOR);
android.os.WorkSource _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.WorkSource.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.noteWifiStopped(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteWifiState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.noteWifiState(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_noteWifiSupplicantStateChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.noteWifiSupplicantStateChanged(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_noteWifiRssiChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteWifiRssiChanged(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteBluetoothOn:
{
data.enforceInterface(DESCRIPTOR);
this.noteBluetoothOn();
reply.writeNoException();
return true;
}
case TRANSACTION_noteBluetoothOff:
{
data.enforceInterface(DESCRIPTOR);
this.noteBluetoothOff();
reply.writeNoException();
return true;
}
case TRANSACTION_noteBluetoothState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteBluetoothState(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteFullWifiLockAcquired:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteFullWifiLockAcquired(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteFullWifiLockReleased:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteFullWifiLockReleased(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteWifiScanStarted:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteWifiScanStarted(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteWifiScanStopped:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteWifiScanStopped(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteWifiMulticastEnabled:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteWifiMulticastEnabled(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteWifiMulticastDisabled:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.noteWifiMulticastDisabled(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteFullWifiLockAcquiredFromSource:
{
data.enforceInterface(DESCRIPTOR);
android.os.WorkSource _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.WorkSource.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.noteFullWifiLockAcquiredFromSource(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteFullWifiLockReleasedFromSource:
{
data.enforceInterface(DESCRIPTOR);
android.os.WorkSource _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.WorkSource.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.noteFullWifiLockReleasedFromSource(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteWifiScanStartedFromSource:
{
data.enforceInterface(DESCRIPTOR);
android.os.WorkSource _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.WorkSource.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.noteWifiScanStartedFromSource(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteWifiScanStoppedFromSource:
{
data.enforceInterface(DESCRIPTOR);
android.os.WorkSource _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.WorkSource.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.noteWifiScanStoppedFromSource(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteWifiBatchedScanStartedFromSource:
{
data.enforceInterface(DESCRIPTOR);
android.os.WorkSource _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.WorkSource.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.noteWifiBatchedScanStartedFromSource(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_noteWifiBatchedScanStoppedFromSource:
{
data.enforceInterface(DESCRIPTOR);
android.os.WorkSource _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.WorkSource.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.noteWifiBatchedScanStoppedFromSource(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteWifiMulticastEnabledFromSource:
{
data.enforceInterface(DESCRIPTOR);
android.os.WorkSource _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.WorkSource.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.noteWifiMulticastEnabledFromSource(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteWifiMulticastDisabledFromSource:
{
data.enforceInterface(DESCRIPTOR);
android.os.WorkSource _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.WorkSource.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.noteWifiMulticastDisabledFromSource(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_noteNetworkInterfaceType:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.noteNetworkInterfaceType(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_noteNetworkStatsEnabled:
{
data.enforceInterface(DESCRIPTOR);
this.noteNetworkStatsEnabled();
reply.writeNoException();
return true;
}
case TRANSACTION_setBatteryState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
int _arg5;
_arg5 = data.readInt();
this.setBatteryState(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_getAwakeTimeBattery:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getAwakeTimeBattery();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getAwakeTimePlugged:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getAwakeTimePlugged();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.app.IBatteryStats
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
// These first methods are also called by native code, so must
// be kept in sync with frameworks/native/include/binder/IBatteryStats.h

@Override public void noteStartSensor(int uid, int sensor) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeInt(sensor);
mRemote.transact(Stub.TRANSACTION_noteStartSensor, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteStopSensor(int uid, int sensor) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeInt(sensor);
mRemote.transact(Stub.TRANSACTION_noteStopSensor, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteStartVideo(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteStartVideo, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteStopVideo(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteStopVideo, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteStartAudio(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteStartAudio, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteStopAudio(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteStopAudio, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteResetVideo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_noteResetVideo, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteResetAudio() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_noteResetAudio, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Remaining methods are only used in Java.

@Override public byte[] getStatistics() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
byte[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getStatistics, _data, _reply, 0);
_reply.readException();
_result = _reply.createByteArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.os.ParcelFileDescriptor getStatisticsStream() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.ParcelFileDescriptor _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getStatisticsStream, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(_reply);
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
// Return the computed amount of time remaining on battery, in milliseconds.
// Returns -1 if nothing could be computed.

@Override public long computeBatteryTimeRemaining() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_computeBatteryTimeRemaining, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Return the computed amount of time remaining to fully charge, in milliseconds.
// Returns -1 if nothing could be computed.

@Override public long computeChargeTimeRemaining() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_computeChargeTimeRemaining, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void noteEvent(int code, java.lang.String name, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(code);
_data.writeString(name);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteEvent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteSyncStart(java.lang.String name, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteSyncStart, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteSyncFinish(java.lang.String name, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteSyncFinish, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteJobStart(java.lang.String name, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteJobStart, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteJobFinish(java.lang.String name, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteJobFinish, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteStartWakelock(int uid, int pid, java.lang.String name, java.lang.String historyName, int type, boolean unimportantForLogging) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeInt(pid);
_data.writeString(name);
_data.writeString(historyName);
_data.writeInt(type);
_data.writeInt(((unimportantForLogging)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_noteStartWakelock, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteStopWakelock(int uid, int pid, java.lang.String name, java.lang.String historyName, int type) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeInt(pid);
_data.writeString(name);
_data.writeString(historyName);
_data.writeInt(type);
mRemote.transact(Stub.TRANSACTION_noteStopWakelock, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteStartWakelockFromSource(android.os.WorkSource ws, int pid, java.lang.String name, java.lang.String historyName, int type, boolean unimportantForLogging) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((ws!=null)) {
_data.writeInt(1);
ws.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(pid);
_data.writeString(name);
_data.writeString(historyName);
_data.writeInt(type);
_data.writeInt(((unimportantForLogging)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_noteStartWakelockFromSource, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteChangeWakelockFromSource(android.os.WorkSource ws, int pid, java.lang.String name, java.lang.String histyoryName, int type, android.os.WorkSource newWs, int newPid, java.lang.String newName, java.lang.String newHistoryName, int newType, boolean newUnimportantForLogging) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((ws!=null)) {
_data.writeInt(1);
ws.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(pid);
_data.writeString(name);
_data.writeString(histyoryName);
_data.writeInt(type);
if ((newWs!=null)) {
_data.writeInt(1);
newWs.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(newPid);
_data.writeString(newName);
_data.writeString(newHistoryName);
_data.writeInt(newType);
_data.writeInt(((newUnimportantForLogging)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_noteChangeWakelockFromSource, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteStopWakelockFromSource(android.os.WorkSource ws, int pid, java.lang.String name, java.lang.String historyName, int type) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((ws!=null)) {
_data.writeInt(1);
ws.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(pid);
_data.writeString(name);
_data.writeString(historyName);
_data.writeInt(type);
mRemote.transact(Stub.TRANSACTION_noteStopWakelockFromSource, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteVibratorOn(int uid, long durationMillis) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeLong(durationMillis);
mRemote.transact(Stub.TRANSACTION_noteVibratorOn, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteVibratorOff(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteVibratorOff, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteFlashlightOn() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_noteFlashlightOn, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteFlashlightOff() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_noteFlashlightOff, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteStartGps(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteStartGps, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteStopGps(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteStopGps, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteScreenState(int state) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(state);
mRemote.transact(Stub.TRANSACTION_noteScreenState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteScreenBrightness(int brightness) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(brightness);
mRemote.transact(Stub.TRANSACTION_noteScreenBrightness, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteUserActivity(int uid, int event) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeInt(event);
mRemote.transact(Stub.TRANSACTION_noteUserActivity, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteInteractive(boolean interactive) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((interactive)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_noteInteractive, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteConnectivityChanged(int type, java.lang.String extra) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(type);
_data.writeString(extra);
mRemote.transact(Stub.TRANSACTION_noteConnectivityChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteMobileRadioPowerState(int powerState, long timestampNs) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(powerState);
_data.writeLong(timestampNs);
mRemote.transact(Stub.TRANSACTION_noteMobileRadioPowerState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notePhoneOn() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_notePhoneOn, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notePhoneOff() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_notePhoneOff, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notePhoneSignalStrength(android.telephony.SignalStrength signalStrength) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_notePhoneSignalStrength, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notePhoneDataConnectionState(int dataType, boolean hasData) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(dataType);
_data.writeInt(((hasData)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_notePhoneDataConnectionState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notePhoneState(int phoneState) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(phoneState);
mRemote.transact(Stub.TRANSACTION_notePhoneState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteWifiOn() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_noteWifiOn, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteWifiOff() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_noteWifiOff, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteWifiRunning(android.os.WorkSource ws) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((ws!=null)) {
_data.writeInt(1);
ws.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_noteWifiRunning, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteWifiRunningChanged(android.os.WorkSource oldWs, android.os.WorkSource newWs) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((oldWs!=null)) {
_data.writeInt(1);
oldWs.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((newWs!=null)) {
_data.writeInt(1);
newWs.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_noteWifiRunningChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteWifiStopped(android.os.WorkSource ws) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((ws!=null)) {
_data.writeInt(1);
ws.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_noteWifiStopped, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteWifiState(int wifiState, java.lang.String accessPoint) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(wifiState);
_data.writeString(accessPoint);
mRemote.transact(Stub.TRANSACTION_noteWifiState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteWifiSupplicantStateChanged(int supplState, boolean failedAuth) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(supplState);
_data.writeInt(((failedAuth)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_noteWifiSupplicantStateChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteWifiRssiChanged(int newRssi) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(newRssi);
mRemote.transact(Stub.TRANSACTION_noteWifiRssiChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteBluetoothOn() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_noteBluetoothOn, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteBluetoothOff() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_noteBluetoothOff, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteBluetoothState(int bluetoothState) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(bluetoothState);
mRemote.transact(Stub.TRANSACTION_noteBluetoothState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteFullWifiLockAcquired(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteFullWifiLockAcquired, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteFullWifiLockReleased(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteFullWifiLockReleased, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteWifiScanStarted(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteWifiScanStarted, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteWifiScanStopped(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteWifiScanStopped, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteWifiMulticastEnabled(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteWifiMulticastEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteWifiMulticastDisabled(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_noteWifiMulticastDisabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteFullWifiLockAcquiredFromSource(android.os.WorkSource ws) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((ws!=null)) {
_data.writeInt(1);
ws.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_noteFullWifiLockAcquiredFromSource, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteFullWifiLockReleasedFromSource(android.os.WorkSource ws) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((ws!=null)) {
_data.writeInt(1);
ws.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_noteFullWifiLockReleasedFromSource, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteWifiScanStartedFromSource(android.os.WorkSource ws) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((ws!=null)) {
_data.writeInt(1);
ws.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_noteWifiScanStartedFromSource, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteWifiScanStoppedFromSource(android.os.WorkSource ws) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((ws!=null)) {
_data.writeInt(1);
ws.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_noteWifiScanStoppedFromSource, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteWifiBatchedScanStartedFromSource(android.os.WorkSource ws, int csph) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((ws!=null)) {
_data.writeInt(1);
ws.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(csph);
mRemote.transact(Stub.TRANSACTION_noteWifiBatchedScanStartedFromSource, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteWifiBatchedScanStoppedFromSource(android.os.WorkSource ws) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((ws!=null)) {
_data.writeInt(1);
ws.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_noteWifiBatchedScanStoppedFromSource, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteWifiMulticastEnabledFromSource(android.os.WorkSource ws) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((ws!=null)) {
_data.writeInt(1);
ws.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_noteWifiMulticastEnabledFromSource, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteWifiMulticastDisabledFromSource(android.os.WorkSource ws) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((ws!=null)) {
_data.writeInt(1);
ws.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_noteWifiMulticastDisabledFromSource, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteNetworkInterfaceType(java.lang.String iface, int type) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
_data.writeInt(type);
mRemote.transact(Stub.TRANSACTION_noteNetworkInterfaceType, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void noteNetworkStatsEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_noteNetworkStatsEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setBatteryState(int status, int health, int plugType, int level, int temp, int volt) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
_data.writeInt(health);
_data.writeInt(plugType);
_data.writeInt(level);
_data.writeInt(temp);
_data.writeInt(volt);
mRemote.transact(Stub.TRANSACTION_setBatteryState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public long getAwakeTimeBattery() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAwakeTimeBattery, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getAwakeTimePlugged() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAwakeTimePlugged, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_noteStartSensor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_noteStopSensor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_noteStartVideo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_noteStopVideo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_noteStartAudio = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_noteStopAudio = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_noteResetVideo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_noteResetAudio = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getStatistics = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getStatisticsStream = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_computeBatteryTimeRemaining = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_computeChargeTimeRemaining = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_noteEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_noteSyncStart = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_noteSyncFinish = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_noteJobStart = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_noteJobFinish = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_noteStartWakelock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_noteStopWakelock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_noteStartWakelockFromSource = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_noteChangeWakelockFromSource = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_noteStopWakelockFromSource = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_noteVibratorOn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_noteVibratorOff = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_noteFlashlightOn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_noteFlashlightOff = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_noteStartGps = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_noteStopGps = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_noteScreenState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_noteScreenBrightness = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_noteUserActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_noteInteractive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_noteConnectivityChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_noteMobileRadioPowerState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_notePhoneOn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
static final int TRANSACTION_notePhoneOff = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
static final int TRANSACTION_notePhoneSignalStrength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
static final int TRANSACTION_notePhoneDataConnectionState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
static final int TRANSACTION_notePhoneState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
static final int TRANSACTION_noteWifiOn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
static final int TRANSACTION_noteWifiOff = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
static final int TRANSACTION_noteWifiRunning = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
static final int TRANSACTION_noteWifiRunningChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
static final int TRANSACTION_noteWifiStopped = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
static final int TRANSACTION_noteWifiState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
static final int TRANSACTION_noteWifiSupplicantStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
static final int TRANSACTION_noteWifiRssiChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
static final int TRANSACTION_noteBluetoothOn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
static final int TRANSACTION_noteBluetoothOff = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
static final int TRANSACTION_noteBluetoothState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
static final int TRANSACTION_noteFullWifiLockAcquired = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
static final int TRANSACTION_noteFullWifiLockReleased = (android.os.IBinder.FIRST_CALL_TRANSACTION + 51);
static final int TRANSACTION_noteWifiScanStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 52);
static final int TRANSACTION_noteWifiScanStopped = (android.os.IBinder.FIRST_CALL_TRANSACTION + 53);
static final int TRANSACTION_noteWifiMulticastEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 54);
static final int TRANSACTION_noteWifiMulticastDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 55);
static final int TRANSACTION_noteFullWifiLockAcquiredFromSource = (android.os.IBinder.FIRST_CALL_TRANSACTION + 56);
static final int TRANSACTION_noteFullWifiLockReleasedFromSource = (android.os.IBinder.FIRST_CALL_TRANSACTION + 57);
static final int TRANSACTION_noteWifiScanStartedFromSource = (android.os.IBinder.FIRST_CALL_TRANSACTION + 58);
static final int TRANSACTION_noteWifiScanStoppedFromSource = (android.os.IBinder.FIRST_CALL_TRANSACTION + 59);
static final int TRANSACTION_noteWifiBatchedScanStartedFromSource = (android.os.IBinder.FIRST_CALL_TRANSACTION + 60);
static final int TRANSACTION_noteWifiBatchedScanStoppedFromSource = (android.os.IBinder.FIRST_CALL_TRANSACTION + 61);
static final int TRANSACTION_noteWifiMulticastEnabledFromSource = (android.os.IBinder.FIRST_CALL_TRANSACTION + 62);
static final int TRANSACTION_noteWifiMulticastDisabledFromSource = (android.os.IBinder.FIRST_CALL_TRANSACTION + 63);
static final int TRANSACTION_noteNetworkInterfaceType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 64);
static final int TRANSACTION_noteNetworkStatsEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 65);
static final int TRANSACTION_setBatteryState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 66);
static final int TRANSACTION_getAwakeTimeBattery = (android.os.IBinder.FIRST_CALL_TRANSACTION + 67);
static final int TRANSACTION_getAwakeTimePlugged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 68);
}
// These first methods are also called by native code, so must
// be kept in sync with frameworks/native/include/binder/IBatteryStats.h

public void noteStartSensor(int uid, int sensor) throws android.os.RemoteException;
public void noteStopSensor(int uid, int sensor) throws android.os.RemoteException;
public void noteStartVideo(int uid) throws android.os.RemoteException;
public void noteStopVideo(int uid) throws android.os.RemoteException;
public void noteStartAudio(int uid) throws android.os.RemoteException;
public void noteStopAudio(int uid) throws android.os.RemoteException;
public void noteResetVideo() throws android.os.RemoteException;
public void noteResetAudio() throws android.os.RemoteException;
// Remaining methods are only used in Java.

public byte[] getStatistics() throws android.os.RemoteException;
public android.os.ParcelFileDescriptor getStatisticsStream() throws android.os.RemoteException;
// Return the computed amount of time remaining on battery, in milliseconds.
// Returns -1 if nothing could be computed.

public long computeBatteryTimeRemaining() throws android.os.RemoteException;
// Return the computed amount of time remaining to fully charge, in milliseconds.
// Returns -1 if nothing could be computed.

public long computeChargeTimeRemaining() throws android.os.RemoteException;
public void noteEvent(int code, java.lang.String name, int uid) throws android.os.RemoteException;
public void noteSyncStart(java.lang.String name, int uid) throws android.os.RemoteException;
public void noteSyncFinish(java.lang.String name, int uid) throws android.os.RemoteException;
public void noteJobStart(java.lang.String name, int uid) throws android.os.RemoteException;
public void noteJobFinish(java.lang.String name, int uid) throws android.os.RemoteException;
public void noteStartWakelock(int uid, int pid, java.lang.String name, java.lang.String historyName, int type, boolean unimportantForLogging) throws android.os.RemoteException;
public void noteStopWakelock(int uid, int pid, java.lang.String name, java.lang.String historyName, int type) throws android.os.RemoteException;
public void noteStartWakelockFromSource(android.os.WorkSource ws, int pid, java.lang.String name, java.lang.String historyName, int type, boolean unimportantForLogging) throws android.os.RemoteException;
public void noteChangeWakelockFromSource(android.os.WorkSource ws, int pid, java.lang.String name, java.lang.String histyoryName, int type, android.os.WorkSource newWs, int newPid, java.lang.String newName, java.lang.String newHistoryName, int newType, boolean newUnimportantForLogging) throws android.os.RemoteException;
public void noteStopWakelockFromSource(android.os.WorkSource ws, int pid, java.lang.String name, java.lang.String historyName, int type) throws android.os.RemoteException;
public void noteVibratorOn(int uid, long durationMillis) throws android.os.RemoteException;
public void noteVibratorOff(int uid) throws android.os.RemoteException;
public void noteFlashlightOn() throws android.os.RemoteException;
public void noteFlashlightOff() throws android.os.RemoteException;
public void noteStartGps(int uid) throws android.os.RemoteException;
public void noteStopGps(int uid) throws android.os.RemoteException;
public void noteScreenState(int state) throws android.os.RemoteException;
public void noteScreenBrightness(int brightness) throws android.os.RemoteException;
public void noteUserActivity(int uid, int event) throws android.os.RemoteException;
public void noteInteractive(boolean interactive) throws android.os.RemoteException;
public void noteConnectivityChanged(int type, java.lang.String extra) throws android.os.RemoteException;
public void noteMobileRadioPowerState(int powerState, long timestampNs) throws android.os.RemoteException;
public void notePhoneOn() throws android.os.RemoteException;
public void notePhoneOff() throws android.os.RemoteException;
public void notePhoneSignalStrength(android.telephony.SignalStrength signalStrength) throws android.os.RemoteException;
public void notePhoneDataConnectionState(int dataType, boolean hasData) throws android.os.RemoteException;
public void notePhoneState(int phoneState) throws android.os.RemoteException;
public void noteWifiOn() throws android.os.RemoteException;
public void noteWifiOff() throws android.os.RemoteException;
public void noteWifiRunning(android.os.WorkSource ws) throws android.os.RemoteException;
public void noteWifiRunningChanged(android.os.WorkSource oldWs, android.os.WorkSource newWs) throws android.os.RemoteException;
public void noteWifiStopped(android.os.WorkSource ws) throws android.os.RemoteException;
public void noteWifiState(int wifiState, java.lang.String accessPoint) throws android.os.RemoteException;
public void noteWifiSupplicantStateChanged(int supplState, boolean failedAuth) throws android.os.RemoteException;
public void noteWifiRssiChanged(int newRssi) throws android.os.RemoteException;
public void noteBluetoothOn() throws android.os.RemoteException;
public void noteBluetoothOff() throws android.os.RemoteException;
public void noteBluetoothState(int bluetoothState) throws android.os.RemoteException;
public void noteFullWifiLockAcquired(int uid) throws android.os.RemoteException;
public void noteFullWifiLockReleased(int uid) throws android.os.RemoteException;
public void noteWifiScanStarted(int uid) throws android.os.RemoteException;
public void noteWifiScanStopped(int uid) throws android.os.RemoteException;
public void noteWifiMulticastEnabled(int uid) throws android.os.RemoteException;
public void noteWifiMulticastDisabled(int uid) throws android.os.RemoteException;
public void noteFullWifiLockAcquiredFromSource(android.os.WorkSource ws) throws android.os.RemoteException;
public void noteFullWifiLockReleasedFromSource(android.os.WorkSource ws) throws android.os.RemoteException;
public void noteWifiScanStartedFromSource(android.os.WorkSource ws) throws android.os.RemoteException;
public void noteWifiScanStoppedFromSource(android.os.WorkSource ws) throws android.os.RemoteException;
public void noteWifiBatchedScanStartedFromSource(android.os.WorkSource ws, int csph) throws android.os.RemoteException;
public void noteWifiBatchedScanStoppedFromSource(android.os.WorkSource ws) throws android.os.RemoteException;
public void noteWifiMulticastEnabledFromSource(android.os.WorkSource ws) throws android.os.RemoteException;
public void noteWifiMulticastDisabledFromSource(android.os.WorkSource ws) throws android.os.RemoteException;
public void noteNetworkInterfaceType(java.lang.String iface, int type) throws android.os.RemoteException;
public void noteNetworkStatsEnabled() throws android.os.RemoteException;
public void setBatteryState(int status, int health, int plugType, int level, int temp, int volt) throws android.os.RemoteException;
public long getAwakeTimeBattery() throws android.os.RemoteException;
public long getAwakeTimePlugged() throws android.os.RemoteException;
}
