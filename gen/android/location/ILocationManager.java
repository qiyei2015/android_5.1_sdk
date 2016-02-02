/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/location/java/android/location/ILocationManager.aidl
 */
package android.location;
/**
 * System private API for talking with the location service.
 *
 * @hide
 */
public interface ILocationManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.location.ILocationManager
{
private static final java.lang.String DESCRIPTOR = "android.location.ILocationManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.location.ILocationManager interface,
 * generating a proxy if needed.
 */
public static android.location.ILocationManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.location.ILocationManager))) {
return ((android.location.ILocationManager)iin);
}
return new android.location.ILocationManager.Stub.Proxy(obj);
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
case TRANSACTION_requestLocationUpdates:
{
data.enforceInterface(DESCRIPTOR);
android.location.LocationRequest _arg0;
if ((0!=data.readInt())) {
_arg0 = android.location.LocationRequest.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.location.ILocationListener _arg1;
_arg1 = android.location.ILocationListener.Stub.asInterface(data.readStrongBinder());
android.app.PendingIntent _arg2;
if ((0!=data.readInt())) {
_arg2 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
java.lang.String _arg3;
_arg3 = data.readString();
this.requestLocationUpdates(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_removeUpdates:
{
data.enforceInterface(DESCRIPTOR);
android.location.ILocationListener _arg0;
_arg0 = android.location.ILocationListener.Stub.asInterface(data.readStrongBinder());
android.app.PendingIntent _arg1;
if ((0!=data.readInt())) {
_arg1 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String _arg2;
_arg2 = data.readString();
this.removeUpdates(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_requestGeofence:
{
data.enforceInterface(DESCRIPTOR);
android.location.LocationRequest _arg0;
if ((0!=data.readInt())) {
_arg0 = android.location.LocationRequest.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.location.Geofence _arg1;
if ((0!=data.readInt())) {
_arg1 = android.location.Geofence.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.app.PendingIntent _arg2;
if ((0!=data.readInt())) {
_arg2 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
java.lang.String _arg3;
_arg3 = data.readString();
this.requestGeofence(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_removeGeofence:
{
data.enforceInterface(DESCRIPTOR);
android.location.Geofence _arg0;
if ((0!=data.readInt())) {
_arg0 = android.location.Geofence.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.app.PendingIntent _arg1;
if ((0!=data.readInt())) {
_arg1 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String _arg2;
_arg2 = data.readString();
this.removeGeofence(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getLastLocation:
{
data.enforceInterface(DESCRIPTOR);
android.location.LocationRequest _arg0;
if ((0!=data.readInt())) {
_arg0 = android.location.LocationRequest.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
android.location.Location _result = this.getLastLocation(_arg0, _arg1);
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
case TRANSACTION_addGpsStatusListener:
{
data.enforceInterface(DESCRIPTOR);
android.location.IGpsStatusListener _arg0;
_arg0 = android.location.IGpsStatusListener.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.addGpsStatusListener(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeGpsStatusListener:
{
data.enforceInterface(DESCRIPTOR);
android.location.IGpsStatusListener _arg0;
_arg0 = android.location.IGpsStatusListener.Stub.asInterface(data.readStrongBinder());
this.removeGpsStatusListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_geocoderIsPresent:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.geocoderIsPresent();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getFromLocation:
{
data.enforceInterface(DESCRIPTOR);
double _arg0;
_arg0 = data.readDouble();
double _arg1;
_arg1 = data.readDouble();
int _arg2;
_arg2 = data.readInt();
android.location.GeocoderParams _arg3;
if ((0!=data.readInt())) {
_arg3 = android.location.GeocoderParams.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
java.util.List<android.location.Address> _arg4;
_arg4 = new java.util.ArrayList<android.location.Address>();
java.lang.String _result = this.getFromLocation(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeString(_result);
reply.writeTypedList(_arg4);
return true;
}
case TRANSACTION_getFromLocationName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
double _arg1;
_arg1 = data.readDouble();
double _arg2;
_arg2 = data.readDouble();
double _arg3;
_arg3 = data.readDouble();
double _arg4;
_arg4 = data.readDouble();
int _arg5;
_arg5 = data.readInt();
android.location.GeocoderParams _arg6;
if ((0!=data.readInt())) {
_arg6 = android.location.GeocoderParams.CREATOR.createFromParcel(data);
}
else {
_arg6 = null;
}
java.util.List<android.location.Address> _arg7;
_arg7 = new java.util.ArrayList<android.location.Address>();
java.lang.String _result = this.getFromLocationName(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
reply.writeNoException();
reply.writeString(_result);
reply.writeTypedList(_arg7);
return true;
}
case TRANSACTION_sendNiResponse:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.sendNiResponse(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_addGpsMeasurementsListener:
{
data.enforceInterface(DESCRIPTOR);
android.location.IGpsMeasurementsListener _arg0;
_arg0 = android.location.IGpsMeasurementsListener.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.addGpsMeasurementsListener(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeGpsMeasurementsListener:
{
data.enforceInterface(DESCRIPTOR);
android.location.IGpsMeasurementsListener _arg0;
_arg0 = android.location.IGpsMeasurementsListener.Stub.asInterface(data.readStrongBinder());
this.removeGpsMeasurementsListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_addGpsNavigationMessageListener:
{
data.enforceInterface(DESCRIPTOR);
android.location.IGpsNavigationMessageListener _arg0;
_arg0 = android.location.IGpsNavigationMessageListener.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.addGpsNavigationMessageListener(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeGpsNavigationMessageListener:
{
data.enforceInterface(DESCRIPTOR);
android.location.IGpsNavigationMessageListener _arg0;
_arg0 = android.location.IGpsNavigationMessageListener.Stub.asInterface(data.readStrongBinder());
this.removeGpsNavigationMessageListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getAllProviders:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<java.lang.String> _result = this.getAllProviders();
reply.writeNoException();
reply.writeStringList(_result);
return true;
}
case TRANSACTION_getProviders:
{
data.enforceInterface(DESCRIPTOR);
android.location.Criteria _arg0;
if ((0!=data.readInt())) {
_arg0 = android.location.Criteria.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
java.util.List<java.lang.String> _result = this.getProviders(_arg0, _arg1);
reply.writeNoException();
reply.writeStringList(_result);
return true;
}
case TRANSACTION_getBestProvider:
{
data.enforceInterface(DESCRIPTOR);
android.location.Criteria _arg0;
if ((0!=data.readInt())) {
_arg0 = android.location.Criteria.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
java.lang.String _result = this.getBestProvider(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_providerMeetsCriteria:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.location.Criteria _arg1;
if ((0!=data.readInt())) {
_arg1 = android.location.Criteria.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _result = this.providerMeetsCriteria(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getProviderProperties:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.android.internal.location.ProviderProperties _result = this.getProviderProperties(_arg0);
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
case TRANSACTION_isProviderEnabled:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isProviderEnabled(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_addTestProvider:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.android.internal.location.ProviderProperties _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.internal.location.ProviderProperties.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.addTestProvider(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_removeTestProvider:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.removeTestProvider(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setTestProviderLocation:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.location.Location _arg1;
if ((0!=data.readInt())) {
_arg1 = android.location.Location.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setTestProviderLocation(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_clearTestProviderLocation:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.clearTestProviderLocation(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setTestProviderEnabled:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setTestProviderEnabled(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_clearTestProviderEnabled:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.clearTestProviderEnabled(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setTestProviderStatus:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.os.Bundle _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
long _arg3;
_arg3 = data.readLong();
this.setTestProviderStatus(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_clearTestProviderStatus:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.clearTestProviderStatus(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_sendExtraCommand:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
android.os.Bundle _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
boolean _result = this.sendExtraCommand(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
if ((_arg2!=null)) {
reply.writeInt(1);
_arg2.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_reportLocation:
{
data.enforceInterface(DESCRIPTOR);
android.location.Location _arg0;
if ((0!=data.readInt())) {
_arg0 = android.location.Location.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
this.reportLocation(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_locationCallbackFinished:
{
data.enforceInterface(DESCRIPTOR);
android.location.ILocationListener _arg0;
_arg0 = android.location.ILocationListener.Stub.asInterface(data.readStrongBinder());
this.locationCallbackFinished(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.location.ILocationManager
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
@Override public void requestLocationUpdates(android.location.LocationRequest request, android.location.ILocationListener listener, android.app.PendingIntent intent, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((request!=null)) {
_data.writeInt(1);
request.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_requestLocationUpdates, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeUpdates(android.location.ILocationListener listener, android.app.PendingIntent intent, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_removeUpdates, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void requestGeofence(android.location.LocationRequest request, android.location.Geofence geofence, android.app.PendingIntent intent, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((request!=null)) {
_data.writeInt(1);
request.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((geofence!=null)) {
_data.writeInt(1);
geofence.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_requestGeofence, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeGeofence(android.location.Geofence fence, android.app.PendingIntent intent, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((fence!=null)) {
_data.writeInt(1);
fence.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_removeGeofence, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.location.Location getLastLocation(android.location.LocationRequest request, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.location.Location _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((request!=null)) {
_data.writeInt(1);
request.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_getLastLocation, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.location.Location.CREATOR.createFromParcel(_reply);
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
@Override public boolean addGpsStatusListener(android.location.IGpsStatusListener listener, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_addGpsStatusListener, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void removeGpsStatusListener(android.location.IGpsStatusListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_removeGpsStatusListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean geocoderIsPresent() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_geocoderIsPresent, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getFromLocation(double latitude, double longitude, int maxResults, android.location.GeocoderParams params, java.util.List<android.location.Address> addrs) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeDouble(latitude);
_data.writeDouble(longitude);
_data.writeInt(maxResults);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getFromLocation, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
_reply.readTypedList(addrs, android.location.Address.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getFromLocationName(java.lang.String locationName, double lowerLeftLatitude, double lowerLeftLongitude, double upperRightLatitude, double upperRightLongitude, int maxResults, android.location.GeocoderParams params, java.util.List<android.location.Address> addrs) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(locationName);
_data.writeDouble(lowerLeftLatitude);
_data.writeDouble(lowerLeftLongitude);
_data.writeDouble(upperRightLatitude);
_data.writeDouble(upperRightLongitude);
_data.writeInt(maxResults);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getFromLocationName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
_reply.readTypedList(addrs, android.location.Address.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean sendNiResponse(int notifId, int userResponse) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(notifId);
_data.writeInt(userResponse);
mRemote.transact(Stub.TRANSACTION_sendNiResponse, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean addGpsMeasurementsListener(android.location.IGpsMeasurementsListener listener, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_addGpsMeasurementsListener, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void removeGpsMeasurementsListener(android.location.IGpsMeasurementsListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_removeGpsMeasurementsListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean addGpsNavigationMessageListener(android.location.IGpsNavigationMessageListener listener, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_addGpsNavigationMessageListener, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void removeGpsNavigationMessageListener(android.location.IGpsNavigationMessageListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_removeGpsNavigationMessageListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// --- deprecated ---

@Override public java.util.List<java.lang.String> getAllProviders() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<java.lang.String> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAllProviders, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArrayList();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<java.lang.String> getProviders(android.location.Criteria criteria, boolean enabledOnly) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<java.lang.String> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((criteria!=null)) {
_data.writeInt(1);
criteria.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((enabledOnly)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getProviders, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArrayList();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getBestProvider(android.location.Criteria criteria, boolean enabledOnly) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((criteria!=null)) {
_data.writeInt(1);
criteria.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((enabledOnly)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getBestProvider, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean providerMeetsCriteria(java.lang.String provider, android.location.Criteria criteria) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(provider);
if ((criteria!=null)) {
_data.writeInt(1);
criteria.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_providerMeetsCriteria, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.android.internal.location.ProviderProperties getProviderProperties(java.lang.String provider) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.internal.location.ProviderProperties _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(provider);
mRemote.transact(Stub.TRANSACTION_getProviderProperties, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.android.internal.location.ProviderProperties.CREATOR.createFromParcel(_reply);
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
@Override public boolean isProviderEnabled(java.lang.String provider) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(provider);
mRemote.transact(Stub.TRANSACTION_isProviderEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void addTestProvider(java.lang.String name, com.android.internal.location.ProviderProperties properties) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
if ((properties!=null)) {
_data.writeInt(1);
properties.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addTestProvider, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeTestProvider(java.lang.String provider) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(provider);
mRemote.transact(Stub.TRANSACTION_removeTestProvider, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setTestProviderLocation(java.lang.String provider, android.location.Location loc) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(provider);
if ((loc!=null)) {
_data.writeInt(1);
loc.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setTestProviderLocation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearTestProviderLocation(java.lang.String provider) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(provider);
mRemote.transact(Stub.TRANSACTION_clearTestProviderLocation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setTestProviderEnabled(java.lang.String provider, boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(provider);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setTestProviderEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearTestProviderEnabled(java.lang.String provider) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(provider);
mRemote.transact(Stub.TRANSACTION_clearTestProviderEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setTestProviderStatus(java.lang.String provider, int status, android.os.Bundle extras, long updateTime) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(provider);
_data.writeInt(status);
if ((extras!=null)) {
_data.writeInt(1);
extras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeLong(updateTime);
mRemote.transact(Stub.TRANSACTION_setTestProviderStatus, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearTestProviderStatus(java.lang.String provider) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(provider);
mRemote.transact(Stub.TRANSACTION_clearTestProviderStatus, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean sendExtraCommand(java.lang.String provider, java.lang.String command, android.os.Bundle extras) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(provider);
_data.writeString(command);
if ((extras!=null)) {
_data.writeInt(1);
extras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendExtraCommand, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
if ((0!=_reply.readInt())) {
extras.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// --- internal ---
// Used by location providers to tell the location manager when it has a new location.
// Passive is true if the location is coming from the passive provider, in which case
// it need not be shared with other providers.

@Override public void reportLocation(android.location.Location location, boolean passive) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((location!=null)) {
_data.writeInt(1);
location.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((passive)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_reportLocation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// for reporting callback completion

@Override public void locationCallbackFinished(android.location.ILocationListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_locationCallbackFinished, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_requestLocationUpdates = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_removeUpdates = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_requestGeofence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_removeGeofence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getLastLocation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_addGpsStatusListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_removeGpsStatusListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_geocoderIsPresent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getFromLocation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getFromLocationName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_sendNiResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_addGpsMeasurementsListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_removeGpsMeasurementsListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_addGpsNavigationMessageListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_removeGpsNavigationMessageListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getAllProviders = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_getProviders = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_getBestProvider = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_providerMeetsCriteria = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_getProviderProperties = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_isProviderEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_addTestProvider = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_removeTestProvider = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_setTestProviderLocation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_clearTestProviderLocation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_setTestProviderEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_clearTestProviderEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_setTestProviderStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_clearTestProviderStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_sendExtraCommand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_reportLocation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_locationCallbackFinished = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
}
public void requestLocationUpdates(android.location.LocationRequest request, android.location.ILocationListener listener, android.app.PendingIntent intent, java.lang.String packageName) throws android.os.RemoteException;
public void removeUpdates(android.location.ILocationListener listener, android.app.PendingIntent intent, java.lang.String packageName) throws android.os.RemoteException;
public void requestGeofence(android.location.LocationRequest request, android.location.Geofence geofence, android.app.PendingIntent intent, java.lang.String packageName) throws android.os.RemoteException;
public void removeGeofence(android.location.Geofence fence, android.app.PendingIntent intent, java.lang.String packageName) throws android.os.RemoteException;
public android.location.Location getLastLocation(android.location.LocationRequest request, java.lang.String packageName) throws android.os.RemoteException;
public boolean addGpsStatusListener(android.location.IGpsStatusListener listener, java.lang.String packageName) throws android.os.RemoteException;
public void removeGpsStatusListener(android.location.IGpsStatusListener listener) throws android.os.RemoteException;
public boolean geocoderIsPresent() throws android.os.RemoteException;
public java.lang.String getFromLocation(double latitude, double longitude, int maxResults, android.location.GeocoderParams params, java.util.List<android.location.Address> addrs) throws android.os.RemoteException;
public java.lang.String getFromLocationName(java.lang.String locationName, double lowerLeftLatitude, double lowerLeftLongitude, double upperRightLatitude, double upperRightLongitude, int maxResults, android.location.GeocoderParams params, java.util.List<android.location.Address> addrs) throws android.os.RemoteException;
public boolean sendNiResponse(int notifId, int userResponse) throws android.os.RemoteException;
public boolean addGpsMeasurementsListener(android.location.IGpsMeasurementsListener listener, java.lang.String packageName) throws android.os.RemoteException;
public void removeGpsMeasurementsListener(android.location.IGpsMeasurementsListener listener) throws android.os.RemoteException;
public boolean addGpsNavigationMessageListener(android.location.IGpsNavigationMessageListener listener, java.lang.String packageName) throws android.os.RemoteException;
public void removeGpsNavigationMessageListener(android.location.IGpsNavigationMessageListener listener) throws android.os.RemoteException;
// --- deprecated ---

public java.util.List<java.lang.String> getAllProviders() throws android.os.RemoteException;
public java.util.List<java.lang.String> getProviders(android.location.Criteria criteria, boolean enabledOnly) throws android.os.RemoteException;
public java.lang.String getBestProvider(android.location.Criteria criteria, boolean enabledOnly) throws android.os.RemoteException;
public boolean providerMeetsCriteria(java.lang.String provider, android.location.Criteria criteria) throws android.os.RemoteException;
public com.android.internal.location.ProviderProperties getProviderProperties(java.lang.String provider) throws android.os.RemoteException;
public boolean isProviderEnabled(java.lang.String provider) throws android.os.RemoteException;
public void addTestProvider(java.lang.String name, com.android.internal.location.ProviderProperties properties) throws android.os.RemoteException;
public void removeTestProvider(java.lang.String provider) throws android.os.RemoteException;
public void setTestProviderLocation(java.lang.String provider, android.location.Location loc) throws android.os.RemoteException;
public void clearTestProviderLocation(java.lang.String provider) throws android.os.RemoteException;
public void setTestProviderEnabled(java.lang.String provider, boolean enabled) throws android.os.RemoteException;
public void clearTestProviderEnabled(java.lang.String provider) throws android.os.RemoteException;
public void setTestProviderStatus(java.lang.String provider, int status, android.os.Bundle extras, long updateTime) throws android.os.RemoteException;
public void clearTestProviderStatus(java.lang.String provider) throws android.os.RemoteException;
public boolean sendExtraCommand(java.lang.String provider, java.lang.String command, android.os.Bundle extras) throws android.os.RemoteException;
// --- internal ---
// Used by location providers to tell the location manager when it has a new location.
// Passive is true if the location is coming from the passive provider, in which case
// it need not be shared with other providers.

public void reportLocation(android.location.Location location, boolean passive) throws android.os.RemoteException;
// for reporting callback completion

public void locationCallbackFinished(android.location.ILocationListener listener) throws android.os.RemoteException;
}
