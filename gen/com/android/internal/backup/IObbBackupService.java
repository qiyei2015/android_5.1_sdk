/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/com/android/internal/backup/IObbBackupService.aidl
 */
package com.android.internal.backup;
/**
 * Interface for the Backup Manager Service to communicate with a helper service that
 * handles local (whole-file) backup & restore of OBB content on behalf of applications.
 * This can't be done within the Backup Manager Service itself because of the restrictions
 * on system-user access to external storage, and can't be left to the apps because even
 * apps that do not have permission to access external storage in the usual way can still
 * use OBBs.
 *
 * {@hide}
 */
public interface IObbBackupService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.backup.IObbBackupService
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.backup.IObbBackupService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.backup.IObbBackupService interface,
 * generating a proxy if needed.
 */
public static com.android.internal.backup.IObbBackupService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.backup.IObbBackupService))) {
return ((com.android.internal.backup.IObbBackupService)iin);
}
return new com.android.internal.backup.IObbBackupService.Stub.Proxy(obj);
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
case TRANSACTION_backupObbs:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.ParcelFileDescriptor _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
android.app.backup.IBackupManager _arg3;
_arg3 = android.app.backup.IBackupManager.Stub.asInterface(data.readStrongBinder());
this.backupObbs(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_restoreObbFile:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.ParcelFileDescriptor _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
long _arg2;
_arg2 = data.readLong();
int _arg3;
_arg3 = data.readInt();
java.lang.String _arg4;
_arg4 = data.readString();
long _arg5;
_arg5 = data.readLong();
long _arg6;
_arg6 = data.readLong();
int _arg7;
_arg7 = data.readInt();
android.app.backup.IBackupManager _arg8;
_arg8 = android.app.backup.IBackupManager.Stub.asInterface(data.readStrongBinder());
this.restoreObbFile(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.backup.IObbBackupService
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
/*
     * Back up a package's OBB directory tree
     */
@Override public void backupObbs(java.lang.String packageName, android.os.ParcelFileDescriptor data, int token, android.app.backup.IBackupManager callbackBinder) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
if ((data!=null)) {
_data.writeInt(1);
data.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(token);
_data.writeStrongBinder((((callbackBinder!=null))?(callbackBinder.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_backupObbs, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/*
     * Restore an OBB file for the given package from the incoming stream
     */
@Override public void restoreObbFile(java.lang.String pkgName, android.os.ParcelFileDescriptor data, long fileSize, int type, java.lang.String path, long mode, long mtime, int token, android.app.backup.IBackupManager callbackBinder) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkgName);
if ((data!=null)) {
_data.writeInt(1);
data.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeLong(fileSize);
_data.writeInt(type);
_data.writeString(path);
_data.writeLong(mode);
_data.writeLong(mtime);
_data.writeInt(token);
_data.writeStrongBinder((((callbackBinder!=null))?(callbackBinder.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_restoreObbFile, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_backupObbs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_restoreObbFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
/*
     * Back up a package's OBB directory tree
     */
public void backupObbs(java.lang.String packageName, android.os.ParcelFileDescriptor data, int token, android.app.backup.IBackupManager callbackBinder) throws android.os.RemoteException;
/*
     * Restore an OBB file for the given package from the incoming stream
     */
public void restoreObbFile(java.lang.String pkgName, android.os.ParcelFileDescriptor data, long fileSize, int type, java.lang.String path, long mode, long mtime, int token, android.app.backup.IBackupManager callbackBinder) throws android.os.RemoteException;
}
