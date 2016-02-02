/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/net/IEthernetManager.aidl
 */
package android.net;
/**
 * Interface that answers queries about, and allows changing
 * ethernet configuration.
 *//** {@hide} */
public interface IEthernetManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.IEthernetManager
{
private static final java.lang.String DESCRIPTOR = "android.net.IEthernetManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.IEthernetManager interface,
 * generating a proxy if needed.
 */
public static android.net.IEthernetManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.IEthernetManager))) {
return ((android.net.IEthernetManager)iin);
}
return new android.net.IEthernetManager.Stub.Proxy(obj);
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
case TRANSACTION_getConfiguration:
{
data.enforceInterface(DESCRIPTOR);
android.net.IpConfiguration _result = this.getConfiguration();
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
case TRANSACTION_setConfiguration:
{
data.enforceInterface(DESCRIPTOR);
android.net.IpConfiguration _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.IpConfiguration.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setConfiguration(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isAvailable:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isAvailable();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_addListener:
{
data.enforceInterface(DESCRIPTOR);
android.net.IEthernetServiceListener _arg0;
_arg0 = android.net.IEthernetServiceListener.Stub.asInterface(data.readStrongBinder());
this.addListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_removeListener:
{
data.enforceInterface(DESCRIPTOR);
android.net.IEthernetServiceListener _arg0;
_arg0 = android.net.IEthernetServiceListener.Stub.asInterface(data.readStrongBinder());
this.removeListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getEthernetConnectState:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getEthernetConnectState();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setEthernetEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _result = this.setEthernetEnabled(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getEthernetIfaceState:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getEthernetIfaceState();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.IEthernetManager
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
@Override public android.net.IpConfiguration getConfiguration() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.IpConfiguration _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getConfiguration, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.IpConfiguration.CREATOR.createFromParcel(_reply);
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
@Override public void setConfiguration(android.net.IpConfiguration config) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((config!=null)) {
_data.writeInt(1);
config.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setConfiguration, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isAvailable() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isAvailable, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void addListener(android.net.IEthernetServiceListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_addListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeListener(android.net.IEthernetServiceListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_removeListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getEthernetConnectState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getEthernetConnectState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setEthernetEnabled(boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setEthernetEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getEthernetIfaceState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getEthernetIfaceState, _data, _reply, 0);
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
static final int TRANSACTION_getConfiguration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setConfiguration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_isAvailable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_addListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_removeListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getEthernetConnectState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setEthernetEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getEthernetIfaceState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
public android.net.IpConfiguration getConfiguration() throws android.os.RemoteException;
public void setConfiguration(android.net.IpConfiguration config) throws android.os.RemoteException;
public boolean isAvailable() throws android.os.RemoteException;
public void addListener(android.net.IEthernetServiceListener listener) throws android.os.RemoteException;
public void removeListener(android.net.IEthernetServiceListener listener) throws android.os.RemoteException;
public int getEthernetConnectState() throws android.os.RemoteException;
public boolean setEthernetEnabled(boolean enable) throws android.os.RemoteException;
public int getEthernetIfaceState() throws android.os.RemoteException;
}
