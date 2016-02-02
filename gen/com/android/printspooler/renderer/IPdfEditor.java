/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/packages/PrintSpooler/src/com/android/printspooler/renderer/IPdfEditor.aidl
 */
package com.android.printspooler.renderer;
/**
 * Interface for communication with a remote pdf editor.
 */
public interface IPdfEditor extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.printspooler.renderer.IPdfEditor
{
private static final java.lang.String DESCRIPTOR = "com.android.printspooler.renderer.IPdfEditor";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.printspooler.renderer.IPdfEditor interface,
 * generating a proxy if needed.
 */
public static com.android.printspooler.renderer.IPdfEditor asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.printspooler.renderer.IPdfEditor))) {
return ((com.android.printspooler.renderer.IPdfEditor)iin);
}
return new com.android.printspooler.renderer.IPdfEditor.Stub.Proxy(obj);
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
case TRANSACTION_openDocument:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelFileDescriptor _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.openDocument(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_removePages:
{
data.enforceInterface(DESCRIPTOR);
android.print.PageRange[] _arg0;
_arg0 = data.createTypedArray(android.print.PageRange.CREATOR);
this.removePages(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_applyPrintAttributes:
{
data.enforceInterface(DESCRIPTOR);
android.print.PrintAttributes _arg0;
if ((0!=data.readInt())) {
_arg0 = android.print.PrintAttributes.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.applyPrintAttributes(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_write:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelFileDescriptor _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.write(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_closeDocument:
{
data.enforceInterface(DESCRIPTOR);
this.closeDocument();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.printspooler.renderer.IPdfEditor
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
@Override public int openDocument(android.os.ParcelFileDescriptor source) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((source!=null)) {
_data.writeInt(1);
source.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_openDocument, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void removePages(android.print.PageRange[] pages) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedArray(pages, 0);
mRemote.transact(Stub.TRANSACTION_removePages, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void applyPrintAttributes(android.print.PrintAttributes attributes) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((attributes!=null)) {
_data.writeInt(1);
attributes.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_applyPrintAttributes, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void write(android.os.ParcelFileDescriptor destination) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((destination!=null)) {
_data.writeInt(1);
destination.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_write, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void closeDocument() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_closeDocument, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_openDocument = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_removePages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_applyPrintAttributes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_write = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_closeDocument = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public int openDocument(android.os.ParcelFileDescriptor source) throws android.os.RemoteException;
public void removePages(android.print.PageRange[] pages) throws android.os.RemoteException;
public void applyPrintAttributes(android.print.PrintAttributes attributes) throws android.os.RemoteException;
public void write(android.os.ParcelFileDescriptor destination) throws android.os.RemoteException;
public void closeDocument() throws android.os.RemoteException;
}
