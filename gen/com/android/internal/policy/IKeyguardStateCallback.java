/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/com/android/internal/policy/IKeyguardStateCallback.aidl
 */
package com.android.internal.policy;
public interface IKeyguardStateCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.policy.IKeyguardStateCallback
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.policy.IKeyguardStateCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.policy.IKeyguardStateCallback interface,
 * generating a proxy if needed.
 */
public static com.android.internal.policy.IKeyguardStateCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.policy.IKeyguardStateCallback))) {
return ((com.android.internal.policy.IKeyguardStateCallback)iin);
}
return new com.android.internal.policy.IKeyguardStateCallback.Stub.Proxy(obj);
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
case TRANSACTION_onShowingStateChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onShowingStateChanged(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onSimSecureStateChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onSimSecureStateChanged(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onInputRestrictedStateChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onInputRestrictedStateChanged(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.policy.IKeyguardStateCallback
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
@Override public void onShowingStateChanged(boolean showing) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((showing)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onShowingStateChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onSimSecureStateChanged(boolean simSecure) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((simSecure)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onSimSecureStateChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onInputRestrictedStateChanged(boolean inputRestricted) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((inputRestricted)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onInputRestrictedStateChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onShowingStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onSimSecureStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onInputRestrictedStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public void onShowingStateChanged(boolean showing) throws android.os.RemoteException;
public void onSimSecureStateChanged(boolean simSecure) throws android.os.RemoteException;
public void onInputRestrictedStateChanged(boolean inputRestricted) throws android.os.RemoteException;
}
