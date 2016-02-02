/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/content/ISyncServiceAdapter.aidl
 */
package android.content;
/**
 * Interface to define an anonymous service that is extended by developers
 * in order to perform anonymous syncs (syncs without an Account or Content
 * Provider specified). See {@link android.content.AbstractThreadedSyncAdapter}.
 * {@hide}
 */
public interface ISyncServiceAdapter extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.content.ISyncServiceAdapter
{
private static final java.lang.String DESCRIPTOR = "android.content.ISyncServiceAdapter";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.content.ISyncServiceAdapter interface,
 * generating a proxy if needed.
 */
public static android.content.ISyncServiceAdapter asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.content.ISyncServiceAdapter))) {
return ((android.content.ISyncServiceAdapter)iin);
}
return new android.content.ISyncServiceAdapter.Stub.Proxy(obj);
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
case TRANSACTION_startSync:
{
data.enforceInterface(DESCRIPTOR);
android.content.ISyncContext _arg0;
_arg0 = android.content.ISyncContext.Stub.asInterface(data.readStrongBinder());
android.os.Bundle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.startSync(_arg0, _arg1);
return true;
}
case TRANSACTION_cancelSync:
{
data.enforceInterface(DESCRIPTOR);
android.content.ISyncContext _arg0;
_arg0 = android.content.ISyncContext.Stub.asInterface(data.readStrongBinder());
this.cancelSync(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.content.ISyncServiceAdapter
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
/**
     * Initiate a sync. SyncAdapter-specific parameters may be specified in
     * extras, which is guaranteed to not be null.
     *
     * @param syncContext the ISyncContext used to indicate the progress of the sync. When
     *   the sync is finished (successfully or not) ISyncContext.onFinished() must be called.
     * @param extras SyncAdapter-specific parameters.
     *
     */
@Override public void startSync(android.content.ISyncContext syncContext, android.os.Bundle extras) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((syncContext!=null))?(syncContext.asBinder()):(null)));
if ((extras!=null)) {
_data.writeInt(1);
extras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startSync, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Cancel the currently ongoing sync.
     */
@Override public void cancelSync(android.content.ISyncContext syncContext) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((syncContext!=null))?(syncContext.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_cancelSync, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_startSync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_cancelSync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
/**
     * Initiate a sync. SyncAdapter-specific parameters may be specified in
     * extras, which is guaranteed to not be null.
     *
     * @param syncContext the ISyncContext used to indicate the progress of the sync. When
     *   the sync is finished (successfully or not) ISyncContext.onFinished() must be called.
     * @param extras SyncAdapter-specific parameters.
     *
     */
public void startSync(android.content.ISyncContext syncContext, android.os.Bundle extras) throws android.os.RemoteException;
/**
     * Cancel the currently ongoing sync.
     */
public void cancelSync(android.content.ISyncContext syncContext) throws android.os.RemoteException;
}
