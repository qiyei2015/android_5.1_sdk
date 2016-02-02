/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/hardware/location/IGeofenceHardwareCallback.aidl
 */
package android.hardware.location;
/** @hide */
public interface IGeofenceHardwareCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.location.IGeofenceHardwareCallback
{
private static final java.lang.String DESCRIPTOR = "android.hardware.location.IGeofenceHardwareCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.location.IGeofenceHardwareCallback interface,
 * generating a proxy if needed.
 */
public static android.hardware.location.IGeofenceHardwareCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.location.IGeofenceHardwareCallback))) {
return ((android.hardware.location.IGeofenceHardwareCallback)iin);
}
return new android.hardware.location.IGeofenceHardwareCallback.Stub.Proxy(obj);
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
case TRANSACTION_onGeofenceTransition:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
android.location.Location _arg2;
if ((0!=data.readInt())) {
_arg2 = android.location.Location.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
long _arg3;
_arg3 = data.readLong();
int _arg4;
_arg4 = data.readInt();
this.onGeofenceTransition(_arg0, _arg1, _arg2, _arg3, _arg4);
return true;
}
case TRANSACTION_onGeofenceAdd:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onGeofenceAdd(_arg0, _arg1);
return true;
}
case TRANSACTION_onGeofenceRemove:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onGeofenceRemove(_arg0, _arg1);
return true;
}
case TRANSACTION_onGeofencePause:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onGeofencePause(_arg0, _arg1);
return true;
}
case TRANSACTION_onGeofenceResume:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onGeofenceResume(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.location.IGeofenceHardwareCallback
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
@Override public void onGeofenceTransition(int geofenceId, int transition, android.location.Location location, long timestamp, int monitoringType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(geofenceId);
_data.writeInt(transition);
if ((location!=null)) {
_data.writeInt(1);
location.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeLong(timestamp);
_data.writeInt(monitoringType);
mRemote.transact(Stub.TRANSACTION_onGeofenceTransition, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onGeofenceAdd(int geofenceId, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(geofenceId);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onGeofenceAdd, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onGeofenceRemove(int geofenceId, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(geofenceId);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onGeofenceRemove, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onGeofencePause(int geofenceId, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(geofenceId);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onGeofencePause, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onGeofenceResume(int geofenceId, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(geofenceId);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onGeofenceResume, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onGeofenceTransition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onGeofenceAdd = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onGeofenceRemove = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onGeofencePause = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onGeofenceResume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public void onGeofenceTransition(int geofenceId, int transition, android.location.Location location, long timestamp, int monitoringType) throws android.os.RemoteException;
public void onGeofenceAdd(int geofenceId, int status) throws android.os.RemoteException;
public void onGeofenceRemove(int geofenceId, int status) throws android.os.RemoteException;
public void onGeofencePause(int geofenceId, int status) throws android.os.RemoteException;
public void onGeofenceResume(int geofenceId, int status) throws android.os.RemoteException;
}
