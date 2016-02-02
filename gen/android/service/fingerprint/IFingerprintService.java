/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/service/fingerprint/IFingerprintService.aidl
 */
package android.service.fingerprint;
/**
 * Communication channel from client to the fingerprint service.
 * @hide
 */
public interface IFingerprintService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.fingerprint.IFingerprintService
{
private static final java.lang.String DESCRIPTOR = "android.service.fingerprint.IFingerprintService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.fingerprint.IFingerprintService interface,
 * generating a proxy if needed.
 */
public static android.service.fingerprint.IFingerprintService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.fingerprint.IFingerprintService))) {
return ((android.service.fingerprint.IFingerprintService)iin);
}
return new android.service.fingerprint.IFingerprintService.Stub.Proxy(obj);
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
case TRANSACTION_enroll:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
long _arg1;
_arg1 = data.readLong();
int _arg2;
_arg2 = data.readInt();
this.enroll(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_enrollCancel:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
this.enrollCancel(_arg0, _arg1);
return true;
}
case TRANSACTION_remove:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.remove(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_startListening:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.service.fingerprint.IFingerprintServiceReceiver _arg1;
_arg1 = android.service.fingerprint.IFingerprintServiceReceiver.Stub.asInterface(data.readStrongBinder());
int _arg2;
_arg2 = data.readInt();
this.startListening(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_stopListening:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
this.stopListening(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.fingerprint.IFingerprintService
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
// Any errors resulting from this call will be returned to the listener

@Override public void enroll(android.os.IBinder token, long timeout, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeLong(timeout);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_enroll, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Any errors resulting from this call will be returned to the listener

@Override public void enrollCancel(android.os.IBinder token, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_enrollCancel, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Any errors resulting from this call will be returned to the listener

@Override public void remove(android.os.IBinder token, int fingerprintId, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(fingerprintId);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_remove, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Start listening for fingerprint events.  This has the side effect of starting
// the hardware if not already started.

@Override public void startListening(android.os.IBinder token, android.service.fingerprint.IFingerprintServiceReceiver receiver, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeStrongBinder((((receiver!=null))?(receiver.asBinder()):(null)));
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_startListening, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Stops listening for fingerprints

@Override public void stopListening(android.os.IBinder token, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_stopListening, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_enroll = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_enrollCancel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_remove = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_startListening = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_stopListening = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
// Any errors resulting from this call will be returned to the listener

public void enroll(android.os.IBinder token, long timeout, int userId) throws android.os.RemoteException;
// Any errors resulting from this call will be returned to the listener

public void enrollCancel(android.os.IBinder token, int userId) throws android.os.RemoteException;
// Any errors resulting from this call will be returned to the listener

public void remove(android.os.IBinder token, int fingerprintId, int userId) throws android.os.RemoteException;
// Start listening for fingerprint events.  This has the side effect of starting
// the hardware if not already started.

public void startListening(android.os.IBinder token, android.service.fingerprint.IFingerprintServiceReceiver receiver, int userId) throws android.os.RemoteException;
// Stops listening for fingerprints

public void stopListening(android.os.IBinder token, int userId) throws android.os.RemoteException;
}
