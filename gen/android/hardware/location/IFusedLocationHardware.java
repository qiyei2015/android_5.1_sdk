/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/hardware/location/IFusedLocationHardware.aidl
 */
package android.hardware.location;
/**
 * Fused Location hardware interface.
 * This interface is the basic set of supported functionality by Fused Hardware
 * modules that offer Location batching capabilities.
 *
 * @hide
 */
public interface IFusedLocationHardware extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.location.IFusedLocationHardware
{
private static final java.lang.String DESCRIPTOR = "android.hardware.location.IFusedLocationHardware";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.location.IFusedLocationHardware interface,
 * generating a proxy if needed.
 */
public static android.hardware.location.IFusedLocationHardware asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.location.IFusedLocationHardware))) {
return ((android.hardware.location.IFusedLocationHardware)iin);
}
return new android.hardware.location.IFusedLocationHardware.Stub.Proxy(obj);
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
case TRANSACTION_registerSink:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.location.IFusedLocationHardwareSink _arg0;
_arg0 = android.hardware.location.IFusedLocationHardwareSink.Stub.asInterface(data.readStrongBinder());
this.registerSink(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterSink:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.location.IFusedLocationHardwareSink _arg0;
_arg0 = android.hardware.location.IFusedLocationHardwareSink.Stub.asInterface(data.readStrongBinder());
this.unregisterSink(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getSupportedBatchSize:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getSupportedBatchSize();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_startBatching:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.location.FusedBatchOptions _arg1;
if ((0!=data.readInt())) {
_arg1 = android.location.FusedBatchOptions.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.startBatching(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_stopBatching:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.stopBatching(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_updateBatchingOptions:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.location.FusedBatchOptions _arg1;
if ((0!=data.readInt())) {
_arg1 = android.location.FusedBatchOptions.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.updateBatchingOptions(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_requestBatchOfLocations:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.requestBatchOfLocations(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_supportsDiagnosticDataInjection:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.supportsDiagnosticDataInjection();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_injectDiagnosticData:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.injectDiagnosticData(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_supportsDeviceContextInjection:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.supportsDeviceContextInjection();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_injectDeviceContext:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.injectDeviceContext(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.location.IFusedLocationHardware
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
     * Registers a sink with the Location Hardware object.
     *
     * @param eventSink     The sink to register.
     */
@Override public void registerSink(android.hardware.location.IFusedLocationHardwareSink eventSink) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((eventSink!=null))?(eventSink.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerSink, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Unregisters a sink with the Location Hardware object.
     *
     * @param eventSink     The sink to unregister.
     */
@Override public void unregisterSink(android.hardware.location.IFusedLocationHardwareSink eventSink) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((eventSink!=null))?(eventSink.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterSink, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Provides access to the batch size available in Hardware.
     *
     * @return The batch size the hardware supports.
     */
@Override public int getSupportedBatchSize() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSupportedBatchSize, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Requests the Hardware to start batching locations.
     *
     * @param id            An Id associated with the request.
     * @param batchOptions  The options required for batching.
     *
     * @throws RuntimeException if the request Id exists.
     */
@Override public void startBatching(int id, android.location.FusedBatchOptions batchOptions) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(id);
if ((batchOptions!=null)) {
_data.writeInt(1);
batchOptions.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startBatching, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Requests the Hardware to stop batching for the given Id.
     *
     * @param id    The request that needs to be stopped.
     * @throws RuntimeException if the request Id is unknown.
     */
@Override public void stopBatching(int id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(id);
mRemote.transact(Stub.TRANSACTION_stopBatching, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Updates a batching operation in progress.
     *
     * @param id                The Id of the operation to update.
     * @param batchOptions     The options to apply to the given operation.
     *
     * @throws RuntimeException if the Id of the request is unknown.
     */
@Override public void updateBatchingOptions(int id, android.location.FusedBatchOptions batchOptions) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(id);
if ((batchOptions!=null)) {
_data.writeInt(1);
batchOptions.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateBatchingOptions, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Requests the most recent locations available in Hardware.
     * This operation does not dequeue the locations, so still other batching
     * events will continue working.
     *
     * @param batchSizeRequested    The number of locations requested.
     */
@Override public void requestBatchOfLocations(int batchSizeRequested) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(batchSizeRequested);
mRemote.transact(Stub.TRANSACTION_requestBatchOfLocations, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Flags if the Hardware supports injection of diagnostic data.
     *
     * @return True if data injection is supported, false otherwise.
     */
@Override public boolean supportsDiagnosticDataInjection() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_supportsDiagnosticDataInjection, _data, _reply, 0);
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
     * Injects diagnostic data into the Hardware subsystem.
     *
     * @param data  The data to inject.
     * @throws RuntimeException if injection is not supported.
     */
@Override public void injectDiagnosticData(java.lang.String data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(data);
mRemote.transact(Stub.TRANSACTION_injectDiagnosticData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Flags if the Hardware supports injection of device context information.
     *
     * @return True if device context injection is supported, false otherwise.
     */
@Override public boolean supportsDeviceContextInjection() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_supportsDeviceContextInjection, _data, _reply, 0);
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
     * Injects device context information into the Hardware subsystem.
     *
     * @param deviceEnabledContext  The context to inject.
     * @throws RuntimeException if injection is not supported.
     */
@Override public void injectDeviceContext(int deviceEnabledContext) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(deviceEnabledContext);
mRemote.transact(Stub.TRANSACTION_injectDeviceContext, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_registerSink = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterSink = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getSupportedBatchSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_startBatching = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_stopBatching = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_updateBatchingOptions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_requestBatchOfLocations = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_supportsDiagnosticDataInjection = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_injectDiagnosticData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_supportsDeviceContextInjection = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_injectDeviceContext = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
}
/**
     * Registers a sink with the Location Hardware object.
     *
     * @param eventSink     The sink to register.
     */
public void registerSink(android.hardware.location.IFusedLocationHardwareSink eventSink) throws android.os.RemoteException;
/**
     * Unregisters a sink with the Location Hardware object.
     *
     * @param eventSink     The sink to unregister.
     */
public void unregisterSink(android.hardware.location.IFusedLocationHardwareSink eventSink) throws android.os.RemoteException;
/**
     * Provides access to the batch size available in Hardware.
     *
     * @return The batch size the hardware supports.
     */
public int getSupportedBatchSize() throws android.os.RemoteException;
/**
     * Requests the Hardware to start batching locations.
     *
     * @param id            An Id associated with the request.
     * @param batchOptions  The options required for batching.
     *
     * @throws RuntimeException if the request Id exists.
     */
public void startBatching(int id, android.location.FusedBatchOptions batchOptions) throws android.os.RemoteException;
/**
     * Requests the Hardware to stop batching for the given Id.
     *
     * @param id    The request that needs to be stopped.
     * @throws RuntimeException if the request Id is unknown.
     */
public void stopBatching(int id) throws android.os.RemoteException;
/**
     * Updates a batching operation in progress.
     *
     * @param id                The Id of the operation to update.
     * @param batchOptions     The options to apply to the given operation.
     *
     * @throws RuntimeException if the Id of the request is unknown.
     */
public void updateBatchingOptions(int id, android.location.FusedBatchOptions batchOptions) throws android.os.RemoteException;
/**
     * Requests the most recent locations available in Hardware.
     * This operation does not dequeue the locations, so still other batching
     * events will continue working.
     *
     * @param batchSizeRequested    The number of locations requested.
     */
public void requestBatchOfLocations(int batchSizeRequested) throws android.os.RemoteException;
/**
     * Flags if the Hardware supports injection of diagnostic data.
     *
     * @return True if data injection is supported, false otherwise.
     */
public boolean supportsDiagnosticDataInjection() throws android.os.RemoteException;
/**
     * Injects diagnostic data into the Hardware subsystem.
     *
     * @param data  The data to inject.
     * @throws RuntimeException if injection is not supported.
     */
public void injectDiagnosticData(java.lang.String data) throws android.os.RemoteException;
/**
     * Flags if the Hardware supports injection of device context information.
     *
     * @return True if device context injection is supported, false otherwise.
     */
public boolean supportsDeviceContextInjection() throws android.os.RemoteException;
/**
     * Injects device context information into the Hardware subsystem.
     *
     * @param deviceEnabledContext  The context to inject.
     * @throws RuntimeException if injection is not supported.
     */
public void injectDeviceContext(int deviceEnabledContext) throws android.os.RemoteException;
}
