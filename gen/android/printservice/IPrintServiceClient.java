/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/printservice/IPrintServiceClient.aidl
 */
package android.printservice;
/**
 * The top-level interface from a print service to the system.
 *
 * @hide
 */
public interface IPrintServiceClient extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.printservice.IPrintServiceClient
{
private static final java.lang.String DESCRIPTOR = "android.printservice.IPrintServiceClient";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.printservice.IPrintServiceClient interface,
 * generating a proxy if needed.
 */
public static android.printservice.IPrintServiceClient asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.printservice.IPrintServiceClient))) {
return ((android.printservice.IPrintServiceClient)iin);
}
return new android.printservice.IPrintServiceClient.Stub.Proxy(obj);
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
java.util.List<android.print.PrintJobInfo> _result = this.getPrintJobInfos();
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
android.print.PrintJobInfo _result = this.getPrintJobInfo(_arg0);
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
boolean _result = this.setPrintJobState(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
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
boolean _result = this.setPrintJobTag(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
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
case TRANSACTION_onPrintersAdded:
{
data.enforceInterface(DESCRIPTOR);
android.content.pm.ParceledListSlice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onPrintersAdded(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onPrintersRemoved:
{
data.enforceInterface(DESCRIPTOR);
android.content.pm.ParceledListSlice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onPrintersRemoved(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.printservice.IPrintServiceClient
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
@Override public java.util.List<android.print.PrintJobInfo> getPrintJobInfos() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.print.PrintJobInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
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
@Override public android.print.PrintJobInfo getPrintJobInfo(android.print.PrintJobId printJobId) throws android.os.RemoteException
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
@Override public boolean setPrintJobState(android.print.PrintJobId printJobId, int state, java.lang.String error) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((printJobId!=null)) {
_data.writeInt(1);
printJobId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(state);
_data.writeString(error);
mRemote.transact(Stub.TRANSACTION_setPrintJobState, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setPrintJobTag(android.print.PrintJobId printJobId, java.lang.String tag) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
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
mRemote.transact(Stub.TRANSACTION_setPrintJobTag, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
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
@Override public void onPrintersAdded(android.content.pm.ParceledListSlice printers) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((printers!=null)) {
_data.writeInt(1);
printers.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onPrintersAdded, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onPrintersRemoved(android.content.pm.ParceledListSlice printerIds) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((printerIds!=null)) {
_data.writeInt(1);
printerIds.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onPrintersRemoved, _data, _reply, 0);
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
static final int TRANSACTION_setPrintJobState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setPrintJobTag = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_writePrintJobData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onPrintersAdded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onPrintersRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
public java.util.List<android.print.PrintJobInfo> getPrintJobInfos() throws android.os.RemoteException;
public android.print.PrintJobInfo getPrintJobInfo(android.print.PrintJobId printJobId) throws android.os.RemoteException;
public boolean setPrintJobState(android.print.PrintJobId printJobId, int state, java.lang.String error) throws android.os.RemoteException;
public boolean setPrintJobTag(android.print.PrintJobId printJobId, java.lang.String tag) throws android.os.RemoteException;
public void writePrintJobData(android.os.ParcelFileDescriptor fd, android.print.PrintJobId printJobId) throws android.os.RemoteException;
public void onPrintersAdded(android.content.pm.ParceledListSlice printers) throws android.os.RemoteException;
public void onPrintersRemoved(android.content.pm.ParceledListSlice printerIds) throws android.os.RemoteException;
}
