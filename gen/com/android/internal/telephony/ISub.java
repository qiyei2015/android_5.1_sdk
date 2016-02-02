/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/telephony/java/com/android/internal/telephony/ISub.aidl
 */
package com.android.internal.telephony;
public interface ISub extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.ISub
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.ISub";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.telephony.ISub interface,
 * generating a proxy if needed.
 */
public static com.android.internal.telephony.ISub asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.telephony.ISub))) {
return ((com.android.internal.telephony.ISub)iin);
}
return new com.android.internal.telephony.ISub.Stub.Proxy(obj);
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
case TRANSACTION_getAllSubInfoList:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.telephony.SubscriptionInfo> _result = this.getAllSubInfoList();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getAllSubInfoCount:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getAllSubInfoCount();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getActiveSubscriptionInfo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.telephony.SubscriptionInfo _result = this.getActiveSubscriptionInfo(_arg0);
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
case TRANSACTION_getActiveSubscriptionInfoForIccId:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.telephony.SubscriptionInfo _result = this.getActiveSubscriptionInfoForIccId(_arg0);
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
case TRANSACTION_getActiveSubscriptionInfoForSimSlotIndex:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.telephony.SubscriptionInfo _result = this.getActiveSubscriptionInfoForSimSlotIndex(_arg0);
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
case TRANSACTION_getActiveSubscriptionInfoList:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.telephony.SubscriptionInfo> _result = this.getActiveSubscriptionInfoList();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getActiveSubInfoCount:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getActiveSubInfoCount();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getActiveSubInfoCountMax:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getActiveSubInfoCountMax();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_addSubInfoRecord:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _result = this.addSubInfoRecord(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setIconTint:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _result = this.setIconTint(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setDisplayName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _result = this.setDisplayName(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setDisplayNameUsingSrc:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
long _arg2;
_arg2 = data.readLong();
int _result = this.setDisplayNameUsingSrc(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setDisplayNumber:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _result = this.setDisplayNumber(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setDataRoaming:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _result = this.setDataRoaming(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getSlotId:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getSlotId(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getSubId:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _result = this.getSubId(_arg0);
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_getDefaultSubId:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getDefaultSubId();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_clearSubInfo:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.clearSubInfo();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getPhoneId:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getPhoneId(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getDefaultDataSubId:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getDefaultDataSubId();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setDefaultDataSubId:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setDefaultDataSubId(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getDefaultVoiceSubId:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getDefaultVoiceSubId();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setDefaultVoiceSubId:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setDefaultVoiceSubId(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getDefaultSmsSubId:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getDefaultSmsSubId();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setDefaultSmsSubId:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setDefaultSmsSubId(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_clearDefaultsForInactiveSubIds:
{
data.enforceInterface(DESCRIPTOR);
this.clearDefaultsForInactiveSubIds();
reply.writeNoException();
return true;
}
case TRANSACTION_getActiveSubIdList:
{
data.enforceInterface(DESCRIPTOR);
int[] _result = this.getActiveSubIdList();
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_getSimStateForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getSimStateForSubscriber(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.telephony.ISub
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
     * @return a list of all subscriptions in the database, this includes
     * all subscriptions that have been seen.
     */
@Override public java.util.List<android.telephony.SubscriptionInfo> getAllSubInfoList() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.telephony.SubscriptionInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAllSubInfoList, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.telephony.SubscriptionInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @return the count of all subscriptions in the database, this includes
     * all subscriptions that have been seen.
     */
@Override public int getAllSubInfoCount() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAllSubInfoCount, _data, _reply, 0);
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
     * Get the active SubscriptionInfo with the subId key
     * @param subId The unique SubscriptionInfo key in database
     * @return SubscriptionInfo, maybe null if its not active
     */
@Override public android.telephony.SubscriptionInfo getActiveSubscriptionInfo(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.telephony.SubscriptionInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_getActiveSubscriptionInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.telephony.SubscriptionInfo.CREATOR.createFromParcel(_reply);
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
     * Get the active SubscriptionInfo associated with the iccId
     * @param iccId the IccId of SIM card
     * @return SubscriptionInfo, maybe null if its not active
     */
@Override public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForIccId(java.lang.String iccId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.telephony.SubscriptionInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iccId);
mRemote.transact(Stub.TRANSACTION_getActiveSubscriptionInfoForIccId, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.telephony.SubscriptionInfo.CREATOR.createFromParcel(_reply);
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
     * Get the active SubscriptionInfo associated with the slotIdx
     * @param slotIdx the slot which the subscription is inserted
     * @return SubscriptionInfo, maybe null if its not active
     */
@Override public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForSimSlotIndex(int slotIdx) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.telephony.SubscriptionInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotIdx);
mRemote.transact(Stub.TRANSACTION_getActiveSubscriptionInfoForSimSlotIndex, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.telephony.SubscriptionInfo.CREATOR.createFromParcel(_reply);
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
     * Get the SubscriptionInfo(s) of the active subscriptions. The records will be sorted
     * by {@link SubscriptionInfo#getSimSlotIndex} then by {@link SubscriptionInfo#getSubscriptionId}.
     *
     * @return Sorted list of the currently {@link SubscriptionInfo} records available on the device.
     * <ul>
     * <li>
     * If null is returned the current state is unknown but if a {@link OnSubscriptionsChangedListener}
     * has been registered {@link OnSubscriptionsChangedListener#onSubscriptionsChanged} will be
     * invoked in the future.
     * </li>
     * <li>
     * If the list is empty then there are no {@link SubscriptionInfo} records currently available.
     * </li>
     * <li>
     * if the list is non-empty the list is sorted by {@link SubscriptionInfo#getSimSlotIndex}
     * then by {@link SubscriptionInfo#getSubscriptionId}.
     * </li>
     * </ul>
     */
@Override public java.util.List<android.telephony.SubscriptionInfo> getActiveSubscriptionInfoList() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.telephony.SubscriptionInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActiveSubscriptionInfoList, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.telephony.SubscriptionInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @return the number of active subscriptions
     */
@Override public int getActiveSubInfoCount() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActiveSubInfoCount, _data, _reply, 0);
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
     * @return the maximum number of subscriptions this device will support at any one time.
     */
@Override public int getActiveSubInfoCountMax() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActiveSubInfoCountMax, _data, _reply, 0);
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
     * Add a new SubscriptionInfo to subinfo database if needed
     * @param iccId the IccId of the SIM card
     * @param slotId the slot which the SIM is inserted
     * @return the URL of the newly created row or the updated row
     */
@Override public int addSubInfoRecord(java.lang.String iccId, int slotId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iccId);
_data.writeInt(slotId);
mRemote.transact(Stub.TRANSACTION_addSubInfoRecord, _data, _reply, 0);
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
     * Set SIM icon tint color by simInfo index
     * @param tint the icon tint color of the SIM
     * @param subId the unique SubscriptionInfo index in database
     * @return the number of records updated
     */
@Override public int setIconTint(int tint, int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(tint);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_setIconTint, _data, _reply, 0);
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
     * Set display name by simInfo index
     * @param displayName the display name of SIM card
     * @param subId the unique SubscriptionInfo index in database
     * @return the number of records updated
     */
@Override public int setDisplayName(java.lang.String displayName, int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(displayName);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_setDisplayName, _data, _reply, 0);
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
     * Set display name by simInfo index with name source
     * @param displayName the display name of SIM card
     * @param subId the unique SubscriptionInfo index in database
     * @param nameSource, 0: DEFAULT_SOURCE, 1: SIM_SOURCE, 2: USER_INPUT
     * @return the number of records updated
     */
@Override public int setDisplayNameUsingSrc(java.lang.String displayName, int subId, long nameSource) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(displayName);
_data.writeInt(subId);
_data.writeLong(nameSource);
mRemote.transact(Stub.TRANSACTION_setDisplayNameUsingSrc, _data, _reply, 0);
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
     * Set phone number by subId
     * @param number the phone number of the SIM
     * @param subId the unique SubscriptionInfo index in database
     * @return the number of records updated
     */
@Override public int setDisplayNumber(java.lang.String number, int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(number);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_setDisplayNumber, _data, _reply, 0);
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
     * Set data roaming by simInfo index
     * @param roaming 0:Don't allow data when roaming, 1:Allow data when roaming
     * @param subId the unique SubscriptionInfo index in database
     * @return the number of records updated
     */
@Override public int setDataRoaming(int roaming, int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(roaming);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_setDataRoaming, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getSlotId(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_getSlotId, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int[] getSubId(int slotId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
mRemote.transact(Stub.TRANSACTION_getSubId, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getDefaultSubId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDefaultSubId, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int clearSubInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_clearSubInfo, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getPhoneId(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_getPhoneId, _data, _reply, 0);
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
     * Get the default data subscription
     * @return Id of the data subscription
     */
@Override public int getDefaultDataSubId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDefaultDataSubId, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setDefaultDataSubId(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_setDefaultDataSubId, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getDefaultVoiceSubId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDefaultVoiceSubId, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setDefaultVoiceSubId(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_setDefaultVoiceSubId, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getDefaultSmsSubId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDefaultSmsSubId, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setDefaultSmsSubId(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_setDefaultSmsSubId, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearDefaultsForInactiveSubIds() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_clearDefaultsForInactiveSubIds, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int[] getActiveSubIdList() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActiveSubIdList, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Get the SIM state for the subscriber
     * @return SIM state as the ordinal of IccCardConstants.State
     */
@Override public int getSimStateForSubscriber(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_getSimStateForSubscriber, _data, _reply, 0);
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
static final int TRANSACTION_getAllSubInfoList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getAllSubInfoCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getActiveSubscriptionInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getActiveSubscriptionInfoForIccId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getActiveSubscriptionInfoForSimSlotIndex = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getActiveSubscriptionInfoList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getActiveSubInfoCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getActiveSubInfoCountMax = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_addSubInfoRecord = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_setIconTint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_setDisplayName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_setDisplayNameUsingSrc = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_setDisplayNumber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_setDataRoaming = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_getSlotId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_getDefaultSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_clearSubInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_getPhoneId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_getDefaultDataSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_setDefaultDataSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_getDefaultVoiceSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_setDefaultVoiceSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_getDefaultSmsSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_setDefaultSmsSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_clearDefaultsForInactiveSubIds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_getActiveSubIdList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_getSimStateForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
}
/**
     * @return a list of all subscriptions in the database, this includes
     * all subscriptions that have been seen.
     */
public java.util.List<android.telephony.SubscriptionInfo> getAllSubInfoList() throws android.os.RemoteException;
/**
     * @return the count of all subscriptions in the database, this includes
     * all subscriptions that have been seen.
     */
public int getAllSubInfoCount() throws android.os.RemoteException;
/**
     * Get the active SubscriptionInfo with the subId key
     * @param subId The unique SubscriptionInfo key in database
     * @return SubscriptionInfo, maybe null if its not active
     */
public android.telephony.SubscriptionInfo getActiveSubscriptionInfo(int subId) throws android.os.RemoteException;
/**
     * Get the active SubscriptionInfo associated with the iccId
     * @param iccId the IccId of SIM card
     * @return SubscriptionInfo, maybe null if its not active
     */
public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForIccId(java.lang.String iccId) throws android.os.RemoteException;
/**
     * Get the active SubscriptionInfo associated with the slotIdx
     * @param slotIdx the slot which the subscription is inserted
     * @return SubscriptionInfo, maybe null if its not active
     */
public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForSimSlotIndex(int slotIdx) throws android.os.RemoteException;
/**
     * Get the SubscriptionInfo(s) of the active subscriptions. The records will be sorted
     * by {@link SubscriptionInfo#getSimSlotIndex} then by {@link SubscriptionInfo#getSubscriptionId}.
     *
     * @return Sorted list of the currently {@link SubscriptionInfo} records available on the device.
     * <ul>
     * <li>
     * If null is returned the current state is unknown but if a {@link OnSubscriptionsChangedListener}
     * has been registered {@link OnSubscriptionsChangedListener#onSubscriptionsChanged} will be
     * invoked in the future.
     * </li>
     * <li>
     * If the list is empty then there are no {@link SubscriptionInfo} records currently available.
     * </li>
     * <li>
     * if the list is non-empty the list is sorted by {@link SubscriptionInfo#getSimSlotIndex}
     * then by {@link SubscriptionInfo#getSubscriptionId}.
     * </li>
     * </ul>
     */
public java.util.List<android.telephony.SubscriptionInfo> getActiveSubscriptionInfoList() throws android.os.RemoteException;
/**
     * @return the number of active subscriptions
     */
public int getActiveSubInfoCount() throws android.os.RemoteException;
/**
     * @return the maximum number of subscriptions this device will support at any one time.
     */
public int getActiveSubInfoCountMax() throws android.os.RemoteException;
/**
     * Add a new SubscriptionInfo to subinfo database if needed
     * @param iccId the IccId of the SIM card
     * @param slotId the slot which the SIM is inserted
     * @return the URL of the newly created row or the updated row
     */
public int addSubInfoRecord(java.lang.String iccId, int slotId) throws android.os.RemoteException;
/**
     * Set SIM icon tint color by simInfo index
     * @param tint the icon tint color of the SIM
     * @param subId the unique SubscriptionInfo index in database
     * @return the number of records updated
     */
public int setIconTint(int tint, int subId) throws android.os.RemoteException;
/**
     * Set display name by simInfo index
     * @param displayName the display name of SIM card
     * @param subId the unique SubscriptionInfo index in database
     * @return the number of records updated
     */
public int setDisplayName(java.lang.String displayName, int subId) throws android.os.RemoteException;
/**
     * Set display name by simInfo index with name source
     * @param displayName the display name of SIM card
     * @param subId the unique SubscriptionInfo index in database
     * @param nameSource, 0: DEFAULT_SOURCE, 1: SIM_SOURCE, 2: USER_INPUT
     * @return the number of records updated
     */
public int setDisplayNameUsingSrc(java.lang.String displayName, int subId, long nameSource) throws android.os.RemoteException;
/**
     * Set phone number by subId
     * @param number the phone number of the SIM
     * @param subId the unique SubscriptionInfo index in database
     * @return the number of records updated
     */
public int setDisplayNumber(java.lang.String number, int subId) throws android.os.RemoteException;
/**
     * Set data roaming by simInfo index
     * @param roaming 0:Don't allow data when roaming, 1:Allow data when roaming
     * @param subId the unique SubscriptionInfo index in database
     * @return the number of records updated
     */
public int setDataRoaming(int roaming, int subId) throws android.os.RemoteException;
public int getSlotId(int subId) throws android.os.RemoteException;
public int[] getSubId(int slotId) throws android.os.RemoteException;
public int getDefaultSubId() throws android.os.RemoteException;
public int clearSubInfo() throws android.os.RemoteException;
public int getPhoneId(int subId) throws android.os.RemoteException;
/**
     * Get the default data subscription
     * @return Id of the data subscription
     */
public int getDefaultDataSubId() throws android.os.RemoteException;
public void setDefaultDataSubId(int subId) throws android.os.RemoteException;
public int getDefaultVoiceSubId() throws android.os.RemoteException;
public void setDefaultVoiceSubId(int subId) throws android.os.RemoteException;
public int getDefaultSmsSubId() throws android.os.RemoteException;
public void setDefaultSmsSubId(int subId) throws android.os.RemoteException;
public void clearDefaultsForInactiveSubIds() throws android.os.RemoteException;
public int[] getActiveSubIdList() throws android.os.RemoteException;
/**
     * Get the SIM state for the subscriber
     * @return SIM state as the ordinal of IccCardConstants.State
     */
public int getSimStateForSubscriber(int subId) throws android.os.RemoteException;
}
