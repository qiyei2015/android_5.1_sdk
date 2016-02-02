/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/com/android/internal/app/IAppOpsCallback.aidl
 */
package com.android.internal.app;
// This interface is also used by native code, so must
// be kept in sync with frameworks/native/include/binder/IAppOpsCallback.h

public interface IAppOpsCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IAppOpsCallback
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.app.IAppOpsCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.app.IAppOpsCallback interface,
 * generating a proxy if needed.
 */
public static com.android.internal.app.IAppOpsCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.app.IAppOpsCallback))) {
return ((com.android.internal.app.IAppOpsCallback)iin);
}
return new com.android.internal.app.IAppOpsCallback.Stub.Proxy(obj);
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
case TRANSACTION_opChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.opChanged(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.app.IAppOpsCallback
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
@Override public void opChanged(int op, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(op);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_opChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_opChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void opChanged(int op, java.lang.String packageName) throws android.os.RemoteException;
}
