/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/app/job/IJobScheduler.aidl
 */
package android.app.job;
/**
  * IPC interface that supports the app-facing {@link #JobScheduler} api.
  * {@hide}
  */
public interface IJobScheduler extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.job.IJobScheduler
{
private static final java.lang.String DESCRIPTOR = "android.app.job.IJobScheduler";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.job.IJobScheduler interface,
 * generating a proxy if needed.
 */
public static android.app.job.IJobScheduler asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.job.IJobScheduler))) {
return ((android.app.job.IJobScheduler)iin);
}
return new android.app.job.IJobScheduler.Stub.Proxy(obj);
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
case TRANSACTION_schedule:
{
data.enforceInterface(DESCRIPTOR);
android.app.job.JobInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.app.job.JobInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.schedule(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_cancel:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.cancel(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_cancelAll:
{
data.enforceInterface(DESCRIPTOR);
this.cancelAll();
reply.writeNoException();
return true;
}
case TRANSACTION_getAllPendingJobs:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.app.job.JobInfo> _result = this.getAllPendingJobs();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.job.IJobScheduler
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
@Override public int schedule(android.app.job.JobInfo job) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((job!=null)) {
_data.writeInt(1);
job.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_schedule, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void cancel(int jobId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(jobId);
mRemote.transact(Stub.TRANSACTION_cancel, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void cancelAll() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_cancelAll, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.util.List<android.app.job.JobInfo> getAllPendingJobs() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.app.job.JobInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAllPendingJobs, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.app.job.JobInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_schedule = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_cancel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_cancelAll = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getAllPendingJobs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public int schedule(android.app.job.JobInfo job) throws android.os.RemoteException;
public void cancel(int jobId) throws android.os.RemoteException;
public void cancelAll() throws android.os.RemoteException;
public java.util.List<android.app.job.JobInfo> getAllPendingJobs() throws android.os.RemoteException;
}
