/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/net/INetworkScoreCache.aidl
 */
package android.net;
/**
 * A service which stores a subset of scored networks from the active network scorer.
 *
 * <p>To be implemented by network subsystems (e.g. Wi-Fi). NetworkScoreService will propagate
 * scores down to each subsystem depending on the network type. Implementations may register for
 * a given network type by calling NetworkScoreManager.registerNetworkSubsystem.
 *
 * <p>A proper implementation should throw SecurityException whenever the caller is not privileged.
 * It may request scores by calling NetworkScoreManager#requestScores(NetworkKey[]); a call to
 * updateScores may follow but may not depending on the active scorer's implementation, and in
 * general this method may be called at any time.
 *
 * <p>Implementations should also override dump() so that "adb shell dumpsys network_score" includes
 * the current scores for each network for debugging purposes.
 * @hide
 */
public interface INetworkScoreCache extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.INetworkScoreCache
{
private static final java.lang.String DESCRIPTOR = "android.net.INetworkScoreCache";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.INetworkScoreCache interface,
 * generating a proxy if needed.
 */
public static android.net.INetworkScoreCache asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.INetworkScoreCache))) {
return ((android.net.INetworkScoreCache)iin);
}
return new android.net.INetworkScoreCache.Stub.Proxy(obj);
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
java.util.List<android.net.ScoredNetwork> _arg0;
_arg0 = data.createTypedArrayList(android.net.ScoredNetwork.CREATOR);
this.updateScores(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_clearScores:
{
data.enforceInterface(DESCRIPTOR);
this.clearScores();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.INetworkScoreCache
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
@Override public void updateScores(java.util.List<android.net.ScoredNetwork> networks) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(networks);
mRemote.transact(Stub.TRANSACTION_updateScores, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearScores() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_clearScores, _data, _reply, 0);
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
}
public void updateScores(java.util.List<android.net.ScoredNetwork> networks) throws android.os.RemoteException;
public void clearScores() throws android.os.RemoteException;
}
