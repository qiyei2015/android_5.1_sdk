/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/location/java/android/location/IGpsGeofenceHardware.aidl
 */
package android.location;
/**
 * GPS hardware geofence
 *
 * @hide
 */
public interface IGpsGeofenceHardware extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.location.IGpsGeofenceHardware
{
private static final java.lang.String DESCRIPTOR = "android.location.IGpsGeofenceHardware";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.location.IGpsGeofenceHardware interface,
 * generating a proxy if needed.
 */
public static android.location.IGpsGeofenceHardware asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.location.IGpsGeofenceHardware))) {
return ((android.location.IGpsGeofenceHardware)iin);
}
return new android.location.IGpsGeofenceHardware.Stub.Proxy(obj);
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
case TRANSACTION_isHardwareGeofenceSupported:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isHardwareGeofenceSupported();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_addCircularHardwareGeofence:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
double _arg1;
_arg1 = data.readDouble();
double _arg2;
_arg2 = data.readDouble();
double _arg3;
_arg3 = data.readDouble();
int _arg4;
_arg4 = data.readInt();
int _arg5;
_arg5 = data.readInt();
int _arg6;
_arg6 = data.readInt();
int _arg7;
_arg7 = data.readInt();
boolean _result = this.addCircularHardwareGeofence(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeHardwareGeofence:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.removeHardwareGeofence(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_pauseHardwareGeofence:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.pauseHardwareGeofence(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_resumeHardwareGeofence:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.resumeHardwareGeofence(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.location.IGpsGeofenceHardware
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
@Override public boolean isHardwareGeofenceSupported() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isHardwareGeofenceSupported, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean addCircularHardwareGeofence(int geofenceId, double latitude, double longitude, double radius, int lastTransition, int monitorTransition, int notificationResponsiveness, int unknownTimer) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(geofenceId);
_data.writeDouble(latitude);
_data.writeDouble(longitude);
_data.writeDouble(radius);
_data.writeInt(lastTransition);
_data.writeInt(monitorTransition);
_data.writeInt(notificationResponsiveness);
_data.writeInt(unknownTimer);
mRemote.transact(Stub.TRANSACTION_addCircularHardwareGeofence, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean removeHardwareGeofence(int geofenceId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(geofenceId);
mRemote.transact(Stub.TRANSACTION_removeHardwareGeofence, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean pauseHardwareGeofence(int geofenceId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(geofenceId);
mRemote.transact(Stub.TRANSACTION_pauseHardwareGeofence, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean resumeHardwareGeofence(int geofenceId, int monitorTransition) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(geofenceId);
_data.writeInt(monitorTransition);
mRemote.transact(Stub.TRANSACTION_resumeHardwareGeofence, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_isHardwareGeofenceSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_addCircularHardwareGeofence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_removeHardwareGeofence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_pauseHardwareGeofence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_resumeHardwareGeofence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public boolean isHardwareGeofenceSupported() throws android.os.RemoteException;
public boolean addCircularHardwareGeofence(int geofenceId, double latitude, double longitude, double radius, int lastTransition, int monitorTransition, int notificationResponsiveness, int unknownTimer) throws android.os.RemoteException;
public boolean removeHardwareGeofence(int geofenceId) throws android.os.RemoteException;
public boolean pauseHardwareGeofence(int geofenceId) throws android.os.RemoteException;
public boolean resumeHardwareGeofence(int geofenceId, int monitorTransition) throws android.os.RemoteException;
}
