/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/ml/bordeaux/service/src/android/bordeaux/services/ILearning_MulticlassPA.aidl
 */
package android.bordeaux.services;
public interface ILearning_MulticlassPA extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bordeaux.services.ILearning_MulticlassPA
{
private static final java.lang.String DESCRIPTOR = "android.bordeaux.services.ILearning_MulticlassPA";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.bordeaux.services.ILearning_MulticlassPA interface,
 * generating a proxy if needed.
 */
public static android.bordeaux.services.ILearning_MulticlassPA asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bordeaux.services.ILearning_MulticlassPA))) {
return ((android.bordeaux.services.ILearning_MulticlassPA)iin);
}
return new android.bordeaux.services.ILearning_MulticlassPA.Stub.Proxy(obj);
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
case TRANSACTION_TrainOneSample:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.bordeaux.services.IntFloat> _arg0;
_arg0 = data.createTypedArrayList(android.bordeaux.services.IntFloat.CREATOR);
int _arg1;
_arg1 = data.readInt();
this.TrainOneSample(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_Classify:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.bordeaux.services.IntFloat> _arg0;
_arg0 = data.createTypedArrayList(android.bordeaux.services.IntFloat.CREATOR);
int _result = this.Classify(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bordeaux.services.ILearning_MulticlassPA
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
@Override public void TrainOneSample(java.util.List<android.bordeaux.services.IntFloat> sample, int target) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(sample);
_data.writeInt(target);
mRemote.transact(Stub.TRANSACTION_TrainOneSample, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int Classify(java.util.List<android.bordeaux.services.IntFloat> sample) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(sample);
mRemote.transact(Stub.TRANSACTION_Classify, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_TrainOneSample = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_Classify = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void TrainOneSample(java.util.List<android.bordeaux.services.IntFloat> sample, int target) throws android.os.RemoteException;
public int Classify(java.util.List<android.bordeaux.services.IntFloat> sample) throws android.os.RemoteException;
}
