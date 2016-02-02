/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/external/broadcom_bplus/frameworks/api/bt/src/com/broadcom/fm/fmreceiver/IFmReceiverService.aidl
 */
package com.broadcom.fm.fmreceiver;
/**
 * @hide
 */
public interface IFmReceiverService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.broadcom.fm.fmreceiver.IFmReceiverService
{
private static final java.lang.String DESCRIPTOR = "com.broadcom.fm.fmreceiver.IFmReceiverService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.broadcom.fm.fmreceiver.IFmReceiverService interface,
 * generating a proxy if needed.
 */
public static com.broadcom.fm.fmreceiver.IFmReceiverService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.broadcom.fm.fmreceiver.IFmReceiverService))) {
return ((com.broadcom.fm.fmreceiver.IFmReceiverService)iin);
}
return new com.broadcom.fm.fmreceiver.IFmReceiverService.Stub.Proxy(obj);
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
case TRANSACTION_init:
{
data.enforceInterface(DESCRIPTOR);
this.init();
reply.writeNoException();
return true;
}
case TRANSACTION_registerCallback:
{
data.enforceInterface(DESCRIPTOR);
com.broadcom.fm.fmreceiver.IFmReceiverCallback _arg0;
_arg0 = com.broadcom.fm.fmreceiver.IFmReceiverCallback.Stub.asInterface(data.readStrongBinder());
this.registerCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterCallback:
{
data.enforceInterface(DESCRIPTOR);
com.broadcom.fm.fmreceiver.IFmReceiverCallback _arg0;
_arg0 = com.broadcom.fm.fmreceiver.IFmReceiverCallback.Stub.asInterface(data.readStrongBinder());
this.unregisterCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getRadioIsOn:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getRadioIsOn();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getMonoStereoMode:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getMonoStereoMode();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getTunedFrequency:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getTunedFrequency();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getIsMute:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getIsMute();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_turnOffRadio:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.turnOffRadio();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_turnOnRadio:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
char[] _arg1;
_arg1 = data.createCharArray();
int _result = this.turnOnRadio(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
reply.writeCharArray(_arg1);
return true;
}
case TRANSACTION_tuneRadio:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.tuneRadio(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getStatus:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getStatus();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_muteAudio:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _result = this.muteAudio(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_seekStation:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _result = this.seekStation(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_seekStationCombo:
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
boolean _arg5;
_arg5 = (0!=data.readInt());
int _arg6;
_arg6 = data.readInt();
int _arg7;
_arg7 = data.readInt();
int _result = this.seekStationCombo(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_seekRdsStation:
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
int _result = this.seekRdsStation(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_seekStationAbort:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.seekStationAbort();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setRdsMode:
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
int _result = this.setRdsMode(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setAudioMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.setAudioMode(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setAudioPath:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.setAudioPath(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setStepSize:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.setStepSize(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setWorldRegion:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _result = this.setWorldRegion(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_estimateNoiseFloorLevel:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.estimateNoiseFloorLevel(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setLiveAudioPolling:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _arg1;
_arg1 = data.readInt();
int _result = this.setLiveAudioPolling(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setFMVolume:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.setFMVolume(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setSnrThreshold:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.setSnrThreshold(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_cleanupFmService:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.cleanupFmService();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.broadcom.fm.fmreceiver.IFmReceiverService
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
/* The FM Receiver Service API. */
@Override public void init() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_init, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void registerCallback(com.broadcom.fm.fmreceiver.IFmReceiverCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterCallback(com.broadcom.fm.fmreceiver.IFmReceiverCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean getRadioIsOn() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getRadioIsOn, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getMonoStereoMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getMonoStereoMode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getTunedFrequency() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTunedFrequency, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean getIsMute() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getIsMute, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int turnOffRadio() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_turnOffRadio, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int turnOnRadio(int functionalityMask, char[] clientPackagename) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(functionalityMask);
_data.writeCharArray(clientPackagename);
mRemote.transact(Stub.TRANSACTION_turnOnRadio, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
_reply.readCharArray(clientPackagename);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int tuneRadio(int freq) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(freq);
mRemote.transact(Stub.TRANSACTION_tuneRadio, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getStatus() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getStatus, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int muteAudio(boolean mute) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((mute)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_muteAudio, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int seekStation(int scanDirection, int minSignalStrength) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(scanDirection);
_data.writeInt(minSignalStrength);
mRemote.transact(Stub.TRANSACTION_seekStation, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int seekStationCombo(int startFreq, int endFreq, int minSignalStrength, int dir, int scanMethod, boolean multiChannel, int rdsType, int rdsTypeValue) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(startFreq);
_data.writeInt(endFreq);
_data.writeInt(minSignalStrength);
_data.writeInt(dir);
_data.writeInt(scanMethod);
_data.writeInt(((multiChannel)?(1):(0)));
_data.writeInt(rdsType);
_data.writeInt(rdsTypeValue);
mRemote.transact(Stub.TRANSACTION_seekStationCombo, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int seekRdsStation(int scanDirection, int minSignalStrength, int rdsCondition, int rdsValue) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(scanDirection);
_data.writeInt(minSignalStrength);
_data.writeInt(rdsCondition);
_data.writeInt(rdsValue);
mRemote.transact(Stub.TRANSACTION_seekRdsStation, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int seekStationAbort() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_seekStationAbort, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int setRdsMode(int rdsMode, int rdsFeatures, int afMode, int afThreshold) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(rdsMode);
_data.writeInt(rdsFeatures);
_data.writeInt(afMode);
_data.writeInt(afThreshold);
mRemote.transact(Stub.TRANSACTION_setRdsMode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int setAudioMode(int audioMode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(audioMode);
mRemote.transact(Stub.TRANSACTION_setAudioMode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int setAudioPath(int audioPath) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(audioPath);
mRemote.transact(Stub.TRANSACTION_setAudioPath, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int setStepSize(int stepSize) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(stepSize);
mRemote.transact(Stub.TRANSACTION_setStepSize, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int setWorldRegion(int worldRegion, int deemphasisTime) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(worldRegion);
_data.writeInt(deemphasisTime);
mRemote.transact(Stub.TRANSACTION_setWorldRegion, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int estimateNoiseFloorLevel(int nflLevel) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nflLevel);
mRemote.transact(Stub.TRANSACTION_estimateNoiseFloorLevel, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int setLiveAudioPolling(boolean liveAudioPolling, int signalPollInterval) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((liveAudioPolling)?(1):(0)));
_data.writeInt(signalPollInterval);
mRemote.transact(Stub.TRANSACTION_setLiveAudioPolling, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int setFMVolume(int volume) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(volume);
mRemote.transact(Stub.TRANSACTION_setFMVolume, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int setSnrThreshold(int snrThreshold) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(snrThreshold);
mRemote.transact(Stub.TRANSACTION_setSnrThreshold, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int cleanupFmService() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_cleanupFmService, _data, _reply, 0);
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
static final int TRANSACTION_init = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_registerCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_unregisterCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getRadioIsOn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getMonoStereoMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getTunedFrequency = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getIsMute = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_turnOffRadio = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_turnOnRadio = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_tuneRadio = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_muteAudio = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_seekStation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_seekStationCombo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_seekRdsStation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_seekStationAbort = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_setRdsMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_setAudioMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_setAudioPath = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_setStepSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_setWorldRegion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_estimateNoiseFloorLevel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_setLiveAudioPolling = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_setFMVolume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_setSnrThreshold = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_cleanupFmService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
}
/* The FM Receiver Service API. */
public void init() throws android.os.RemoteException;
public void registerCallback(com.broadcom.fm.fmreceiver.IFmReceiverCallback cb) throws android.os.RemoteException;
public void unregisterCallback(com.broadcom.fm.fmreceiver.IFmReceiverCallback cb) throws android.os.RemoteException;
public boolean getRadioIsOn() throws android.os.RemoteException;
public int getMonoStereoMode() throws android.os.RemoteException;
public int getTunedFrequency() throws android.os.RemoteException;
public boolean getIsMute() throws android.os.RemoteException;
public int turnOffRadio() throws android.os.RemoteException;
public int turnOnRadio(int functionalityMask, char[] clientPackagename) throws android.os.RemoteException;
public int tuneRadio(int freq) throws android.os.RemoteException;
public int getStatus() throws android.os.RemoteException;
public int muteAudio(boolean mute) throws android.os.RemoteException;
public int seekStation(int scanDirection, int minSignalStrength) throws android.os.RemoteException;
public int seekStationCombo(int startFreq, int endFreq, int minSignalStrength, int dir, int scanMethod, boolean multiChannel, int rdsType, int rdsTypeValue) throws android.os.RemoteException;
public int seekRdsStation(int scanDirection, int minSignalStrength, int rdsCondition, int rdsValue) throws android.os.RemoteException;
public int seekStationAbort() throws android.os.RemoteException;
public int setRdsMode(int rdsMode, int rdsFeatures, int afMode, int afThreshold) throws android.os.RemoteException;
public int setAudioMode(int audioMode) throws android.os.RemoteException;
public int setAudioPath(int audioPath) throws android.os.RemoteException;
public int setStepSize(int stepSize) throws android.os.RemoteException;
public int setWorldRegion(int worldRegion, int deemphasisTime) throws android.os.RemoteException;
public int estimateNoiseFloorLevel(int nflLevel) throws android.os.RemoteException;
public int setLiveAudioPolling(boolean liveAudioPolling, int signalPollInterval) throws android.os.RemoteException;
public int setFMVolume(int volume) throws android.os.RemoteException;
public int setSnrThreshold(int snrThreshold) throws android.os.RemoteException;
public int cleanupFmService() throws android.os.RemoteException;
}
