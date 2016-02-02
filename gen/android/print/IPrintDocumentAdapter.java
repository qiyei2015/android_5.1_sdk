/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/print/IPrintDocumentAdapter.aidl
 */
package android.print;
/**
 * Interface for communication with the print adapter object.
 *
 * @hide
 */
public interface IPrintDocumentAdapter extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.print.IPrintDocumentAdapter
{
private static final java.lang.String DESCRIPTOR = "android.print.IPrintDocumentAdapter";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.print.IPrintDocumentAdapter interface,
 * generating a proxy if needed.
 */
public static android.print.IPrintDocumentAdapter asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.print.IPrintDocumentAdapter))) {
return ((android.print.IPrintDocumentAdapter)iin);
}
return new android.print.IPrintDocumentAdapter.Stub.Proxy(obj);
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
case TRANSACTION_setObserver:
{
data.enforceInterface(DESCRIPTOR);
android.print.IPrintDocumentAdapterObserver _arg0;
_arg0 = android.print.IPrintDocumentAdapterObserver.Stub.asInterface(data.readStrongBinder());
this.setObserver(_arg0);
return true;
}
case TRANSACTION_start:
{
data.enforceInterface(DESCRIPTOR);
this.start();
return true;
}
case TRANSACTION_layout:
{
data.enforceInterface(DESCRIPTOR);
android.print.PrintAttributes _arg0;
if ((0!=data.readInt())) {
_arg0 = android.print.PrintAttributes.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.print.PrintAttributes _arg1;
if ((0!=data.readInt())) {
_arg1 = android.print.PrintAttributes.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.print.ILayoutResultCallback _arg2;
_arg2 = android.print.ILayoutResultCallback.Stub.asInterface(data.readStrongBinder());
android.os.Bundle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
int _arg4;
_arg4 = data.readInt();
this.layout(_arg0, _arg1, _arg2, _arg3, _arg4);
return true;
}
case TRANSACTION_write:
{
data.enforceInterface(DESCRIPTOR);
android.print.PageRange[] _arg0;
_arg0 = data.createTypedArray(android.print.PageRange.CREATOR);
android.os.ParcelFileDescriptor _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.print.IWriteResultCallback _arg2;
_arg2 = android.print.IWriteResultCallback.Stub.asInterface(data.readStrongBinder());
int _arg3;
_arg3 = data.readInt();
this.write(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_finish:
{
data.enforceInterface(DESCRIPTOR);
this.finish();
return true;
}
case TRANSACTION_kill:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.kill(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.print.IPrintDocumentAdapter
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
@Override public void setObserver(android.print.IPrintDocumentAdapterObserver observer) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((observer!=null))?(observer.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setObserver, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void start() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_start, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void layout(android.print.PrintAttributes oldAttributes, android.print.PrintAttributes newAttributes, android.print.ILayoutResultCallback callback, android.os.Bundle metadata, int sequence) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((oldAttributes!=null)) {
_data.writeInt(1);
oldAttributes.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((newAttributes!=null)) {
_data.writeInt(1);
newAttributes.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
if ((metadata!=null)) {
_data.writeInt(1);
metadata.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(sequence);
mRemote.transact(Stub.TRANSACTION_layout, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void write(android.print.PageRange[] pages, android.os.ParcelFileDescriptor fd, android.print.IWriteResultCallback callback, int sequence) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedArray(pages, 0);
if ((fd!=null)) {
_data.writeInt(1);
fd.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
_data.writeInt(sequence);
mRemote.transact(Stub.TRANSACTION_write, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void finish() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_finish, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void kill(java.lang.String reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(reason);
mRemote.transact(Stub.TRANSACTION_kill, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_setObserver = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_start = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_layout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_write = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_finish = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_kill = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
}
public void setObserver(android.print.IPrintDocumentAdapterObserver observer) throws android.os.RemoteException;
public void start() throws android.os.RemoteException;
public void layout(android.print.PrintAttributes oldAttributes, android.print.PrintAttributes newAttributes, android.print.ILayoutResultCallback callback, android.os.Bundle metadata, int sequence) throws android.os.RemoteException;
public void write(android.print.PageRange[] pages, android.os.ParcelFileDescriptor fd, android.print.IWriteResultCallback callback, int sequence) throws android.os.RemoteException;
public void finish() throws android.os.RemoteException;
public void kill(java.lang.String reason) throws android.os.RemoteException;
}
