/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/ml/bordeaux/service/src/android/bordeaux/services/IAggregatorManager.aidl
 */
package android.bordeaux.services;
public interface IAggregatorManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bordeaux.services.IAggregatorManager
{
private static final java.lang.String DESCRIPTOR = "android.bordeaux.services.IAggregatorManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.bordeaux.services.IAggregatorManager interface,
 * generating a proxy if needed.
 */
public static android.bordeaux.services.IAggregatorManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bordeaux.services.IAggregatorManager))) {
return ((android.bordeaux.services.IAggregatorManager)iin);
}
return new android.bordeaux.services.IAggregatorManager.Stub.Proxy(obj);
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
case TRANSACTION_getData:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.List<android.bordeaux.services.StringString> _result = this.getData(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getLocationClusters:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<java.lang.String> _result = this.getLocationClusters();
reply.writeNoException();
reply.writeStringList(_result);
return true;
}
case TRANSACTION_getTimeOfDayValues:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<java.lang.String> _result = this.getTimeOfDayValues();
reply.writeNoException();
reply.writeStringList(_result);
return true;
}
case TRANSACTION_getDayOfWeekValues:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<java.lang.String> _result = this.getDayOfWeekValues();
reply.writeNoException();
reply.writeStringList(_result);
return true;
}
case TRANSACTION_setFakeLocation:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.setFakeLocation(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setFakeTimeOfDay:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.setFakeTimeOfDay(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setFakeDayOfWeek:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.setFakeDayOfWeek(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getFakeMode:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getFakeMode();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bordeaux.services.IAggregatorManager
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
@Override public java.util.List<android.bordeaux.services.StringString> getData(java.lang.String dataName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.bordeaux.services.StringString> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(dataName);
mRemote.transact(Stub.TRANSACTION_getData, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.bordeaux.services.StringString.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// TODO: remove the following interfaces in production
// they are only used for demo purpose

@Override public java.util.List<java.lang.String> getLocationClusters() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<java.lang.String> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLocationClusters, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArrayList();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<java.lang.String> getTimeOfDayValues() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<java.lang.String> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTimeOfDayValues, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArrayList();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<java.lang.String> getDayOfWeekValues() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<java.lang.String> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDayOfWeekValues, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArrayList();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// use "" to disable the fake location

@Override public boolean setFakeLocation(java.lang.String cluster) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(cluster);
mRemote.transact(Stub.TRANSACTION_setFakeLocation, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// use "" to disable the fake time

@Override public boolean setFakeTimeOfDay(java.lang.String time_of_day) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(time_of_day);
mRemote.transact(Stub.TRANSACTION_setFakeTimeOfDay, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// use "" to disable the fake day

@Override public boolean setFakeDayOfWeek(java.lang.String day_of_week) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(day_of_week);
mRemote.transact(Stub.TRANSACTION_setFakeDayOfWeek, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// return whether the service is in fake mode
// it's in fake mode, if any of the location, time and day is fake

@Override public boolean getFakeMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getFakeMode, _data, _reply, 0);
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
static final int TRANSACTION_getData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getLocationClusters = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getTimeOfDayValues = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getDayOfWeekValues = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setFakeLocation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setFakeTimeOfDay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setFakeDayOfWeek = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getFakeMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
public java.util.List<android.bordeaux.services.StringString> getData(java.lang.String dataName) throws android.os.RemoteException;
// TODO: remove the following interfaces in production
// they are only used for demo purpose

public java.util.List<java.lang.String> getLocationClusters() throws android.os.RemoteException;
public java.util.List<java.lang.String> getTimeOfDayValues() throws android.os.RemoteException;
public java.util.List<java.lang.String> getDayOfWeekValues() throws android.os.RemoteException;
// use "" to disable the fake location

public boolean setFakeLocation(java.lang.String cluster) throws android.os.RemoteException;
// use "" to disable the fake time

public boolean setFakeTimeOfDay(java.lang.String time_of_day) throws android.os.RemoteException;
// use "" to disable the fake day

public boolean setFakeDayOfWeek(java.lang.String day_of_week) throws android.os.RemoteException;
// return whether the service is in fake mode
// it's in fake mode, if any of the location, time and day is fake

public boolean getFakeMode() throws android.os.RemoteException;
}
