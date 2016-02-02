/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/telephony/java/com/android/internal/telephony/ISms.aidl
 */
package com.android.internal.telephony;
/** Interface for applications to access the ICC phone book.
 *
 * <p>The following code snippet demonstrates a static method to
 * retrieve the ISms interface from Android:</p>
 * <pre>private static ISms getSmsInterface()
            throws DeadObjectException {
    IServiceManager sm = ServiceManagerNative.getDefault();
    ISms ss;
    ss = ISms.Stub.asInterface(sm.getService("isms"));
    return ss;
}
 * </pre>
 */
public interface ISms extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.ISms
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.ISms";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.telephony.ISms interface,
 * generating a proxy if needed.
 */
public static com.android.internal.telephony.ISms asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.telephony.ISms))) {
return ((com.android.internal.telephony.ISms)iin);
}
return new com.android.internal.telephony.ISms.Stub.Proxy(obj);
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
case TRANSACTION_getAllMessagesFromIccEf:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.List<com.android.internal.telephony.SmsRawData> _result = this.getAllMessagesFromIccEf(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getAllMessagesFromIccEfForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.util.List<com.android.internal.telephony.SmsRawData> _result = this.getAllMessagesFromIccEfForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_updateMessageOnIccEf:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
byte[] _arg3;
_arg3 = data.createByteArray();
boolean _result = this.updateMessageOnIccEf(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_updateMessageOnIccEfForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
byte[] _arg4;
_arg4 = data.createByteArray();
boolean _result = this.updateMessageOnIccEfForSubscriber(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_copyMessageToIccEf:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
byte[] _arg2;
_arg2 = data.createByteArray();
byte[] _arg3;
_arg3 = data.createByteArray();
boolean _result = this.copyMessageToIccEf(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_copyMessageToIccEfForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
byte[] _arg3;
_arg3 = data.createByteArray();
byte[] _arg4;
_arg4 = data.createByteArray();
boolean _result = this.copyMessageToIccEfForSubscriber(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_sendData:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
byte[] _arg4;
_arg4 = data.createByteArray();
android.app.PendingIntent _arg5;
if ((0!=data.readInt())) {
_arg5 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg5 = null;
}
android.app.PendingIntent _arg6;
if ((0!=data.readInt())) {
_arg6 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg6 = null;
}
this.sendData(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
return true;
}
case TRANSACTION_sendDataForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
int _arg4;
_arg4 = data.readInt();
byte[] _arg5;
_arg5 = data.createByteArray();
android.app.PendingIntent _arg6;
if ((0!=data.readInt())) {
_arg6 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg6 = null;
}
android.app.PendingIntent _arg7;
if ((0!=data.readInt())) {
_arg7 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg7 = null;
}
this.sendDataForSubscriber(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
reply.writeNoException();
return true;
}
case TRANSACTION_sendText:
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
android.app.PendingIntent _arg4;
if ((0!=data.readInt())) {
_arg4 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
android.app.PendingIntent _arg5;
if ((0!=data.readInt())) {
_arg5 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg5 = null;
}
this.sendText(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_sendTextForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
java.lang.String _arg4;
_arg4 = data.readString();
android.app.PendingIntent _arg5;
if ((0!=data.readInt())) {
_arg5 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg5 = null;
}
android.app.PendingIntent _arg6;
if ((0!=data.readInt())) {
_arg6 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg6 = null;
}
this.sendTextForSubscriber(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
return true;
}
case TRANSACTION_injectSmsPdu:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
java.lang.String _arg1;
_arg1 = data.readString();
android.app.PendingIntent _arg2;
if ((0!=data.readInt())) {
_arg2 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.injectSmsPdu(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_sendMultipartText:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.util.List<java.lang.String> _arg3;
_arg3 = data.createStringArrayList();
java.util.List<android.app.PendingIntent> _arg4;
_arg4 = data.createTypedArrayList(android.app.PendingIntent.CREATOR);
java.util.List<android.app.PendingIntent> _arg5;
_arg5 = data.createTypedArrayList(android.app.PendingIntent.CREATOR);
this.sendMultipartText(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_sendMultipartTextForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
java.util.List<java.lang.String> _arg4;
_arg4 = data.createStringArrayList();
java.util.List<android.app.PendingIntent> _arg5;
_arg5 = data.createTypedArrayList(android.app.PendingIntent.CREATOR);
java.util.List<android.app.PendingIntent> _arg6;
_arg6 = data.createTypedArrayList(android.app.PendingIntent.CREATOR);
this.sendMultipartTextForSubscriber(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
return true;
}
case TRANSACTION_enableCellBroadcast:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.enableCellBroadcast(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_enableCellBroadcastForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
boolean _result = this.enableCellBroadcastForSubscriber(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_disableCellBroadcast:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.disableCellBroadcast(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_disableCellBroadcastForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
boolean _result = this.disableCellBroadcastForSubscriber(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_enableCellBroadcastRange:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
boolean _result = this.enableCellBroadcastRange(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_enableCellBroadcastRangeForSubscriber:
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
boolean _result = this.enableCellBroadcastRangeForSubscriber(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_disableCellBroadcastRange:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
boolean _result = this.disableCellBroadcastRange(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_disableCellBroadcastRangeForSubscriber:
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
boolean _result = this.disableCellBroadcastRangeForSubscriber(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getPremiumSmsPermission:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getPremiumSmsPermission(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getPremiumSmsPermissionForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.getPremiumSmsPermissionForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setPremiumSmsPermission:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.setPremiumSmsPermission(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setPremiumSmsPermissionForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
this.setPremiumSmsPermissionForSubscriber(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_isImsSmsSupported:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isImsSmsSupported();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isImsSmsSupportedForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isImsSmsSupportedForSubscriber(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isSmsSimPickActivityNeeded:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isSmsSimPickActivityNeeded(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getPreferredSmsSubscription:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getPreferredSmsSubscription();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getImsSmsFormat:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getImsSmsFormat();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getImsSmsFormatForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _result = this.getImsSmsFormatForSubscriber(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_isSMSPromptEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isSMSPromptEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_sendStoredText:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
android.net.Uri _arg2;
if ((0!=data.readInt())) {
_arg2 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
java.lang.String _arg3;
_arg3 = data.readString();
android.app.PendingIntent _arg4;
if ((0!=data.readInt())) {
_arg4 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
android.app.PendingIntent _arg5;
if ((0!=data.readInt())) {
_arg5 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg5 = null;
}
this.sendStoredText(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_sendStoredMultipartText:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
android.net.Uri _arg2;
if ((0!=data.readInt())) {
_arg2 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
java.lang.String _arg3;
_arg3 = data.readString();
java.util.List<android.app.PendingIntent> _arg4;
_arg4 = data.createTypedArrayList(android.app.PendingIntent.CREATOR);
java.util.List<android.app.PendingIntent> _arg5;
_arg5 = data.createTypedArrayList(android.app.PendingIntent.CREATOR);
this.sendStoredMultipartText(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.telephony.ISms
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
     * Retrieves all messages currently stored on ICC.
     *
     * @return list of SmsRawData of all sms on ICC
     */
@Override public java.util.List<com.android.internal.telephony.SmsRawData> getAllMessagesFromIccEf(java.lang.String callingPkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<com.android.internal.telephony.SmsRawData> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
mRemote.transact(Stub.TRANSACTION_getAllMessagesFromIccEf, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(com.android.internal.telephony.SmsRawData.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Retrieves all messages currently stored on ICC.
     * @param subId the subId id.
     * @return list of SmsRawData of all sms on ICC
     */
@Override public java.util.List<com.android.internal.telephony.SmsRawData> getAllMessagesFromIccEfForSubscriber(int subId, java.lang.String callingPkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<com.android.internal.telephony.SmsRawData> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPkg);
mRemote.transact(Stub.TRANSACTION_getAllMessagesFromIccEfForSubscriber, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(com.android.internal.telephony.SmsRawData.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Update the specified message on the ICC.
     *
     * @param messageIndex record index of message to update
     * @param newStatus new message status (STATUS_ON_ICC_READ,
     *                  STATUS_ON_ICC_UNREAD, STATUS_ON_ICC_SENT,
     *                  STATUS_ON_ICC_UNSENT, STATUS_ON_ICC_FREE)
     * @param pdu the raw PDU to store
     * @return success or not
     *
     */
@Override public boolean updateMessageOnIccEf(java.lang.String callingPkg, int messageIndex, int newStatus, byte[] pdu) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
_data.writeInt(messageIndex);
_data.writeInt(newStatus);
_data.writeByteArray(pdu);
mRemote.transact(Stub.TRANSACTION_updateMessageOnIccEf, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Update the specified message on the ICC.
     *
     * @param messageIndex record index of message to update
     * @param newStatus new message status (STATUS_ON_ICC_READ,
     *                  STATUS_ON_ICC_UNREAD, STATUS_ON_ICC_SENT,
     *                  STATUS_ON_ICC_UNSENT, STATUS_ON_ICC_FREE)
     * @param pdu the raw PDU to store
     * @param subId the subId id.
     * @return success or not
     *
     */
@Override public boolean updateMessageOnIccEfForSubscriber(int subId, java.lang.String callingPkg, int messageIndex, int newStatus, byte[] pdu) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPkg);
_data.writeInt(messageIndex);
_data.writeInt(newStatus);
_data.writeByteArray(pdu);
mRemote.transact(Stub.TRANSACTION_updateMessageOnIccEfForSubscriber, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Copy a raw SMS PDU to the ICC.
     *
     * @param pdu the raw PDU to store
     * @param status message status (STATUS_ON_ICC_READ, STATUS_ON_ICC_UNREAD,
     *               STATUS_ON_ICC_SENT, STATUS_ON_ICC_UNSENT)
     * @return success or not
     *
     */
@Override public boolean copyMessageToIccEf(java.lang.String callingPkg, int status, byte[] pdu, byte[] smsc) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
_data.writeInt(status);
_data.writeByteArray(pdu);
_data.writeByteArray(smsc);
mRemote.transact(Stub.TRANSACTION_copyMessageToIccEf, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Copy a raw SMS PDU to the ICC.
     *
     * @param pdu the raw PDU to store
     * @param status message status (STATUS_ON_ICC_READ, STATUS_ON_ICC_UNREAD,
     *               STATUS_ON_ICC_SENT, STATUS_ON_ICC_UNSENT)
     * @param subId the subId id.
     * @return success or not
     *
     */
@Override public boolean copyMessageToIccEfForSubscriber(int subId, java.lang.String callingPkg, int status, byte[] pdu, byte[] smsc) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPkg);
_data.writeInt(status);
_data.writeByteArray(pdu);
_data.writeByteArray(smsc);
mRemote.transact(Stub.TRANSACTION_copyMessageToIccEfForSubscriber, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Send a data SMS.
     *
     * @param smsc the SMSC to send the message through, or NULL for the
     *  default SMSC
     * @param data the body of the message to send
     * @param sentIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is sucessfully sent, or failed.
     *  The result code will be <code>Activity.RESULT_OK<code> for success,
     *  or one of these errors:<br>
     *  <code>RESULT_ERROR_GENERIC_FAILURE</code><br>
     *  <code>RESULT_ERROR_RADIO_OFF</code><br>
     *  <code>RESULT_ERROR_NULL_PDU</code><br>
     *  For <code>RESULT_ERROR_GENERIC_FAILURE</code> the sentIntent may include
     *  the extra "errorCode" containing a radio technology specific value,
     *  generally only useful for troubleshooting.<br>
     *  The per-application based SMS control checks sentIntent. If sentIntent
     *  is NULL the caller will be checked against all unknown applicaitons,
     *  which cause smaller number of SMS to be sent in checking period.
     * @param deliveryIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is delivered to the recipient.  The
     *  raw pdu of the status report is in the extended data ("pdu").
     */
@Override public void sendData(java.lang.String callingPkg, java.lang.String destAddr, java.lang.String scAddr, int destPort, byte[] data, android.app.PendingIntent sentIntent, android.app.PendingIntent deliveryIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
_data.writeString(destAddr);
_data.writeString(scAddr);
_data.writeInt(destPort);
_data.writeByteArray(data);
if ((sentIntent!=null)) {
_data.writeInt(1);
sentIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((deliveryIntent!=null)) {
_data.writeInt(1);
deliveryIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Send a data SMS.
     *
     * @param smsc the SMSC to send the message through, or NULL for the
     *  default SMSC
     * @param data the body of the message to send
     * @param sentIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is sucessfully sent, or failed.
     *  The result code will be <code>Activity.RESULT_OK<code> for success,
     *  or one of these errors:<br>
     *  <code>RESULT_ERROR_GENERIC_FAILURE</code><br>
     *  <code>RESULT_ERROR_RADIO_OFF</code><br>
     *  <code>RESULT_ERROR_NULL_PDU</code><br>
     *  For <code>RESULT_ERROR_GENERIC_FAILURE</code> the sentIntent may include
     *  the extra "errorCode" containing a radio technology specific value,
     *  generally only useful for troubleshooting.<br>
     *  The per-application based SMS control checks sentIntent. If sentIntent
     *  is NULL the caller will be checked against all unknown applicaitons,
     *  which cause smaller number of SMS to be sent in checking period.
     * @param deliveryIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is delivered to the recipient.  The
     *  raw pdu of the status report is in the extended data ("pdu").
     * @param subId the subId id.
     */
@Override public void sendDataForSubscriber(int subId, java.lang.String callingPkg, java.lang.String destAddr, java.lang.String scAddr, int destPort, byte[] data, android.app.PendingIntent sentIntent, android.app.PendingIntent deliveryIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPkg);
_data.writeString(destAddr);
_data.writeString(scAddr);
_data.writeInt(destPort);
_data.writeByteArray(data);
if ((sentIntent!=null)) {
_data.writeInt(1);
sentIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((deliveryIntent!=null)) {
_data.writeInt(1);
deliveryIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendDataForSubscriber, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Send an SMS.
     *
     * @param smsc the SMSC to send the message through, or NULL for the
     *  default SMSC
     * @param text the body of the message to send
     * @param sentIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is sucessfully sent, or failed.
     *  The result code will be <code>Activity.RESULT_OK<code> for success,
     *  or one of these errors:<br>
     *  <code>RESULT_ERROR_GENERIC_FAILURE</code><br>
     *  <code>RESULT_ERROR_RADIO_OFF</code><br>
     *  <code>RESULT_ERROR_NULL_PDU</code><br>
     *  For <code>RESULT_ERROR_GENERIC_FAILURE</code> the sentIntent may include
     *  the extra "errorCode" containing a radio technology specific value,
     *  generally only useful for troubleshooting.<br>
     *  The per-application based SMS control checks sentIntent. If sentIntent
     *  is NULL the caller will be checked against all unknown applications,
     *  which cause smaller number of SMS to be sent in checking period.
     * @param deliveryIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is delivered to the recipient.  The
     *  raw pdu of the status report is in the extended data ("pdu").
     */
@Override public void sendText(java.lang.String callingPkg, java.lang.String destAddr, java.lang.String scAddr, java.lang.String text, android.app.PendingIntent sentIntent, android.app.PendingIntent deliveryIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
_data.writeString(destAddr);
_data.writeString(scAddr);
_data.writeString(text);
if ((sentIntent!=null)) {
_data.writeInt(1);
sentIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((deliveryIntent!=null)) {
_data.writeInt(1);
deliveryIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendText, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Send an SMS.
     *
     * @param smsc the SMSC to send the message through, or NULL for the
     *  default SMSC
     * @param text the body of the message to send
     * @param sentIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is sucessfully sent, or failed.
     *  The result code will be <code>Activity.RESULT_OK<code> for success,
     *  or one of these errors:<br>
     *  <code>RESULT_ERROR_GENERIC_FAILURE</code><br>
     *  <code>RESULT_ERROR_RADIO_OFF</code><br>
     *  <code>RESULT_ERROR_NULL_PDU</code><br>
     *  For <code>RESULT_ERROR_GENERIC_FAILURE</code> the sentIntent may include
     *  the extra "errorCode" containing a radio technology specific value,
     *  generally only useful for troubleshooting.<br>
     *  The per-application based SMS control checks sentIntent. If sentIntent
     *  is NULL the caller will be checked against all unknown applications,
     *  which cause smaller number of SMS to be sent in checking period.
     * @param deliveryIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is delivered to the recipient.  The
     *  raw pdu of the status report is in the extended data ("pdu").
     * @param subId the subId on which the SMS has to be sent.
     */
@Override public void sendTextForSubscriber(int subId, java.lang.String callingPkg, java.lang.String destAddr, java.lang.String scAddr, java.lang.String text, android.app.PendingIntent sentIntent, android.app.PendingIntent deliveryIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPkg);
_data.writeString(destAddr);
_data.writeString(scAddr);
_data.writeString(text);
if ((sentIntent!=null)) {
_data.writeInt(1);
sentIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((deliveryIntent!=null)) {
_data.writeInt(1);
deliveryIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendTextForSubscriber, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Inject an SMS PDU into the android platform.
     *
     * @param pdu is the byte array of pdu to be injected into android application framework
     * @param format is the format of SMS pdu (android.telephony.SmsMessage.FORMAT_3GPP or
     * android.telephony.SmsMessage.FORMAT_3GPP2)
     * @param receivedIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is successfully received by the
     *  android application framework. This intent is broadcasted at
     *  the same time an SMS received from radio is acknowledged back.
     */
@Override public void injectSmsPdu(byte[] pdu, java.lang.String format, android.app.PendingIntent receivedIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(pdu);
_data.writeString(format);
if ((receivedIntent!=null)) {
_data.writeInt(1);
receivedIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_injectSmsPdu, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Send a multi-part text based SMS.
     *
     * @param destinationAddress the address to send the message to
     * @param scAddress is the service center address or null to use
     *   the current default SMSC
     * @param parts an <code>ArrayList</code> of strings that, in order,
     *   comprise the original message
     * @param sentIntents if not null, an <code>ArrayList</code> of
     *   <code>PendingIntent</code>s (one for each message part) that is
     *   broadcast when the corresponding message part has been sent.
     *   The result code will be <code>Activity.RESULT_OK<code> for success,
     *   or one of these errors:
     *   <code>RESULT_ERROR_GENERIC_FAILURE</code>
     *   <code>RESULT_ERROR_RADIO_OFF</code>
     *   <code>RESULT_ERROR_NULL_PDU</code>.
     * @param deliveryIntents if not null, an <code>ArrayList</code> of
     *   <code>PendingIntent</code>s (one for each message part) that is
     *   broadcast when the corresponding message part has been delivered
     *   to the recipient.  The raw pdu of the status report is in the
     *   extended data ("pdu").
     */
@Override public void sendMultipartText(java.lang.String callingPkg, java.lang.String destinationAddress, java.lang.String scAddress, java.util.List<java.lang.String> parts, java.util.List<android.app.PendingIntent> sentIntents, java.util.List<android.app.PendingIntent> deliveryIntents) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
_data.writeString(destinationAddress);
_data.writeString(scAddress);
_data.writeStringList(parts);
_data.writeTypedList(sentIntents);
_data.writeTypedList(deliveryIntents);
mRemote.transact(Stub.TRANSACTION_sendMultipartText, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Send a multi-part text based SMS.
     *
     * @param destinationAddress the address to send the message to
     * @param scAddress is the service center address or null to use
     *   the current default SMSC
     * @param parts an <code>ArrayList</code> of strings that, in order,
     *   comprise the original message
     * @param sentIntents if not null, an <code>ArrayList</code> of
     *   <code>PendingIntent</code>s (one for each message part) that is
     *   broadcast when the corresponding message part has been sent.
     *   The result code will be <code>Activity.RESULT_OK<code> for success,
     *   or one of these errors:
     *   <code>RESULT_ERROR_GENERIC_FAILURE</code>
     *   <code>RESULT_ERROR_RADIO_OFF</code>
     *   <code>RESULT_ERROR_NULL_PDU</code>.
     * @param deliveryIntents if not null, an <code>ArrayList</code> of
     *   <code>PendingIntent</code>s (one for each message part) that is
     *   broadcast when the corresponding message part has been delivered
     *   to the recipient.  The raw pdu of the status report is in the
     *   extended data ("pdu").
     * @param subId the subId on which the SMS has to be sent.
     */
@Override public void sendMultipartTextForSubscriber(int subId, java.lang.String callingPkg, java.lang.String destinationAddress, java.lang.String scAddress, java.util.List<java.lang.String> parts, java.util.List<android.app.PendingIntent> sentIntents, java.util.List<android.app.PendingIntent> deliveryIntents) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPkg);
_data.writeString(destinationAddress);
_data.writeString(scAddress);
_data.writeStringList(parts);
_data.writeTypedList(sentIntents);
_data.writeTypedList(deliveryIntents);
mRemote.transact(Stub.TRANSACTION_sendMultipartTextForSubscriber, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Enable reception of cell broadcast (SMS-CB) messages with the given
     * message identifier and RAN type. The RAN type specify this message ID
     * belong to 3GPP (GSM) or 3GPP2(CDMA). Note that if two different clients
     * enable the same message identifier, they must both disable it for the
     * device to stop receiving those messages.
     *
     * @param messageIdentifier Message identifier as specified in TS 23.041 (3GPP) or
     *   C.R1001-G (3GPP2)
     * @param ranType as defined in class SmsManager, the value can be one of these:
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_GSM
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_CDMA
     * @return true if successful, false otherwise
     *
     * @see #disableCellBroadcast(int, int)
     */
@Override public boolean enableCellBroadcast(int messageIdentifier, int ranType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(messageIdentifier);
_data.writeInt(ranType);
mRemote.transact(Stub.TRANSACTION_enableCellBroadcast, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Enable reception of cell broadcast (SMS-CB) messages with the given
     * message identifier and RAN type. The RAN type specify this message ID
     * belong to 3GPP (GSM) or 3GPP2(CDMA). Note that if two different clients
     * enable the same message identifier, they must both disable it for the
     * device to stop receiving those messages.
     *
     * @param messageIdentifier Message identifier as specified in TS 23.041 (3GPP) or
     *   C.R1001-G (3GPP2)
     * @param subId for which the broadcast has to be enabled
     * @param ranType as defined in class SmsManager, the value can be one of these:
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_GSM
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_CDMA
     * @return true if successful, false otherwise
     *
     * @see #disableCellBroadcast(int, int)
     */
@Override public boolean enableCellBroadcastForSubscriber(int subId, int messageIdentifier, int ranType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeInt(messageIdentifier);
_data.writeInt(ranType);
mRemote.transact(Stub.TRANSACTION_enableCellBroadcastForSubscriber, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Disable reception of cell broadcast (SMS-CB) messages with the given
     * message identifier and RAN type. The RAN type specify this message ID
     * belong to 3GPP (GSM) or 3GPP2(CDMA). Note that if two different clients
     * enable the same message identifier, they must both disable it for the
     * device to stop receiving those messages.
     *
     * @param messageIdentifier Message identifier as specified in TS 23.041 (3GPP) or
     *   C.R1001-G (3GPP2)
     * @param ranType as defined in class SmsManager, the value can be one of these:
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_GSM
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_CDMA
     * @return true if successful, false otherwise
     *
     * @see #enableCellBroadcast(int, int)
     */
@Override public boolean disableCellBroadcast(int messageIdentifier, int ranType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(messageIdentifier);
_data.writeInt(ranType);
mRemote.transact(Stub.TRANSACTION_disableCellBroadcast, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Disable reception of cell broadcast (SMS-CB) messages with the given
     * message identifier and RAN type. The RAN type specify this message ID
     * belong to 3GPP (GSM) or 3GPP2(CDMA). Note that if two different clients
     * enable the same message identifier, they must both disable it for the
     * device to stop receiving those messages.
     *
     * @param messageIdentifier Message identifier as specified in TS 23.041 (3GPP) or
     *   C.R1001-G (3GPP2)
     * @param subId for which the broadcast has to be disabled
     * @param ranType as defined in class SmsManager, the value can be one of these:
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_GSM
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_CDMA
     * @return true if successful, false otherwise
     *
     * @see #enableCellBroadcast(int, int)
     */
@Override public boolean disableCellBroadcastForSubscriber(int subId, int messageIdentifier, int ranType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeInt(messageIdentifier);
_data.writeInt(ranType);
mRemote.transact(Stub.TRANSACTION_disableCellBroadcastForSubscriber, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/*
     * Enable reception of cell broadcast (SMS-CB) messages with the given
     * message identifier range and RAN type. The RAN type specify this message
     * ID range belong to 3GPP (GSM) or 3GPP2(CDMA). Note that if two different
     * clients enable a message identifier range, they must both disable it for
     * the device to stop receiving those messages.
     *
     * @param startMessageId first message identifier as specified in TS 23.041 (3GPP) or
     *   C.R1001-G (3GPP2)
     * @param endMessageId last message identifier as specified in TS 23.041 (3GPP) or
     *   C.R1001-G (3GPP2)
     * @param ranType as defined in class SmsManager, the value can be one of these:
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_GSM
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_CDMA
     * @return true if successful, false otherwise
     *
     * @see #disableCellBroadcastRange(int, int, int)
     */
@Override public boolean enableCellBroadcastRange(int startMessageId, int endMessageId, int ranType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(startMessageId);
_data.writeInt(endMessageId);
_data.writeInt(ranType);
mRemote.transact(Stub.TRANSACTION_enableCellBroadcastRange, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/*
     * Enable reception of cell broadcast (SMS-CB) messages with the given
     * message identifier range and RAN type. The RAN type specify this message ID range
     * belong to 3GPP (GSM) or 3GPP2(CDMA). Note that if two different clients enable
     * a message identifier range, they must both disable it for the device
     * to stop receiving those messages.
     *
     * @param startMessageId first message identifier as specified in TS 23.041 (3GPP) or
     *   C.R1001-G (3GPP2)
     * @param endMessageId last message identifier as specified in TS 23.041 (3GPP) or
     *   C.R1001-G (3GPP2)
     * @param subId for which the broadcast has to be enabled
     * @param ranType as defined in class SmsManager, the value can be one of these:
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_GSM
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_CDMA
     * @return true if successful, false otherwise
     *
     * @see #disableCellBroadcastRange(int, int, int)
     */
@Override public boolean enableCellBroadcastRangeForSubscriber(int subId, int startMessageId, int endMessageId, int ranType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeInt(startMessageId);
_data.writeInt(endMessageId);
_data.writeInt(ranType);
mRemote.transact(Stub.TRANSACTION_enableCellBroadcastRangeForSubscriber, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Disable reception of cell broadcast (SMS-CB) messages with the given
     * message identifier range and RAN type. The RAN type specify this message ID range
     * belong to 3GPP (GSM) or 3GPP2(CDMA). Note that if two different clients enable
     * a message identifier range, they must both disable it for the device
     * to stop receiving those messages.
     *
     * @param startMessageId first message identifier as specified in TS 23.041 (3GPP) or
     *   C.R1001-G (3GPP2)
     * @param endMessageId last message identifier as specified in TS 23.041 (3GPP) or
     *   C.R1001-G (3GPP2)
     * @param ranType as defined in class SmsManager, the value can be one of these:
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_GSM
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_CDMA
     * @return true if successful, false otherwise
     *
     * @see #enableCellBroadcastRange(int, int, int)
     */
@Override public boolean disableCellBroadcastRange(int startMessageId, int endMessageId, int ranType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(startMessageId);
_data.writeInt(endMessageId);
_data.writeInt(ranType);
mRemote.transact(Stub.TRANSACTION_disableCellBroadcastRange, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Disable reception of cell broadcast (SMS-CB) messages with the given
     * message identifier range and RAN type. The RAN type specify this message ID range
     * belong to 3GPP (GSM) or 3GPP2(CDMA). Note that if two different clients enable
     * a message identifier range, they must both disable it for the device
     * to stop receiving those messages.
     *
     * @param startMessageId first message identifier as specified in TS 23.041 (3GPP) or
     *   C.R1001-G (3GPP2)
     * @param endMessageId last message identifier as specified in TS 23.041 (3GPP) or
     *   C.R1001-G (3GPP2)
     * @param subId for which the broadcast has to be disabled
     * @param ranType as defined in class SmsManager, the value can be one of these:
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_GSM
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_CDMA
     * @return true if successful, false otherwise
     *
     * @see #enableCellBroadcastRange(int, int, int, int)
     */
@Override public boolean disableCellBroadcastRangeForSubscriber(int subId, int startMessageId, int endMessageId, int ranType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeInt(startMessageId);
_data.writeInt(endMessageId);
_data.writeInt(ranType);
mRemote.transact(Stub.TRANSACTION_disableCellBroadcastRangeForSubscriber, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Returns the premium SMS send permission for the specified package.
     * Requires system permission.
     */
@Override public int getPremiumSmsPermission(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_getPremiumSmsPermission, _data, _reply, 0);
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
     * Returns the premium SMS send permission for the specified package.
     * Requires system permission.
     */
@Override public int getPremiumSmsPermissionForSubscriber(int subId, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_getPremiumSmsPermissionForSubscriber, _data, _reply, 0);
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
     * Set the SMS send permission for the specified package.
     * Requires system permission.
     */
@Override public void setPremiumSmsPermission(java.lang.String packageName, int permission) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(permission);
mRemote.transact(Stub.TRANSACTION_setPremiumSmsPermission, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Set the SMS send permission for the specified package.
     * Requires system permission.
     */
@Override public void setPremiumSmsPermissionForSubscriber(int subId, java.lang.String packageName, int permission) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(packageName);
_data.writeInt(permission);
mRemote.transact(Stub.TRANSACTION_setPremiumSmsPermissionForSubscriber, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * SMS over IMS is supported if IMS is registered and SMS is supported
     * on IMS.
     *
     * @return true if SMS over IMS is supported, false otherwise
     *
     * @see #getImsSmsFormat()
     */
@Override public boolean isImsSmsSupported() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isImsSmsSupported, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * SMS over IMS is supported if IMS is registered and SMS is supported
     * on IMS.
     * @param subId for subId which isImsSmsSupported is queried
     * @return true if SMS over IMS is supported, false otherwise
     *
     * @see #getImsSmsFormat()
     */
@Override public boolean isImsSmsSupportedForSubscriber(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_isImsSmsSupportedForSubscriber, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * User needs to pick SIM for SMS if multiple SIMs present and if current subId passed in is not
     * active/valid.
     * @param subId current subId for sending SMS
     * @return true if SIM for SMS sending needs to be chosen
     */
@Override public boolean isSmsSimPickActivityNeeded(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_isSmsSimPickActivityNeeded, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/*
     * get user prefered SMS subId
     * @return subId id
     */
@Override public int getPreferredSmsSubscription() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPreferredSmsSubscription, _data, _reply, 0);
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
     * Gets SMS format supported on IMS.  SMS over IMS format is
     * either 3GPP or 3GPP2.
     *
     * @return android.telephony.SmsMessage.FORMAT_3GPP,
     *         android.telephony.SmsMessage.FORMAT_3GPP2
     *      or android.telephony.SmsMessage.FORMAT_UNKNOWN
     *
     * @see #isImsSmsSupported()
     */
@Override public java.lang.String getImsSmsFormat() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getImsSmsFormat, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Gets SMS format supported on IMS.  SMS over IMS format is
     * either 3GPP or 3GPP2.
     * @param subId for subId which getImsSmsFormat is queried
     * @return android.telephony.SmsMessage.FORMAT_3GPP,
     *         android.telephony.SmsMessage.FORMAT_3GPP2
     *      or android.telephony.SmsMessage.FORMAT_UNKNOWN
     *
     * @see #isImsSmsSupported()
     */
@Override public java.lang.String getImsSmsFormatForSubscriber(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_getImsSmsFormatForSubscriber, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/*
     * Get SMS prompt property,  enabled or not
     * @return true if enabled, false otherwise
     */
@Override public boolean isSMSPromptEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isSMSPromptEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Send a system stored text message.
     *
     * This is used for sending a previously sent, but failed-to-send, message or
     * for sending a text message that has been stored as a draft.
     *
     * @param subId the SIM id.
     * @param callingPkg the package name of the calling app
     * @param messageUri the URI of the stored message
     * @param scAddress is the service center address or null to use the current default SMSC
     * @param sentIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is successfully sent, or failed.
     *  The result code will be <code>Activity.RESULT_OK</code> for success,
     *  or one of these errors:<br>
     *  <code>RESULT_ERROR_GENERIC_FAILURE</code><br>
     *  <code>RESULT_ERROR_RADIO_OFF</code><br>
     *  <code>RESULT_ERROR_NULL_PDU</code><br>
     *  For <code>RESULT_ERROR_GENERIC_FAILURE</code> the sentIntent may include
     *  the extra "errorCode" containing a radio technology specific value,
     *  generally only useful for troubleshooting.<br>
     *  The per-application based SMS control checks sentIntent. If sentIntent
     *  is NULL the caller will be checked against all unknown applications,
     *  which cause smaller number of SMS to be sent in checking period.
     * @param deliveryIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is delivered to the recipient.  The
     *  raw pdu of the status report is in the extended data ("pdu").
     */
@Override public void sendStoredText(int subId, java.lang.String callingPkg, android.net.Uri messageUri, java.lang.String scAddress, android.app.PendingIntent sentIntent, android.app.PendingIntent deliveryIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPkg);
if ((messageUri!=null)) {
_data.writeInt(1);
messageUri.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(scAddress);
if ((sentIntent!=null)) {
_data.writeInt(1);
sentIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((deliveryIntent!=null)) {
_data.writeInt(1);
deliveryIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendStoredText, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Send a system stored multi-part text message.
     *
     * This is used for sending a previously sent, but failed-to-send, message or
     * for sending a text message that has been stored as a draft.
     * The provided <code>PendingIntent</code> lists should match the part number of the
     * divided text of the stored message by using <code>divideMessage</code>
     *
     * @param subId the SIM id.
     * @param callingPkg the package name of the calling app
     * @param messageUri the URI of the stored message
     * @param scAddress is the service center address or null to use
     *   the current default SMSC
     * @param sentIntents if not null, an <code>ArrayList</code> of
     *   <code>PendingIntent</code>s (one for each message part) that is
     *   broadcast when the corresponding message part has been sent.
     *   The result code will be <code>Activity.RESULT_OK</code> for success,
     *   or one of these errors:<br>
     *   <code>RESULT_ERROR_GENERIC_FAILURE</code><br>
     *   <code>RESULT_ERROR_RADIO_OFF</code><br>
     *   <code>RESULT_ERROR_NULL_PDU</code><br>
     *   For <code>RESULT_ERROR_GENERIC_FAILURE</code> each sentIntent may include
     *   the extra "errorCode" containing a radio technology specific value,
     *   generally only useful for troubleshooting.<br>
     *   The per-application based SMS control checks sentIntent. If sentIntent
     *   is NULL the caller will be checked against all unknown applications,
     *   which cause smaller number of SMS to be sent in checking period.
     * @param deliveryIntents if not null, an <code>ArrayList</code> of
     *   <code>PendingIntent</code>s (one for each message part) that is
     *   broadcast when the corresponding message part has been delivered
     *   to the recipient.  The raw pdu of the status report is in the
     *   extended data ("pdu").
     */
@Override public void sendStoredMultipartText(int subId, java.lang.String callingPkg, android.net.Uri messageUri, java.lang.String scAddress, java.util.List<android.app.PendingIntent> sentIntents, java.util.List<android.app.PendingIntent> deliveryIntents) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPkg);
if ((messageUri!=null)) {
_data.writeInt(1);
messageUri.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(scAddress);
_data.writeTypedList(sentIntents);
_data.writeTypedList(deliveryIntents);
mRemote.transact(Stub.TRANSACTION_sendStoredMultipartText, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getAllMessagesFromIccEf = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getAllMessagesFromIccEfForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_updateMessageOnIccEf = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_updateMessageOnIccEfForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_copyMessageToIccEf = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_copyMessageToIccEfForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_sendData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_sendDataForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_sendText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_sendTextForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_injectSmsPdu = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_sendMultipartText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_sendMultipartTextForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_enableCellBroadcast = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_enableCellBroadcastForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_disableCellBroadcast = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_disableCellBroadcastForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_enableCellBroadcastRange = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_enableCellBroadcastRangeForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_disableCellBroadcastRange = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_disableCellBroadcastRangeForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_getPremiumSmsPermission = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_getPremiumSmsPermissionForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_setPremiumSmsPermission = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_setPremiumSmsPermissionForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_isImsSmsSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_isImsSmsSupportedForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_isSmsSimPickActivityNeeded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_getPreferredSmsSubscription = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_getImsSmsFormat = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_getImsSmsFormatForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_isSMSPromptEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_sendStoredText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_sendStoredMultipartText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
}
/**
     * Retrieves all messages currently stored on ICC.
     *
     * @return list of SmsRawData of all sms on ICC
     */
public java.util.List<com.android.internal.telephony.SmsRawData> getAllMessagesFromIccEf(java.lang.String callingPkg) throws android.os.RemoteException;
/**
     * Retrieves all messages currently stored on ICC.
     * @param subId the subId id.
     * @return list of SmsRawData of all sms on ICC
     */
public java.util.List<com.android.internal.telephony.SmsRawData> getAllMessagesFromIccEfForSubscriber(int subId, java.lang.String callingPkg) throws android.os.RemoteException;
/**
     * Update the specified message on the ICC.
     *
     * @param messageIndex record index of message to update
     * @param newStatus new message status (STATUS_ON_ICC_READ,
     *                  STATUS_ON_ICC_UNREAD, STATUS_ON_ICC_SENT,
     *                  STATUS_ON_ICC_UNSENT, STATUS_ON_ICC_FREE)
     * @param pdu the raw PDU to store
     * @return success or not
     *
     */
public boolean updateMessageOnIccEf(java.lang.String callingPkg, int messageIndex, int newStatus, byte[] pdu) throws android.os.RemoteException;
/**
     * Update the specified message on the ICC.
     *
     * @param messageIndex record index of message to update
     * @param newStatus new message status (STATUS_ON_ICC_READ,
     *                  STATUS_ON_ICC_UNREAD, STATUS_ON_ICC_SENT,
     *                  STATUS_ON_ICC_UNSENT, STATUS_ON_ICC_FREE)
     * @param pdu the raw PDU to store
     * @param subId the subId id.
     * @return success or not
     *
     */
public boolean updateMessageOnIccEfForSubscriber(int subId, java.lang.String callingPkg, int messageIndex, int newStatus, byte[] pdu) throws android.os.RemoteException;
/**
     * Copy a raw SMS PDU to the ICC.
     *
     * @param pdu the raw PDU to store
     * @param status message status (STATUS_ON_ICC_READ, STATUS_ON_ICC_UNREAD,
     *               STATUS_ON_ICC_SENT, STATUS_ON_ICC_UNSENT)
     * @return success or not
     *
     */
public boolean copyMessageToIccEf(java.lang.String callingPkg, int status, byte[] pdu, byte[] smsc) throws android.os.RemoteException;
/**
     * Copy a raw SMS PDU to the ICC.
     *
     * @param pdu the raw PDU to store
     * @param status message status (STATUS_ON_ICC_READ, STATUS_ON_ICC_UNREAD,
     *               STATUS_ON_ICC_SENT, STATUS_ON_ICC_UNSENT)
     * @param subId the subId id.
     * @return success or not
     *
     */
public boolean copyMessageToIccEfForSubscriber(int subId, java.lang.String callingPkg, int status, byte[] pdu, byte[] smsc) throws android.os.RemoteException;
/**
     * Send a data SMS.
     *
     * @param smsc the SMSC to send the message through, or NULL for the
     *  default SMSC
     * @param data the body of the message to send
     * @param sentIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is sucessfully sent, or failed.
     *  The result code will be <code>Activity.RESULT_OK<code> for success,
     *  or one of these errors:<br>
     *  <code>RESULT_ERROR_GENERIC_FAILURE</code><br>
     *  <code>RESULT_ERROR_RADIO_OFF</code><br>
     *  <code>RESULT_ERROR_NULL_PDU</code><br>
     *  For <code>RESULT_ERROR_GENERIC_FAILURE</code> the sentIntent may include
     *  the extra "errorCode" containing a radio technology specific value,
     *  generally only useful for troubleshooting.<br>
     *  The per-application based SMS control checks sentIntent. If sentIntent
     *  is NULL the caller will be checked against all unknown applicaitons,
     *  which cause smaller number of SMS to be sent in checking period.
     * @param deliveryIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is delivered to the recipient.  The
     *  raw pdu of the status report is in the extended data ("pdu").
     */
public void sendData(java.lang.String callingPkg, java.lang.String destAddr, java.lang.String scAddr, int destPort, byte[] data, android.app.PendingIntent sentIntent, android.app.PendingIntent deliveryIntent) throws android.os.RemoteException;
/**
     * Send a data SMS.
     *
     * @param smsc the SMSC to send the message through, or NULL for the
     *  default SMSC
     * @param data the body of the message to send
     * @param sentIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is sucessfully sent, or failed.
     *  The result code will be <code>Activity.RESULT_OK<code> for success,
     *  or one of these errors:<br>
     *  <code>RESULT_ERROR_GENERIC_FAILURE</code><br>
     *  <code>RESULT_ERROR_RADIO_OFF</code><br>
     *  <code>RESULT_ERROR_NULL_PDU</code><br>
     *  For <code>RESULT_ERROR_GENERIC_FAILURE</code> the sentIntent may include
     *  the extra "errorCode" containing a radio technology specific value,
     *  generally only useful for troubleshooting.<br>
     *  The per-application based SMS control checks sentIntent. If sentIntent
     *  is NULL the caller will be checked against all unknown applicaitons,
     *  which cause smaller number of SMS to be sent in checking period.
     * @param deliveryIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is delivered to the recipient.  The
     *  raw pdu of the status report is in the extended data ("pdu").
     * @param subId the subId id.
     */
public void sendDataForSubscriber(int subId, java.lang.String callingPkg, java.lang.String destAddr, java.lang.String scAddr, int destPort, byte[] data, android.app.PendingIntent sentIntent, android.app.PendingIntent deliveryIntent) throws android.os.RemoteException;
/**
     * Send an SMS.
     *
     * @param smsc the SMSC to send the message through, or NULL for the
     *  default SMSC
     * @param text the body of the message to send
     * @param sentIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is sucessfully sent, or failed.
     *  The result code will be <code>Activity.RESULT_OK<code> for success,
     *  or one of these errors:<br>
     *  <code>RESULT_ERROR_GENERIC_FAILURE</code><br>
     *  <code>RESULT_ERROR_RADIO_OFF</code><br>
     *  <code>RESULT_ERROR_NULL_PDU</code><br>
     *  For <code>RESULT_ERROR_GENERIC_FAILURE</code> the sentIntent may include
     *  the extra "errorCode" containing a radio technology specific value,
     *  generally only useful for troubleshooting.<br>
     *  The per-application based SMS control checks sentIntent. If sentIntent
     *  is NULL the caller will be checked against all unknown applications,
     *  which cause smaller number of SMS to be sent in checking period.
     * @param deliveryIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is delivered to the recipient.  The
     *  raw pdu of the status report is in the extended data ("pdu").
     */
public void sendText(java.lang.String callingPkg, java.lang.String destAddr, java.lang.String scAddr, java.lang.String text, android.app.PendingIntent sentIntent, android.app.PendingIntent deliveryIntent) throws android.os.RemoteException;
/**
     * Send an SMS.
     *
     * @param smsc the SMSC to send the message through, or NULL for the
     *  default SMSC
     * @param text the body of the message to send
     * @param sentIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is sucessfully sent, or failed.
     *  The result code will be <code>Activity.RESULT_OK<code> for success,
     *  or one of these errors:<br>
     *  <code>RESULT_ERROR_GENERIC_FAILURE</code><br>
     *  <code>RESULT_ERROR_RADIO_OFF</code><br>
     *  <code>RESULT_ERROR_NULL_PDU</code><br>
     *  For <code>RESULT_ERROR_GENERIC_FAILURE</code> the sentIntent may include
     *  the extra "errorCode" containing a radio technology specific value,
     *  generally only useful for troubleshooting.<br>
     *  The per-application based SMS control checks sentIntent. If sentIntent
     *  is NULL the caller will be checked against all unknown applications,
     *  which cause smaller number of SMS to be sent in checking period.
     * @param deliveryIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is delivered to the recipient.  The
     *  raw pdu of the status report is in the extended data ("pdu").
     * @param subId the subId on which the SMS has to be sent.
     */
public void sendTextForSubscriber(int subId, java.lang.String callingPkg, java.lang.String destAddr, java.lang.String scAddr, java.lang.String text, android.app.PendingIntent sentIntent, android.app.PendingIntent deliveryIntent) throws android.os.RemoteException;
/**
     * Inject an SMS PDU into the android platform.
     *
     * @param pdu is the byte array of pdu to be injected into android application framework
     * @param format is the format of SMS pdu (android.telephony.SmsMessage.FORMAT_3GPP or
     * android.telephony.SmsMessage.FORMAT_3GPP2)
     * @param receivedIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is successfully received by the
     *  android application framework. This intent is broadcasted at
     *  the same time an SMS received from radio is acknowledged back.
     */
public void injectSmsPdu(byte[] pdu, java.lang.String format, android.app.PendingIntent receivedIntent) throws android.os.RemoteException;
/**
     * Send a multi-part text based SMS.
     *
     * @param destinationAddress the address to send the message to
     * @param scAddress is the service center address or null to use
     *   the current default SMSC
     * @param parts an <code>ArrayList</code> of strings that, in order,
     *   comprise the original message
     * @param sentIntents if not null, an <code>ArrayList</code> of
     *   <code>PendingIntent</code>s (one for each message part) that is
     *   broadcast when the corresponding message part has been sent.
     *   The result code will be <code>Activity.RESULT_OK<code> for success,
     *   or one of these errors:
     *   <code>RESULT_ERROR_GENERIC_FAILURE</code>
     *   <code>RESULT_ERROR_RADIO_OFF</code>
     *   <code>RESULT_ERROR_NULL_PDU</code>.
     * @param deliveryIntents if not null, an <code>ArrayList</code> of
     *   <code>PendingIntent</code>s (one for each message part) that is
     *   broadcast when the corresponding message part has been delivered
     *   to the recipient.  The raw pdu of the status report is in the
     *   extended data ("pdu").
     */
public void sendMultipartText(java.lang.String callingPkg, java.lang.String destinationAddress, java.lang.String scAddress, java.util.List<java.lang.String> parts, java.util.List<android.app.PendingIntent> sentIntents, java.util.List<android.app.PendingIntent> deliveryIntents) throws android.os.RemoteException;
/**
     * Send a multi-part text based SMS.
     *
     * @param destinationAddress the address to send the message to
     * @param scAddress is the service center address or null to use
     *   the current default SMSC
     * @param parts an <code>ArrayList</code> of strings that, in order,
     *   comprise the original message
     * @param sentIntents if not null, an <code>ArrayList</code> of
     *   <code>PendingIntent</code>s (one for each message part) that is
     *   broadcast when the corresponding message part has been sent.
     *   The result code will be <code>Activity.RESULT_OK<code> for success,
     *   or one of these errors:
     *   <code>RESULT_ERROR_GENERIC_FAILURE</code>
     *   <code>RESULT_ERROR_RADIO_OFF</code>
     *   <code>RESULT_ERROR_NULL_PDU</code>.
     * @param deliveryIntents if not null, an <code>ArrayList</code> of
     *   <code>PendingIntent</code>s (one for each message part) that is
     *   broadcast when the corresponding message part has been delivered
     *   to the recipient.  The raw pdu of the status report is in the
     *   extended data ("pdu").
     * @param subId the subId on which the SMS has to be sent.
     */
public void sendMultipartTextForSubscriber(int subId, java.lang.String callingPkg, java.lang.String destinationAddress, java.lang.String scAddress, java.util.List<java.lang.String> parts, java.util.List<android.app.PendingIntent> sentIntents, java.util.List<android.app.PendingIntent> deliveryIntents) throws android.os.RemoteException;
/**
     * Enable reception of cell broadcast (SMS-CB) messages with the given
     * message identifier and RAN type. The RAN type specify this message ID
     * belong to 3GPP (GSM) or 3GPP2(CDMA). Note that if two different clients
     * enable the same message identifier, they must both disable it for the
     * device to stop receiving those messages.
     *
     * @param messageIdentifier Message identifier as specified in TS 23.041 (3GPP) or
     *   C.R1001-G (3GPP2)
     * @param ranType as defined in class SmsManager, the value can be one of these:
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_GSM
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_CDMA
     * @return true if successful, false otherwise
     *
     * @see #disableCellBroadcast(int, int)
     */
public boolean enableCellBroadcast(int messageIdentifier, int ranType) throws android.os.RemoteException;
/**
     * Enable reception of cell broadcast (SMS-CB) messages with the given
     * message identifier and RAN type. The RAN type specify this message ID
     * belong to 3GPP (GSM) or 3GPP2(CDMA). Note that if two different clients
     * enable the same message identifier, they must both disable it for the
     * device to stop receiving those messages.
     *
     * @param messageIdentifier Message identifier as specified in TS 23.041 (3GPP) or
     *   C.R1001-G (3GPP2)
     * @param subId for which the broadcast has to be enabled
     * @param ranType as defined in class SmsManager, the value can be one of these:
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_GSM
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_CDMA
     * @return true if successful, false otherwise
     *
     * @see #disableCellBroadcast(int, int)
     */
public boolean enableCellBroadcastForSubscriber(int subId, int messageIdentifier, int ranType) throws android.os.RemoteException;
/**
     * Disable reception of cell broadcast (SMS-CB) messages with the given
     * message identifier and RAN type. The RAN type specify this message ID
     * belong to 3GPP (GSM) or 3GPP2(CDMA). Note that if two different clients
     * enable the same message identifier, they must both disable it for the
     * device to stop receiving those messages.
     *
     * @param messageIdentifier Message identifier as specified in TS 23.041 (3GPP) or
     *   C.R1001-G (3GPP2)
     * @param ranType as defined in class SmsManager, the value can be one of these:
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_GSM
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_CDMA
     * @return true if successful, false otherwise
     *
     * @see #enableCellBroadcast(int, int)
     */
public boolean disableCellBroadcast(int messageIdentifier, int ranType) throws android.os.RemoteException;
/**
     * Disable reception of cell broadcast (SMS-CB) messages with the given
     * message identifier and RAN type. The RAN type specify this message ID
     * belong to 3GPP (GSM) or 3GPP2(CDMA). Note that if two different clients
     * enable the same message identifier, they must both disable it for the
     * device to stop receiving those messages.
     *
     * @param messageIdentifier Message identifier as specified in TS 23.041 (3GPP) or
     *   C.R1001-G (3GPP2)
     * @param subId for which the broadcast has to be disabled
     * @param ranType as defined in class SmsManager, the value can be one of these:
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_GSM
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_CDMA
     * @return true if successful, false otherwise
     *
     * @see #enableCellBroadcast(int, int)
     */
public boolean disableCellBroadcastForSubscriber(int subId, int messageIdentifier, int ranType) throws android.os.RemoteException;
/*
     * Enable reception of cell broadcast (SMS-CB) messages with the given
     * message identifier range and RAN type. The RAN type specify this message
     * ID range belong to 3GPP (GSM) or 3GPP2(CDMA). Note that if two different
     * clients enable a message identifier range, they must both disable it for
     * the device to stop receiving those messages.
     *
     * @param startMessageId first message identifier as specified in TS 23.041 (3GPP) or
     *   C.R1001-G (3GPP2)
     * @param endMessageId last message identifier as specified in TS 23.041 (3GPP) or
     *   C.R1001-G (3GPP2)
     * @param ranType as defined in class SmsManager, the value can be one of these:
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_GSM
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_CDMA
     * @return true if successful, false otherwise
     *
     * @see #disableCellBroadcastRange(int, int, int)
     */
public boolean enableCellBroadcastRange(int startMessageId, int endMessageId, int ranType) throws android.os.RemoteException;
/*
     * Enable reception of cell broadcast (SMS-CB) messages with the given
     * message identifier range and RAN type. The RAN type specify this message ID range
     * belong to 3GPP (GSM) or 3GPP2(CDMA). Note that if two different clients enable
     * a message identifier range, they must both disable it for the device
     * to stop receiving those messages.
     *
     * @param startMessageId first message identifier as specified in TS 23.041 (3GPP) or
     *   C.R1001-G (3GPP2)
     * @param endMessageId last message identifier as specified in TS 23.041 (3GPP) or
     *   C.R1001-G (3GPP2)
     * @param subId for which the broadcast has to be enabled
     * @param ranType as defined in class SmsManager, the value can be one of these:
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_GSM
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_CDMA
     * @return true if successful, false otherwise
     *
     * @see #disableCellBroadcastRange(int, int, int)
     */
public boolean enableCellBroadcastRangeForSubscriber(int subId, int startMessageId, int endMessageId, int ranType) throws android.os.RemoteException;
/**
     * Disable reception of cell broadcast (SMS-CB) messages with the given
     * message identifier range and RAN type. The RAN type specify this message ID range
     * belong to 3GPP (GSM) or 3GPP2(CDMA). Note that if two different clients enable
     * a message identifier range, they must both disable it for the device
     * to stop receiving those messages.
     *
     * @param startMessageId first message identifier as specified in TS 23.041 (3GPP) or
     *   C.R1001-G (3GPP2)
     * @param endMessageId last message identifier as specified in TS 23.041 (3GPP) or
     *   C.R1001-G (3GPP2)
     * @param ranType as defined in class SmsManager, the value can be one of these:
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_GSM
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_CDMA
     * @return true if successful, false otherwise
     *
     * @see #enableCellBroadcastRange(int, int, int)
     */
public boolean disableCellBroadcastRange(int startMessageId, int endMessageId, int ranType) throws android.os.RemoteException;
/**
     * Disable reception of cell broadcast (SMS-CB) messages with the given
     * message identifier range and RAN type. The RAN type specify this message ID range
     * belong to 3GPP (GSM) or 3GPP2(CDMA). Note that if two different clients enable
     * a message identifier range, they must both disable it for the device
     * to stop receiving those messages.
     *
     * @param startMessageId first message identifier as specified in TS 23.041 (3GPP) or
     *   C.R1001-G (3GPP2)
     * @param endMessageId last message identifier as specified in TS 23.041 (3GPP) or
     *   C.R1001-G (3GPP2)
     * @param subId for which the broadcast has to be disabled
     * @param ranType as defined in class SmsManager, the value can be one of these:
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_GSM
     *    android.telephony.SmsMessage.CELL_BROADCAST_RAN_TYPE_CDMA
     * @return true if successful, false otherwise
     *
     * @see #enableCellBroadcastRange(int, int, int, int)
     */
public boolean disableCellBroadcastRangeForSubscriber(int subId, int startMessageId, int endMessageId, int ranType) throws android.os.RemoteException;
/**
     * Returns the premium SMS send permission for the specified package.
     * Requires system permission.
     */
public int getPremiumSmsPermission(java.lang.String packageName) throws android.os.RemoteException;
/**
     * Returns the premium SMS send permission for the specified package.
     * Requires system permission.
     */
public int getPremiumSmsPermissionForSubscriber(int subId, java.lang.String packageName) throws android.os.RemoteException;
/**
     * Set the SMS send permission for the specified package.
     * Requires system permission.
     */
public void setPremiumSmsPermission(java.lang.String packageName, int permission) throws android.os.RemoteException;
/**
     * Set the SMS send permission for the specified package.
     * Requires system permission.
     */
public void setPremiumSmsPermissionForSubscriber(int subId, java.lang.String packageName, int permission) throws android.os.RemoteException;
/**
     * SMS over IMS is supported if IMS is registered and SMS is supported
     * on IMS.
     *
     * @return true if SMS over IMS is supported, false otherwise
     *
     * @see #getImsSmsFormat()
     */
public boolean isImsSmsSupported() throws android.os.RemoteException;
/**
     * SMS over IMS is supported if IMS is registered and SMS is supported
     * on IMS.
     * @param subId for subId which isImsSmsSupported is queried
     * @return true if SMS over IMS is supported, false otherwise
     *
     * @see #getImsSmsFormat()
     */
public boolean isImsSmsSupportedForSubscriber(int subId) throws android.os.RemoteException;
/**
     * User needs to pick SIM for SMS if multiple SIMs present and if current subId passed in is not
     * active/valid.
     * @param subId current subId for sending SMS
     * @return true if SIM for SMS sending needs to be chosen
     */
public boolean isSmsSimPickActivityNeeded(int subId) throws android.os.RemoteException;
/*
     * get user prefered SMS subId
     * @return subId id
     */
public int getPreferredSmsSubscription() throws android.os.RemoteException;
/**
     * Gets SMS format supported on IMS.  SMS over IMS format is
     * either 3GPP or 3GPP2.
     *
     * @return android.telephony.SmsMessage.FORMAT_3GPP,
     *         android.telephony.SmsMessage.FORMAT_3GPP2
     *      or android.telephony.SmsMessage.FORMAT_UNKNOWN
     *
     * @see #isImsSmsSupported()
     */
public java.lang.String getImsSmsFormat() throws android.os.RemoteException;
/**
     * Gets SMS format supported on IMS.  SMS over IMS format is
     * either 3GPP or 3GPP2.
     * @param subId for subId which getImsSmsFormat is queried
     * @return android.telephony.SmsMessage.FORMAT_3GPP,
     *         android.telephony.SmsMessage.FORMAT_3GPP2
     *      or android.telephony.SmsMessage.FORMAT_UNKNOWN
     *
     * @see #isImsSmsSupported()
     */
public java.lang.String getImsSmsFormatForSubscriber(int subId) throws android.os.RemoteException;
/*
     * Get SMS prompt property,  enabled or not
     * @return true if enabled, false otherwise
     */
public boolean isSMSPromptEnabled() throws android.os.RemoteException;
/**
     * Send a system stored text message.
     *
     * This is used for sending a previously sent, but failed-to-send, message or
     * for sending a text message that has been stored as a draft.
     *
     * @param subId the SIM id.
     * @param callingPkg the package name of the calling app
     * @param messageUri the URI of the stored message
     * @param scAddress is the service center address or null to use the current default SMSC
     * @param sentIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is successfully sent, or failed.
     *  The result code will be <code>Activity.RESULT_OK</code> for success,
     *  or one of these errors:<br>
     *  <code>RESULT_ERROR_GENERIC_FAILURE</code><br>
     *  <code>RESULT_ERROR_RADIO_OFF</code><br>
     *  <code>RESULT_ERROR_NULL_PDU</code><br>
     *  For <code>RESULT_ERROR_GENERIC_FAILURE</code> the sentIntent may include
     *  the extra "errorCode" containing a radio technology specific value,
     *  generally only useful for troubleshooting.<br>
     *  The per-application based SMS control checks sentIntent. If sentIntent
     *  is NULL the caller will be checked against all unknown applications,
     *  which cause smaller number of SMS to be sent in checking period.
     * @param deliveryIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is delivered to the recipient.  The
     *  raw pdu of the status report is in the extended data ("pdu").
     */
public void sendStoredText(int subId, java.lang.String callingPkg, android.net.Uri messageUri, java.lang.String scAddress, android.app.PendingIntent sentIntent, android.app.PendingIntent deliveryIntent) throws android.os.RemoteException;
/**
     * Send a system stored multi-part text message.
     *
     * This is used for sending a previously sent, but failed-to-send, message or
     * for sending a text message that has been stored as a draft.
     * The provided <code>PendingIntent</code> lists should match the part number of the
     * divided text of the stored message by using <code>divideMessage</code>
     *
     * @param subId the SIM id.
     * @param callingPkg the package name of the calling app
     * @param messageUri the URI of the stored message
     * @param scAddress is the service center address or null to use
     *   the current default SMSC
     * @param sentIntents if not null, an <code>ArrayList</code> of
     *   <code>PendingIntent</code>s (one for each message part) that is
     *   broadcast when the corresponding message part has been sent.
     *   The result code will be <code>Activity.RESULT_OK</code> for success,
     *   or one of these errors:<br>
     *   <code>RESULT_ERROR_GENERIC_FAILURE</code><br>
     *   <code>RESULT_ERROR_RADIO_OFF</code><br>
     *   <code>RESULT_ERROR_NULL_PDU</code><br>
     *   For <code>RESULT_ERROR_GENERIC_FAILURE</code> each sentIntent may include
     *   the extra "errorCode" containing a radio technology specific value,
     *   generally only useful for troubleshooting.<br>
     *   The per-application based SMS control checks sentIntent. If sentIntent
     *   is NULL the caller will be checked against all unknown applications,
     *   which cause smaller number of SMS to be sent in checking period.
     * @param deliveryIntents if not null, an <code>ArrayList</code> of
     *   <code>PendingIntent</code>s (one for each message part) that is
     *   broadcast when the corresponding message part has been delivered
     *   to the recipient.  The raw pdu of the status report is in the
     *   extended data ("pdu").
     */
public void sendStoredMultipartText(int subId, java.lang.String callingPkg, android.net.Uri messageUri, java.lang.String scAddress, java.util.List<android.app.PendingIntent> sentIntents, java.util.List<android.app.PendingIntent> deliveryIntents) throws android.os.RemoteException;
}
