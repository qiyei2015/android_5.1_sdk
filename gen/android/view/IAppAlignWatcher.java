/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/view/IAppAlignWatcher.aidl
 */
package android.view;
/**
* {@hide}
 */
public interface IAppAlignWatcher extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.view.IAppAlignWatcher
{
private static final java.lang.String DESCRIPTOR = "android.view.IAppAlignWatcher";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.view.IAppAlignWatcher interface,
 * generating a proxy if needed.
 */
public static android.view.IAppAlignWatcher asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.view.IAppAlignWatcher))) {
return ((android.view.IAppAlignWatcher)iin);
}
return new android.view.IAppAlignWatcher.Stub.Proxy(obj);
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
case TRANSACTION_onAppAlignChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.onAppAlignChanged(_arg0, _arg1);
return true;
}
case TRANSACTION_onHalfScreenWindowPositionChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onHalfScreenWindowPositionChanged(_arg0, _arg1);
return true;
}
case TRANSACTION_dispatchUnhandledKey:
{
data.enforceInterface(DESCRIPTOR);
android.view.KeyEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.KeyEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.dispatchUnhandledKey(_arg0);
return true;
}
case TRANSACTION_onTopAllWindowChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onTopAllWindowChanged(_arg0);
return true;
}
case TRANSACTION_applyXTrac:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.applyXTrac(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.view.IAppAlignWatcher
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
@Override public void onAppAlignChanged(int align, boolean rotate) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(align);
_data.writeInt(((rotate)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onAppAlignChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onHalfScreenWindowPositionChanged(int posX, int posY) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(posX);
_data.writeInt(posY);
mRemote.transact(Stub.TRANSACTION_onHalfScreenWindowPositionChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void dispatchUnhandledKey(android.view.KeyEvent event) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((event!=null)) {
_data.writeInt(1);
event.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_dispatchUnhandledKey, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onTopAllWindowChanged(int taskid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(taskid);
mRemote.transact(Stub.TRANSACTION_onTopAllWindowChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void applyXTrac(int x) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(x);
mRemote.transact(Stub.TRANSACTION_applyXTrac, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onAppAlignChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onHalfScreenWindowPositionChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_dispatchUnhandledKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onTopAllWindowChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_applyXTrac = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public void onAppAlignChanged(int align, boolean rotate) throws android.os.RemoteException;
public void onHalfScreenWindowPositionChanged(int posX, int posY) throws android.os.RemoteException;
public void dispatchUnhandledKey(android.view.KeyEvent event) throws android.os.RemoteException;
public void onTopAllWindowChanged(int taskid) throws android.os.RemoteException;
public void applyXTrac(int x) throws android.os.RemoteException;
}
