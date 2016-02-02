/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/webkit/IWebViewUpdateService.aidl
 */
package android.webkit;
/**
 * Private service to wait for the updatable WebView to be ready for use.
 * @hide
 */
public interface IWebViewUpdateService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.webkit.IWebViewUpdateService
{
private static final java.lang.String DESCRIPTOR = "android.webkit.IWebViewUpdateService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.webkit.IWebViewUpdateService interface,
 * generating a proxy if needed.
 */
public static android.webkit.IWebViewUpdateService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.webkit.IWebViewUpdateService))) {
return ((android.webkit.IWebViewUpdateService)iin);
}
return new android.webkit.IWebViewUpdateService.Stub.Proxy(obj);
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
case TRANSACTION_notifyRelroCreationCompleted:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _arg1;
_arg1 = (0!=data.readInt());
this.notifyRelroCreationCompleted(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_waitForRelroCreationCompleted:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.waitForRelroCreationCompleted(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.webkit.IWebViewUpdateService
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
     * Used by the relro file creator to notify the service that it's done.
     */
@Override public void notifyRelroCreationCompleted(boolean is64Bit, boolean success) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((is64Bit)?(1):(0)));
_data.writeInt(((success)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_notifyRelroCreationCompleted, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Used by WebViewFactory to block loading of WebView code until
     * preparations are complete.
     */
@Override public void waitForRelroCreationCompleted(boolean is64Bit) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((is64Bit)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_waitForRelroCreationCompleted, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_notifyRelroCreationCompleted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_waitForRelroCreationCompleted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
/**
     * Used by the relro file creator to notify the service that it's done.
     */
public void notifyRelroCreationCompleted(boolean is64Bit, boolean success) throws android.os.RemoteException;
/**
     * Used by WebViewFactory to block loading of WebView code until
     * preparations are complete.
     */
public void waitForRelroCreationCompleted(boolean is64Bit) throws android.os.RemoteException;
}
