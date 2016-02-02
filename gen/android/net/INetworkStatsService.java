/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/net/INetworkStatsService.aidl
 */
package android.net;
/** {@hide} */
public interface INetworkStatsService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.INetworkStatsService
{
private static final java.lang.String DESCRIPTOR = "android.net.INetworkStatsService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.INetworkStatsService interface,
 * generating a proxy if needed.
 */
public static android.net.INetworkStatsService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.INetworkStatsService))) {
return ((android.net.INetworkStatsService)iin);
}
return new android.net.INetworkStatsService.Stub.Proxy(obj);
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
case TRANSACTION_openSession:
{
data.enforceInterface(DESCRIPTOR);
android.net.INetworkStatsSession _result = this.openSession();
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_getNetworkTotalBytes:
{
data.enforceInterface(DESCRIPTOR);
android.net.NetworkTemplate _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.NetworkTemplate.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
long _arg1;
_arg1 = data.readLong();
long _arg2;
_arg2 = data.readLong();
long _result = this.getNetworkTotalBytes(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getDataLayerSnapshotForUid:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.net.NetworkStats _result = this.getDataLayerSnapshotForUid(_arg0);
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
case TRANSACTION_getMobileIfaces:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getMobileIfaces();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_incrementOperationCount:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.incrementOperationCount(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setUidForeground:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setUidForeground(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_forceUpdateIfaces:
{
data.enforceInterface(DESCRIPTOR);
this.forceUpdateIfaces();
reply.writeNoException();
return true;
}
case TRANSACTION_forceUpdate:
{
data.enforceInterface(DESCRIPTOR);
this.forceUpdate();
reply.writeNoException();
return true;
}
case TRANSACTION_advisePersistThreshold:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.advisePersistThreshold(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.INetworkStatsService
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
/** Start a statistics query session. */
@Override public android.net.INetworkStatsSession openSession() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.INetworkStatsSession _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_openSession, _data, _reply, 0);
_reply.readException();
_result = android.net.INetworkStatsSession.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/** Return network layer usage total for traffic that matches template. */
@Override public long getNetworkTotalBytes(android.net.NetworkTemplate template, long start, long end) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((template!=null)) {
_data.writeInt(1);
template.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeLong(start);
_data.writeLong(end);
mRemote.transact(Stub.TRANSACTION_getNetworkTotalBytes, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/** Return data layer snapshot of UID network usage. */
@Override public android.net.NetworkStats getDataLayerSnapshotForUid(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.NetworkStats _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_getDataLayerSnapshotForUid, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.NetworkStats.CREATOR.createFromParcel(_reply);
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
/** Return set of any ifaces associated with mobile networks since boot. */
@Override public java.lang.String[] getMobileIfaces() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getMobileIfaces, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/** Increment data layer count of operations performed for UID and tag. */
@Override public void incrementOperationCount(int uid, int tag, int operationCount) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeInt(tag);
_data.writeInt(operationCount);
mRemote.transact(Stub.TRANSACTION_incrementOperationCount, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** Mark given UID as being in foreground for stats purposes. */
@Override public void setUidForeground(int uid, boolean uidForeground) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeInt(((uidForeground)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setUidForeground, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** Force update of ifaces. */
@Override public void forceUpdateIfaces() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_forceUpdateIfaces, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** Force update of statistics. */
@Override public void forceUpdate() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_forceUpdate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** Advise persistance threshold; may be overridden internally. */
@Override public void advisePersistThreshold(long thresholdBytes) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(thresholdBytes);
mRemote.transact(Stub.TRANSACTION_advisePersistThreshold, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_openSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getNetworkTotalBytes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getDataLayerSnapshotForUid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getMobileIfaces = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_incrementOperationCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setUidForeground = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_forceUpdateIfaces = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_forceUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_advisePersistThreshold = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
}
/** Start a statistics query session. */
public android.net.INetworkStatsSession openSession() throws android.os.RemoteException;
/** Return network layer usage total for traffic that matches template. */
public long getNetworkTotalBytes(android.net.NetworkTemplate template, long start, long end) throws android.os.RemoteException;
/** Return data layer snapshot of UID network usage. */
public android.net.NetworkStats getDataLayerSnapshotForUid(int uid) throws android.os.RemoteException;
/** Return set of any ifaces associated with mobile networks since boot. */
public java.lang.String[] getMobileIfaces() throws android.os.RemoteException;
/** Increment data layer count of operations performed for UID and tag. */
public void incrementOperationCount(int uid, int tag, int operationCount) throws android.os.RemoteException;
/** Mark given UID as being in foreground for stats purposes. */
public void setUidForeground(int uid, boolean uidForeground) throws android.os.RemoteException;
/** Force update of ifaces. */
public void forceUpdateIfaces() throws android.os.RemoteException;
/** Force update of statistics. */
public void forceUpdate() throws android.os.RemoteException;
/** Advise persistance threshold; may be overridden internally. */
public void advisePersistThreshold(long thresholdBytes) throws android.os.RemoteException;
}
