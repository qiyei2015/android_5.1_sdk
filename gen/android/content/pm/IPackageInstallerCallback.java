/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/content/pm/IPackageInstallerCallback.aidl
 */
package android.content.pm;
/** {@hide} */
public interface IPackageInstallerCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.content.pm.IPackageInstallerCallback
{
private static final java.lang.String DESCRIPTOR = "android.content.pm.IPackageInstallerCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.content.pm.IPackageInstallerCallback interface,
 * generating a proxy if needed.
 */
public static android.content.pm.IPackageInstallerCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.content.pm.IPackageInstallerCallback))) {
return ((android.content.pm.IPackageInstallerCallback)iin);
}
return new android.content.pm.IPackageInstallerCallback.Stub.Proxy(obj);
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
case TRANSACTION_onSessionCreated:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onSessionCreated(_arg0);
return true;
}
case TRANSACTION_onSessionBadgingChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onSessionBadgingChanged(_arg0);
return true;
}
case TRANSACTION_onSessionActiveChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.onSessionActiveChanged(_arg0, _arg1);
return true;
}
case TRANSACTION_onSessionProgressChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
float _arg1;
_arg1 = data.readFloat();
this.onSessionProgressChanged(_arg0, _arg1);
return true;
}
case TRANSACTION_onSessionFinished:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.onSessionFinished(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.content.pm.IPackageInstallerCallback
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
@Override public void onSessionCreated(int sessionId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sessionId);
mRemote.transact(Stub.TRANSACTION_onSessionCreated, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onSessionBadgingChanged(int sessionId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sessionId);
mRemote.transact(Stub.TRANSACTION_onSessionBadgingChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onSessionActiveChanged(int sessionId, boolean active) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sessionId);
_data.writeInt(((active)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onSessionActiveChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onSessionProgressChanged(int sessionId, float progress) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sessionId);
_data.writeFloat(progress);
mRemote.transact(Stub.TRANSACTION_onSessionProgressChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onSessionFinished(int sessionId, boolean success) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sessionId);
_data.writeInt(((success)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onSessionFinished, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onSessionCreated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onSessionBadgingChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onSessionActiveChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onSessionProgressChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onSessionFinished = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public void onSessionCreated(int sessionId) throws android.os.RemoteException;
public void onSessionBadgingChanged(int sessionId) throws android.os.RemoteException;
public void onSessionActiveChanged(int sessionId, boolean active) throws android.os.RemoteException;
public void onSessionProgressChanged(int sessionId, float progress) throws android.os.RemoteException;
public void onSessionFinished(int sessionId, boolean success) throws android.os.RemoteException;
}
