/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/location/java/android/location/IFusedGeofenceHardware.aidl
 */
package android.location;
/**
 * Fused Geofence Hardware interface.
 *
 * <p>This interface is the basic set of supported functionality by Fused Hardware modules that offer
 * Geofencing capabilities.
 *
 * All operations are asynchronous and the status codes can be obtained via a set of callbacks.
 *
 * @hide
 */
public interface IFusedGeofenceHardware extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.location.IFusedGeofenceHardware
{
private static final java.lang.String DESCRIPTOR = "android.location.IFusedGeofenceHardware";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.location.IFusedGeofenceHardware interface,
 * generating a proxy if needed.
 */
public static android.location.IFusedGeofenceHardware asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.location.IFusedGeofenceHardware))) {
return ((android.location.IFusedGeofenceHardware)iin);
}
return new android.location.IFusedGeofenceHardware.Stub.Proxy(obj);
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
case TRANSACTION_isSupported:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isSupported();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_addGeofences:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.location.GeofenceHardwareRequestParcelable[] _arg0;
_arg0 = data.createTypedArray(android.hardware.location.GeofenceHardwareRequestParcelable.CREATOR);
this.addGeofences(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_removeGeofences:
{
data.enforceInterface(DESCRIPTOR);
int[] _arg0;
_arg0 = data.createIntArray();
this.removeGeofences(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_pauseMonitoringGeofence:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.pauseMonitoringGeofence(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_resumeMonitoringGeofence:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.resumeMonitoringGeofence(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_modifyGeofenceOptions:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
int _arg5;
_arg5 = data.readInt();
this.modifyGeofenceOptions(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.location.IFusedGeofenceHardware
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
     * Flags if the interface functionality is supported by the platform.
     *
     * @return true if the functionality is supported, false otherwise.
     */
@Override public boolean isSupported() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isSupported, _data, _reply, 0);
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
     * Adds a given list of geofences to the system.
     *
     * @param geofenceRequestsArray    The list of geofences to add.
     */
@Override public void addGeofences(android.hardware.location.GeofenceHardwareRequestParcelable[] geofenceRequestsArray) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedArray(geofenceRequestsArray, 0);
mRemote.transact(Stub.TRANSACTION_addGeofences, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Removes a give list of geofences from the system.
     *
     * @param geofences     The list of geofences to remove.
     */
@Override public void removeGeofences(int[] geofenceIds) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeIntArray(geofenceIds);
mRemote.transact(Stub.TRANSACTION_removeGeofences, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Pauses monitoring a particular geofence.
     * 
     * @param geofenceId    The geofence to pause monitoring.
     */
@Override public void pauseMonitoringGeofence(int geofenceId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(geofenceId);
mRemote.transact(Stub.TRANSACTION_pauseMonitoringGeofence, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Resumes monitoring a particular geofence.
     *
     * @param geofenceid            The geofence to resume monitoring.
     * @param transitionsToMonitor  The transitions to monitor upon resume.
     *
     * Remarks: keep naming of geofence request options consistent with the naming used in
     *          GeofenceHardwareRequest
     */
@Override public void resumeMonitoringGeofence(int geofenceId, int monitorTransitions) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(geofenceId);
_data.writeInt(monitorTransitions);
mRemote.transact(Stub.TRANSACTION_resumeMonitoringGeofence, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Modifies the request options if a geofence that is already known by the
     * system.
     *  
     * @param geofenceId                    The geofence to modify.
     * @param lastTransition                The last known transition state of
     *                                      the geofence.
     * @param monitorTransitions            The set of transitions to monitor.
     * @param notificationResponsiveness    The notification responsivness needed.
     * @param unknownTimer                  The time span associated with the.
     * @param sourcesToUse                  The source technologies to use.
     *
     * Remarks: keep the options as separate fields to be able to leverage the class
     * GeofenceHardwareRequest without any changes
     */
@Override public void modifyGeofenceOptions(int geofenceId, int lastTransition, int monitorTransitions, int notificationResponsiveness, int unknownTimer, int sourcesToUse) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(geofenceId);
_data.writeInt(lastTransition);
_data.writeInt(monitorTransitions);
_data.writeInt(notificationResponsiveness);
_data.writeInt(unknownTimer);
_data.writeInt(sourcesToUse);
mRemote.transact(Stub.TRANSACTION_modifyGeofenceOptions, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_isSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_addGeofences = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_removeGeofences = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_pauseMonitoringGeofence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_resumeMonitoringGeofence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_modifyGeofenceOptions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
}
/**
     * Flags if the interface functionality is supported by the platform.
     *
     * @return true if the functionality is supported, false otherwise.
     */
public boolean isSupported() throws android.os.RemoteException;
/**
     * Adds a given list of geofences to the system.
     *
     * @param geofenceRequestsArray    The list of geofences to add.
     */
public void addGeofences(android.hardware.location.GeofenceHardwareRequestParcelable[] geofenceRequestsArray) throws android.os.RemoteException;
/**
     * Removes a give list of geofences from the system.
     *
     * @param geofences     The list of geofences to remove.
     */
public void removeGeofences(int[] geofenceIds) throws android.os.RemoteException;
/**
     * Pauses monitoring a particular geofence.
     * 
     * @param geofenceId    The geofence to pause monitoring.
     */
public void pauseMonitoringGeofence(int geofenceId) throws android.os.RemoteException;
/**
     * Resumes monitoring a particular geofence.
     *
     * @param geofenceid            The geofence to resume monitoring.
     * @param transitionsToMonitor  The transitions to monitor upon resume.
     *
     * Remarks: keep naming of geofence request options consistent with the naming used in
     *          GeofenceHardwareRequest
     */
public void resumeMonitoringGeofence(int geofenceId, int monitorTransitions) throws android.os.RemoteException;
/**
     * Modifies the request options if a geofence that is already known by the
     * system.
     *  
     * @param geofenceId                    The geofence to modify.
     * @param lastTransition                The last known transition state of
     *                                      the geofence.
     * @param monitorTransitions            The set of transitions to monitor.
     * @param notificationResponsiveness    The notification responsivness needed.
     * @param unknownTimer                  The time span associated with the.
     * @param sourcesToUse                  The source technologies to use.
     *
     * Remarks: keep the options as separate fields to be able to leverage the class
     * GeofenceHardwareRequest without any changes
     */
public void modifyGeofenceOptions(int geofenceId, int lastTransition, int monitorTransitions, int notificationResponsiveness, int unknownTimer, int sourcesToUse) throws android.os.RemoteException;
}
