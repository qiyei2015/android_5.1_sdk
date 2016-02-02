/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/ml/bordeaux/service/src/android/bordeaux/services/ILearning_StochasticLinearRanker.aidl
 */
package android.bordeaux.services;
public interface ILearning_StochasticLinearRanker extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bordeaux.services.ILearning_StochasticLinearRanker
{
private static final java.lang.String DESCRIPTOR = "android.bordeaux.services.ILearning_StochasticLinearRanker";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.bordeaux.services.ILearning_StochasticLinearRanker interface,
 * generating a proxy if needed.
 */
public static android.bordeaux.services.ILearning_StochasticLinearRanker asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bordeaux.services.ILearning_StochasticLinearRanker))) {
return ((android.bordeaux.services.ILearning_StochasticLinearRanker)iin);
}
return new android.bordeaux.services.ILearning_StochasticLinearRanker.Stub.Proxy(obj);
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
case TRANSACTION_UpdateClassifier:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.bordeaux.services.StringFloat> _arg0;
_arg0 = data.createTypedArrayList(android.bordeaux.services.StringFloat.CREATOR);
java.util.List<android.bordeaux.services.StringFloat> _arg1;
_arg1 = data.createTypedArrayList(android.bordeaux.services.StringFloat.CREATOR);
boolean _result = this.UpdateClassifier(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_ScoreSample:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.bordeaux.services.StringFloat> _arg0;
_arg0 = data.createTypedArrayList(android.bordeaux.services.StringFloat.CREATOR);
float _result = this.ScoreSample(_arg0);
reply.writeNoException();
reply.writeFloat(_result);
return true;
}
case TRANSACTION_ResetRanker:
{
data.enforceInterface(DESCRIPTOR);
this.ResetRanker();
reply.writeNoException();
return true;
}
case TRANSACTION_SetModelPriorWeight:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.bordeaux.services.StringFloat> _arg0;
_arg0 = data.createTypedArrayList(android.bordeaux.services.StringFloat.CREATOR);
boolean _result = this.SetModelPriorWeight(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_SetModelParameter:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.SetModelParameter(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bordeaux.services.ILearning_StochasticLinearRanker
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
@Override public boolean UpdateClassifier(java.util.List<android.bordeaux.services.StringFloat> sample_1, java.util.List<android.bordeaux.services.StringFloat> sample_2) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(sample_1);
_data.writeTypedList(sample_2);
mRemote.transact(Stub.TRANSACTION_UpdateClassifier, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public float ScoreSample(java.util.List<android.bordeaux.services.StringFloat> sample) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
float _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(sample);
mRemote.transact(Stub.TRANSACTION_ScoreSample, _data, _reply, 0);
_reply.readException();
_result = _reply.readFloat();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void ResetRanker() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_ResetRanker, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean SetModelPriorWeight(java.util.List<android.bordeaux.services.StringFloat> weight) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(weight);
mRemote.transact(Stub.TRANSACTION_SetModelPriorWeight, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean SetModelParameter(java.lang.String key, java.lang.String value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeString(value);
mRemote.transact(Stub.TRANSACTION_SetModelParameter, _data, _reply, 0);
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
static final int TRANSACTION_UpdateClassifier = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_ScoreSample = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_ResetRanker = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_SetModelPriorWeight = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_SetModelParameter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public boolean UpdateClassifier(java.util.List<android.bordeaux.services.StringFloat> sample_1, java.util.List<android.bordeaux.services.StringFloat> sample_2) throws android.os.RemoteException;
public float ScoreSample(java.util.List<android.bordeaux.services.StringFloat> sample) throws android.os.RemoteException;
public void ResetRanker() throws android.os.RemoteException;
public boolean SetModelPriorWeight(java.util.List<android.bordeaux.services.StringFloat> weight) throws android.os.RemoteException;
public boolean SetModelParameter(java.lang.String key, java.lang.String value) throws android.os.RemoteException;
}
