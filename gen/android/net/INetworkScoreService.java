/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/net/INetworkScoreService.aidl
 */
package android.net;
/**
 * A service for updating network scores from a network scorer application.
 * @hide
 */
public interface INetworkScoreService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.INetworkScoreService
{
private static final java.lang.String DESCRIPTOR = "android.net.INetworkScoreService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.INetworkScoreService interface,
 * generating a proxy if needed.
 */
public static android.net.INetworkScoreService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.INetworkScoreService))) {
return ((android.net.INetworkScoreService)iin);
}
return new android.net.INetworkScoreService.Stub.Proxy(obj);
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
case TRANSACTION_updateScores:
{
data.enforceInterface(DESCRIPTOR);
android.net.ScoredNetwork[] _arg0;
_arg0 = data.createTypedArray(android.net.ScoredNetwork.CREATOR);
boolean _result = this.updateScores(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_clearScores:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.clearScores();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setActiveScorer:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.setActiveScorer(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_disableScoring:
{
data.enforceInterface(DESCRIPTOR);
this.disableScoring();
reply.writeNoException();
return true;
}
case TRANSACTION_registerNetworkScoreCache:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.net.INetworkScoreCache _arg1;
_arg1 = android.net.INetworkScoreCache.Stub.asInterface(data.readStrongBinder());
this.registerNetworkScoreCache(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.INetworkScoreService
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
     * Update scores.
     * @return whether the update was successful.
     * @throws SecurityException if the caller is not the current active scorer.
     */
@Override public boolean updateScores(android.net.ScoredNetwork[] networks) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedArray(networks, 0);
mRemote.transact(Stub.TRANSACTION_updateScores, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Clear all scores.
     * @return whether the clear was successful.
     * @throws SecurityException if the caller is neither the current active scorer nor the system.
     */
@Override public boolean clearScores() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_clearScores, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Set the active scorer and clear existing scores.
     * @param packageName the package name of the new scorer to use.
     * @return true if the operation succeeded, or false if the new package is not a valid scorer.
     * @throws SecurityException if the caller is not the system.
     */
@Override public boolean setActiveScorer(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_setActiveScorer, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Disable the current active scorer and clear existing scores.
     * @throws SecurityException if the caller is not the current scorer or the system.
     */
@Override public void disableScoring() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_disableScoring, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Register a network subsystem for scoring.
     *
     * @param networkType the type of network this cache can handle. See {@link NetworkKey#type}.
     * @param scoreCache implementation of {@link INetworkScoreCache} to store the scores.
     * @throws SecurityException if the caller is not the system.
     * @throws IllegalArgumentException if a score cache is already registed for this type.
     * @hide
     */
@Override public void registerNetworkScoreCache(int networkType, android.net.INetworkScoreCache scoreCache) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(networkType);
_data.writeStrongBinder((((scoreCache!=null))?(scoreCache.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerNetworkScoreCache, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_updateScores = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_clearScores = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setActiveScorer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_disableScoring = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_registerNetworkScoreCache = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
/**
     * Update scores.
     * @return whether the update was successful.
     * @throws SecurityException if the caller is not the current active scorer.
     */
public boolean updateScores(android.net.ScoredNetwork[] networks) throws android.os.RemoteException;
/**
     * Clear all scores.
     * @return whether the clear was successful.
     * @throws SecurityException if the caller is neither the current active scorer nor the system.
     */
public boolean clearScores() throws android.os.RemoteException;
/**
     * Set the active scorer and clear existing scores.
     * @param packageName the package name of the new scorer to use.
     * @return true if the operation succeeded, or false if the new package is not a valid scorer.
     * @throws SecurityException if the caller is not the system.
     */
public boolean setActiveScorer(java.lang.String packageName) throws android.os.RemoteException;
/**
     * Disable the current active scorer and clear existing scores.
     * @throws SecurityException if the caller is not the current scorer or the system.
     */
public void disableScoring() throws android.os.RemoteException;
/**
     * Register a network subsystem for scoring.
     *
     * @param networkType the type of network this cache can handle. See {@link NetworkKey#type}.
     * @param scoreCache implementation of {@link INetworkScoreCache} to store the scores.
     * @throws SecurityException if the caller is not the system.
     * @throws IllegalArgumentException if a score cache is already registed for this type.
     * @hide
     */
public void registerNetworkScoreCache(int networkType, android.net.INetworkScoreCache scoreCache) throws android.os.RemoteException;
}
