/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/telephony/java/com/android/ims/internal/IImsUt.aidl
 */
package com.android.ims.internal;
/**
 * Provides the Ut interface interworking to get/set the supplementary service configuration.
 *
 * {@hide}
 */
public interface IImsUt extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsUt
{
private static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsUt";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.ims.internal.IImsUt interface,
 * generating a proxy if needed.
 */
public static com.android.ims.internal.IImsUt asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.ims.internal.IImsUt))) {
return ((com.android.ims.internal.IImsUt)iin);
}
return new com.android.ims.internal.IImsUt.Stub.Proxy(obj);
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
case TRANSACTION_close:
{
data.enforceInterface(DESCRIPTOR);
this.close();
reply.writeNoException();
return true;
}
case TRANSACTION_queryCallBarring:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.queryCallBarring(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_queryCallForward:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.queryCallForward(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_queryCallWaiting:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.queryCallWaiting();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_queryCLIR:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.queryCLIR();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_queryCLIP:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.queryCLIP();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_queryCOLR:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.queryCOLR();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_queryCOLP:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.queryCOLP();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_transact:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.transact(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_updateCallBarring:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
java.lang.String[] _arg2;
_arg2 = data.createStringArray();
int _result = this.updateCallBarring(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_updateCallForward:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
int _result = this.updateCallForward(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_updateCallWaiting:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _result = this.updateCallWaiting(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_updateCLIR:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.updateCLIR(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_updateCLIP:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _result = this.updateCLIP(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_updateCOLR:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.updateCOLR(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_updateCOLP:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _result = this.updateCOLP(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setListener:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsUtListener _arg0;
_arg0 = com.android.ims.internal.IImsUtListener.Stub.asInterface(data.readStrongBinder());
this.setListener(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.ims.internal.IImsUt
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
     * Closes the object. This object is not usable after being closed.
     */
@Override public void close() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_close, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Retrieves the configuration of the call barring.
     */
@Override public int queryCallBarring(int cbType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(cbType);
mRemote.transact(Stub.TRANSACTION_queryCallBarring, _data, _reply, 0);
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
     * Retrieves the configuration of the call forward.
     */
@Override public int queryCallForward(int condition, java.lang.String number) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(condition);
_data.writeString(number);
mRemote.transact(Stub.TRANSACTION_queryCallForward, _data, _reply, 0);
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
     * Retrieves the configuration of the call waiting.
     */
@Override public int queryCallWaiting() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_queryCallWaiting, _data, _reply, 0);
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
     * Retrieves the default CLIR setting.
     */
@Override public int queryCLIR() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_queryCLIR, _data, _reply, 0);
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
     * Retrieves the CLIP call setting.
     */
@Override public int queryCLIP() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_queryCLIP, _data, _reply, 0);
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
     * Retrieves the COLR call setting.
     */
@Override public int queryCOLR() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_queryCOLR, _data, _reply, 0);
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
     * Retrieves the COLP call setting.
     */
@Override public int queryCOLP() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_queryCOLP, _data, _reply, 0);
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
     * Updates or retrieves the supplementary service configuration.
     */
@Override public int transact(android.os.Bundle ssInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((ssInfo!=null)) {
_data.writeInt(1);
ssInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_transact, _data, _reply, 0);
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
     * Updates the configuration of the call barring.
     */
@Override public int updateCallBarring(int cbType, boolean enable, java.lang.String[] barrList) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(cbType);
_data.writeInt(((enable)?(1):(0)));
_data.writeStringArray(barrList);
mRemote.transact(Stub.TRANSACTION_updateCallBarring, _data, _reply, 0);
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
     * Updates the configuration of the call forward.
     */
@Override public int updateCallForward(int action, int condition, java.lang.String number, int timeSeconds) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(action);
_data.writeInt(condition);
_data.writeString(number);
_data.writeInt(timeSeconds);
mRemote.transact(Stub.TRANSACTION_updateCallForward, _data, _reply, 0);
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
     * Updates the configuration of the call waiting.
     */
@Override public int updateCallWaiting(boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_updateCallWaiting, _data, _reply, 0);
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
     * Updates the configuration of the CLIR supplementary service.
     */
@Override public int updateCLIR(int clirMode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clirMode);
mRemote.transact(Stub.TRANSACTION_updateCLIR, _data, _reply, 0);
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
     * Updates the configuration of the CLIP supplementary service.
     */
@Override public int updateCLIP(boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_updateCLIP, _data, _reply, 0);
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
     * Updates the configuration of the COLR supplementary service.
     */
@Override public int updateCOLR(int presentation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(presentation);
mRemote.transact(Stub.TRANSACTION_updateCOLR, _data, _reply, 0);
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
     * Updates the configuration of the COLP supplementary service.
     */
@Override public int updateCOLP(boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_updateCOLP, _data, _reply, 0);
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
     * Sets the listener.
     */
@Override public void setListener(com.android.ims.internal.IImsUtListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_close = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_queryCallBarring = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_queryCallForward = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_queryCallWaiting = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_queryCLIR = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_queryCLIP = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_queryCOLR = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_queryCOLP = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_transact = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_updateCallBarring = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_updateCallForward = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_updateCallWaiting = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_updateCLIR = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_updateCLIP = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_updateCOLR = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_updateCOLP = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_setListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
}
/**
     * Closes the object. This object is not usable after being closed.
     */
public void close() throws android.os.RemoteException;
/**
     * Retrieves the configuration of the call barring.
     */
public int queryCallBarring(int cbType) throws android.os.RemoteException;
/**
     * Retrieves the configuration of the call forward.
     */
public int queryCallForward(int condition, java.lang.String number) throws android.os.RemoteException;
/**
     * Retrieves the configuration of the call waiting.
     */
public int queryCallWaiting() throws android.os.RemoteException;
/**
     * Retrieves the default CLIR setting.
     */
public int queryCLIR() throws android.os.RemoteException;
/**
     * Retrieves the CLIP call setting.
     */
public int queryCLIP() throws android.os.RemoteException;
/**
     * Retrieves the COLR call setting.
     */
public int queryCOLR() throws android.os.RemoteException;
/**
     * Retrieves the COLP call setting.
     */
public int queryCOLP() throws android.os.RemoteException;
/**
     * Updates or retrieves the supplementary service configuration.
     */
public int transact(android.os.Bundle ssInfo) throws android.os.RemoteException;
/**
     * Updates the configuration of the call barring.
     */
public int updateCallBarring(int cbType, boolean enable, java.lang.String[] barrList) throws android.os.RemoteException;
/**
     * Updates the configuration of the call forward.
     */
public int updateCallForward(int action, int condition, java.lang.String number, int timeSeconds) throws android.os.RemoteException;
/**
     * Updates the configuration of the call waiting.
     */
public int updateCallWaiting(boolean enable) throws android.os.RemoteException;
/**
     * Updates the configuration of the CLIR supplementary service.
     */
public int updateCLIR(int clirMode) throws android.os.RemoteException;
/**
     * Updates the configuration of the CLIP supplementary service.
     */
public int updateCLIP(boolean enable) throws android.os.RemoteException;
/**
     * Updates the configuration of the COLR supplementary service.
     */
public int updateCOLR(int presentation) throws android.os.RemoteException;
/**
     * Updates the configuration of the COLP supplementary service.
     */
public int updateCOLP(boolean enable) throws android.os.RemoteException;
/**
     * Sets the listener.
     */
public void setListener(com.android.ims.internal.IImsUtListener listener) throws android.os.RemoteException;
}
