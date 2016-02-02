/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/view/IAssetAtlas.aidl
 */
package android.view;
/**
 * Programming interface to the system assets atlas. This atlas, when
 * present, holds preloaded drawable in a single, shareable graphics
 * buffer. This allows multiple processes to share the same data to
 * save up on memory.
 *
 * @hide
 */
public interface IAssetAtlas extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.view.IAssetAtlas
{
private static final java.lang.String DESCRIPTOR = "android.view.IAssetAtlas";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.view.IAssetAtlas interface,
 * generating a proxy if needed.
 */
public static android.view.IAssetAtlas asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.view.IAssetAtlas))) {
return ((android.view.IAssetAtlas)iin);
}
return new android.view.IAssetAtlas.Stub.Proxy(obj);
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
case TRANSACTION_isCompatible:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isCompatible(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getBuffer:
{
data.enforceInterface(DESCRIPTOR);
android.view.GraphicBuffer _result = this.getBuffer();
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
case TRANSACTION_getMap:
{
data.enforceInterface(DESCRIPTOR);
long[] _result = this.getMap();
reply.writeNoException();
reply.writeLongArray(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.view.IAssetAtlas
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
     * Indicates whether the atlas is compatible with the specified
     * parent process id. If the atlas' ppid does not match, this
     * method will return false.
     */
@Override public boolean isCompatible(int ppid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(ppid);
mRemote.transact(Stub.TRANSACTION_isCompatible, _data, _reply, 0);
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
     * Returns the atlas buffer (texture) or null if the atlas is
     * not available yet.
     */
@Override public android.view.GraphicBuffer getBuffer() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.view.GraphicBuffer _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getBuffer, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.view.GraphicBuffer.CREATOR.createFromParcel(_reply);
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
/**
     * Returns the map of the bitmaps stored in the atlas or null
     * if the atlas is not available yet.
     *
     * Each bitmap is represented by several entries in the array:
     * long0: SkBitmap*, the native bitmap object
     * long1: x position
     * long2: y position
     * long3: rotated, 1 if the bitmap must be rotated, 0 otherwise
     */
@Override public long[] getMap() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getMap, _data, _reply, 0);
_reply.readException();
_result = _reply.createLongArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_isCompatible = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getMap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
/**
     * Indicates whether the atlas is compatible with the specified
     * parent process id. If the atlas' ppid does not match, this
     * method will return false.
     */
public boolean isCompatible(int ppid) throws android.os.RemoteException;
/**
     * Returns the atlas buffer (texture) or null if the atlas is
     * not available yet.
     */
public android.view.GraphicBuffer getBuffer() throws android.os.RemoteException;
/**
     * Returns the map of the bitmaps stored in the atlas or null
     * if the atlas is not available yet.
     *
     * Each bitmap is represented by several entries in the array:
     * long0: SkBitmap*, the native bitmap object
     * long1: x position
     * long2: y position
     * long3: rotated, 1 if the bitmap must be rotated, 0 otherwise
     */
public long[] getMap() throws android.os.RemoteException;
}
