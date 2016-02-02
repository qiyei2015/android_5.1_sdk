/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/service/dreams/IDreamManager.aidl
 */
package android.service.dreams;
/** @hide */
public interface IDreamManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.dreams.IDreamManager
{
private static final java.lang.String DESCRIPTOR = "android.service.dreams.IDreamManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.dreams.IDreamManager interface,
 * generating a proxy if needed.
 */
public static android.service.dreams.IDreamManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.dreams.IDreamManager))) {
return ((android.service.dreams.IDreamManager)iin);
}
return new android.service.dreams.IDreamManager.Stub.Proxy(obj);
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
case TRANSACTION_dream:
{
data.enforceInterface(DESCRIPTOR);
this.dream();
reply.writeNoException();
return true;
}
case TRANSACTION_awaken:
{
data.enforceInterface(DESCRIPTOR);
this.awaken();
reply.writeNoException();
return true;
}
case TRANSACTION_setDreamComponents:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName[] _arg0;
_arg0 = data.createTypedArray(android.content.ComponentName.CREATOR);
this.setDreamComponents(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getDreamComponents:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName[] _result = this.getDreamComponents();
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_getDefaultDreamComponent:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _result = this.getDefaultDreamComponent();
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
case TRANSACTION_testDream:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.testDream(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isDreaming:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isDreaming();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_finishSelf:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.finishSelf(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_startDozing:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.startDozing(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_stopDozing:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.stopDozing(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.dreams.IDreamManager
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
@Override public void dream() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_dream, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void awaken() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_awaken, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setDreamComponents(android.content.ComponentName[] componentNames) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedArray(componentNames, 0);
mRemote.transact(Stub.TRANSACTION_setDreamComponents, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.content.ComponentName[] getDreamComponents() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.ComponentName[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDreamComponents, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.content.ComponentName.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.ComponentName getDefaultDreamComponent() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.ComponentName _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDefaultDreamComponent, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.ComponentName.CREATOR.createFromParcel(_reply);
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
@Override public void testDream(android.content.ComponentName componentName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((componentName!=null)) {
_data.writeInt(1);
componentName.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_testDream, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isDreaming() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isDreaming, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void finishSelf(android.os.IBinder token, boolean immediate) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(((immediate)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_finishSelf, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void startDozing(android.os.IBinder token, int screenState, int screenBrightness) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(screenState);
_data.writeInt(screenBrightness);
mRemote.transact(Stub.TRANSACTION_startDozing, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopDozing(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_stopDozing, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_dream = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_awaken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setDreamComponents = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getDreamComponents = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getDefaultDreamComponent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_testDream = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_isDreaming = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_finishSelf = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_startDozing = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_stopDozing = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
}
public void dream() throws android.os.RemoteException;
public void awaken() throws android.os.RemoteException;
public void setDreamComponents(android.content.ComponentName[] componentNames) throws android.os.RemoteException;
public android.content.ComponentName[] getDreamComponents() throws android.os.RemoteException;
public android.content.ComponentName getDefaultDreamComponent() throws android.os.RemoteException;
public void testDream(android.content.ComponentName componentName) throws android.os.RemoteException;
public boolean isDreaming() throws android.os.RemoteException;
public void finishSelf(android.os.IBinder token, boolean immediate) throws android.os.RemoteException;
public void startDozing(android.os.IBinder token, int screenState, int screenBrightness) throws android.os.RemoteException;
public void stopDozing(android.os.IBinder token) throws android.os.RemoteException;
}
