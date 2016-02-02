/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/app/IInstrumentationWatcher.aidl
 */
package android.app;
/** @hide */
public interface IInstrumentationWatcher extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.IInstrumentationWatcher
{
private static final java.lang.String DESCRIPTOR = "android.app.IInstrumentationWatcher";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.IInstrumentationWatcher interface,
 * generating a proxy if needed.
 */
public static android.app.IInstrumentationWatcher asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.IInstrumentationWatcher))) {
return ((android.app.IInstrumentationWatcher)iin);
}
return new android.app.IInstrumentationWatcher.Stub.Proxy(obj);
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
case TRANSACTION_instrumentationStatus:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
android.os.Bundle _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.instrumentationStatus(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_instrumentationFinished:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
android.os.Bundle _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.instrumentationFinished(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.IInstrumentationWatcher
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
@Override public void instrumentationStatus(android.content.ComponentName name, int resultCode, android.os.Bundle results) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((name!=null)) {
_data.writeInt(1);
name.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(resultCode);
if ((results!=null)) {
_data.writeInt(1);
results.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_instrumentationStatus, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void instrumentationFinished(android.content.ComponentName name, int resultCode, android.os.Bundle results) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((name!=null)) {
_data.writeInt(1);
name.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(resultCode);
if ((results!=null)) {
_data.writeInt(1);
results.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_instrumentationFinished, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_instrumentationStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_instrumentationFinished = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void instrumentationStatus(android.content.ComponentName name, int resultCode, android.os.Bundle results) throws android.os.RemoteException;
public void instrumentationFinished(android.content.ComponentName name, int resultCode, android.os.Bundle results) throws android.os.RemoteException;
}
