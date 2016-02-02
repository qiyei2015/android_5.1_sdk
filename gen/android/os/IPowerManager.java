/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/os/IPowerManager.aidl
 */
package android.os;
/** @hide */
public interface IPowerManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.IPowerManager
{
private static final java.lang.String DESCRIPTOR = "android.os.IPowerManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.IPowerManager interface,
 * generating a proxy if needed.
 */
public static android.os.IPowerManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.IPowerManager))) {
return ((android.os.IPowerManager)iin);
}
return new android.os.IPowerManager.Stub.Proxy(obj);
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
case TRANSACTION_acquireWakeLock:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
android.os.WorkSource _arg4;
if ((0!=data.readInt())) {
_arg4 = android.os.WorkSource.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
java.lang.String _arg5;
_arg5 = data.readString();
this.acquireWakeLock(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_acquireWakeLockWithUid:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
int _arg4;
_arg4 = data.readInt();
this.acquireWakeLockWithUid(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_releaseWakeLock:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
this.releaseWakeLock(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_updateWakeLockUids:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int[] _arg1;
_arg1 = data.createIntArray();
this.updateWakeLockUids(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_powerHint:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.powerHint(_arg0, _arg1);
return true;
}
case TRANSACTION_updateWakeLockWorkSource:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.os.WorkSource _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.WorkSource.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String _arg2;
_arg2 = data.readString();
this.updateWakeLockWorkSource(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_isWakeLockLevelSupported:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isWakeLockLevelSupported(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_userActivity:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.userActivity(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_wakeUp:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.wakeUp(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_goToSleep:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.goToSleep(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_nap:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.nap(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isInteractive:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isInteractive();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isPowerSaveMode:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isPowerSaveMode();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setPowerSaveMode:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _result = this.setPowerSaveMode(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_reboot:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
java.lang.String _arg1;
_arg1 = data.readString();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.reboot(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_shutdown:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _arg1;
_arg1 = (0!=data.readInt());
this.shutdown(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_crash:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.crash(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setStayOnSetting:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setStayOnSetting(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_boostScreenBrightness:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.boostScreenBrightness(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setTemporaryScreenBrightnessSettingOverride:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setTemporaryScreenBrightnessSettingOverride(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setTemporaryScreenAutoBrightnessAdjustmentSettingOverride:
{
data.enforceInterface(DESCRIPTOR);
float _arg0;
_arg0 = data.readFloat();
this.setTemporaryScreenAutoBrightnessAdjustmentSettingOverride(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setAttentionLight:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _arg1;
_arg1 = data.readInt();
this.setAttentionLight(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_cpuBoost:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.cpuBoost(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setPerformanceMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setPerformanceMode(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.IPowerManager
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
// WARNING: The first five methods must remain the first five methods because their
// transaction numbers must not change unless IPowerManager.cpp is also updated.

@Override public void acquireWakeLock(android.os.IBinder lock, int flags, java.lang.String tag, java.lang.String packageName, android.os.WorkSource ws, java.lang.String historyTag) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(lock);
_data.writeInt(flags);
_data.writeString(tag);
_data.writeString(packageName);
if ((ws!=null)) {
_data.writeInt(1);
ws.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(historyTag);
mRemote.transact(Stub.TRANSACTION_acquireWakeLock, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void acquireWakeLockWithUid(android.os.IBinder lock, int flags, java.lang.String tag, java.lang.String packageName, int uidtoblame) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(lock);
_data.writeInt(flags);
_data.writeString(tag);
_data.writeString(packageName);
_data.writeInt(uidtoblame);
mRemote.transact(Stub.TRANSACTION_acquireWakeLockWithUid, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void releaseWakeLock(android.os.IBinder lock, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(lock);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_releaseWakeLock, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void updateWakeLockUids(android.os.IBinder lock, int[] uids) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(lock);
_data.writeIntArray(uids);
mRemote.transact(Stub.TRANSACTION_updateWakeLockUids, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void powerHint(int hintId, int data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(hintId);
_data.writeInt(data);
mRemote.transact(Stub.TRANSACTION_powerHint, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void updateWakeLockWorkSource(android.os.IBinder lock, android.os.WorkSource ws, java.lang.String historyTag) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(lock);
if ((ws!=null)) {
_data.writeInt(1);
ws.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(historyTag);
mRemote.transact(Stub.TRANSACTION_updateWakeLockWorkSource, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isWakeLockLevelSupported(int level) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(level);
mRemote.transact(Stub.TRANSACTION_isWakeLockLevelSupported, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void userActivity(long time, int event, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(time);
_data.writeInt(event);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_userActivity, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void wakeUp(long time) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(time);
mRemote.transact(Stub.TRANSACTION_wakeUp, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void goToSleep(long time, int reason, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(time);
_data.writeInt(reason);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_goToSleep, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void nap(long time) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(time);
mRemote.transact(Stub.TRANSACTION_nap, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isInteractive() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isInteractive, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isPowerSaveMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isPowerSaveMode, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setPowerSaveMode(boolean mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((mode)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setPowerSaveMode, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void reboot(boolean confirm, java.lang.String reason, boolean wait) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((confirm)?(1):(0)));
_data.writeString(reason);
_data.writeInt(((wait)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_reboot, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void shutdown(boolean confirm, boolean wait) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((confirm)?(1):(0)));
_data.writeInt(((wait)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_shutdown, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void crash(java.lang.String message) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(message);
mRemote.transact(Stub.TRANSACTION_crash, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setStayOnSetting(int val) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(val);
mRemote.transact(Stub.TRANSACTION_setStayOnSetting, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void boostScreenBrightness(long time) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(time);
mRemote.transact(Stub.TRANSACTION_boostScreenBrightness, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// temporarily overrides the screen brightness settings to allow the user to
// see the effect of a settings change without applying it immediately

@Override public void setTemporaryScreenBrightnessSettingOverride(int brightness) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(brightness);
mRemote.transact(Stub.TRANSACTION_setTemporaryScreenBrightnessSettingOverride, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setTemporaryScreenAutoBrightnessAdjustmentSettingOverride(float adj) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeFloat(adj);
mRemote.transact(Stub.TRANSACTION_setTemporaryScreenAutoBrightnessAdjustmentSettingOverride, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// sets the attention light (used by phone app only)

@Override public void setAttentionLight(boolean on, int color) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((on)?(1):(0)));
_data.writeInt(color);
mRemote.transact(Stub.TRANSACTION_setAttentionLight, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void cpuBoost(int duration) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(duration);
mRemote.transact(Stub.TRANSACTION_cpuBoost, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setPerformanceMode(int mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(mode);
mRemote.transact(Stub.TRANSACTION_setPerformanceMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_acquireWakeLock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_acquireWakeLockWithUid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_releaseWakeLock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_updateWakeLockUids = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_powerHint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_updateWakeLockWorkSource = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_isWakeLockLevelSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_userActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_wakeUp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_goToSleep = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_nap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_isInteractive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_isPowerSaveMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_setPowerSaveMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_reboot = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_shutdown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_crash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_setStayOnSetting = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_boostScreenBrightness = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_setTemporaryScreenBrightnessSettingOverride = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_setTemporaryScreenAutoBrightnessAdjustmentSettingOverride = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_setAttentionLight = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_cpuBoost = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_setPerformanceMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
}
// WARNING: The first five methods must remain the first five methods because their
// transaction numbers must not change unless IPowerManager.cpp is also updated.

public void acquireWakeLock(android.os.IBinder lock, int flags, java.lang.String tag, java.lang.String packageName, android.os.WorkSource ws, java.lang.String historyTag) throws android.os.RemoteException;
public void acquireWakeLockWithUid(android.os.IBinder lock, int flags, java.lang.String tag, java.lang.String packageName, int uidtoblame) throws android.os.RemoteException;
public void releaseWakeLock(android.os.IBinder lock, int flags) throws android.os.RemoteException;
public void updateWakeLockUids(android.os.IBinder lock, int[] uids) throws android.os.RemoteException;
public void powerHint(int hintId, int data) throws android.os.RemoteException;
public void updateWakeLockWorkSource(android.os.IBinder lock, android.os.WorkSource ws, java.lang.String historyTag) throws android.os.RemoteException;
public boolean isWakeLockLevelSupported(int level) throws android.os.RemoteException;
public void userActivity(long time, int event, int flags) throws android.os.RemoteException;
public void wakeUp(long time) throws android.os.RemoteException;
public void goToSleep(long time, int reason, int flags) throws android.os.RemoteException;
public void nap(long time) throws android.os.RemoteException;
public boolean isInteractive() throws android.os.RemoteException;
public boolean isPowerSaveMode() throws android.os.RemoteException;
public boolean setPowerSaveMode(boolean mode) throws android.os.RemoteException;
public void reboot(boolean confirm, java.lang.String reason, boolean wait) throws android.os.RemoteException;
public void shutdown(boolean confirm, boolean wait) throws android.os.RemoteException;
public void crash(java.lang.String message) throws android.os.RemoteException;
public void setStayOnSetting(int val) throws android.os.RemoteException;
public void boostScreenBrightness(long time) throws android.os.RemoteException;
// temporarily overrides the screen brightness settings to allow the user to
// see the effect of a settings change without applying it immediately

public void setTemporaryScreenBrightnessSettingOverride(int brightness) throws android.os.RemoteException;
public void setTemporaryScreenAutoBrightnessAdjustmentSettingOverride(float adj) throws android.os.RemoteException;
// sets the attention light (used by phone app only)

public void setAttentionLight(boolean on, int color) throws android.os.RemoteException;
public void cpuBoost(int duration) throws android.os.RemoteException;
public void setPerformanceMode(int mode) throws android.os.RemoteException;
}
