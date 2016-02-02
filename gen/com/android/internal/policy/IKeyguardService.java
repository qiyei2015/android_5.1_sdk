/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/com/android/internal/policy/IKeyguardService.aidl
 */
package com.android.internal.policy;
public interface IKeyguardService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.policy.IKeyguardService
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.policy.IKeyguardService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.policy.IKeyguardService interface,
 * generating a proxy if needed.
 */
public static com.android.internal.policy.IKeyguardService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.policy.IKeyguardService))) {
return ((com.android.internal.policy.IKeyguardService)iin);
}
return new com.android.internal.policy.IKeyguardService.Stub.Proxy(obj);
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
case TRANSACTION_setOccluded:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setOccluded(_arg0);
return true;
}
case TRANSACTION_addStateMonitorCallback:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.policy.IKeyguardStateCallback _arg0;
_arg0 = com.android.internal.policy.IKeyguardStateCallback.Stub.asInterface(data.readStrongBinder());
this.addStateMonitorCallback(_arg0);
return true;
}
case TRANSACTION_verifyUnlock:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.policy.IKeyguardExitCallback _arg0;
_arg0 = com.android.internal.policy.IKeyguardExitCallback.Stub.asInterface(data.readStrongBinder());
this.verifyUnlock(_arg0);
return true;
}
case TRANSACTION_keyguardDone:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _arg1;
_arg1 = (0!=data.readInt());
this.keyguardDone(_arg0, _arg1);
return true;
}
case TRANSACTION_dismiss:
{
data.enforceInterface(DESCRIPTOR);
this.dismiss();
return true;
}
case TRANSACTION_onDreamingStarted:
{
data.enforceInterface(DESCRIPTOR);
this.onDreamingStarted();
return true;
}
case TRANSACTION_onDreamingStopped:
{
data.enforceInterface(DESCRIPTOR);
this.onDreamingStopped();
return true;
}
case TRANSACTION_onScreenTurnedOff:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onScreenTurnedOff(_arg0);
return true;
}
case TRANSACTION_onScreenTurnedOn:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.policy.IKeyguardShowCallback _arg0;
_arg0 = com.android.internal.policy.IKeyguardShowCallback.Stub.asInterface(data.readStrongBinder());
this.onScreenTurnedOn(_arg0);
return true;
}
case TRANSACTION_setKeyguardEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setKeyguardEnabled(_arg0);
return true;
}
case TRANSACTION_onSystemReady:
{
data.enforceInterface(DESCRIPTOR);
this.onSystemReady();
return true;
}
case TRANSACTION_doKeyguardTimeout:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.doKeyguardTimeout(_arg0);
return true;
}
case TRANSACTION_setCurrentUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setCurrentUser(_arg0);
return true;
}
case TRANSACTION_onBootCompleted:
{
data.enforceInterface(DESCRIPTOR);
this.onBootCompleted();
return true;
}
case TRANSACTION_startKeyguardExitAnimation:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
long _arg1;
_arg1 = data.readLong();
this.startKeyguardExitAnimation(_arg0, _arg1);
return true;
}
case TRANSACTION_onActivityDrawn:
{
data.enforceInterface(DESCRIPTOR);
this.onActivityDrawn();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.policy.IKeyguardService
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
     * Sets the Keyguard as occluded when a window dismisses the Keyguard with flag
     * FLAG_SHOW_ON_LOCK_SCREEN.
     *
     * @param isOccluded Whether the Keyguard is occluded by another window.
     */
@Override public void setOccluded(boolean isOccluded) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isOccluded)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setOccluded, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void addStateMonitorCallback(com.android.internal.policy.IKeyguardStateCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_addStateMonitorCallback, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void verifyUnlock(com.android.internal.policy.IKeyguardExitCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_verifyUnlock, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void keyguardDone(boolean authenticated, boolean wakeup) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((authenticated)?(1):(0)));
_data.writeInt(((wakeup)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_keyguardDone, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void dismiss() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_dismiss, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onDreamingStarted() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onDreamingStarted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onDreamingStopped() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onDreamingStopped, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onScreenTurnedOff(int reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(reason);
mRemote.transact(Stub.TRANSACTION_onScreenTurnedOff, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onScreenTurnedOn(com.android.internal.policy.IKeyguardShowCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_onScreenTurnedOn, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setKeyguardEnabled(boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setKeyguardEnabled, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onSystemReady() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onSystemReady, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void doKeyguardTimeout(android.os.Bundle options) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((options!=null)) {
_data.writeInt(1);
options.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_doKeyguardTimeout, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setCurrentUser(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_setCurrentUser, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onBootCompleted() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onBootCompleted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Notifies that the activity behind has now been drawn and it's safe to remove the wallpaper
     * and keyguard flag.
     *
     * @param startTime the start time of the animation in uptime milliseconds
     * @param fadeoutDuration the duration of the exit animation, in milliseconds
     */
@Override public void startKeyguardExitAnimation(long startTime, long fadeoutDuration) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(startTime);
_data.writeLong(fadeoutDuration);
mRemote.transact(Stub.TRANSACTION_startKeyguardExitAnimation, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Notifies the Keyguard that the activity that was starting has now been drawn and it's safe
     * to start the keyguard dismiss sequence.
     */
@Override public void onActivityDrawn() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onActivityDrawn, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_setOccluded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_addStateMonitorCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_verifyUnlock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_keyguardDone = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_dismiss = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onDreamingStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onDreamingStopped = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onScreenTurnedOff = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_onScreenTurnedOn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_setKeyguardEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_onSystemReady = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_doKeyguardTimeout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_setCurrentUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_onBootCompleted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_startKeyguardExitAnimation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_onActivityDrawn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
}
/**
     * Sets the Keyguard as occluded when a window dismisses the Keyguard with flag
     * FLAG_SHOW_ON_LOCK_SCREEN.
     *
     * @param isOccluded Whether the Keyguard is occluded by another window.
     */
public void setOccluded(boolean isOccluded) throws android.os.RemoteException;
public void addStateMonitorCallback(com.android.internal.policy.IKeyguardStateCallback callback) throws android.os.RemoteException;
public void verifyUnlock(com.android.internal.policy.IKeyguardExitCallback callback) throws android.os.RemoteException;
public void keyguardDone(boolean authenticated, boolean wakeup) throws android.os.RemoteException;
public void dismiss() throws android.os.RemoteException;
public void onDreamingStarted() throws android.os.RemoteException;
public void onDreamingStopped() throws android.os.RemoteException;
public void onScreenTurnedOff(int reason) throws android.os.RemoteException;
public void onScreenTurnedOn(com.android.internal.policy.IKeyguardShowCallback callback) throws android.os.RemoteException;
public void setKeyguardEnabled(boolean enabled) throws android.os.RemoteException;
public void onSystemReady() throws android.os.RemoteException;
public void doKeyguardTimeout(android.os.Bundle options) throws android.os.RemoteException;
public void setCurrentUser(int userId) throws android.os.RemoteException;
public void onBootCompleted() throws android.os.RemoteException;
/**
     * Notifies that the activity behind has now been drawn and it's safe to remove the wallpaper
     * and keyguard flag.
     *
     * @param startTime the start time of the animation in uptime milliseconds
     * @param fadeoutDuration the duration of the exit animation, in milliseconds
     */
public void startKeyguardExitAnimation(long startTime, long fadeoutDuration) throws android.os.RemoteException;
/**
     * Notifies the Keyguard that the activity that was starting has now been drawn and it's safe
     * to start the keyguard dismiss sequence.
     */
public void onActivityDrawn() throws android.os.RemoteException;
}
