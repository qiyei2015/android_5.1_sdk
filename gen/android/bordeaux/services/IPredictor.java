/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/ml/bordeaux/service/src/android/bordeaux/services/IPredictor.aidl
 */
package android.bordeaux.services;
public interface IPredictor extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bordeaux.services.IPredictor
{
private static final java.lang.String DESCRIPTOR = "android.bordeaux.services.IPredictor";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.bordeaux.services.IPredictor interface,
 * generating a proxy if needed.
 */
public static android.bordeaux.services.IPredictor asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bordeaux.services.IPredictor))) {
return ((android.bordeaux.services.IPredictor)iin);
}
return new android.bordeaux.services.IPredictor.Stub.Proxy(obj);
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
case TRANSACTION_setPredictorParameter:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.setPredictorParameter(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_pushNewSample:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.pushNewSample(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_resetPredictor:
{
data.enforceInterface(DESCRIPTOR);
this.resetPredictor();
reply.writeNoException();
return true;
}
case TRANSACTION_getTopCandidates:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List<android.bordeaux.services.StringFloat> _result = this.getTopCandidates(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bordeaux.services.IPredictor
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
@Override public boolean setPredictorParameter(java.lang.String key, java.lang.String value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeString(value);
mRemote.transact(Stub.TRANSACTION_setPredictorParameter, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void pushNewSample(java.lang.String sampleName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(sampleName);
mRemote.transact(Stub.TRANSACTION_pushNewSample, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void resetPredictor() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_resetPredictor, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.util.List<android.bordeaux.services.StringFloat> getTopCandidates(int topK) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.bordeaux.services.StringFloat> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(topK);
mRemote.transact(Stub.TRANSACTION_getTopCandidates, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.bordeaux.services.StringFloat.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_setPredictorParameter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_pushNewSample = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_resetPredictor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getTopCandidates = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public boolean setPredictorParameter(java.lang.String key, java.lang.String value) throws android.os.RemoteException;
public void pushNewSample(java.lang.String sampleName) throws android.os.RemoteException;
public void resetPredictor() throws android.os.RemoteException;
public java.util.List<android.bordeaux.services.StringFloat> getTopCandidates(int topK) throws android.os.RemoteException;
}
