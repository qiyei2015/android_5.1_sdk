/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/net/pppoe/IPppoeManager.aidl
 */
package android.net.pppoe;
/**
 * Interface that answers queries about, and allows changing
 * ethernet configuration.
 *//** {@hide} */
public interface IPppoeManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.pppoe.IPppoeManager
{
private static final java.lang.String DESCRIPTOR = "android.net.pppoe.IPppoeManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.pppoe.IPppoeManager interface,
 * generating a proxy if needed.
 */
public static android.net.pppoe.IPppoeManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.pppoe.IPppoeManager))) {
return ((android.net.pppoe.IPppoeManager)iin);
}
return new android.net.pppoe.IPppoeManager.Stub.Proxy(obj);
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
case TRANSACTION_getPppoeState:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getPppoeState();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setupPppoe:
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
java.lang.String _arg4;
_arg4 = data.readString();
boolean _result = this.setupPppoe(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_startPppoe:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.startPppoe();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_stopPppoe:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.stopPppoe();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getPppoePhyIface:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getPppoePhyIface();
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.pppoe.IPppoeManager
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
@Override public int getPppoeState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPppoeState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setupPppoe(java.lang.String user, java.lang.String iface, java.lang.String dns1, java.lang.String dns2, java.lang.String password) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(user);
_data.writeString(iface);
_data.writeString(dns1);
_data.writeString(dns2);
_data.writeString(password);
mRemote.transact(Stub.TRANSACTION_setupPppoe, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean startPppoe() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_startPppoe, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean stopPppoe() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopPppoe, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getPppoePhyIface() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPppoePhyIface, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getPppoeState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setupPppoe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_startPppoe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_stopPppoe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getPppoePhyIface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public int getPppoeState() throws android.os.RemoteException;
public boolean setupPppoe(java.lang.String user, java.lang.String iface, java.lang.String dns1, java.lang.String dns2, java.lang.String password) throws android.os.RemoteException;
public boolean startPppoe() throws android.os.RemoteException;
public boolean stopPppoe() throws android.os.RemoteException;
public java.lang.String getPppoePhyIface() throws android.os.RemoteException;
}
