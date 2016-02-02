/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/net/IConnectivityManager.aidl
 */
package android.net;
/**
 * Interface that answers queries about, and allows changing, the
 * state of network connectivity.
 *//** {@hide} */
public interface IConnectivityManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.IConnectivityManager
{
private static final java.lang.String DESCRIPTOR = "android.net.IConnectivityManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.IConnectivityManager interface,
 * generating a proxy if needed.
 */
public static android.net.IConnectivityManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.IConnectivityManager))) {
return ((android.net.IConnectivityManager)iin);
}
return new android.net.IConnectivityManager.Stub.Proxy(obj);
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
case TRANSACTION_getActiveNetworkInfo:
{
data.enforceInterface(DESCRIPTOR);
android.net.NetworkInfo _result = this.getActiveNetworkInfo();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getActiveNetworkInfoForUid:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.net.NetworkInfo _result = this.getActiveNetworkInfoForUid(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getNetworkInfo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.net.NetworkInfo _result = this.getNetworkInfo(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getNetworkInfoForNetwork:
{
data.enforceInterface(DESCRIPTOR);
android.net.Network _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.Network.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.net.NetworkInfo _result = this.getNetworkInfoForNetwork(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getAllNetworkInfo:
{
data.enforceInterface(DESCRIPTOR);
android.net.NetworkInfo[] _result = this.getAllNetworkInfo();
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_getNetworkForType:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.net.Network _result = this.getNetworkForType(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getAllNetworks:
{
data.enforceInterface(DESCRIPTOR);
android.net.Network[] _result = this.getAllNetworks();
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_getDefaultNetworkCapabilitiesForUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.net.NetworkCapabilities[] _result = this.getDefaultNetworkCapabilitiesForUser(_arg0);
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_getProvisioningOrActiveNetworkInfo:
{
data.enforceInterface(DESCRIPTOR);
android.net.NetworkInfo _result = this.getProvisioningOrActiveNetworkInfo();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_isNetworkSupported:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isNetworkSupported(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getActiveLinkProperties:
{
data.enforceInterface(DESCRIPTOR);
android.net.LinkProperties _result = this.getActiveLinkProperties();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getLinkPropertiesForType:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.net.LinkProperties _result = this.getLinkPropertiesForType(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getLinkProperties:
{
data.enforceInterface(DESCRIPTOR);
android.net.Network _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.Network.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.net.LinkProperties _result = this.getLinkProperties(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getNetworkCapabilities:
{
data.enforceInterface(DESCRIPTOR);
android.net.Network _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.Network.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.net.NetworkCapabilities _result = this.getNetworkCapabilities(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getAllNetworkState:
{
data.enforceInterface(DESCRIPTOR);
android.net.NetworkState[] _result = this.getAllNetworkState();
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_getActiveNetworkQuotaInfo:
{
data.enforceInterface(DESCRIPTOR);
android.net.NetworkQuotaInfo _result = this.getActiveNetworkQuotaInfo();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_isActiveNetworkMetered:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isActiveNetworkMetered();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_requestRouteToHostAddress:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
byte[] _arg1;
_arg1 = data.createByteArray();
boolean _result = this.requestRouteToHostAddress(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_tether:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.tether(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_untether:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.untether(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getLastTetherError:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getLastTetherError(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_isTetheringSupported:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isTetheringSupported();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getTetherableIfaces:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getTetherableIfaces();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getTetheredIfaces:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getTetheredIfaces();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getTetheringErroredIfaces:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getTetheringErroredIfaces();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getTetheredDhcpRanges:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getTetheredDhcpRanges();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getTetherableUsbRegexs:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getTetherableUsbRegexs();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getTetherableWifiRegexs:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getTetherableWifiRegexs();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getTetherableBluetoothRegexs:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getTetherableBluetoothRegexs();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_setUsbTethering:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _result = this.setUsbTethering(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_reportInetCondition:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.reportInetCondition(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_reportBadNetwork:
{
data.enforceInterface(DESCRIPTOR);
android.net.Network _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.Network.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.reportBadNetwork(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getGlobalProxy:
{
data.enforceInterface(DESCRIPTOR);
android.net.ProxyInfo _result = this.getGlobalProxy();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_setGlobalProxy:
{
data.enforceInterface(DESCRIPTOR);
android.net.ProxyInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.ProxyInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setGlobalProxy(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getDefaultProxy:
{
data.enforceInterface(DESCRIPTOR);
android.net.ProxyInfo _result = this.getDefaultProxy();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_setDataDependency:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setDataDependency(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_prepareVpn:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.prepareVpn(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setVpnPackageAuthorization:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setVpnPackageAuthorization(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_establishVpn:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.net.VpnConfig _arg0;
if ((0!=data.readInt())) {
_arg0 = com.android.internal.net.VpnConfig.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.ParcelFileDescriptor _result = this.establishVpn(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getVpnConfig:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.net.VpnConfig _result = this.getVpnConfig();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_startLegacyVpn:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.net.VpnProfile _arg0;
if ((0!=data.readInt())) {
_arg0 = com.android.internal.net.VpnProfile.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.startLegacyVpn(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getLegacyVpnInfo:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.net.LegacyVpnInfo _result = this.getLegacyVpnInfo();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_updateLockdownVpn:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.updateLockdownVpn();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_captivePortalCheckCompleted:
{
data.enforceInterface(DESCRIPTOR);
android.net.NetworkInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.NetworkInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
this.captivePortalCheckCompleted(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_supplyMessenger:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.os.Messenger _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Messenger.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.supplyMessenger(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_findConnectionTypeForIface:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.findConnectionTypeForIface(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_checkMobileProvisioning:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.checkMobileProvisioning(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getMobileProvisioningUrl:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getMobileProvisioningUrl();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getMobileRedirectedProvisioningUrl:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getMobileRedirectedProvisioningUrl();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_setProvisioningNotificationVisible:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
this.setProvisioningNotificationVisible(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setAirplaneMode:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setAirplaneMode(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_registerNetworkFactory:
{
data.enforceInterface(DESCRIPTOR);
android.os.Messenger _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Messenger.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
this.registerNetworkFactory(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterNetworkFactory:
{
data.enforceInterface(DESCRIPTOR);
android.os.Messenger _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Messenger.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.unregisterNetworkFactory(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_registerNetworkAgent:
{
data.enforceInterface(DESCRIPTOR);
android.os.Messenger _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Messenger.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.net.NetworkInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = android.net.NetworkInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.net.LinkProperties _arg2;
if ((0!=data.readInt())) {
_arg2 = android.net.LinkProperties.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
android.net.NetworkCapabilities _arg3;
if ((0!=data.readInt())) {
_arg3 = android.net.NetworkCapabilities.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
int _arg4;
_arg4 = data.readInt();
android.net.NetworkMisc _arg5;
if ((0!=data.readInt())) {
_arg5 = android.net.NetworkMisc.CREATOR.createFromParcel(data);
}
else {
_arg5 = null;
}
this.registerNetworkAgent(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_requestNetwork:
{
data.enforceInterface(DESCRIPTOR);
android.net.NetworkCapabilities _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.NetworkCapabilities.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.Messenger _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Messenger.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
android.os.IBinder _arg3;
_arg3 = data.readStrongBinder();
int _arg4;
_arg4 = data.readInt();
android.net.NetworkRequest _result = this.requestNetwork(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_pendingRequestForNetwork:
{
data.enforceInterface(DESCRIPTOR);
android.net.NetworkCapabilities _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.NetworkCapabilities.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.app.PendingIntent _arg1;
if ((0!=data.readInt())) {
_arg1 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.net.NetworkRequest _result = this.pendingRequestForNetwork(_arg0, _arg1);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_releasePendingNetworkRequest:
{
data.enforceInterface(DESCRIPTOR);
android.app.PendingIntent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.releasePendingNetworkRequest(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_listenForNetwork:
{
data.enforceInterface(DESCRIPTOR);
android.net.NetworkCapabilities _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.NetworkCapabilities.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.Messenger _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Messenger.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.os.IBinder _arg2;
_arg2 = data.readStrongBinder();
android.net.NetworkRequest _result = this.listenForNetwork(_arg0, _arg1, _arg2);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_pendingListenForNetwork:
{
data.enforceInterface(DESCRIPTOR);
android.net.NetworkCapabilities _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.NetworkCapabilities.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.app.PendingIntent _arg1;
if ((0!=data.readInt())) {
_arg1 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.pendingListenForNetwork(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_releaseNetworkRequest:
{
data.enforceInterface(DESCRIPTOR);
android.net.NetworkRequest _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.NetworkRequest.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.releaseNetworkRequest(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getRestoreDefaultNetworkDelay:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getRestoreDefaultNetworkDelay(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_addVpnAddress:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.addVpnAddress(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeVpnAddress:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.removeVpnAddress(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setUnderlyingNetworksForVpn:
{
data.enforceInterface(DESCRIPTOR);
android.net.Network[] _arg0;
_arg0 = data.createTypedArray(android.net.Network.CREATOR);
boolean _result = this.setUnderlyingNetworksForVpn(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.IConnectivityManager
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
@Override public android.net.NetworkInfo getActiveNetworkInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.NetworkInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActiveNetworkInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.NetworkInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.net.NetworkInfo getActiveNetworkInfoForUid(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.NetworkInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_getActiveNetworkInfoForUid, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.NetworkInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.net.NetworkInfo getNetworkInfo(int networkType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.NetworkInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(networkType);
mRemote.transact(Stub.TRANSACTION_getNetworkInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.NetworkInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.net.NetworkInfo getNetworkInfoForNetwork(android.net.Network network) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.NetworkInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((network!=null)) {
_data.writeInt(1);
network.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getNetworkInfoForNetwork, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.NetworkInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.net.NetworkInfo[] getAllNetworkInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.NetworkInfo[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAllNetworkInfo, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.net.NetworkInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.net.Network getNetworkForType(int networkType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.Network _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(networkType);
mRemote.transact(Stub.TRANSACTION_getNetworkForType, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.Network.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.net.Network[] getAllNetworks() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.Network[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAllNetworks, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.net.Network.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.net.NetworkCapabilities[] getDefaultNetworkCapabilitiesForUser(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.NetworkCapabilities[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getDefaultNetworkCapabilitiesForUser, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.net.NetworkCapabilities.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.net.NetworkInfo getProvisioningOrActiveNetworkInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.NetworkInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getProvisioningOrActiveNetworkInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.NetworkInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isNetworkSupported(int networkType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(networkType);
mRemote.transact(Stub.TRANSACTION_isNetworkSupported, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.net.LinkProperties getActiveLinkProperties() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.LinkProperties _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActiveLinkProperties, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.LinkProperties.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.net.LinkProperties getLinkPropertiesForType(int networkType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.LinkProperties _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(networkType);
mRemote.transact(Stub.TRANSACTION_getLinkPropertiesForType, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.LinkProperties.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.net.LinkProperties getLinkProperties(android.net.Network network) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.LinkProperties _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((network!=null)) {
_data.writeInt(1);
network.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getLinkProperties, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.LinkProperties.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.net.NetworkCapabilities getNetworkCapabilities(android.net.Network network) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.NetworkCapabilities _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((network!=null)) {
_data.writeInt(1);
network.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getNetworkCapabilities, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.NetworkCapabilities.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.net.NetworkState[] getAllNetworkState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.NetworkState[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAllNetworkState, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.net.NetworkState.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.net.NetworkQuotaInfo getActiveNetworkQuotaInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.NetworkQuotaInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActiveNetworkQuotaInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.NetworkQuotaInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isActiveNetworkMetered() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isActiveNetworkMetered, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean requestRouteToHostAddress(int networkType, byte[] hostAddress) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(networkType);
_data.writeByteArray(hostAddress);
mRemote.transact(Stub.TRANSACTION_requestRouteToHostAddress, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int tether(java.lang.String iface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
mRemote.transact(Stub.TRANSACTION_tether, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int untether(java.lang.String iface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
mRemote.transact(Stub.TRANSACTION_untether, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getLastTetherError(java.lang.String iface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
mRemote.transact(Stub.TRANSACTION_getLastTetherError, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isTetheringSupported() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isTetheringSupported, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String[] getTetherableIfaces() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTetherableIfaces, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String[] getTetheredIfaces() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTetheredIfaces, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String[] getTetheringErroredIfaces() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTetheringErroredIfaces, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String[] getTetheredDhcpRanges() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTetheredDhcpRanges, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String[] getTetherableUsbRegexs() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTetherableUsbRegexs, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String[] getTetherableWifiRegexs() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTetherableWifiRegexs, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String[] getTetherableBluetoothRegexs() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTetherableBluetoothRegexs, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int setUsbTethering(boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setUsbTethering, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void reportInetCondition(int networkType, int percentage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(networkType);
_data.writeInt(percentage);
mRemote.transact(Stub.TRANSACTION_reportInetCondition, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void reportBadNetwork(android.net.Network network) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((network!=null)) {
_data.writeInt(1);
network.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_reportBadNetwork, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.net.ProxyInfo getGlobalProxy() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.ProxyInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getGlobalProxy, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.ProxyInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setGlobalProxy(android.net.ProxyInfo p) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((p!=null)) {
_data.writeInt(1);
p.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setGlobalProxy, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.net.ProxyInfo getDefaultProxy() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.ProxyInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDefaultProxy, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.ProxyInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setDataDependency(int networkType, boolean met) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(networkType);
_data.writeInt(((met)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setDataDependency, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean prepareVpn(java.lang.String oldPackage, java.lang.String newPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(oldPackage);
_data.writeString(newPackage);
mRemote.transact(Stub.TRANSACTION_prepareVpn, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setVpnPackageAuthorization(boolean authorized) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((authorized)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setVpnPackageAuthorization, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.os.ParcelFileDescriptor establishVpn(com.android.internal.net.VpnConfig config) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.ParcelFileDescriptor _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((config!=null)) {
_data.writeInt(1);
config.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_establishVpn, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.android.internal.net.VpnConfig getVpnConfig() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.internal.net.VpnConfig _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getVpnConfig, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.android.internal.net.VpnConfig.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void startLegacyVpn(com.android.internal.net.VpnProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startLegacyVpn, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public com.android.internal.net.LegacyVpnInfo getLegacyVpnInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.internal.net.LegacyVpnInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLegacyVpnInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.android.internal.net.LegacyVpnInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean updateLockdownVpn() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_updateLockdownVpn, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void captivePortalCheckCompleted(android.net.NetworkInfo info, boolean isCaptivePortal) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((info!=null)) {
_data.writeInt(1);
info.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((isCaptivePortal)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_captivePortalCheckCompleted, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void supplyMessenger(int networkType, android.os.Messenger messenger) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(networkType);
if ((messenger!=null)) {
_data.writeInt(1);
messenger.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_supplyMessenger, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int findConnectionTypeForIface(java.lang.String iface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
mRemote.transact(Stub.TRANSACTION_findConnectionTypeForIface, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int checkMobileProvisioning(int suggestedTimeOutMs) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(suggestedTimeOutMs);
mRemote.transact(Stub.TRANSACTION_checkMobileProvisioning, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getMobileProvisioningUrl() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getMobileProvisioningUrl, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getMobileRedirectedProvisioningUrl() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getMobileRedirectedProvisioningUrl, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setProvisioningNotificationVisible(boolean visible, int networkType, java.lang.String action) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((visible)?(1):(0)));
_data.writeInt(networkType);
_data.writeString(action);
mRemote.transact(Stub.TRANSACTION_setProvisioningNotificationVisible, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setAirplaneMode(boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setAirplaneMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void registerNetworkFactory(android.os.Messenger messenger, java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((messenger!=null)) {
_data.writeInt(1);
messenger.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_registerNetworkFactory, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterNetworkFactory(android.os.Messenger messenger) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((messenger!=null)) {
_data.writeInt(1);
messenger.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_unregisterNetworkFactory, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void registerNetworkAgent(android.os.Messenger messenger, android.net.NetworkInfo ni, android.net.LinkProperties lp, android.net.NetworkCapabilities nc, int score, android.net.NetworkMisc misc) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((messenger!=null)) {
_data.writeInt(1);
messenger.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((ni!=null)) {
_data.writeInt(1);
ni.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((lp!=null)) {
_data.writeInt(1);
lp.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((nc!=null)) {
_data.writeInt(1);
nc.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(score);
if ((misc!=null)) {
_data.writeInt(1);
misc.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_registerNetworkAgent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.net.NetworkRequest requestNetwork(android.net.NetworkCapabilities networkCapabilities, android.os.Messenger messenger, int timeoutSec, android.os.IBinder binder, int legacy) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.NetworkRequest _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((networkCapabilities!=null)) {
_data.writeInt(1);
networkCapabilities.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((messenger!=null)) {
_data.writeInt(1);
messenger.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(timeoutSec);
_data.writeStrongBinder(binder);
_data.writeInt(legacy);
mRemote.transact(Stub.TRANSACTION_requestNetwork, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.NetworkRequest.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.net.NetworkRequest pendingRequestForNetwork(android.net.NetworkCapabilities networkCapabilities, android.app.PendingIntent operation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.NetworkRequest _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((networkCapabilities!=null)) {
_data.writeInt(1);
networkCapabilities.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((operation!=null)) {
_data.writeInt(1);
operation.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_pendingRequestForNetwork, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.NetworkRequest.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void releasePendingNetworkRequest(android.app.PendingIntent operation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((operation!=null)) {
_data.writeInt(1);
operation.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_releasePendingNetworkRequest, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.net.NetworkRequest listenForNetwork(android.net.NetworkCapabilities networkCapabilities, android.os.Messenger messenger, android.os.IBinder binder) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.NetworkRequest _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((networkCapabilities!=null)) {
_data.writeInt(1);
networkCapabilities.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((messenger!=null)) {
_data.writeInt(1);
messenger.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder(binder);
mRemote.transact(Stub.TRANSACTION_listenForNetwork, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.NetworkRequest.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void pendingListenForNetwork(android.net.NetworkCapabilities networkCapabilities, android.app.PendingIntent operation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((networkCapabilities!=null)) {
_data.writeInt(1);
networkCapabilities.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((operation!=null)) {
_data.writeInt(1);
operation.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_pendingListenForNetwork, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void releaseNetworkRequest(android.net.NetworkRequest networkRequest) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((networkRequest!=null)) {
_data.writeInt(1);
networkRequest.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_releaseNetworkRequest, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getRestoreDefaultNetworkDelay(int networkType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(networkType);
mRemote.transact(Stub.TRANSACTION_getRestoreDefaultNetworkDelay, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean addVpnAddress(java.lang.String address, int prefixLength) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(prefixLength);
mRemote.transact(Stub.TRANSACTION_addVpnAddress, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean removeVpnAddress(java.lang.String address, int prefixLength) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(prefixLength);
mRemote.transact(Stub.TRANSACTION_removeVpnAddress, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setUnderlyingNetworksForVpn(android.net.Network[] networks) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedArray(networks, 0);
mRemote.transact(Stub.TRANSACTION_setUnderlyingNetworksForVpn, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getActiveNetworkInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getActiveNetworkInfoForUid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getNetworkInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getNetworkInfoForNetwork = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getAllNetworkInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getNetworkForType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getAllNetworks = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getDefaultNetworkCapabilitiesForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getProvisioningOrActiveNetworkInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_isNetworkSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getActiveLinkProperties = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getLinkPropertiesForType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getLinkProperties = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_getNetworkCapabilities = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_getAllNetworkState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getActiveNetworkQuotaInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_isActiveNetworkMetered = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_requestRouteToHostAddress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_tether = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_untether = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_getLastTetherError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_isTetheringSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_getTetherableIfaces = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_getTetheredIfaces = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_getTetheringErroredIfaces = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_getTetheredDhcpRanges = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_getTetherableUsbRegexs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_getTetherableWifiRegexs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_getTetherableBluetoothRegexs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_setUsbTethering = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_reportInetCondition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_reportBadNetwork = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_getGlobalProxy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_setGlobalProxy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_getDefaultProxy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
static final int TRANSACTION_setDataDependency = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
static final int TRANSACTION_prepareVpn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
static final int TRANSACTION_setVpnPackageAuthorization = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
static final int TRANSACTION_establishVpn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
static final int TRANSACTION_getVpnConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
static final int TRANSACTION_startLegacyVpn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
static final int TRANSACTION_getLegacyVpnInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
static final int TRANSACTION_updateLockdownVpn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
static final int TRANSACTION_captivePortalCheckCompleted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
static final int TRANSACTION_supplyMessenger = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
static final int TRANSACTION_findConnectionTypeForIface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
static final int TRANSACTION_checkMobileProvisioning = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
static final int TRANSACTION_getMobileProvisioningUrl = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
static final int TRANSACTION_getMobileRedirectedProvisioningUrl = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
static final int TRANSACTION_setProvisioningNotificationVisible = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
static final int TRANSACTION_setAirplaneMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
static final int TRANSACTION_registerNetworkFactory = (android.os.IBinder.FIRST_CALL_TRANSACTION + 51);
static final int TRANSACTION_unregisterNetworkFactory = (android.os.IBinder.FIRST_CALL_TRANSACTION + 52);
static final int TRANSACTION_registerNetworkAgent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 53);
static final int TRANSACTION_requestNetwork = (android.os.IBinder.FIRST_CALL_TRANSACTION + 54);
static final int TRANSACTION_pendingRequestForNetwork = (android.os.IBinder.FIRST_CALL_TRANSACTION + 55);
static final int TRANSACTION_releasePendingNetworkRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 56);
static final int TRANSACTION_listenForNetwork = (android.os.IBinder.FIRST_CALL_TRANSACTION + 57);
static final int TRANSACTION_pendingListenForNetwork = (android.os.IBinder.FIRST_CALL_TRANSACTION + 58);
static final int TRANSACTION_releaseNetworkRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 59);
static final int TRANSACTION_getRestoreDefaultNetworkDelay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 60);
static final int TRANSACTION_addVpnAddress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 61);
static final int TRANSACTION_removeVpnAddress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 62);
static final int TRANSACTION_setUnderlyingNetworksForVpn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 63);
}
public android.net.NetworkInfo getActiveNetworkInfo() throws android.os.RemoteException;
public android.net.NetworkInfo getActiveNetworkInfoForUid(int uid) throws android.os.RemoteException;
public android.net.NetworkInfo getNetworkInfo(int networkType) throws android.os.RemoteException;
public android.net.NetworkInfo getNetworkInfoForNetwork(android.net.Network network) throws android.os.RemoteException;
public android.net.NetworkInfo[] getAllNetworkInfo() throws android.os.RemoteException;
public android.net.Network getNetworkForType(int networkType) throws android.os.RemoteException;
public android.net.Network[] getAllNetworks() throws android.os.RemoteException;
public android.net.NetworkCapabilities[] getDefaultNetworkCapabilitiesForUser(int userId) throws android.os.RemoteException;
public android.net.NetworkInfo getProvisioningOrActiveNetworkInfo() throws android.os.RemoteException;
public boolean isNetworkSupported(int networkType) throws android.os.RemoteException;
public android.net.LinkProperties getActiveLinkProperties() throws android.os.RemoteException;
public android.net.LinkProperties getLinkPropertiesForType(int networkType) throws android.os.RemoteException;
public android.net.LinkProperties getLinkProperties(android.net.Network network) throws android.os.RemoteException;
public android.net.NetworkCapabilities getNetworkCapabilities(android.net.Network network) throws android.os.RemoteException;
public android.net.NetworkState[] getAllNetworkState() throws android.os.RemoteException;
public android.net.NetworkQuotaInfo getActiveNetworkQuotaInfo() throws android.os.RemoteException;
public boolean isActiveNetworkMetered() throws android.os.RemoteException;
public boolean requestRouteToHostAddress(int networkType, byte[] hostAddress) throws android.os.RemoteException;
public int tether(java.lang.String iface) throws android.os.RemoteException;
public int untether(java.lang.String iface) throws android.os.RemoteException;
public int getLastTetherError(java.lang.String iface) throws android.os.RemoteException;
public boolean isTetheringSupported() throws android.os.RemoteException;
public java.lang.String[] getTetherableIfaces() throws android.os.RemoteException;
public java.lang.String[] getTetheredIfaces() throws android.os.RemoteException;
public java.lang.String[] getTetheringErroredIfaces() throws android.os.RemoteException;
public java.lang.String[] getTetheredDhcpRanges() throws android.os.RemoteException;
public java.lang.String[] getTetherableUsbRegexs() throws android.os.RemoteException;
public java.lang.String[] getTetherableWifiRegexs() throws android.os.RemoteException;
public java.lang.String[] getTetherableBluetoothRegexs() throws android.os.RemoteException;
public int setUsbTethering(boolean enable) throws android.os.RemoteException;
public void reportInetCondition(int networkType, int percentage) throws android.os.RemoteException;
public void reportBadNetwork(android.net.Network network) throws android.os.RemoteException;
public android.net.ProxyInfo getGlobalProxy() throws android.os.RemoteException;
public void setGlobalProxy(android.net.ProxyInfo p) throws android.os.RemoteException;
public android.net.ProxyInfo getDefaultProxy() throws android.os.RemoteException;
public void setDataDependency(int networkType, boolean met) throws android.os.RemoteException;
public boolean prepareVpn(java.lang.String oldPackage, java.lang.String newPackage) throws android.os.RemoteException;
public void setVpnPackageAuthorization(boolean authorized) throws android.os.RemoteException;
public android.os.ParcelFileDescriptor establishVpn(com.android.internal.net.VpnConfig config) throws android.os.RemoteException;
public com.android.internal.net.VpnConfig getVpnConfig() throws android.os.RemoteException;
public void startLegacyVpn(com.android.internal.net.VpnProfile profile) throws android.os.RemoteException;
public com.android.internal.net.LegacyVpnInfo getLegacyVpnInfo() throws android.os.RemoteException;
public boolean updateLockdownVpn() throws android.os.RemoteException;
public void captivePortalCheckCompleted(android.net.NetworkInfo info, boolean isCaptivePortal) throws android.os.RemoteException;
public void supplyMessenger(int networkType, android.os.Messenger messenger) throws android.os.RemoteException;
public int findConnectionTypeForIface(java.lang.String iface) throws android.os.RemoteException;
public int checkMobileProvisioning(int suggestedTimeOutMs) throws android.os.RemoteException;
public java.lang.String getMobileProvisioningUrl() throws android.os.RemoteException;
public java.lang.String getMobileRedirectedProvisioningUrl() throws android.os.RemoteException;
public void setProvisioningNotificationVisible(boolean visible, int networkType, java.lang.String action) throws android.os.RemoteException;
public void setAirplaneMode(boolean enable) throws android.os.RemoteException;
public void registerNetworkFactory(android.os.Messenger messenger, java.lang.String name) throws android.os.RemoteException;
public void unregisterNetworkFactory(android.os.Messenger messenger) throws android.os.RemoteException;
public void registerNetworkAgent(android.os.Messenger messenger, android.net.NetworkInfo ni, android.net.LinkProperties lp, android.net.NetworkCapabilities nc, int score, android.net.NetworkMisc misc) throws android.os.RemoteException;
public android.net.NetworkRequest requestNetwork(android.net.NetworkCapabilities networkCapabilities, android.os.Messenger messenger, int timeoutSec, android.os.IBinder binder, int legacy) throws android.os.RemoteException;
public android.net.NetworkRequest pendingRequestForNetwork(android.net.NetworkCapabilities networkCapabilities, android.app.PendingIntent operation) throws android.os.RemoteException;
public void releasePendingNetworkRequest(android.app.PendingIntent operation) throws android.os.RemoteException;
public android.net.NetworkRequest listenForNetwork(android.net.NetworkCapabilities networkCapabilities, android.os.Messenger messenger, android.os.IBinder binder) throws android.os.RemoteException;
public void pendingListenForNetwork(android.net.NetworkCapabilities networkCapabilities, android.app.PendingIntent operation) throws android.os.RemoteException;
public void releaseNetworkRequest(android.net.NetworkRequest networkRequest) throws android.os.RemoteException;
public int getRestoreDefaultNetworkDelay(int networkType) throws android.os.RemoteException;
public boolean addVpnAddress(java.lang.String address, int prefixLength) throws android.os.RemoteException;
public boolean removeVpnAddress(java.lang.String address, int prefixLength) throws android.os.RemoteException;
public boolean setUnderlyingNetworksForVpn(android.net.Network[] networks) throws android.os.RemoteException;
}
