/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/com/android/internal/policy/IKeyguardExitCallback.aidl
 */
package com.android.internal.policy;
public interface IKeyguardExitCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.policy.IKeyguardExitCallback
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.policy.IKeyguardExitCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.policy.IKeyguardExitCallback interface,
 * generating a proxy if needed.
 */
public static com.android.internal.policy.IKeyguardExitCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.policy.IKeyguardExitCallback))) {
return ((com.android.internal.policy.IKeyguardExitCallback)iin);
}
return new com.android.internal.policy.IKeyguardExitCallback.Stub.Proxy(obj);
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
case TRANSACTION_onKeyguardExitResult:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onKeyguardExitResult(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.policy.IKeyguardExitCallback
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
@Override public void onKeyguardExitResult(boolean success) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((success)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onKeyguardExitResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onKeyguardExitResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onKeyguardExitResult(boolean success) throws android.os.RemoteException;
}
