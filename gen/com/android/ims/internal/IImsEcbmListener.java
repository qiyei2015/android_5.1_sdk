/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/telephony/java/com/android/ims/internal/IImsEcbmListener.aidl
 */
package com.android.ims.internal;
/**
 * A listener type for receiving notifications about the changes to
 * Emergency Callback Mode through IMS.
 *
 * {@hide}
 */
public interface IImsEcbmListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsEcbmListener
{
private static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsEcbmListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.ims.internal.IImsEcbmListener interface,
 * generating a proxy if needed.
 */
public static com.android.ims.internal.IImsEcbmListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.ims.internal.IImsEcbmListener))) {
return ((com.android.ims.internal.IImsEcbmListener)iin);
}
return new com.android.ims.internal.IImsEcbmListener.Stub.Proxy(obj);
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
case TRANSACTION_enteredECBM:
{
data.enforceInterface(DESCRIPTOR);
this.enteredECBM();
reply.writeNoException();
return true;
}
case TRANSACTION_exitedECBM:
{
data.enforceInterface(DESCRIPTOR);
this.exitedECBM();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.ims.internal.IImsEcbmListener
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
     * Notifies the application when the device enters Emergency Callback Mode.
     */
@Override public void enteredECBM() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_enteredECBM, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notifies the application when the device exits Emergency Callback Mode.
     */
@Override public void exitedECBM() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_exitedECBM, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_enteredECBM = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_exitedECBM = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
/**
     * Notifies the application when the device enters Emergency Callback Mode.
     */
public void enteredECBM() throws android.os.RemoteException;
/**
     * Notifies the application when the device exits Emergency Callback Mode.
     */
public void exitedECBM() throws android.os.RemoteException;
}
