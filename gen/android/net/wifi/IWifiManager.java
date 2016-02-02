/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/wifi/java/android/net/wifi/IWifiManager.aidl
 */
package android.net.wifi;
/**
 * Interface that allows controlling and querying Wi-Fi connectivity.
 *
 * {@hide}
 */
public interface IWifiManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.wifi.IWifiManager
{
private static final java.lang.String DESCRIPTOR = "android.net.wifi.IWifiManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.wifi.IWifiManager interface,
 * generating a proxy if needed.
 */
public static android.net.wifi.IWifiManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.wifi.IWifiManager))) {
return ((android.net.wifi.IWifiManager)iin);
}
return new android.net.wifi.IWifiManager.Stub.Proxy(obj);
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
case TRANSACTION_getSupportedFeatures:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getSupportedFeatures();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_reportActivityInfo:
{
data.enforceInterface(DESCRIPTOR);
android.net.wifi.WifiActivityEnergyInfo _result = this.reportActivityInfo();
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
case TRANSACTION_getConfiguredNetworks:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.net.wifi.WifiConfiguration> _result = this.getConfiguredNetworks();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getPrivilegedConfiguredNetworks:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.net.wifi.WifiConfiguration> _result = this.getPrivilegedConfiguredNetworks();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_addOrUpdateNetwork:
{
data.enforceInterface(DESCRIPTOR);
android.net.wifi.WifiConfiguration _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.wifi.WifiConfiguration.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.addOrUpdateNetwork(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_removeNetwork:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.removeNetwork(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_enableNetwork:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _result = this.enableNetwork(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_disableNetwork:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.disableNetwork(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_pingSupplicant:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.pingSupplicant();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getChannelList:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.net.wifi.WifiChannel> _result = this.getChannelList();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_startScan:
{
data.enforceInterface(DESCRIPTOR);
android.net.wifi.ScanSettings _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.wifi.ScanSettings.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.WorkSource _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.WorkSource.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.startScan(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_startLocationRestrictedScan:
{
data.enforceInterface(DESCRIPTOR);
android.os.WorkSource _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.WorkSource.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.startLocationRestrictedScan(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getScanResults:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.List<android.net.wifi.ScanResult> _result = this.getScanResults(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_disconnect:
{
data.enforceInterface(DESCRIPTOR);
this.disconnect();
reply.writeNoException();
return true;
}
case TRANSACTION_reconnect:
{
data.enforceInterface(DESCRIPTOR);
this.reconnect();
reply.writeNoException();
return true;
}
case TRANSACTION_reassociate:
{
data.enforceInterface(DESCRIPTOR);
this.reassociate();
reply.writeNoException();
return true;
}
case TRANSACTION_getConnectionInfo:
{
data.enforceInterface(DESCRIPTOR);
android.net.wifi.WifiInfo _result = this.getConnectionInfo();
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
case TRANSACTION_setWifiEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _result = this.setWifiEnabled(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getWifiEnabledState:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getWifiEnabledState();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setCountryCode:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setCountryCode(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setFrequencyBand:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setFrequencyBand(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getFrequencyBand:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getFrequencyBand();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_isDualBandSupported:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isDualBandSupported();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_saveConfiguration:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.saveConfiguration();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getDhcpInfo:
{
data.enforceInterface(DESCRIPTOR);
android.net.DhcpInfo _result = this.getDhcpInfo();
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
case TRANSACTION_isScanAlwaysAvailable:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isScanAlwaysAvailable();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_acquireWifiLock:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
android.os.WorkSource _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.WorkSource.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
boolean _result = this.acquireWifiLock(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_updateWifiLockWorkSource:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.os.WorkSource _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.WorkSource.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.updateWifiLockWorkSource(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_releaseWifiLock:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _result = this.releaseWifiLock(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_initializeMulticastFiltering:
{
data.enforceInterface(DESCRIPTOR);
this.initializeMulticastFiltering();
reply.writeNoException();
return true;
}
case TRANSACTION_isMulticastEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isMulticastEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_acquireMulticastLock:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
java.lang.String _arg1;
_arg1 = data.readString();
this.acquireMulticastLock(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_releaseMulticastLock:
{
data.enforceInterface(DESCRIPTOR);
this.releaseMulticastLock();
reply.writeNoException();
return true;
}
case TRANSACTION_setWifiApEnabled:
{
data.enforceInterface(DESCRIPTOR);
android.net.wifi.WifiConfiguration _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.wifi.WifiConfiguration.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setWifiApEnabled(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getWifiApEnabledState:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getWifiApEnabledState();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getWifiApConfiguration:
{
data.enforceInterface(DESCRIPTOR);
android.net.wifi.WifiConfiguration _result = this.getWifiApConfiguration();
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
case TRANSACTION_setWifiApConfiguration:
{
data.enforceInterface(DESCRIPTOR);
android.net.wifi.WifiConfiguration _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.wifi.WifiConfiguration.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setWifiApConfiguration(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_startWifi:
{
data.enforceInterface(DESCRIPTOR);
this.startWifi();
reply.writeNoException();
return true;
}
case TRANSACTION_stopWifi:
{
data.enforceInterface(DESCRIPTOR);
this.stopWifi();
reply.writeNoException();
return true;
}
case TRANSACTION_addToBlacklist:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.addToBlacklist(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_clearBlacklist:
{
data.enforceInterface(DESCRIPTOR);
this.clearBlacklist();
reply.writeNoException();
return true;
}
case TRANSACTION_getWifiServiceMessenger:
{
data.enforceInterface(DESCRIPTOR);
android.os.Messenger _result = this.getWifiServiceMessenger();
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
case TRANSACTION_getConfigFile:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getConfigFile();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_enableTdls:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.enableTdls(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_enableTdlsWithMacAddress:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.enableTdlsWithMacAddress(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_requestBatchedScan:
{
data.enforceInterface(DESCRIPTOR);
android.net.wifi.BatchedScanSettings _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.wifi.BatchedScanSettings.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
android.os.WorkSource _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.WorkSource.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
boolean _result = this.requestBatchedScan(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_stopBatchedScan:
{
data.enforceInterface(DESCRIPTOR);
android.net.wifi.BatchedScanSettings _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.wifi.BatchedScanSettings.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.stopBatchedScan(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getBatchedScanResults:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.List<android.net.wifi.BatchedScanResult> _result = this.getBatchedScanResults(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_isBatchedScanSupported:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isBatchedScanSupported();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_pollBatchedScan:
{
data.enforceInterface(DESCRIPTOR);
this.pollBatchedScan();
reply.writeNoException();
return true;
}
case TRANSACTION_getWpsNfcConfigurationToken:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _result = this.getWpsNfcConfigurationToken(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_enableVerboseLogging:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.enableVerboseLogging(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getVerboseLoggingLevel:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getVerboseLoggingLevel();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getAggressiveHandover:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getAggressiveHandover();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_enableAggressiveHandover:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.enableAggressiveHandover(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getAllowScansWithTraffic:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getAllowScansWithTraffic();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setAllowScansWithTraffic:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setAllowScansWithTraffic(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getConnectionStatistics:
{
data.enforceInterface(DESCRIPTOR);
android.net.wifi.WifiConnectionStatistics _result = this.getConnectionStatistics();
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
case TRANSACTION_disableEphemeralNetwork:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.disableEphemeralNetwork(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.wifi.IWifiManager
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
@Override public int getSupportedFeatures() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSupportedFeatures, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.net.wifi.WifiActivityEnergyInfo reportActivityInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.wifi.WifiActivityEnergyInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_reportActivityInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.wifi.WifiActivityEnergyInfo.CREATOR.createFromParcel(_reply);
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
@Override public java.util.List<android.net.wifi.WifiConfiguration> getConfiguredNetworks() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.net.wifi.WifiConfiguration> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getConfiguredNetworks, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.net.wifi.WifiConfiguration.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.net.wifi.WifiConfiguration> getPrivilegedConfiguredNetworks() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.net.wifi.WifiConfiguration> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPrivilegedConfiguredNetworks, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.net.wifi.WifiConfiguration.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int addOrUpdateNetwork(android.net.wifi.WifiConfiguration config) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((config!=null)) {
_data.writeInt(1);
config.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addOrUpdateNetwork, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean removeNetwork(int netId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(netId);
mRemote.transact(Stub.TRANSACTION_removeNetwork, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean enableNetwork(int netId, boolean disableOthers) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(netId);
_data.writeInt(((disableOthers)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_enableNetwork, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean disableNetwork(int netId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(netId);
mRemote.transact(Stub.TRANSACTION_disableNetwork, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean pingSupplicant() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_pingSupplicant, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.net.wifi.WifiChannel> getChannelList() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.net.wifi.WifiChannel> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getChannelList, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.net.wifi.WifiChannel.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void startScan(android.net.wifi.ScanSettings requested, android.os.WorkSource ws) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((requested!=null)) {
_data.writeInt(1);
requested.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((ws!=null)) {
_data.writeInt(1);
ws.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startScan, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void startLocationRestrictedScan(android.os.WorkSource ws) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((ws!=null)) {
_data.writeInt(1);
ws.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startLocationRestrictedScan, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.util.List<android.net.wifi.ScanResult> getScanResults(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.net.wifi.ScanResult> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getScanResults, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.net.wifi.ScanResult.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void disconnect() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_disconnect, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void reconnect() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_reconnect, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void reassociate() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_reassociate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.net.wifi.WifiInfo getConnectionInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.wifi.WifiInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getConnectionInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.wifi.WifiInfo.CREATOR.createFromParcel(_reply);
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
@Override public boolean setWifiEnabled(boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setWifiEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getWifiEnabledState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getWifiEnabledState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setCountryCode(java.lang.String country, boolean persist) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(country);
_data.writeInt(((persist)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setCountryCode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setFrequencyBand(int band, boolean persist) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(band);
_data.writeInt(((persist)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setFrequencyBand, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getFrequencyBand() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getFrequencyBand, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isDualBandSupported() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isDualBandSupported, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean saveConfiguration() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_saveConfiguration, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.net.DhcpInfo getDhcpInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.DhcpInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDhcpInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.DhcpInfo.CREATOR.createFromParcel(_reply);
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
@Override public boolean isScanAlwaysAvailable() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isScanAlwaysAvailable, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean acquireWifiLock(android.os.IBinder lock, int lockType, java.lang.String tag, android.os.WorkSource ws) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(lock);
_data.writeInt(lockType);
_data.writeString(tag);
if ((ws!=null)) {
_data.writeInt(1);
ws.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_acquireWifiLock, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void updateWifiLockWorkSource(android.os.IBinder lock, android.os.WorkSource ws) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(lock);
if ((ws!=null)) {
_data.writeInt(1);
ws.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateWifiLockWorkSource, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean releaseWifiLock(android.os.IBinder lock) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(lock);
mRemote.transact(Stub.TRANSACTION_releaseWifiLock, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void initializeMulticastFiltering() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_initializeMulticastFiltering, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isMulticastEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isMulticastEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void acquireMulticastLock(android.os.IBinder binder, java.lang.String tag) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(binder);
_data.writeString(tag);
mRemote.transact(Stub.TRANSACTION_acquireMulticastLock, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void releaseMulticastLock() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_releaseMulticastLock, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setWifiApEnabled(android.net.wifi.WifiConfiguration wifiConfig, boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((wifiConfig!=null)) {
_data.writeInt(1);
wifiConfig.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setWifiApEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getWifiApEnabledState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getWifiApEnabledState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.net.wifi.WifiConfiguration getWifiApConfiguration() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.wifi.WifiConfiguration _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getWifiApConfiguration, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.wifi.WifiConfiguration.CREATOR.createFromParcel(_reply);
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
@Override public void setWifiApConfiguration(android.net.wifi.WifiConfiguration wifiConfig) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((wifiConfig!=null)) {
_data.writeInt(1);
wifiConfig.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setWifiApConfiguration, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void startWifi() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_startWifi, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopWifi() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopWifi, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void addToBlacklist(java.lang.String bssid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(bssid);
mRemote.transact(Stub.TRANSACTION_addToBlacklist, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearBlacklist() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_clearBlacklist, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.os.Messenger getWifiServiceMessenger() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Messenger _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getWifiServiceMessenger, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Messenger.CREATOR.createFromParcel(_reply);
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
@Override public java.lang.String getConfigFile() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getConfigFile, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void enableTdls(java.lang.String remoteIPAddress, boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(remoteIPAddress);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_enableTdls, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void enableTdlsWithMacAddress(java.lang.String remoteMacAddress, boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(remoteMacAddress);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_enableTdlsWithMacAddress, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean requestBatchedScan(android.net.wifi.BatchedScanSettings requested, android.os.IBinder binder, android.os.WorkSource ws) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((requested!=null)) {
_data.writeInt(1);
requested.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder(binder);
if ((ws!=null)) {
_data.writeInt(1);
ws.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_requestBatchedScan, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void stopBatchedScan(android.net.wifi.BatchedScanSettings requested) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((requested!=null)) {
_data.writeInt(1);
requested.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_stopBatchedScan, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.util.List<android.net.wifi.BatchedScanResult> getBatchedScanResults(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.net.wifi.BatchedScanResult> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getBatchedScanResults, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.net.wifi.BatchedScanResult.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isBatchedScanSupported() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isBatchedScanSupported, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void pollBatchedScan() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_pollBatchedScan, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String getWpsNfcConfigurationToken(int netId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(netId);
mRemote.transact(Stub.TRANSACTION_getWpsNfcConfigurationToken, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void enableVerboseLogging(int verbose) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(verbose);
mRemote.transact(Stub.TRANSACTION_enableVerboseLogging, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getVerboseLoggingLevel() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getVerboseLoggingLevel, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getAggressiveHandover() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAggressiveHandover, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void enableAggressiveHandover(int enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(enabled);
mRemote.transact(Stub.TRANSACTION_enableAggressiveHandover, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getAllowScansWithTraffic() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAllowScansWithTraffic, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setAllowScansWithTraffic(int enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(enabled);
mRemote.transact(Stub.TRANSACTION_setAllowScansWithTraffic, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.net.wifi.WifiConnectionStatistics getConnectionStatistics() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.wifi.WifiConnectionStatistics _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getConnectionStatistics, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.wifi.WifiConnectionStatistics.CREATOR.createFromParcel(_reply);
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
@Override public void disableEphemeralNetwork(java.lang.String SSID) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(SSID);
mRemote.transact(Stub.TRANSACTION_disableEphemeralNetwork, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getSupportedFeatures = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_reportActivityInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getConfiguredNetworks = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getPrivilegedConfiguredNetworks = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_addOrUpdateNetwork = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_removeNetwork = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_enableNetwork = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_disableNetwork = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_pingSupplicant = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getChannelList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_startScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_startLocationRestrictedScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getScanResults = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_disconnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_reconnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_reassociate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_getConnectionInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_setWifiEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_getWifiEnabledState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_setCountryCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_setFrequencyBand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_getFrequencyBand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_isDualBandSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_saveConfiguration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_getDhcpInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_isScanAlwaysAvailable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_acquireWifiLock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_updateWifiLockWorkSource = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_releaseWifiLock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_initializeMulticastFiltering = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_isMulticastEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_acquireMulticastLock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_releaseMulticastLock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_setWifiApEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_getWifiApEnabledState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
static final int TRANSACTION_getWifiApConfiguration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
static final int TRANSACTION_setWifiApConfiguration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
static final int TRANSACTION_startWifi = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
static final int TRANSACTION_stopWifi = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
static final int TRANSACTION_addToBlacklist = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
static final int TRANSACTION_clearBlacklist = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
static final int TRANSACTION_getWifiServiceMessenger = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
static final int TRANSACTION_getConfigFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
static final int TRANSACTION_enableTdls = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
static final int TRANSACTION_enableTdlsWithMacAddress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
static final int TRANSACTION_requestBatchedScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
static final int TRANSACTION_stopBatchedScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
static final int TRANSACTION_getBatchedScanResults = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
static final int TRANSACTION_isBatchedScanSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
static final int TRANSACTION_pollBatchedScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
static final int TRANSACTION_getWpsNfcConfigurationToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
static final int TRANSACTION_enableVerboseLogging = (android.os.IBinder.FIRST_CALL_TRANSACTION + 51);
static final int TRANSACTION_getVerboseLoggingLevel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 52);
static final int TRANSACTION_getAggressiveHandover = (android.os.IBinder.FIRST_CALL_TRANSACTION + 53);
static final int TRANSACTION_enableAggressiveHandover = (android.os.IBinder.FIRST_CALL_TRANSACTION + 54);
static final int TRANSACTION_getAllowScansWithTraffic = (android.os.IBinder.FIRST_CALL_TRANSACTION + 55);
static final int TRANSACTION_setAllowScansWithTraffic = (android.os.IBinder.FIRST_CALL_TRANSACTION + 56);
static final int TRANSACTION_getConnectionStatistics = (android.os.IBinder.FIRST_CALL_TRANSACTION + 57);
static final int TRANSACTION_disableEphemeralNetwork = (android.os.IBinder.FIRST_CALL_TRANSACTION + 58);
}
public int getSupportedFeatures() throws android.os.RemoteException;
public android.net.wifi.WifiActivityEnergyInfo reportActivityInfo() throws android.os.RemoteException;
public java.util.List<android.net.wifi.WifiConfiguration> getConfiguredNetworks() throws android.os.RemoteException;
public java.util.List<android.net.wifi.WifiConfiguration> getPrivilegedConfiguredNetworks() throws android.os.RemoteException;
public int addOrUpdateNetwork(android.net.wifi.WifiConfiguration config) throws android.os.RemoteException;
public boolean removeNetwork(int netId) throws android.os.RemoteException;
public boolean enableNetwork(int netId, boolean disableOthers) throws android.os.RemoteException;
public boolean disableNetwork(int netId) throws android.os.RemoteException;
public boolean pingSupplicant() throws android.os.RemoteException;
public java.util.List<android.net.wifi.WifiChannel> getChannelList() throws android.os.RemoteException;
public void startScan(android.net.wifi.ScanSettings requested, android.os.WorkSource ws) throws android.os.RemoteException;
public void startLocationRestrictedScan(android.os.WorkSource ws) throws android.os.RemoteException;
public java.util.List<android.net.wifi.ScanResult> getScanResults(java.lang.String callingPackage) throws android.os.RemoteException;
public void disconnect() throws android.os.RemoteException;
public void reconnect() throws android.os.RemoteException;
public void reassociate() throws android.os.RemoteException;
public android.net.wifi.WifiInfo getConnectionInfo() throws android.os.RemoteException;
public boolean setWifiEnabled(boolean enable) throws android.os.RemoteException;
public int getWifiEnabledState() throws android.os.RemoteException;
public void setCountryCode(java.lang.String country, boolean persist) throws android.os.RemoteException;
public void setFrequencyBand(int band, boolean persist) throws android.os.RemoteException;
public int getFrequencyBand() throws android.os.RemoteException;
public boolean isDualBandSupported() throws android.os.RemoteException;
public boolean saveConfiguration() throws android.os.RemoteException;
public android.net.DhcpInfo getDhcpInfo() throws android.os.RemoteException;
public boolean isScanAlwaysAvailable() throws android.os.RemoteException;
public boolean acquireWifiLock(android.os.IBinder lock, int lockType, java.lang.String tag, android.os.WorkSource ws) throws android.os.RemoteException;
public void updateWifiLockWorkSource(android.os.IBinder lock, android.os.WorkSource ws) throws android.os.RemoteException;
public boolean releaseWifiLock(android.os.IBinder lock) throws android.os.RemoteException;
public void initializeMulticastFiltering() throws android.os.RemoteException;
public boolean isMulticastEnabled() throws android.os.RemoteException;
public void acquireMulticastLock(android.os.IBinder binder, java.lang.String tag) throws android.os.RemoteException;
public void releaseMulticastLock() throws android.os.RemoteException;
public void setWifiApEnabled(android.net.wifi.WifiConfiguration wifiConfig, boolean enable) throws android.os.RemoteException;
public int getWifiApEnabledState() throws android.os.RemoteException;
public android.net.wifi.WifiConfiguration getWifiApConfiguration() throws android.os.RemoteException;
public void setWifiApConfiguration(android.net.wifi.WifiConfiguration wifiConfig) throws android.os.RemoteException;
public void startWifi() throws android.os.RemoteException;
public void stopWifi() throws android.os.RemoteException;
public void addToBlacklist(java.lang.String bssid) throws android.os.RemoteException;
public void clearBlacklist() throws android.os.RemoteException;
public android.os.Messenger getWifiServiceMessenger() throws android.os.RemoteException;
public java.lang.String getConfigFile() throws android.os.RemoteException;
public void enableTdls(java.lang.String remoteIPAddress, boolean enable) throws android.os.RemoteException;
public void enableTdlsWithMacAddress(java.lang.String remoteMacAddress, boolean enable) throws android.os.RemoteException;
public boolean requestBatchedScan(android.net.wifi.BatchedScanSettings requested, android.os.IBinder binder, android.os.WorkSource ws) throws android.os.RemoteException;
public void stopBatchedScan(android.net.wifi.BatchedScanSettings requested) throws android.os.RemoteException;
public java.util.List<android.net.wifi.BatchedScanResult> getBatchedScanResults(java.lang.String callingPackage) throws android.os.RemoteException;
public boolean isBatchedScanSupported() throws android.os.RemoteException;
public void pollBatchedScan() throws android.os.RemoteException;
public java.lang.String getWpsNfcConfigurationToken(int netId) throws android.os.RemoteException;
public void enableVerboseLogging(int verbose) throws android.os.RemoteException;
public int getVerboseLoggingLevel() throws android.os.RemoteException;
public int getAggressiveHandover() throws android.os.RemoteException;
public void enableAggressiveHandover(int enabled) throws android.os.RemoteException;
public int getAllowScansWithTraffic() throws android.os.RemoteException;
public void setAllowScansWithTraffic(int enabled) throws android.os.RemoteException;
public android.net.wifi.WifiConnectionStatistics getConnectionStatistics() throws android.os.RemoteException;
public void disableEphemeralNetwork(java.lang.String SSID) throws android.os.RemoteException;
}
