/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/service/dreams/IDreamService.aidl
 */
package android.service.dreams;
/**
 * @hide
 */
public interface IDreamService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.dreams.IDreamService
{
private static final java.lang.String DESCRIPTOR = "android.service.dreams.IDreamService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.dreams.IDreamService interface,
 * generating a proxy if needed.
 */
public static android.service.dreams.IDreamService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.dreams.IDreamService))) {
return ((android.service.dreams.IDreamService)iin);
}
return new android.service.dreams.IDreamService.Stub.Proxy(obj);
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
case TRANSACTION_attach:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.attach(_arg0, _arg1);
return true;
}
case TRANSACTION_detach:
{
data.enforceInterface(DESCRIPTOR);
this.detach();
return true;
}
case TRANSACTION_wakeUp:
{
data.enforceInterface(DESCRIPTOR);
this.wakeUp();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.dreams.IDreamService
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
@Override public void attach(android.os.IBinder windowToken, boolean canDoze) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(windowToken);
_data.writeInt(((canDoze)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_attach, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void detach() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_detach, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void wakeUp() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_wakeUp, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_attach = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_detach = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_wakeUp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public void attach(android.os.IBinder windowToken, boolean canDoze) throws android.os.RemoteException;
public void detach() throws android.os.RemoteException;
public void wakeUp() throws android.os.RemoteException;
}
