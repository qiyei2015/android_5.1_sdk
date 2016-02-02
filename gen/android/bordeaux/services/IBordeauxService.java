/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/ml/bordeaux/service/src/android/bordeaux/services/IBordeauxService.aidl
 */
package android.bordeaux.services;
/**
 * Main learning interface of bordeaux service
 * (running in another process).
 */
public interface IBordeauxService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bordeaux.services.IBordeauxService
{
private static final java.lang.String DESCRIPTOR = "android.bordeaux.services.IBordeauxService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.bordeaux.services.IBordeauxService interface,
 * generating a proxy if needed.
 */
public static android.bordeaux.services.IBordeauxService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bordeaux.services.IBordeauxService))) {
return ((android.bordeaux.services.IBordeauxService)iin);
}
return new android.bordeaux.services.IBordeauxService.Stub.Proxy(obj);
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
case TRANSACTION_getRanker:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.IBinder _result = this.getRanker(_arg0);
reply.writeNoException();
reply.writeStrongBinder(_result);
return true;
}
case TRANSACTION_getClassifier:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.IBinder _result = this.getClassifier(_arg0);
reply.writeNoException();
reply.writeStrongBinder(_result);
return true;
}
case TRANSACTION_getAggregatorManager:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _result = this.getAggregatorManager();
reply.writeNoException();
reply.writeStrongBinder(_result);
return true;
}
case TRANSACTION_getPredictor:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.IBinder _result = this.getPredictor(_arg0);
reply.writeNoException();
reply.writeStrongBinder(_result);
return true;
}
case TRANSACTION_registerCallback:
{
data.enforceInterface(DESCRIPTOR);
android.bordeaux.services.IBordeauxServiceCallback _arg0;
_arg0 = android.bordeaux.services.IBordeauxServiceCallback.Stub.asInterface(data.readStrongBinder());
this.registerCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterCallback:
{
data.enforceInterface(DESCRIPTOR);
android.bordeaux.services.IBordeauxServiceCallback _arg0;
_arg0 = android.bordeaux.services.IBordeauxServiceCallback.Stub.asInterface(data.readStrongBinder());
this.unregisterCallback(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bordeaux.services.IBordeauxService
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
/* Request a Ranker
    */
@Override public android.os.IBinder getRanker(java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.IBinder _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_getRanker, _data, _reply, 0);
_reply.readException();
_result = _reply.readStrongBinder();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/* Request a MulticlassPA
    */
@Override public android.os.IBinder getClassifier(java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.IBinder _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_getClassifier, _data, _reply, 0);
_reply.readException();
_result = _reply.readStrongBinder();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/* Request to access AggregatorManager
    */
@Override public android.os.IBinder getAggregatorManager() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.IBinder _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAggregatorManager, _data, _reply, 0);
_reply.readException();
_result = _reply.readStrongBinder();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/* Request a Predictor
    */
@Override public android.os.IBinder getPredictor(java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.IBinder _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_getPredictor, _data, _reply, 0);
_reply.readException();
_result = _reply.readStrongBinder();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Often you want to allow a service to call back to its clients.
     * This shows how to do so, by registering a callback interface with
     * the service.
     */
@Override public void registerCallback(android.bordeaux.services.IBordeauxServiceCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Remove a previously registered callback interface.
     */
@Override public void unregisterCallback(android.bordeaux.services.IBordeauxServiceCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getRanker = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getClassifier = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getAggregatorManager = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getPredictor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_registerCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_unregisterCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
}
/* Request a Ranker
    */
public android.os.IBinder getRanker(java.lang.String name) throws android.os.RemoteException;
/* Request a MulticlassPA
    */
public android.os.IBinder getClassifier(java.lang.String name) throws android.os.RemoteException;
/* Request to access AggregatorManager
    */
public android.os.IBinder getAggregatorManager() throws android.os.RemoteException;
/* Request a Predictor
    */
public android.os.IBinder getPredictor(java.lang.String name) throws android.os.RemoteException;
/**
     * Often you want to allow a service to call back to its clients.
     * This shows how to do so, by registering a callback interface with
     * the service.
     */
public void registerCallback(android.bordeaux.services.IBordeauxServiceCallback cb) throws android.os.RemoteException;
/**
     * Remove a previously registered callback interface.
     */
public void unregisterCallback(android.bordeaux.services.IBordeauxServiceCallback cb) throws android.os.RemoteException;
}
