/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/packages/services/Telephony/src/com/android/phone/INetworkQueryServiceCallback.aidl
 */
package com.android.phone;
/**
 * Service interface to handle callbacks into the activity from the
 * NetworkQueryService.  These objects are used to notify that a
 * query is complete and that the results are ready to process.
 */
public interface INetworkQueryServiceCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.phone.INetworkQueryServiceCallback
{
private static final java.lang.String DESCRIPTOR = "com.android.phone.INetworkQueryServiceCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.phone.INetworkQueryServiceCallback interface,
 * generating a proxy if needed.
 */
public static com.android.phone.INetworkQueryServiceCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.phone.INetworkQueryServiceCallback))) {
return ((com.android.phone.INetworkQueryServiceCallback)iin);
}
return new com.android.phone.INetworkQueryServiceCallback.Stub.Proxy(obj);
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
case TRANSACTION_onQueryComplete:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<com.android.internal.telephony.OperatorInfo> _arg0;
_arg0 = data.createTypedArrayList(com.android.internal.telephony.OperatorInfo.CREATOR);
int _arg1;
_arg1 = data.readInt();
this.onQueryComplete(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.phone.INetworkQueryServiceCallback
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
     * Called upon query completion, handing a status value and an
     * array of OperatorInfo objects.
     *
     * @param networkInfoArray is the list of OperatorInfo. Can be
     * null, indicating no results were found, or an error.
     * @param status the status indicating if there were any
     * problems with the request.
     */
@Override public void onQueryComplete(java.util.List<com.android.internal.telephony.OperatorInfo> networkInfoArray, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(networkInfoArray);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onQueryComplete, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onQueryComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * Called upon query completion, handing a status value and an
     * array of OperatorInfo objects.
     *
     * @param networkInfoArray is the list of OperatorInfo. Can be
     * null, indicating no results were found, or an error.
     * @param status the status indicating if there were any
     * problems with the request.
     */
public void onQueryComplete(java.util.List<com.android.internal.telephony.OperatorInfo> networkInfoArray, int status) throws android.os.RemoteException;
}
