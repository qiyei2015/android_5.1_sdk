/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/service/trust/ITrustAgentServiceCallback.aidl
 */
package android.service.trust;
/**
 * Communication channel from the TrustAgentService back to TrustManagerService.
 * @hide
 */
public interface ITrustAgentServiceCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.trust.ITrustAgentServiceCallback
{
private static final java.lang.String DESCRIPTOR = "android.service.trust.ITrustAgentServiceCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.trust.ITrustAgentServiceCallback interface,
 * generating a proxy if needed.
 */
public static android.service.trust.ITrustAgentServiceCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.trust.ITrustAgentServiceCallback))) {
return ((android.service.trust.ITrustAgentServiceCallback)iin);
}
return new android.service.trust.ITrustAgentServiceCallback.Stub.Proxy(obj);
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
case TRANSACTION_grantTrust:
{
data.enforceInterface(DESCRIPTOR);
java.lang.CharSequence _arg0;
if ((0!=data.readInt())) {
_arg0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
long _arg1;
_arg1 = data.readLong();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.grantTrust(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_revokeTrust:
{
data.enforceInterface(DESCRIPTOR);
this.revokeTrust();
return true;
}
case TRANSACTION_setManagingTrust:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setManagingTrust(_arg0);
return true;
}
case TRANSACTION_onConfigureCompleted:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
this.onConfigureCompleted(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.trust.ITrustAgentServiceCallback
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
@Override public void grantTrust(java.lang.CharSequence message, long durationMs, boolean initiatedByUser) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((message!=null)) {
_data.writeInt(1);
android.text.TextUtils.writeToParcel(message, _data, 0);
}
else {
_data.writeInt(0);
}
_data.writeLong(durationMs);
_data.writeInt(((initiatedByUser)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_grantTrust, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void revokeTrust() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_revokeTrust, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setManagingTrust(boolean managingTrust) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((managingTrust)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setManagingTrust, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onConfigureCompleted(boolean result, android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((result)?(1):(0)));
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_onConfigureCompleted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_grantTrust = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_revokeTrust = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setManagingTrust = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onConfigureCompleted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public void grantTrust(java.lang.CharSequence message, long durationMs, boolean initiatedByUser) throws android.os.RemoteException;
public void revokeTrust() throws android.os.RemoteException;
public void setManagingTrust(boolean managingTrust) throws android.os.RemoteException;
public void onConfigureCompleted(boolean result, android.os.IBinder token) throws android.os.RemoteException;
}
