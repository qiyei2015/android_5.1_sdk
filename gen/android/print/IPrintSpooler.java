/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/print/IPrintSpooler.aidl
 */
package android.print;
/**
 * Interface for communication with the print spooler service.
 *
 * @see android.print.IPrintSpoolerCallbacks
 *
 * @hide
 */
public interface IPrintSpooler extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.print.IPrintSpooler
{
private static final java.lang.String DESCRIPTOR = "android.print.IPrintSpooler";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.print.IPrintSpooler interface,
 * generating a proxy if needed.
 */
public static android.print.IPrintSpooler asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.print.IPrintSpooler))) {
return ((android.print.IPrintSpooler)iin);
}
return new android.print.IPrintSpooler.Stub.Proxy(obj);
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
case TRANSACTION_removeObsoletePrintJobs:
{
data.enforceInterface(DESCRIPTOR);
this.removeObsoletePrintJobs();
return true;
}
case TRANSACTION_getPrintJobInfos:
{
data.enforceInterface(DESCRIPTOR);
android.print.IPrintSpoolerCallbacks _arg0;
_arg0 = android.print.IPrintSpoolerCallbacks.Stub.asInterface(data.readStrongBinder());
android.content.ComponentName _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
this.getPrintJobInfos(_arg0, _arg1, _arg2, _arg3, _arg4);
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
android.print.IPrintSpoolerCallbacks _arg1;
_arg1 = android.print.IPrintSpoolerCallbacks.Stub.asInterface(data.readStrongBinder());
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.getPrintJobInfo(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_createPrintJob:
{
data.enforceInterface(DESCRIPTOR);
android.print.PrintJobInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.print.PrintJobInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.createPrintJob(_arg0);
return true;
}
case TRANSACTION_setPrintJobState:
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
java.lang.String _arg2;
_arg2 = data.readString();
android.print.IPrintSpoolerCallbacks _arg3;
_arg3 = android.print.IPrintSpoolerCallbacks.Stub.asInterface(data.readStrongBinder());
int _arg4;
_arg4 = data.readInt();
this.setPrintJobState(_arg0, _arg1, _arg2, _arg3, _arg4);
return true;
}
case TRANSACTION_setPrintJobTag:
{
data.enforceInterface(DESCRIPTOR);
android.print.PrintJobId _arg0;
if ((0!=data.readInt())) {
_arg0 = android.print.PrintJobId.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
android.print.IPrintSpoolerCallbacks _arg2;
_arg2 = android.print.IPrintSpoolerCallbacks.Stub.asInterface(data.readStrongBinder());
int _arg3;
_arg3 = data.readInt();
this.setPrintJobTag(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_writePrintJobData:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelFileDescriptor _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.print.PrintJobId _arg1;
if ((0!=data.readInt())) {
_arg1 = android.print.PrintJobId.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.writePrintJobData(_arg0, _arg1);
return true;
}
case TRANSACTION_setClient:
{
data.enforceInterface(DESCRIPTOR);
android.print.IPrintSpoolerClient _arg0;
_arg0 = android.print.IPrintSpoolerClient.Stub.asInterface(data.readStrongBinder());
this.setClient(_arg0);
return true;
}
case TRANSACTION_setPrintJobCancelling:
{
data.enforceInterface(DESCRIPTOR);
android.print.PrintJobId _arg0;
if ((0!=data.readInt())) {
_arg0 = android.print.PrintJobId.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setPrintJobCancelling(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.print.IPrintSpooler
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
@Override public void removeObsoletePrintJobs() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_removeObsoletePrintJobs, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void getPrintJobInfos(android.print.IPrintSpoolerCallbacks callback, android.content.ComponentName componentName, int state, int appId, int sequence) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
if ((componentName!=null)) {
_data.writeInt(1);
componentName.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(state);
_data.writeInt(appId);
_data.writeInt(sequence);
mRemote.transact(Stub.TRANSACTION_getPrintJobInfos, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void getPrintJobInfo(android.print.PrintJobId printJobId, android.print.IPrintSpoolerCallbacks callback, int appId, int sequence) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((printJobId!=null)) {
_data.writeInt(1);
printJobId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
_data.writeInt(appId);
_data.writeInt(sequence);
mRemote.transact(Stub.TRANSACTION_getPrintJobInfo, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void createPrintJob(android.print.PrintJobInfo printJob) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((printJob!=null)) {
_data.writeInt(1);
printJob.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_createPrintJob, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setPrintJobState(android.print.PrintJobId printJobId, int status, java.lang.String stateReason, android.print.IPrintSpoolerCallbacks callback, int sequence) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((printJobId!=null)) {
_data.writeInt(1);
printJobId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(status);
_data.writeString(stateReason);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
_data.writeInt(sequence);
mRemote.transact(Stub.TRANSACTION_setPrintJobState, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setPrintJobTag(android.print.PrintJobId printJobId, java.lang.String tag, android.print.IPrintSpoolerCallbacks callback, int sequence) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((printJobId!=null)) {
_data.writeInt(1);
printJobId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(tag);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
_data.writeInt(sequence);
mRemote.transact(Stub.TRANSACTION_setPrintJobTag, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void writePrintJobData(android.os.ParcelFileDescriptor fd, android.print.PrintJobId printJobId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((fd!=null)) {
_data.writeInt(1);
fd.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((printJobId!=null)) {
_data.writeInt(1);
printJobId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_writePrintJobData, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setClient(android.print.IPrintSpoolerClient client) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setClient, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setPrintJobCancelling(android.print.PrintJobId printJobId, boolean cancelling) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((printJobId!=null)) {
_data.writeInt(1);
printJobId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((cancelling)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setPrintJobCancelling, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_removeObsoletePrintJobs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getPrintJobInfos = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getPrintJobInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_createPrintJob = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setPrintJobState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setPrintJobTag = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_writePrintJobData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_setPrintJobCancelling = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
}
public void removeObsoletePrintJobs() throws android.os.RemoteException;
public void getPrintJobInfos(android.print.IPrintSpoolerCallbacks callback, android.content.ComponentName componentName, int state, int appId, int sequence) throws android.os.RemoteException;
public void getPrintJobInfo(android.print.PrintJobId printJobId, android.print.IPrintSpoolerCallbacks callback, int appId, int sequence) throws android.os.RemoteException;
public void createPrintJob(android.print.PrintJobInfo printJob) throws android.os.RemoteException;
public void setPrintJobState(android.print.PrintJobId printJobId, int status, java.lang.String stateReason, android.print.IPrintSpoolerCallbacks callback, int sequence) throws android.os.RemoteException;
public void setPrintJobTag(android.print.PrintJobId printJobId, java.lang.String tag, android.print.IPrintSpoolerCallbacks callback, int sequence) throws android.os.RemoteException;
public void writePrintJobData(android.os.ParcelFileDescriptor fd, android.print.PrintJobId printJobId) throws android.os.RemoteException;
public void setClient(android.print.IPrintSpoolerClient client) throws android.os.RemoteException;
public void setPrintJobCancelling(android.print.PrintJobId printJobId, boolean cancelling) throws android.os.RemoteException;
}
