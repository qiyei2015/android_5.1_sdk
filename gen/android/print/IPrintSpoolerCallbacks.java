/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/print/IPrintSpoolerCallbacks.aidl
 */
package android.print;
/**
 * Callbacks for communication with the print spooler service.
 *
 * @see android.print.IPrintSpoolerService
 *
 * @hide
 */
public interface IPrintSpoolerCallbacks extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.print.IPrintSpoolerCallbacks
{
private static final java.lang.String DESCRIPTOR = "android.print.IPrintSpoolerCallbacks";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.print.IPrintSpoolerCallbacks interface,
 * generating a proxy if needed.
 */
public static android.print.IPrintSpoolerCallbacks asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.print.IPrintSpoolerCallbacks))) {
return ((android.print.IPrintSpoolerCallbacks)iin);
}
return new android.print.IPrintSpoolerCallbacks.Stub.Proxy(obj);
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
case TRANSACTION_onGetPrintJobInfosResult:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.print.PrintJobInfo> _arg0;
_arg0 = data.createTypedArrayList(android.print.PrintJobInfo.CREATOR);
int _arg1;
_arg1 = data.readInt();
this.onGetPrintJobInfosResult(_arg0, _arg1);
return true;
}
case TRANSACTION_onCancelPrintJobResult:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _arg1;
_arg1 = data.readInt();
this.onCancelPrintJobResult(_arg0, _arg1);
return true;
}
case TRANSACTION_onSetPrintJobStateResult:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _arg1;
_arg1 = data.readInt();
this.onSetPrintJobStateResult(_arg0, _arg1);
return true;
}
case TRANSACTION_onSetPrintJobTagResult:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _arg1;
_arg1 = data.readInt();
this.onSetPrintJobTagResult(_arg0, _arg1);
return true;
}
case TRANSACTION_onGetPrintJobInfoResult:
{
data.enforceInterface(DESCRIPTOR);
android.print.PrintJobInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.print.PrintJobInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.onGetPrintJobInfoResult(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.print.IPrintSpoolerCallbacks
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
@Override public void onGetPrintJobInfosResult(java.util.List<android.print.PrintJobInfo> printJob, int sequence) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(printJob);
_data.writeInt(sequence);
mRemote.transact(Stub.TRANSACTION_onGetPrintJobInfosResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onCancelPrintJobResult(boolean canceled, int sequence) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((canceled)?(1):(0)));
_data.writeInt(sequence);
mRemote.transact(Stub.TRANSACTION_onCancelPrintJobResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onSetPrintJobStateResult(boolean success, int sequence) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((success)?(1):(0)));
_data.writeInt(sequence);
mRemote.transact(Stub.TRANSACTION_onSetPrintJobStateResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onSetPrintJobTagResult(boolean success, int sequence) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((success)?(1):(0)));
_data.writeInt(sequence);
mRemote.transact(Stub.TRANSACTION_onSetPrintJobTagResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onGetPrintJobInfoResult(android.print.PrintJobInfo printJob, int sequence) throws android.os.RemoteException
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
_data.writeInt(sequence);
mRemote.transact(Stub.TRANSACTION_onGetPrintJobInfoResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onGetPrintJobInfosResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onCancelPrintJobResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onSetPrintJobStateResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onSetPrintJobTagResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onGetPrintJobInfoResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public void onGetPrintJobInfosResult(java.util.List<android.print.PrintJobInfo> printJob, int sequence) throws android.os.RemoteException;
public void onCancelPrintJobResult(boolean canceled, int sequence) throws android.os.RemoteException;
public void onSetPrintJobStateResult(boolean success, int sequence) throws android.os.RemoteException;
public void onSetPrintJobTagResult(boolean success, int sequence) throws android.os.RemoteException;
public void onGetPrintJobInfoResult(android.print.PrintJobInfo printJob, int sequence) throws android.os.RemoteException;
}
