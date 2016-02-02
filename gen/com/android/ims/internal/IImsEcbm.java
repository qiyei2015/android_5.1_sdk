/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/telephony/java/com/android/ims/internal/IImsEcbm.aidl
 */
package com.android.ims.internal;
/**
 * Provides the ECBM interface
 *
 * {@hide}
 */
public interface IImsEcbm extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsEcbm
{
private static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsEcbm";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.ims.internal.IImsEcbm interface,
 * generating a proxy if needed.
 */
public static com.android.ims.internal.IImsEcbm asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.ims.internal.IImsEcbm))) {
return ((com.android.ims.internal.IImsEcbm)iin);
}
return new com.android.ims.internal.IImsEcbm.Stub.Proxy(obj);
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
case TRANSACTION_setListener:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsEcbmListener _arg0;
_arg0 = com.android.ims.internal.IImsEcbmListener.Stub.asInterface(data.readStrongBinder());
this.setListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_exitEmergencyCallbackMode:
{
data.enforceInterface(DESCRIPTOR);
this.exitEmergencyCallbackMode();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.ims.internal.IImsEcbm
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
     * Sets the listener.
     */
@Override public void setListener(com.android.ims.internal.IImsEcbmListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Requests Modem to come out of ECBM mode
     */
@Override public void exitEmergencyCallbackMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_exitEmergencyCallbackMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_setListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_exitEmergencyCallbackMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
/**
     * Sets the listener.
     */
public void setListener(com.android.ims.internal.IImsEcbmListener listener) throws android.os.RemoteException;
/**
     * Requests Modem to come out of ECBM mode
     */
public void exitEmergencyCallbackMode() throws android.os.RemoteException;
}
