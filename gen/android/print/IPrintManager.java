/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/print/IPrintManager.aidl
 */
package android.print;
/**
 * Interface for communication with the core print manager service.
 *
 * @hide
 */
public interface IPrintManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.print.IPrintManager
{
private static final java.lang.String DESCRIPTOR = "android.print.IPrintManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.print.IPrintManager interface,
 * generating a proxy if needed.
 */
public static android.print.IPrintManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.print.IPrintManager))) {
return ((android.print.IPrintManager)iin);
}
return new android.print.IPrintManager.Stub.Proxy(obj);
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
case TRANSACTION_getPrintJobInfos:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.util.List<android.print.PrintJobInfo> _result = this.getPrintJobInfos(_arg0, _arg1);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getPrintJobInfo:
{
data.enforceInterface(DESCRIPTOR);
android.print.PrintJobId _arg0;
if ((0!=data.readInt())) {
_arg0 = android.print.PrintJobId.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
android.print.PrintJobInfo _result = this.getPrintJobInfo(_arg0, _arg1, _arg2);
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
case TRANSACTION_print:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.print.IPrintDocumentAdapter _arg1;
_arg1 = android.print.IPrintDocumentAdapter.Stub.asInterface(data.readStrongBinder());
android.print.PrintAttributes _arg2;
if ((0!=data.readInt())) {
_arg2 = android.print.PrintAttributes.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
java.lang.String _arg3;
_arg3 = data.readString();
int _arg4;
_arg4 = data.readInt();
int _arg5;
_arg5 = data.readInt();
android.os.Bundle _result = this.print(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
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
case TRANSACTION_cancelPrintJob:
{
data.enforceInterface(DESCRIPTOR);
android.print.PrintJobId _arg0;
if ((0!=data.readInt())) {
_arg0 = android.print.PrintJobId.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.cancelPrintJob(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_restartPrintJob:
{
data.enforceInterface(DESCRIPTOR);
android.print.PrintJobId _arg0;
if ((0!=data.readInt())) {
_arg0 = android.print.PrintJobId.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.restartPrintJob(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_addPrintJobStateChangeListener:
{
data.enforceInterface(DESCRIPTOR);
android.print.IPrintJobStateChangeListener _arg0;
_arg0 = android.print.IPrintJobStateChangeListener.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.addPrintJobStateChangeListener(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_removePrintJobStateChangeListener:
{
data.enforceInterface(DESCRIPTOR);
android.print.IPrintJobStateChangeListener _arg0;
_arg0 = android.print.IPrintJobStateChangeListener.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.removePrintJobStateChangeListener(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getInstalledPrintServices:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List<android.printservice.PrintServiceInfo> _result = this.getInstalledPrintServices(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getEnabledPrintServices:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List<android.printservice.PrintServiceInfo> _result = this.getEnabledPrintServices(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_createPrinterDiscoverySession:
{
data.enforceInterface(DESCRIPTOR);
android.print.IPrinterDiscoveryObserver _arg0;
_arg0 = android.print.IPrinterDiscoveryObserver.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.createPrinterDiscoverySession(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_startPrinterDiscovery:
{
data.enforceInterface(DESCRIPTOR);
android.print.IPrinterDiscoveryObserver _arg0;
_arg0 = android.print.IPrinterDiscoveryObserver.Stub.asInterface(data.readStrongBinder());
java.util.List<android.print.PrinterId> _arg1;
_arg1 = data.createTypedArrayList(android.print.PrinterId.CREATOR);
int _arg2;
_arg2 = data.readInt();
this.startPrinterDiscovery(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_stopPrinterDiscovery:
{
data.enforceInterface(DESCRIPTOR);
android.print.IPrinterDiscoveryObserver _arg0;
_arg0 = android.print.IPrinterDiscoveryObserver.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.stopPrinterDiscovery(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_validatePrinters:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.print.PrinterId> _arg0;
_arg0 = data.createTypedArrayList(android.print.PrinterId.CREATOR);
int _arg1;
_arg1 = data.readInt();
this.validatePrinters(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_startPrinterStateTracking:
{
data.enforceInterface(DESCRIPTOR);
android.print.PrinterId _arg0;
if ((0!=data.readInt())) {
_arg0 = android.print.PrinterId.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.startPrinterStateTracking(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_stopPrinterStateTracking:
{
data.enforceInterface(DESCRIPTOR);
android.print.PrinterId _arg0;
if ((0!=data.readInt())) {
_arg0 = android.print.PrinterId.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.stopPrinterStateTracking(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_destroyPrinterDiscoverySession:
{
data.enforceInterface(DESCRIPTOR);
android.print.IPrinterDiscoveryObserver _arg0;
_arg0 = android.print.IPrinterDiscoveryObserver.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.destroyPrinterDiscoverySession(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.print.IPrintManager
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
@Override public java.util.List<android.print.PrintJobInfo> getPrintJobInfos(int appId, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.print.PrintJobInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(appId);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getPrintJobInfos, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.print.PrintJobInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.print.PrintJobInfo getPrintJobInfo(android.print.PrintJobId printJobId, int appId, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.print.PrintJobInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((printJobId!=null)) {
_data.writeInt(1);
printJobId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(appId);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getPrintJobInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.print.PrintJobInfo.CREATOR.createFromParcel(_reply);
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
@Override public android.os.Bundle print(java.lang.String printJobName, android.print.IPrintDocumentAdapter printAdapter, android.print.PrintAttributes attributes, java.lang.String packageName, int appId, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(printJobName);
_data.writeStrongBinder((((printAdapter!=null))?(printAdapter.asBinder()):(null)));
if ((attributes!=null)) {
_data.writeInt(1);
attributes.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
_data.writeInt(appId);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_print, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
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
@Override public void cancelPrintJob(android.print.PrintJobId printJobId, int appId, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((printJobId!=null)) {
_data.writeInt(1);
printJobId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(appId);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_cancelPrintJob, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void restartPrintJob(android.print.PrintJobId printJobId, int appId, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((printJobId!=null)) {
_data.writeInt(1);
printJobId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(appId);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_restartPrintJob, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void addPrintJobStateChangeListener(android.print.IPrintJobStateChangeListener listener, int appId, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
_data.writeInt(appId);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_addPrintJobStateChangeListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removePrintJobStateChangeListener(android.print.IPrintJobStateChangeListener listener, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_removePrintJobStateChangeListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.util.List<android.printservice.PrintServiceInfo> getInstalledPrintServices(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.printservice.PrintServiceInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getInstalledPrintServices, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.printservice.PrintServiceInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.printservice.PrintServiceInfo> getEnabledPrintServices(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.printservice.PrintServiceInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getEnabledPrintServices, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.printservice.PrintServiceInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void createPrinterDiscoverySession(android.print.IPrinterDiscoveryObserver observer, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((observer!=null))?(observer.asBinder()):(null)));
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_createPrinterDiscoverySession, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void startPrinterDiscovery(android.print.IPrinterDiscoveryObserver observer, java.util.List<android.print.PrinterId> priorityList, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((observer!=null))?(observer.asBinder()):(null)));
_data.writeTypedList(priorityList);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_startPrinterDiscovery, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopPrinterDiscovery(android.print.IPrinterDiscoveryObserver observer, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((observer!=null))?(observer.asBinder()):(null)));
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_stopPrinterDiscovery, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void validatePrinters(java.util.List<android.print.PrinterId> printerIds, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(printerIds);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_validatePrinters, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void startPrinterStateTracking(android.print.PrinterId printerId, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((printerId!=null)) {
_data.writeInt(1);
printerId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_startPrinterStateTracking, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopPrinterStateTracking(android.print.PrinterId printerId, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((printerId!=null)) {
_data.writeInt(1);
printerId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_stopPrinterStateTracking, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void destroyPrinterDiscoverySession(android.print.IPrinterDiscoveryObserver observer, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((observer!=null))?(observer.asBinder()):(null)));
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_destroyPrinterDiscoverySession, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getPrintJobInfos = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getPrintJobInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_print = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_cancelPrintJob = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_restartPrintJob = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_addPrintJobStateChangeListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_removePrintJobStateChangeListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getInstalledPrintServices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getEnabledPrintServices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_createPrinterDiscoverySession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_startPrinterDiscovery = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_stopPrinterDiscovery = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_validatePrinters = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_startPrinterStateTracking = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_stopPrinterStateTracking = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_destroyPrinterDiscoverySession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
}
public java.util.List<android.print.PrintJobInfo> getPrintJobInfos(int appId, int userId) throws android.os.RemoteException;
public android.print.PrintJobInfo getPrintJobInfo(android.print.PrintJobId printJobId, int appId, int userId) throws android.os.RemoteException;
public android.os.Bundle print(java.lang.String printJobName, android.print.IPrintDocumentAdapter printAdapter, android.print.PrintAttributes attributes, java.lang.String packageName, int appId, int userId) throws android.os.RemoteException;
public void cancelPrintJob(android.print.PrintJobId printJobId, int appId, int userId) throws android.os.RemoteException;
public void restartPrintJob(android.print.PrintJobId printJobId, int appId, int userId) throws android.os.RemoteException;
public void addPrintJobStateChangeListener(android.print.IPrintJobStateChangeListener listener, int appId, int userId) throws android.os.RemoteException;
public void removePrintJobStateChangeListener(android.print.IPrintJobStateChangeListener listener, int userId) throws android.os.RemoteException;
public java.util.List<android.printservice.PrintServiceInfo> getInstalledPrintServices(int userId) throws android.os.RemoteException;
public java.util.List<android.printservice.PrintServiceInfo> getEnabledPrintServices(int userId) throws android.os.RemoteException;
public void createPrinterDiscoverySession(android.print.IPrinterDiscoveryObserver observer, int userId) throws android.os.RemoteException;
public void startPrinterDiscovery(android.print.IPrinterDiscoveryObserver observer, java.util.List<android.print.PrinterId> priorityList, int userId) throws android.os.RemoteException;
public void stopPrinterDiscovery(android.print.IPrinterDiscoveryObserver observer, int userId) throws android.os.RemoteException;
public void validatePrinters(java.util.List<android.print.PrinterId> printerIds, int userId) throws android.os.RemoteException;
public void startPrinterStateTracking(android.print.PrinterId printerId, int userId) throws android.os.RemoteException;
public void stopPrinterStateTracking(android.print.PrinterId printerId, int userId) throws android.os.RemoteException;
public void destroyPrinterDiscoverySession(android.print.IPrinterDiscoveryObserver observer, int userId) throws android.os.RemoteException;
}
