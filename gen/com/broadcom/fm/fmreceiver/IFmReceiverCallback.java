/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/external/broadcom_bplus/frameworks/api/bt/src/com/broadcom/fm/fmreceiver/IFmReceiverCallback.aidl
 */
package com.broadcom.fm.fmreceiver;
/**
 * Callback interface for applications to receive events from the FM radio service.
 * @hide
 */
public interface IFmReceiverCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.broadcom.fm.fmreceiver.IFmReceiverCallback
{
private static final java.lang.String DESCRIPTOR = "com.broadcom.fm.fmreceiver.IFmReceiverCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.broadcom.fm.fmreceiver.IFmReceiverCallback interface,
 * generating a proxy if needed.
 */
public static com.broadcom.fm.fmreceiver.IFmReceiverCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.broadcom.fm.fmreceiver.IFmReceiverCallback))) {
return ((com.broadcom.fm.fmreceiver.IFmReceiverCallback)iin);
}
return new com.broadcom.fm.fmreceiver.IFmReceiverCallback.Stub.Proxy(obj);
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
case TRANSACTION_onStatusEvent:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
boolean _arg3;
_arg3 = (0!=data.readInt());
int _arg4;
_arg4 = data.readInt();
java.lang.String _arg5;
_arg5 = data.readString();
java.lang.String _arg6;
_arg6 = data.readString();
java.lang.String _arg7;
_arg7 = data.readString();
boolean _arg8;
_arg8 = (0!=data.readInt());
this.onStatusEvent(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8);
reply.writeNoException();
return true;
}
case TRANSACTION_onSeekCompleteEvent:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
boolean _arg3;
_arg3 = (0!=data.readInt());
this.onSeekCompleteEvent(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_onRdsModeEvent:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onRdsModeEvent(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onRdsDataEvent:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
this.onRdsDataEvent(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_onAudioModeEvent:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onAudioModeEvent(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onAudioPathEvent:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onAudioPathEvent(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onWorldRegionEvent:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onWorldRegionEvent(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onEstimateNflEvent:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onEstimateNflEvent(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onLiveAudioQualityEvent:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onLiveAudioQualityEvent(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onVolumeEvent:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onVolumeEvent(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.broadcom.fm.fmreceiver.IFmReceiverCallback
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
/* The FM Receiver callback function list. *//**
     * Callback for a radio status event.
     * @param freq the radio frequency
     * @param rssi the received signal strength indicator
     * @param snr the received signal-to-noise ratio(SNR) value
     * @param radioIsOn true if the radio is turned on
     * @param rdsProgramType the RDS program type
     * @param rdsProgramService the RDS program service
     * @param rdsProgramText the RDS radio text
     * @param rdsProgramTypeName the RDS program type name
     * @param isMute if true, indicates the radio is muted
     */
@Override public void onStatusEvent(int freq, int rssi, int snr, boolean radioIsOn, int rdsProgramType, java.lang.String rdsProgramService, java.lang.String rdsRadioText, java.lang.String rdsProgramTypeName, boolean isMute) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(freq);
_data.writeInt(rssi);
_data.writeInt(snr);
_data.writeInt(((radioIsOn)?(1):(0)));
_data.writeInt(rdsProgramType);
_data.writeString(rdsProgramService);
_data.writeString(rdsRadioText);
_data.writeString(rdsProgramTypeName);
_data.writeInt(((isMute)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onStatusEvent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Callback for a radio seek complete event.
     * @param freq the radio frequency
     * @param rssi the received signal strength indicator
     * @param snr the received signal-to-noise ratio(SNR) value
     * @param seeksuccess if true, indicates the radio seek succeeded
     */
@Override public void onSeekCompleteEvent(int freq, int rssi, int snr, boolean seeksuccess) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(freq);
_data.writeInt(rssi);
_data.writeInt(snr);
_data.writeInt(((seeksuccess)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onSeekCompleteEvent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Callback for a RDS mode event
     * @param rdsMode the RDS Mode
     * @param alternateFreqHopEnabled if true, alternative frequency hop is enabled
     */
@Override public void onRdsModeEvent(int rdsMode, int alternateFreqHopEnabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(rdsMode);
_data.writeInt(alternateFreqHopEnabled);
mRemote.transact(Stub.TRANSACTION_onRdsModeEvent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Callback for a RDS data event
     * @param rdsMode the RDS Mode
     * @param alternateFreqHopEnabled if true, alternative frequency hop is enabled
     */
@Override public void onRdsDataEvent(int rdsDataType, int rdsIndex, java.lang.String rdsText) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(rdsDataType);
_data.writeInt(rdsIndex);
_data.writeString(rdsText);
mRemote.transact(Stub.TRANSACTION_onRdsDataEvent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Callback for an audio mode event
     * @param audioMode the audio mode
     */
@Override public void onAudioModeEvent(int audioMode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(audioMode);
mRemote.transact(Stub.TRANSACTION_onAudioModeEvent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* Handle audio path event. */
@Override public void onAudioPathEvent(int audioPath) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(audioPath);
mRemote.transact(Stub.TRANSACTION_onAudioPathEvent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Callback for world region mode event
     * @param worldRegion the world region
     */
@Override public void onWorldRegionEvent(int worldRegion) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(worldRegion);
mRemote.transact(Stub.TRANSACTION_onWorldRegionEvent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Callback for estimate noise floor event
     * @param nfl the noise floor
     */
@Override public void onEstimateNflEvent(int nfl) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nfl);
mRemote.transact(Stub.TRANSACTION_onEstimateNflEvent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Callback for live audio quality event
     * @param rssi the received signal strength indicator
     * @param snr the received signal-to-noise ratio(SNR) value
     */
@Override public void onLiveAudioQualityEvent(int rssi, int snr) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(rssi);
_data.writeInt(snr);
mRemote.transact(Stub.TRANSACTION_onLiveAudioQualityEvent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Callback for FM volume event
     * @param status equal to 0 if successful. Otherwise returns a non-zero error code.
     * @param volume range from 0 to 0x100
     */
@Override public void onVolumeEvent(int status, int volume) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
_data.writeInt(volume);
mRemote.transact(Stub.TRANSACTION_onVolumeEvent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onStatusEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onSeekCompleteEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onRdsModeEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onRdsDataEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onAudioModeEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onAudioPathEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onWorldRegionEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onEstimateNflEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_onLiveAudioQualityEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_onVolumeEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
}
/* The FM Receiver callback function list. *//**
     * Callback for a radio status event.
     * @param freq the radio frequency
     * @param rssi the received signal strength indicator
     * @param snr the received signal-to-noise ratio(SNR) value
     * @param radioIsOn true if the radio is turned on
     * @param rdsProgramType the RDS program type
     * @param rdsProgramService the RDS program service
     * @param rdsProgramText the RDS radio text
     * @param rdsProgramTypeName the RDS program type name
     * @param isMute if true, indicates the radio is muted
     */
public void onStatusEvent(int freq, int rssi, int snr, boolean radioIsOn, int rdsProgramType, java.lang.String rdsProgramService, java.lang.String rdsRadioText, java.lang.String rdsProgramTypeName, boolean isMute) throws android.os.RemoteException;
/**
     * Callback for a radio seek complete event.
     * @param freq the radio frequency
     * @param rssi the received signal strength indicator
     * @param snr the received signal-to-noise ratio(SNR) value
     * @param seeksuccess if true, indicates the radio seek succeeded
     */
public void onSeekCompleteEvent(int freq, int rssi, int snr, boolean seeksuccess) throws android.os.RemoteException;
/**
     * Callback for a RDS mode event
     * @param rdsMode the RDS Mode
     * @param alternateFreqHopEnabled if true, alternative frequency hop is enabled
     */
public void onRdsModeEvent(int rdsMode, int alternateFreqHopEnabled) throws android.os.RemoteException;
/**
     * Callback for a RDS data event
     * @param rdsMode the RDS Mode
     * @param alternateFreqHopEnabled if true, alternative frequency hop is enabled
     */
public void onRdsDataEvent(int rdsDataType, int rdsIndex, java.lang.String rdsText) throws android.os.RemoteException;
/**
     * Callback for an audio mode event
     * @param audioMode the audio mode
     */
public void onAudioModeEvent(int audioMode) throws android.os.RemoteException;
/* Handle audio path event. */
public void onAudioPathEvent(int audioPath) throws android.os.RemoteException;
/**
     * Callback for world region mode event
     * @param worldRegion the world region
     */
public void onWorldRegionEvent(int worldRegion) throws android.os.RemoteException;
/**
     * Callback for estimate noise floor event
     * @param nfl the noise floor
     */
public void onEstimateNflEvent(int nfl) throws android.os.RemoteException;
/**
     * Callback for live audio quality event
     * @param rssi the received signal strength indicator
     * @param snr the received signal-to-noise ratio(SNR) value
     */
public void onLiveAudioQualityEvent(int rssi, int snr) throws android.os.RemoteException;
/**
     * Callback for FM volume event
     * @param status equal to 0 if successful. Otherwise returns a non-zero error code.
     * @param volume range from 0 to 0x100
     */
public void onVolumeEvent(int status, int volume) throws android.os.RemoteException;
}
