/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/view/accessibility/IAccessibilityManager.aidl
 */
package android.view.accessibility;
/**
 * Interface implemented by the AccessibilityManagerService called by
 * the AccessibilityMasngers.
 *
 * @hide
 */
public interface IAccessibilityManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.view.accessibility.IAccessibilityManager
{
private static final java.lang.String DESCRIPTOR = "android.view.accessibility.IAccessibilityManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.view.accessibility.IAccessibilityManager interface,
 * generating a proxy if needed.
 */
public static android.view.accessibility.IAccessibilityManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.view.accessibility.IAccessibilityManager))) {
return ((android.view.accessibility.IAccessibilityManager)iin);
}
return new android.view.accessibility.IAccessibilityManager.Stub.Proxy(obj);
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
case TRANSACTION_addClient:
{
data.enforceInterface(DESCRIPTOR);
android.view.accessibility.IAccessibilityManagerClient _arg0;
_arg0 = android.view.accessibility.IAccessibilityManagerClient.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
int _result = this.addClient(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_sendAccessibilityEvent:
{
data.enforceInterface(DESCRIPTOR);
android.view.accessibility.AccessibilityEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.accessibility.AccessibilityEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _result = this.sendAccessibilityEvent(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getInstalledAccessibilityServiceList:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List<android.accessibilityservice.AccessibilityServiceInfo> _result = this.getInstalledAccessibilityServiceList(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getEnabledAccessibilityServiceList:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.util.List<android.accessibilityservice.AccessibilityServiceInfo> _result = this.getEnabledAccessibilityServiceList(_arg0, _arg1);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_interrupt:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.interrupt(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_addAccessibilityInteractionConnection:
{
data.enforceInterface(DESCRIPTOR);
android.view.IWindow _arg0;
_arg0 = android.view.IWindow.Stub.asInterface(data.readStrongBinder());
android.view.accessibility.IAccessibilityInteractionConnection _arg1;
_arg1 = android.view.accessibility.IAccessibilityInteractionConnection.Stub.asInterface(data.readStrongBinder());
int _arg2;
_arg2 = data.readInt();
int _result = this.addAccessibilityInteractionConnection(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_removeAccessibilityInteractionConnection:
{
data.enforceInterface(DESCRIPTOR);
android.view.IWindow _arg0;
_arg0 = android.view.IWindow.Stub.asInterface(data.readStrongBinder());
this.removeAccessibilityInteractionConnection(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_registerUiTestAutomationService:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.accessibilityservice.IAccessibilityServiceClient _arg1;
_arg1 = android.accessibilityservice.IAccessibilityServiceClient.Stub.asInterface(data.readStrongBinder());
android.accessibilityservice.AccessibilityServiceInfo _arg2;
if ((0!=data.readInt())) {
_arg2 = android.accessibilityservice.AccessibilityServiceInfo.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.registerUiTestAutomationService(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterUiTestAutomationService:
{
data.enforceInterface(DESCRIPTOR);
android.accessibilityservice.IAccessibilityServiceClient _arg0;
_arg0 = android.accessibilityservice.IAccessibilityServiceClient.Stub.asInterface(data.readStrongBinder());
this.unregisterUiTestAutomationService(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_temporaryEnableAccessibilityStateUntilKeyguardRemoved:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
this.temporaryEnableAccessibilityStateUntilKeyguardRemoved(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getWindowToken:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.os.IBinder _result = this.getWindowToken(_arg0);
reply.writeNoException();
reply.writeStrongBinder(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.view.accessibility.IAccessibilityManager
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
@Override public int addClient(android.view.accessibility.IAccessibilityManagerClient client, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_addClient, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean sendAccessibilityEvent(android.view.accessibility.AccessibilityEvent uiEvent, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((uiEvent!=null)) {
_data.writeInt(1);
uiEvent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_sendAccessibilityEvent, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAccessibilityServiceList(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.accessibilityservice.AccessibilityServiceInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getInstalledAccessibilityServiceList, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.accessibilityservice.AccessibilityServiceInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getEnabledAccessibilityServiceList(int feedbackType, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.accessibilityservice.AccessibilityServiceInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(feedbackType);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getEnabledAccessibilityServiceList, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.accessibilityservice.AccessibilityServiceInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void interrupt(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_interrupt, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int addAccessibilityInteractionConnection(android.view.IWindow windowToken, android.view.accessibility.IAccessibilityInteractionConnection connection, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((windowToken!=null))?(windowToken.asBinder()):(null)));
_data.writeStrongBinder((((connection!=null))?(connection.asBinder()):(null)));
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_addAccessibilityInteractionConnection, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void removeAccessibilityInteractionConnection(android.view.IWindow windowToken) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((windowToken!=null))?(windowToken.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_removeAccessibilityInteractionConnection, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void registerUiTestAutomationService(android.os.IBinder owner, android.accessibilityservice.IAccessibilityServiceClient client, android.accessibilityservice.AccessibilityServiceInfo info) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(owner);
_data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
if ((info!=null)) {
_data.writeInt(1);
info.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_registerUiTestAutomationService, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterUiTestAutomationService(android.accessibilityservice.IAccessibilityServiceClient client) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterUiTestAutomationService, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void temporaryEnableAccessibilityStateUntilKeyguardRemoved(android.content.ComponentName service, boolean touchExplorationEnabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((service!=null)) {
_data.writeInt(1);
service.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((touchExplorationEnabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_temporaryEnableAccessibilityStateUntilKeyguardRemoved, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.os.IBinder getWindowToken(int windowId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.IBinder _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(windowId);
mRemote.transact(Stub.TRANSACTION_getWindowToken, _data, _reply, 0);
_reply.readException();
_result = _reply.readStrongBinder();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_addClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_sendAccessibilityEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getInstalledAccessibilityServiceList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getEnabledAccessibilityServiceList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_interrupt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_addAccessibilityInteractionConnection = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_removeAccessibilityInteractionConnection = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_registerUiTestAutomationService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_unregisterUiTestAutomationService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_temporaryEnableAccessibilityStateUntilKeyguardRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getWindowToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
}
public int addClient(android.view.accessibility.IAccessibilityManagerClient client, int userId) throws android.os.RemoteException;
public boolean sendAccessibilityEvent(android.view.accessibility.AccessibilityEvent uiEvent, int userId) throws android.os.RemoteException;
public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAccessibilityServiceList(int userId) throws android.os.RemoteException;
public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getEnabledAccessibilityServiceList(int feedbackType, int userId) throws android.os.RemoteException;
public void interrupt(int userId) throws android.os.RemoteException;
public int addAccessibilityInteractionConnection(android.view.IWindow windowToken, android.view.accessibility.IAccessibilityInteractionConnection connection, int userId) throws android.os.RemoteException;
public void removeAccessibilityInteractionConnection(android.view.IWindow windowToken) throws android.os.RemoteException;
public void registerUiTestAutomationService(android.os.IBinder owner, android.accessibilityservice.IAccessibilityServiceClient client, android.accessibilityservice.AccessibilityServiceInfo info) throws android.os.RemoteException;
public void unregisterUiTestAutomationService(android.accessibilityservice.IAccessibilityServiceClient client) throws android.os.RemoteException;
public void temporaryEnableAccessibilityStateUntilKeyguardRemoved(android.content.ComponentName service, boolean touchExplorationEnabled) throws android.os.RemoteException;
public android.os.IBinder getWindowToken(int windowId) throws android.os.RemoteException;
}
