/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/telephony/java/com/android/ims/ImsConfigListener.aidl
 */
package com.android.ims;
/**
 * Used by IMS config client to monitor the config operation results.
 * {@hide}
 */
public interface ImsConfigListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.ims.ImsConfigListener
{
private static final java.lang.String DESCRIPTOR = "com.android.ims.ImsConfigListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.ims.ImsConfigListener interface,
 * generating a proxy if needed.
 */
public static com.android.ims.ImsConfigListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.ims.ImsConfigListener))) {
return ((com.android.ims.ImsConfigListener)iin);
}
return new com.android.ims.ImsConfigListener.Stub.Proxy(obj);
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
case TRANSACTION_onGetFeatureResponse:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.onGetFeatureResponse(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_onSetFeatureResponse:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.onSetFeatureResponse(_arg0, _arg1, _arg2, _arg3);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.ims.ImsConfigListener
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
     * Notifies client the value of the get operation result on the feature config item.
     * The arguments are the same as passed to com.android.ims.ImsConfig#getFeatureValue.
     *
     * @param feature. as defined in com.android.ims.ImsConfig#FeatureConstants.
     * @param network. as defined in android.telephony.TelephonyManager#NETWORK_TYPE_XXX.
     * @param value. as defined in com.android.ims.ImsConfig#FeatureValueConstants.
     * @param status. as defined in com.android.ims.ImsConfig#OperationStatusConstants.
     * @return void.
     */
@Override public void onGetFeatureResponse(int feature, int network, int value, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(feature);
_data.writeInt(network);
_data.writeInt(value);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onGetFeatureResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Notifies client the set value operation result for feature config item.
     * Used by clients that need to be notified the set operation result.
     * The arguments are the same as passed to com.android.ims.ImsConfig#setFeatureValue.
     * The arguments are repeated in the callback to enable the listener to understand
     * which configuration attempt failed.
     *
     * @param feature. as defined in com.android.ims.ImsConfig#FeatureConstants.
     * @param network. as defined in android.telephony.TelephonyManager#NETWORK_TYPE_XXX.
     * @param value. as defined in com.android.ims.ImsConfig#FeatureValueConstants.
     * @param status. as defined in com.android.ims.ImsConfig#OperationStatusConstants.
     *
     * @return void.
     */
@Override public void onSetFeatureResponse(int feature, int network, int value, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(feature);
_data.writeInt(network);
_data.writeInt(value);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onSetFeatureResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onGetFeatureResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onSetFeatureResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
/**
     * Notifies client the value of the get operation result on the feature config item.
     * The arguments are the same as passed to com.android.ims.ImsConfig#getFeatureValue.
     *
     * @param feature. as defined in com.android.ims.ImsConfig#FeatureConstants.
     * @param network. as defined in android.telephony.TelephonyManager#NETWORK_TYPE_XXX.
     * @param value. as defined in com.android.ims.ImsConfig#FeatureValueConstants.
     * @param status. as defined in com.android.ims.ImsConfig#OperationStatusConstants.
     * @return void.
     */
public void onGetFeatureResponse(int feature, int network, int value, int status) throws android.os.RemoteException;
/**
     * Notifies client the set value operation result for feature config item.
     * Used by clients that need to be notified the set operation result.
     * The arguments are the same as passed to com.android.ims.ImsConfig#setFeatureValue.
     * The arguments are repeated in the callback to enable the listener to understand
     * which configuration attempt failed.
     *
     * @param feature. as defined in com.android.ims.ImsConfig#FeatureConstants.
     * @param network. as defined in android.telephony.TelephonyManager#NETWORK_TYPE_XXX.
     * @param value. as defined in com.android.ims.ImsConfig#FeatureValueConstants.
     * @param status. as defined in com.android.ims.ImsConfig#OperationStatusConstants.
     *
     * @return void.
     */
public void onSetFeatureResponse(int feature, int network, int value, int status) throws android.os.RemoteException;
}
