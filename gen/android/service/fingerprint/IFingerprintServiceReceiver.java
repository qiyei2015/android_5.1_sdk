/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/service/fingerprint/IFingerprintServiceReceiver.aidl
 */
package android.service.fingerprint;
/**
 * Communication channel from the FingerprintService back to FingerprintManager.
 * @hide
 */
public interface IFingerprintServiceReceiver extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.fingerprint.IFingerprintServiceReceiver
{
private static final java.lang.String DESCRIPTOR = "android.service.fingerprint.IFingerprintServiceReceiver";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.fingerprint.IFingerprintServiceReceiver interface,
 * generating a proxy if needed.
 */
public static android.service.fingerprint.IFingerprintServiceReceiver asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.fingerprint.IFingerprintServiceReceiver))) {
return ((android.service.fingerprint.IFingerprintServiceReceiver)iin);
}
return new android.service.fingerprint.IFingerprintServiceReceiver.Stub.Proxy(obj);
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
case TRANSACTION_onEnrollResult:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onEnrollResult(_arg0, _arg1);
return true;
}
case TRANSACTION_onAcquired:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onAcquired(_arg0);
return true;
}
case TRANSACTION_onProcessed:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onProcessed(_arg0);
return true;
}
case TRANSACTION_onError:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onError(_arg0);
return true;
}
case TRANSACTION_onRemoved:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onRemoved(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.fingerprint.IFingerprintServiceReceiver
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
@Override public void onEnrollResult(int fingerprintId, int remaining) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(fingerprintId);
_data.writeInt(remaining);
mRemote.transact(Stub.TRANSACTION_onEnrollResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onAcquired(int acquiredInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(acquiredInfo);
mRemote.transact(Stub.TRANSACTION_onAcquired, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onProcessed(int fingerprintId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(fingerprintId);
mRemote.transact(Stub.TRANSACTION_onProcessed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onError(int error) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(error);
mRemote.transact(Stub.TRANSACTION_onError, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onRemoved(int fingerprintId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(fingerprintId);
mRemote.transact(Stub.TRANSACTION_onRemoved, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onEnrollResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onAcquired = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onProcessed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public void onEnrollResult(int fingerprintId, int remaining) throws android.os.RemoteException;
public void onAcquired(int acquiredInfo) throws android.os.RemoteException;
public void onProcessed(int fingerprintId) throws android.os.RemoteException;
public void onError(int error) throws android.os.RemoteException;
public void onRemoved(int fingerprintId) throws android.os.RemoteException;
}
