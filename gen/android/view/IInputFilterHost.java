/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/view/IInputFilterHost.aidl
 */
package android.view;
/**
 * Interface for calls from an input filter to its host.
 *
 * @hide
 */
public interface IInputFilterHost extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.view.IInputFilterHost
{
private static final java.lang.String DESCRIPTOR = "android.view.IInputFilterHost";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.view.IInputFilterHost interface,
 * generating a proxy if needed.
 */
public static android.view.IInputFilterHost asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.view.IInputFilterHost))) {
return ((android.view.IInputFilterHost)iin);
}
return new android.view.IInputFilterHost.Stub.Proxy(obj);
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
case TRANSACTION_sendInputEvent:
{
data.enforceInterface(DESCRIPTOR);
android.view.InputEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.InputEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.sendInputEvent(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.view.IInputFilterHost
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
@Override public void sendInputEvent(android.view.InputEvent event, int policyFlags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((event!=null)) {
_data.writeInt(1);
event.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(policyFlags);
mRemote.transact(Stub.TRANSACTION_sendInputEvent, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_sendInputEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void sendInputEvent(android.view.InputEvent event, int policyFlags) throws android.os.RemoteException;
}
