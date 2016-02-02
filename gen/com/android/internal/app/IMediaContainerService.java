/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/com/android/internal/app/IMediaContainerService.aidl
 */
package com.android.internal.app;
public interface IMediaContainerService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IMediaContainerService
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.app.IMediaContainerService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.app.IMediaContainerService interface,
 * generating a proxy if needed.
 */
public static com.android.internal.app.IMediaContainerService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.app.IMediaContainerService))) {
return ((com.android.internal.app.IMediaContainerService)iin);
}
return new com.android.internal.app.IMediaContainerService.Stub.Proxy(obj);
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
case TRANSACTION_copyPackageToContainer:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
boolean _arg3;
_arg3 = (0!=data.readInt());
boolean _arg4;
_arg4 = (0!=data.readInt());
java.lang.String _arg5;
_arg5 = data.readString();
java.lang.String _result = this.copyPackageToContainer(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_copyPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.android.internal.os.IParcelFileDescriptorFactory _arg1;
_arg1 = com.android.internal.os.IParcelFileDescriptorFactory.Stub.asInterface(data.readStrongBinder());
int _result = this.copyPackage(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getMinimalPackageInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
android.content.pm.PackageInfoLite _result = this.getMinimalPackageInfo(_arg0, _arg1, _arg2);
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
case TRANSACTION_getObbInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.res.ObbInfo _result = this.getObbInfo(_arg0);
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
case TRANSACTION_calculateDirectorySize:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _result = this.calculateDirectorySize(_arg0);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getFileSystemStats:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long[] _result = this.getFileSystemStats(_arg0);
reply.writeNoException();
reply.writeLongArray(_result);
return true;
}
case TRANSACTION_clearDirectory:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.clearDirectory(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_calculateInstalledSize:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
java.lang.String _arg2;
_arg2 = data.readString();
long _result = this.calculateInstalledSize(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.app.IMediaContainerService
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
@Override public java.lang.String copyPackageToContainer(java.lang.String packagePath, java.lang.String containerId, java.lang.String key, boolean isExternal, boolean isForwardLocked, java.lang.String abiOverride) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packagePath);
_data.writeString(containerId);
_data.writeString(key);
_data.writeInt(((isExternal)?(1):(0)));
_data.writeInt(((isForwardLocked)?(1):(0)));
_data.writeString(abiOverride);
mRemote.transact(Stub.TRANSACTION_copyPackageToContainer, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int copyPackage(java.lang.String packagePath, com.android.internal.os.IParcelFileDescriptorFactory target) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packagePath);
_data.writeStrongBinder((((target!=null))?(target.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_copyPackage, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.pm.PackageInfoLite getMinimalPackageInfo(java.lang.String packagePath, int flags, java.lang.String abiOverride) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.PackageInfoLite _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packagePath);
_data.writeInt(flags);
_data.writeString(abiOverride);
mRemote.transact(Stub.TRANSACTION_getMinimalPackageInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.PackageInfoLite.CREATOR.createFromParcel(_reply);
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
@Override public android.content.res.ObbInfo getObbInfo(java.lang.String filename) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.res.ObbInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(filename);
mRemote.transact(Stub.TRANSACTION_getObbInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.res.ObbInfo.CREATOR.createFromParcel(_reply);
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
@Override public long calculateDirectorySize(java.lang.String directory) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(directory);
mRemote.transact(Stub.TRANSACTION_calculateDirectorySize, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/** Return file system stats: [0] is total bytes, [1] is available bytes */
@Override public long[] getFileSystemStats(java.lang.String path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(path);
mRemote.transact(Stub.TRANSACTION_getFileSystemStats, _data, _reply, 0);
_reply.readException();
_result = _reply.createLongArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void clearDirectory(java.lang.String directory) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(directory);
mRemote.transact(Stub.TRANSACTION_clearDirectory, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public long calculateInstalledSize(java.lang.String packagePath, boolean isForwardLocked, java.lang.String abiOverride) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packagePath);
_data.writeInt(((isForwardLocked)?(1):(0)));
_data.writeString(abiOverride);
mRemote.transact(Stub.TRANSACTION_calculateInstalledSize, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_copyPackageToContainer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_copyPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getMinimalPackageInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getObbInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_calculateDirectorySize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getFileSystemStats = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_clearDirectory = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_calculateInstalledSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
public java.lang.String copyPackageToContainer(java.lang.String packagePath, java.lang.String containerId, java.lang.String key, boolean isExternal, boolean isForwardLocked, java.lang.String abiOverride) throws android.os.RemoteException;
public int copyPackage(java.lang.String packagePath, com.android.internal.os.IParcelFileDescriptorFactory target) throws android.os.RemoteException;
public android.content.pm.PackageInfoLite getMinimalPackageInfo(java.lang.String packagePath, int flags, java.lang.String abiOverride) throws android.os.RemoteException;
public android.content.res.ObbInfo getObbInfo(java.lang.String filename) throws android.os.RemoteException;
public long calculateDirectorySize(java.lang.String directory) throws android.os.RemoteException;
/** Return file system stats: [0] is total bytes, [1] is available bytes */
public long[] getFileSystemStats(java.lang.String path) throws android.os.RemoteException;
public void clearDirectory(java.lang.String directory) throws android.os.RemoteException;
public long calculateInstalledSize(java.lang.String packagePath, boolean isForwardLocked, java.lang.String abiOverride) throws android.os.RemoteException;
}
