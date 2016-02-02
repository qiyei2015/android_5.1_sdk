/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/service/notification/IConditionProvider.aidl
 */
package android.service.notification;
/** @hide */
public interface IConditionProvider extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.notification.IConditionProvider
{
private static final java.lang.String DESCRIPTOR = "android.service.notification.IConditionProvider";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.notification.IConditionProvider interface,
 * generating a proxy if needed.
 */
public static android.service.notification.IConditionProvider asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.notification.IConditionProvider))) {
return ((android.service.notification.IConditionProvider)iin);
}
return new android.service.notification.IConditionProvider.Stub.Proxy(obj);
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
case TRANSACTION_onConnected:
{
data.enforceInterface(DESCRIPTOR);
this.onConnected();
return true;
}
case TRANSACTION_onRequestConditions:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onRequestConditions(_arg0);
return true;
}
case TRANSACTION_onSubscribe:
{
data.enforceInterface(DESCRIPTOR);
android.net.Uri _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onSubscribe(_arg0);
return true;
}
case TRANSACTION_onUnsubscribe:
{
data.enforceInterface(DESCRIPTOR);
android.net.Uri _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onUnsubscribe(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.notification.IConditionProvider
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
@Override public void onConnected() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onConnected, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onRequestConditions(int relevance) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(relevance);
mRemote.transact(Stub.TRANSACTION_onRequestConditions, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onSubscribe(android.net.Uri conditionId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((conditionId!=null)) {
_data.writeInt(1);
conditionId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onSubscribe, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onUnsubscribe(android.net.Uri conditionId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((conditionId!=null)) {
_data.writeInt(1);
conditionId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onUnsubscribe, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onConnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onRequestConditions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onSubscribe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onUnsubscribe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public void onConnected() throws android.os.RemoteException;
public void onRequestConditions(int relevance) throws android.os.RemoteException;
public void onSubscribe(android.net.Uri conditionId) throws android.os.RemoteException;
public void onUnsubscribe(android.net.Uri conditionId) throws android.os.RemoteException;
}
