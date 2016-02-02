/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/app/usage/IUsageStatsManager.aidl
 */
package android.app.usage;
/**
 * System private API for talking with the UsageStatsManagerService.
 *
 * {@hide}
 */
public interface IUsageStatsManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.usage.IUsageStatsManager
{
private static final java.lang.String DESCRIPTOR = "android.app.usage.IUsageStatsManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.usage.IUsageStatsManager interface,
 * generating a proxy if needed.
 */
public static android.app.usage.IUsageStatsManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.usage.IUsageStatsManager))) {
return ((android.app.usage.IUsageStatsManager)iin);
}
return new android.app.usage.IUsageStatsManager.Stub.Proxy(obj);
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
case TRANSACTION_queryUsageStats:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
long _arg1;
_arg1 = data.readLong();
long _arg2;
_arg2 = data.readLong();
java.lang.String _arg3;
_arg3 = data.readString();
android.content.pm.ParceledListSlice _result = this.queryUsageStats(_arg0, _arg1, _arg2, _arg3);
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
case TRANSACTION_queryConfigurationStats:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
long _arg1;
_arg1 = data.readLong();
long _arg2;
_arg2 = data.readLong();
java.lang.String _arg3;
_arg3 = data.readString();
android.content.pm.ParceledListSlice _result = this.queryConfigurationStats(_arg0, _arg1, _arg2, _arg3);
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
case TRANSACTION_queryEvents:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
long _arg1;
_arg1 = data.readLong();
java.lang.String _arg2;
_arg2 = data.readString();
android.app.usage.UsageEvents _result = this.queryEvents(_arg0, _arg1, _arg2);
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
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.usage.IUsageStatsManager
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
@Override public android.content.pm.ParceledListSlice queryUsageStats(int bucketType, long beginTime, long endTime, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ParceledListSlice _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(bucketType);
_data.writeLong(beginTime);
_data.writeLong(endTime);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_queryUsageStats, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(_reply);
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
@Override public android.content.pm.ParceledListSlice queryConfigurationStats(int bucketType, long beginTime, long endTime, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ParceledListSlice _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(bucketType);
_data.writeLong(beginTime);
_data.writeLong(endTime);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_queryConfigurationStats, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(_reply);
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
@Override public android.app.usage.UsageEvents queryEvents(long beginTime, long endTime, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.app.usage.UsageEvents _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(beginTime);
_data.writeLong(endTime);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_queryEvents, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.app.usage.UsageEvents.CREATOR.createFromParcel(_reply);
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
}
static final int TRANSACTION_queryUsageStats = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_queryConfigurationStats = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_queryEvents = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public android.content.pm.ParceledListSlice queryUsageStats(int bucketType, long beginTime, long endTime, java.lang.String callingPackage) throws android.os.RemoteException;
public android.content.pm.ParceledListSlice queryConfigurationStats(int bucketType, long beginTime, long endTime, java.lang.String callingPackage) throws android.os.RemoteException;
public android.app.usage.UsageEvents queryEvents(long beginTime, long endTime, java.lang.String callingPackage) throws android.os.RemoteException;
}
