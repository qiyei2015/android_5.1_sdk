/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/telephony/java/com/android/ims/internal/IImsUtListener.aidl
 */
package com.android.ims.internal;
/**
 * {@hide}
 */
public interface IImsUtListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsUtListener
{
private static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsUtListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.ims.internal.IImsUtListener interface,
 * generating a proxy if needed.
 */
public static com.android.ims.internal.IImsUtListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.ims.internal.IImsUtListener))) {
return ((com.android.ims.internal.IImsUtListener)iin);
}
return new com.android.ims.internal.IImsUtListener.Stub.Proxy(obj);
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
case TRANSACTION_utConfigurationUpdated:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsUt _arg0;
_arg0 = com.android.ims.internal.IImsUt.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.utConfigurationUpdated(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_utConfigurationUpdateFailed:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsUt _arg0;
_arg0 = com.android.ims.internal.IImsUt.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
com.android.ims.ImsReasonInfo _arg2;
if ((0!=data.readInt())) {
_arg2 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.utConfigurationUpdateFailed(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_utConfigurationQueried:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsUt _arg0;
_arg0 = com.android.ims.internal.IImsUt.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
android.os.Bundle _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.utConfigurationQueried(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_utConfigurationQueryFailed:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsUt _arg0;
_arg0 = com.android.ims.internal.IImsUt.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
com.android.ims.ImsReasonInfo _arg2;
if ((0!=data.readInt())) {
_arg2 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.utConfigurationQueryFailed(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_utConfigurationCallBarringQueried:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsUt _arg0;
_arg0 = com.android.ims.internal.IImsUt.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
com.android.ims.ImsSsInfo[] _arg2;
_arg2 = data.createTypedArray(com.android.ims.ImsSsInfo.CREATOR);
this.utConfigurationCallBarringQueried(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_utConfigurationCallForwardQueried:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsUt _arg0;
_arg0 = com.android.ims.internal.IImsUt.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
com.android.ims.ImsCallForwardInfo[] _arg2;
_arg2 = data.createTypedArray(com.android.ims.ImsCallForwardInfo.CREATOR);
this.utConfigurationCallForwardQueried(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_utConfigurationCallWaitingQueried:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsUt _arg0;
_arg0 = com.android.ims.internal.IImsUt.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
com.android.ims.ImsSsInfo[] _arg2;
_arg2 = data.createTypedArray(com.android.ims.ImsSsInfo.CREATOR);
this.utConfigurationCallWaitingQueried(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.ims.internal.IImsUtListener
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
     * Notifies the result of the supplementary service configuration udpate.
     */
@Override public void utConfigurationUpdated(com.android.ims.internal.IImsUt ut, int id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((ut!=null))?(ut.asBinder()):(null)));
_data.writeInt(id);
mRemote.transact(Stub.TRANSACTION_utConfigurationUpdated, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void utConfigurationUpdateFailed(com.android.ims.internal.IImsUt ut, int id, com.android.ims.ImsReasonInfo error) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((ut!=null))?(ut.asBinder()):(null)));
_data.writeInt(id);
if ((error!=null)) {
_data.writeInt(1);
error.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_utConfigurationUpdateFailed, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notifies the result of the supplementary service configuration query.
     */
@Override public void utConfigurationQueried(com.android.ims.internal.IImsUt ut, int id, android.os.Bundle ssInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((ut!=null))?(ut.asBinder()):(null)));
_data.writeInt(id);
if ((ssInfo!=null)) {
_data.writeInt(1);
ssInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_utConfigurationQueried, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void utConfigurationQueryFailed(com.android.ims.internal.IImsUt ut, int id, com.android.ims.ImsReasonInfo error) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((ut!=null))?(ut.asBinder()):(null)));
_data.writeInt(id);
if ((error!=null)) {
_data.writeInt(1);
error.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_utConfigurationQueryFailed, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notifies the status of the call barring supplementary service.
     */
@Override public void utConfigurationCallBarringQueried(com.android.ims.internal.IImsUt ut, int id, com.android.ims.ImsSsInfo[] cbInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((ut!=null))?(ut.asBinder()):(null)));
_data.writeInt(id);
_data.writeTypedArray(cbInfo, 0);
mRemote.transact(Stub.TRANSACTION_utConfigurationCallBarringQueried, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notifies the status of the call forwarding supplementary service.
     */
@Override public void utConfigurationCallForwardQueried(com.android.ims.internal.IImsUt ut, int id, com.android.ims.ImsCallForwardInfo[] cfInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((ut!=null))?(ut.asBinder()):(null)));
_data.writeInt(id);
_data.writeTypedArray(cfInfo, 0);
mRemote.transact(Stub.TRANSACTION_utConfigurationCallForwardQueried, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notifies the status of the call waiting supplementary service.
     */
@Override public void utConfigurationCallWaitingQueried(com.android.ims.internal.IImsUt ut, int id, com.android.ims.ImsSsInfo[] cwInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((ut!=null))?(ut.asBinder()):(null)));
_data.writeInt(id);
_data.writeTypedArray(cwInfo, 0);
mRemote.transact(Stub.TRANSACTION_utConfigurationCallWaitingQueried, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_utConfigurationUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_utConfigurationUpdateFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_utConfigurationQueried = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_utConfigurationQueryFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_utConfigurationCallBarringQueried = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_utConfigurationCallForwardQueried = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_utConfigurationCallWaitingQueried = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
/**
     * Notifies the result of the supplementary service configuration udpate.
     */
public void utConfigurationUpdated(com.android.ims.internal.IImsUt ut, int id) throws android.os.RemoteException;
public void utConfigurationUpdateFailed(com.android.ims.internal.IImsUt ut, int id, com.android.ims.ImsReasonInfo error) throws android.os.RemoteException;
/**
     * Notifies the result of the supplementary service configuration query.
     */
public void utConfigurationQueried(com.android.ims.internal.IImsUt ut, int id, android.os.Bundle ssInfo) throws android.os.RemoteException;
public void utConfigurationQueryFailed(com.android.ims.internal.IImsUt ut, int id, com.android.ims.ImsReasonInfo error) throws android.os.RemoteException;
/**
     * Notifies the status of the call barring supplementary service.
     */
public void utConfigurationCallBarringQueried(com.android.ims.internal.IImsUt ut, int id, com.android.ims.ImsSsInfo[] cbInfo) throws android.os.RemoteException;
/**
     * Notifies the status of the call forwarding supplementary service.
     */
public void utConfigurationCallForwardQueried(com.android.ims.internal.IImsUt ut, int id, com.android.ims.ImsCallForwardInfo[] cfInfo) throws android.os.RemoteException;
/**
     * Notifies the status of the call waiting supplementary service.
     */
public void utConfigurationCallWaitingQueried(com.android.ims.internal.IImsUt ut, int id, com.android.ims.ImsSsInfo[] cwInfo) throws android.os.RemoteException;
}
