/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/nfc/INfcAdapterExtras.aidl
 */
package android.nfc;
/**
 * {@hide}
 */
public interface INfcAdapterExtras extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.nfc.INfcAdapterExtras
{
private static final java.lang.String DESCRIPTOR = "android.nfc.INfcAdapterExtras";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.nfc.INfcAdapterExtras interface,
 * generating a proxy if needed.
 */
public static android.nfc.INfcAdapterExtras asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.nfc.INfcAdapterExtras))) {
return ((android.nfc.INfcAdapterExtras)iin);
}
return new android.nfc.INfcAdapterExtras.Stub.Proxy(obj);
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
case TRANSACTION_open:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
android.os.Bundle _result = this.open(_arg0, _arg1);
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
case TRANSACTION_close:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
android.os.Bundle _result = this.close(_arg0, _arg1);
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
case TRANSACTION_transceive:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
byte[] _arg1;
_arg1 = data.createByteArray();
android.os.Bundle _result = this.transceive(_arg0, _arg1);
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
case TRANSACTION_getCardEmulationRoute:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getCardEmulationRoute(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setCardEmulationRoute:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.setCardEmulationRoute(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_authenticate:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
byte[] _arg1;
_arg1 = data.createByteArray();
this.authenticate(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getDriverName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getDriverName(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.nfc.INfcAdapterExtras
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
@Override public android.os.Bundle open(java.lang.String pkg, android.os.IBinder b) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeStrongBinder(b);
mRemote.transact(Stub.TRANSACTION_open, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
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
@Override public android.os.Bundle close(java.lang.String pkg, android.os.IBinder b) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeStrongBinder(b);
mRemote.transact(Stub.TRANSACTION_close, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
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
@Override public android.os.Bundle transceive(java.lang.String pkg, byte[] data_in) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeByteArray(data_in);
mRemote.transact(Stub.TRANSACTION_transceive, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
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
@Override public int getCardEmulationRoute(java.lang.String pkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
mRemote.transact(Stub.TRANSACTION_getCardEmulationRoute, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setCardEmulationRoute(java.lang.String pkg, int route) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(route);
mRemote.transact(Stub.TRANSACTION_setCardEmulationRoute, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void authenticate(java.lang.String pkg, byte[] token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeByteArray(token);
mRemote.transact(Stub.TRANSACTION_authenticate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String getDriverName(java.lang.String pkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
mRemote.transact(Stub.TRANSACTION_getDriverName, _data, _reply, 0);
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
static final int TRANSACTION_open = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_close = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_transceive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getCardEmulationRoute = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setCardEmulationRoute = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_authenticate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getDriverName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
public android.os.Bundle open(java.lang.String pkg, android.os.IBinder b) throws android.os.RemoteException;
public android.os.Bundle close(java.lang.String pkg, android.os.IBinder b) throws android.os.RemoteException;
public android.os.Bundle transceive(java.lang.String pkg, byte[] data_in) throws android.os.RemoteException;
public int getCardEmulationRoute(java.lang.String pkg) throws android.os.RemoteException;
public void setCardEmulationRoute(java.lang.String pkg, int route) throws android.os.RemoteException;
public void authenticate(java.lang.String pkg, byte[] token) throws android.os.RemoteException;
public java.lang.String getDriverName(java.lang.String pkg) throws android.os.RemoteException;
}
