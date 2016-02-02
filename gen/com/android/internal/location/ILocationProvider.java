/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/location/java/com/android/internal/location/ILocationProvider.aidl
 */
package com.android.internal.location;
/**
 * Binder interface for services that implement location providers.
 * <p>Use {@link LocationProviderBase} as a helper to implement this
 * interface.
 * @hide
 */
public interface ILocationProvider extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.location.ILocationProvider
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.location.ILocationProvider";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.location.ILocationProvider interface,
 * generating a proxy if needed.
 */
public static com.android.internal.location.ILocationProvider asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.location.ILocationProvider))) {
return ((com.android.internal.location.ILocationProvider)iin);
}
return new com.android.internal.location.ILocationProvider.Stub.Proxy(obj);
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
case TRANSACTION_enable:
{
data.enforceInterface(DESCRIPTOR);
this.enable();
reply.writeNoException();
return true;
}
case TRANSACTION_disable:
{
data.enforceInterface(DESCRIPTOR);
this.disable();
reply.writeNoException();
return true;
}
case TRANSACTION_setRequest:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.location.ProviderRequest _arg0;
if ((0!=data.readInt())) {
_arg0 = com.android.internal.location.ProviderRequest.CREATOR.createFromParcel(data);
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
this.setRequest(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getProperties:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.location.ProviderProperties _result = this.getProperties();
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
case TRANSACTION_getStatus:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
_arg0 = new android.os.Bundle();
int _result = this.getStatus(_arg0);
reply.writeNoException();
reply.writeInt(_result);
if ((_arg0!=null)) {
reply.writeInt(1);
_arg0.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getStatusUpdateTime:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getStatusUpdateTime();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_sendExtraCommand:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.Bundle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _result = this.sendExtraCommand(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
if ((_arg1!=null)) {
reply.writeInt(1);
_arg1.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.location.ILocationProvider
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
@Override public void enable() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_enable, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void disable() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_disable, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setRequest(com.android.internal.location.ProviderRequest request, android.os.WorkSource ws) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((request!=null)) {
_data.writeInt(1);
request.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((ws!=null)) {
_data.writeInt(1);
ws.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setRequest, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// --- deprecated (but still supported) ---

@Override public com.android.internal.location.ProviderProperties getProperties() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.internal.location.ProviderProperties _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getProperties, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.android.internal.location.ProviderProperties.CREATOR.createFromParcel(_reply);
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
@Override public int getStatus(android.os.Bundle extras) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getStatus, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
if ((0!=_reply.readInt())) {
extras.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getStatusUpdateTime() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getStatusUpdateTime, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean sendExtraCommand(java.lang.String command, android.os.Bundle extras) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(command);
if ((extras!=null)) {
_data.writeInt(1);
extras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendExtraCommand, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
if ((0!=_reply.readInt())) {
extras.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_enable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_disable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getProperties = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getStatusUpdateTime = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_sendExtraCommand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
public void enable() throws android.os.RemoteException;
public void disable() throws android.os.RemoteException;
public void setRequest(com.android.internal.location.ProviderRequest request, android.os.WorkSource ws) throws android.os.RemoteException;
// --- deprecated (but still supported) ---

public com.android.internal.location.ProviderProperties getProperties() throws android.os.RemoteException;
public int getStatus(android.os.Bundle extras) throws android.os.RemoteException;
public long getStatusUpdateTime() throws android.os.RemoteException;
public boolean sendExtraCommand(java.lang.String command, android.os.Bundle extras) throws android.os.RemoteException;
}
