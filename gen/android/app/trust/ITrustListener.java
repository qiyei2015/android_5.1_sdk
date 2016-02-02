/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/app/trust/ITrustListener.aidl
 */
package android.app.trust;
/**
 * Private API to be notified about trust changes.
 *
 * {@hide}
 */
public interface ITrustListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.trust.ITrustListener
{
private static final java.lang.String DESCRIPTOR = "android.app.trust.ITrustListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.trust.ITrustListener interface,
 * generating a proxy if needed.
 */
public static android.app.trust.ITrustListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.trust.ITrustListener))) {
return ((android.app.trust.ITrustListener)iin);
}
return new android.app.trust.ITrustListener.Stub.Proxy(obj);
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
case TRANSACTION_onTrustChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.onTrustChanged(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onTrustManagedChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _arg1;
_arg1 = data.readInt();
this.onTrustManagedChanged(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.trust.ITrustListener
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
@Override public void onTrustChanged(boolean enabled, int userId, boolean initiatedByUser) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enabled)?(1):(0)));
_data.writeInt(userId);
_data.writeInt(((initiatedByUser)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onTrustChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onTrustManagedChanged(boolean managed, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((managed)?(1):(0)));
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_onTrustManagedChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onTrustChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onTrustManagedChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void onTrustChanged(boolean enabled, int userId, boolean initiatedByUser) throws android.os.RemoteException;
public void onTrustManagedChanged(boolean managed, int userId) throws android.os.RemoteException;
}
