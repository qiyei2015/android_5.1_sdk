/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/os/ISchedulingPolicyService.aidl
 */
package android.os;
/**
 * Initially only provides requestPriority() below, but in longer term
 * other scheduling policy related services will be collected here.
 *
 * @hide
 */
public interface ISchedulingPolicyService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.ISchedulingPolicyService
{
private static final java.lang.String DESCRIPTOR = "android.os.ISchedulingPolicyService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.ISchedulingPolicyService interface,
 * generating a proxy if needed.
 */
public static android.os.ISchedulingPolicyService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.ISchedulingPolicyService))) {
return ((android.os.ISchedulingPolicyService)iin);
}
return new android.os.ISchedulingPolicyService.Stub.Proxy(obj);
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
case TRANSACTION_requestPriority:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _result = this.requestPriority(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.ISchedulingPolicyService
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
     * Move thread tid into appropriate cgroup and assign it priority prio.
     * The thread group leader of tid must be pid.
     * There may be restrictions on who can call this.
     */
@Override public int requestPriority(int pid, int tid, int prio) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(pid);
_data.writeInt(tid);
_data.writeInt(prio);
mRemote.transact(Stub.TRANSACTION_requestPriority, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_requestPriority = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * Move thread tid into appropriate cgroup and assign it priority prio.
     * The thread group leader of tid must be pid.
     * There may be restrictions on who can call this.
     */
public int requestPriority(int pid, int tid, int prio) throws android.os.RemoteException;
}
