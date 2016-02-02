/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/com/android/internal/appwidget/IAppWidgetService.aidl
 */
package com.android.internal.appwidget;
/** {@hide} */
public interface IAppWidgetService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.appwidget.IAppWidgetService
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.appwidget.IAppWidgetService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.appwidget.IAppWidgetService interface,
 * generating a proxy if needed.
 */
public static com.android.internal.appwidget.IAppWidgetService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.appwidget.IAppWidgetService))) {
return ((com.android.internal.appwidget.IAppWidgetService)iin);
}
return new com.android.internal.appwidget.IAppWidgetService.Stub.Proxy(obj);
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
case TRANSACTION_startListening:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.appwidget.IAppWidgetHost _arg0;
_arg0 = com.android.internal.appwidget.IAppWidgetHost.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
java.util.List<android.widget.RemoteViews> _arg3;
_arg3 = new java.util.ArrayList<android.widget.RemoteViews>();
int[] _result = this.startListening(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeIntArray(_result);
reply.writeTypedList(_arg3);
return true;
}
case TRANSACTION_stopListening:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.stopListening(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_allocateAppWidgetId:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _result = this.allocateAppWidgetId(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_deleteAppWidgetId:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.deleteAppWidgetId(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_deleteHost:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.deleteHost(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_deleteAllHosts:
{
data.enforceInterface(DESCRIPTOR);
this.deleteAllHosts();
reply.writeNoException();
return true;
}
case TRANSACTION_getAppWidgetViews:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.widget.RemoteViews _result = this.getAppWidgetViews(_arg0, _arg1);
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
case TRANSACTION_getAppWidgetIdsForHost:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int[] _result = this.getAppWidgetIdsForHost(_arg0, _arg1);
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_createAppWidgetConfigIntentSender:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
android.content.IntentSender _result = this.createAppWidgetConfigIntentSender(_arg0, _arg1, _arg2);
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
case TRANSACTION_updateAppWidgetIds:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int[] _arg1;
_arg1 = data.createIntArray();
android.widget.RemoteViews _arg2;
if ((0!=data.readInt())) {
_arg2 = android.widget.RemoteViews.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.updateAppWidgetIds(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_updateAppWidgetOptions:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.os.Bundle _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.updateAppWidgetOptions(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getAppWidgetOptions:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.os.Bundle _result = this.getAppWidgetOptions(_arg0, _arg1);
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
case TRANSACTION_partiallyUpdateAppWidgetIds:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int[] _arg1;
_arg1 = data.createIntArray();
android.widget.RemoteViews _arg2;
if ((0!=data.readInt())) {
_arg2 = android.widget.RemoteViews.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.partiallyUpdateAppWidgetIds(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_updateAppWidgetProvider:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.widget.RemoteViews _arg1;
if ((0!=data.readInt())) {
_arg1 = android.widget.RemoteViews.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.updateAppWidgetProvider(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyAppWidgetViewDataChanged:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int[] _arg1;
_arg1 = data.createIntArray();
int _arg2;
_arg2 = data.readInt();
this.notifyAppWidgetViewDataChanged(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getInstalledProvidersForProfile:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.util.List<android.appwidget.AppWidgetProviderInfo> _result = this.getInstalledProvidersForProfile(_arg0, _arg1);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getAppWidgetInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.appwidget.AppWidgetProviderInfo _result = this.getAppWidgetInfo(_arg0, _arg1);
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
case TRANSACTION_hasBindAppWidgetPermission:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.hasBindAppWidgetPermission(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setBindAppWidgetPermission:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setBindAppWidgetPermission(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_bindAppWidgetId:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
android.content.ComponentName _arg3;
if ((0!=data.readInt())) {
_arg3 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
android.os.Bundle _arg4;
if ((0!=data.readInt())) {
_arg4 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
boolean _result = this.bindAppWidgetId(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_bindAppWidgetIdSkipBindPermission:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
android.content.ComponentName _arg3;
if ((0!=data.readInt())) {
_arg3 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
android.os.Bundle _arg4;
if ((0!=data.readInt())) {
_arg4 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
boolean _arg5;
_arg5 = (0!=data.readInt());
boolean _result = this.bindAppWidgetIdSkipBindPermission(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_bindRemoteViewsService:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.content.Intent _arg2;
if ((0!=data.readInt())) {
_arg2 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
android.os.IBinder _arg3;
_arg3 = data.readStrongBinder();
this.bindRemoteViewsService(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_unbindRemoteViewsService:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.content.Intent _arg2;
if ((0!=data.readInt())) {
_arg2 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.unbindRemoteViewsService(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getAppWidgetIds:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int[] _result = this.getAppWidgetIds(_arg0);
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.appwidget.IAppWidgetService
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
//
// for AppWidgetHost
//

@Override public int[] startListening(com.android.internal.appwidget.IAppWidgetHost host, java.lang.String callingPackage, int hostId, java.util.List<android.widget.RemoteViews> updatedViews) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((host!=null))?(host.asBinder()):(null)));
_data.writeString(callingPackage);
_data.writeInt(hostId);
mRemote.transact(Stub.TRANSACTION_startListening, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
_reply.readTypedList(updatedViews, android.widget.RemoteViews.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void stopListening(java.lang.String callingPackage, int hostId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
_data.writeInt(hostId);
mRemote.transact(Stub.TRANSACTION_stopListening, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int allocateAppWidgetId(java.lang.String callingPackage, int hostId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
_data.writeInt(hostId);
mRemote.transact(Stub.TRANSACTION_allocateAppWidgetId, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void deleteAppWidgetId(java.lang.String callingPackage, int appWidgetId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
_data.writeInt(appWidgetId);
mRemote.transact(Stub.TRANSACTION_deleteAppWidgetId, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void deleteHost(java.lang.String packageName, int hostId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(hostId);
mRemote.transact(Stub.TRANSACTION_deleteHost, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void deleteAllHosts() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_deleteAllHosts, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.widget.RemoteViews getAppWidgetViews(java.lang.String callingPackage, int appWidgetId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.widget.RemoteViews _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
_data.writeInt(appWidgetId);
mRemote.transact(Stub.TRANSACTION_getAppWidgetViews, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.widget.RemoteViews.CREATOR.createFromParcel(_reply);
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
@Override public int[] getAppWidgetIdsForHost(java.lang.String callingPackage, int hostId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
_data.writeInt(hostId);
mRemote.transact(Stub.TRANSACTION_getAppWidgetIdsForHost, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.IntentSender createAppWidgetConfigIntentSender(java.lang.String callingPackage, int appWidgetId, int intentFlags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.IntentSender _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
_data.writeInt(appWidgetId);
_data.writeInt(intentFlags);
mRemote.transact(Stub.TRANSACTION_createAppWidgetConfigIntentSender, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.IntentSender.CREATOR.createFromParcel(_reply);
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
//
// for AppWidgetManager
//

@Override public void updateAppWidgetIds(java.lang.String callingPackage, int[] appWidgetIds, android.widget.RemoteViews views) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
_data.writeIntArray(appWidgetIds);
if ((views!=null)) {
_data.writeInt(1);
views.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateAppWidgetIds, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void updateAppWidgetOptions(java.lang.String callingPackage, int appWidgetId, android.os.Bundle extras) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
_data.writeInt(appWidgetId);
if ((extras!=null)) {
_data.writeInt(1);
extras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateAppWidgetOptions, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.os.Bundle getAppWidgetOptions(java.lang.String callingPackage, int appWidgetId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
_data.writeInt(appWidgetId);
mRemote.transact(Stub.TRANSACTION_getAppWidgetOptions, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
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
@Override public void partiallyUpdateAppWidgetIds(java.lang.String callingPackage, int[] appWidgetIds, android.widget.RemoteViews views) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
_data.writeIntArray(appWidgetIds);
if ((views!=null)) {
_data.writeInt(1);
views.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_partiallyUpdateAppWidgetIds, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void updateAppWidgetProvider(android.content.ComponentName provider, android.widget.RemoteViews views) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((provider!=null)) {
_data.writeInt(1);
provider.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((views!=null)) {
_data.writeInt(1);
views.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateAppWidgetProvider, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyAppWidgetViewDataChanged(java.lang.String packageName, int[] appWidgetIds, int viewId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeIntArray(appWidgetIds);
_data.writeInt(viewId);
mRemote.transact(Stub.TRANSACTION_notifyAppWidgetViewDataChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.util.List<android.appwidget.AppWidgetProviderInfo> getInstalledProvidersForProfile(int categoryFilter, int profileId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.appwidget.AppWidgetProviderInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(categoryFilter);
_data.writeInt(profileId);
mRemote.transact(Stub.TRANSACTION_getInstalledProvidersForProfile, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.appwidget.AppWidgetProviderInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.appwidget.AppWidgetProviderInfo getAppWidgetInfo(java.lang.String callingPackage, int appWidgetId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.appwidget.AppWidgetProviderInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
_data.writeInt(appWidgetId);
mRemote.transact(Stub.TRANSACTION_getAppWidgetInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.appwidget.AppWidgetProviderInfo.CREATOR.createFromParcel(_reply);
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
@Override public boolean hasBindAppWidgetPermission(java.lang.String packageName, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_hasBindAppWidgetPermission, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setBindAppWidgetPermission(java.lang.String packageName, int userId, boolean permission) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(userId);
_data.writeInt(((permission)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setBindAppWidgetPermission, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean bindAppWidgetId(java.lang.String callingPackage, int appWidgetId, int providerProfileId, android.content.ComponentName providerComponent, android.os.Bundle options) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
_data.writeInt(appWidgetId);
_data.writeInt(providerProfileId);
if ((providerComponent!=null)) {
_data.writeInt(1);
providerComponent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((options!=null)) {
_data.writeInt(1);
options.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_bindAppWidgetId, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean bindAppWidgetIdSkipBindPermission(java.lang.String callingPackage, int appWidgetId, int providerProfileId, android.content.ComponentName providerComponent, android.os.Bundle options, boolean skipBindPermission) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
_data.writeInt(appWidgetId);
_data.writeInt(providerProfileId);
if ((providerComponent!=null)) {
_data.writeInt(1);
providerComponent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((options!=null)) {
_data.writeInt(1);
options.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((skipBindPermission)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_bindAppWidgetIdSkipBindPermission, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void bindRemoteViewsService(java.lang.String callingPackage, int appWidgetId, android.content.Intent intent, android.os.IBinder connection) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
_data.writeInt(appWidgetId);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder(connection);
mRemote.transact(Stub.TRANSACTION_bindRemoteViewsService, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unbindRemoteViewsService(java.lang.String callingPackage, int appWidgetId, android.content.Intent intent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
_data.writeInt(appWidgetId);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_unbindRemoteViewsService, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int[] getAppWidgetIds(android.content.ComponentName providerComponent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((providerComponent!=null)) {
_data.writeInt(1);
providerComponent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getAppWidgetIds, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_startListening = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_stopListening = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_allocateAppWidgetId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_deleteAppWidgetId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_deleteHost = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_deleteAllHosts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getAppWidgetViews = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getAppWidgetIdsForHost = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_createAppWidgetConfigIntentSender = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_updateAppWidgetIds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_updateAppWidgetOptions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getAppWidgetOptions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_partiallyUpdateAppWidgetIds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_updateAppWidgetProvider = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_notifyAppWidgetViewDataChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getInstalledProvidersForProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_getAppWidgetInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_hasBindAppWidgetPermission = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_setBindAppWidgetPermission = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_bindAppWidgetId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_bindAppWidgetIdSkipBindPermission = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_bindRemoteViewsService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_unbindRemoteViewsService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_getAppWidgetIds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
}
//
// for AppWidgetHost
//

public int[] startListening(com.android.internal.appwidget.IAppWidgetHost host, java.lang.String callingPackage, int hostId, java.util.List<android.widget.RemoteViews> updatedViews) throws android.os.RemoteException;
public void stopListening(java.lang.String callingPackage, int hostId) throws android.os.RemoteException;
public int allocateAppWidgetId(java.lang.String callingPackage, int hostId) throws android.os.RemoteException;
public void deleteAppWidgetId(java.lang.String callingPackage, int appWidgetId) throws android.os.RemoteException;
public void deleteHost(java.lang.String packageName, int hostId) throws android.os.RemoteException;
public void deleteAllHosts() throws android.os.RemoteException;
public android.widget.RemoteViews getAppWidgetViews(java.lang.String callingPackage, int appWidgetId) throws android.os.RemoteException;
public int[] getAppWidgetIdsForHost(java.lang.String callingPackage, int hostId) throws android.os.RemoteException;
public android.content.IntentSender createAppWidgetConfigIntentSender(java.lang.String callingPackage, int appWidgetId, int intentFlags) throws android.os.RemoteException;
//
// for AppWidgetManager
//

public void updateAppWidgetIds(java.lang.String callingPackage, int[] appWidgetIds, android.widget.RemoteViews views) throws android.os.RemoteException;
public void updateAppWidgetOptions(java.lang.String callingPackage, int appWidgetId, android.os.Bundle extras) throws android.os.RemoteException;
public android.os.Bundle getAppWidgetOptions(java.lang.String callingPackage, int appWidgetId) throws android.os.RemoteException;
public void partiallyUpdateAppWidgetIds(java.lang.String callingPackage, int[] appWidgetIds, android.widget.RemoteViews views) throws android.os.RemoteException;
public void updateAppWidgetProvider(android.content.ComponentName provider, android.widget.RemoteViews views) throws android.os.RemoteException;
public void notifyAppWidgetViewDataChanged(java.lang.String packageName, int[] appWidgetIds, int viewId) throws android.os.RemoteException;
public java.util.List<android.appwidget.AppWidgetProviderInfo> getInstalledProvidersForProfile(int categoryFilter, int profileId) throws android.os.RemoteException;
public android.appwidget.AppWidgetProviderInfo getAppWidgetInfo(java.lang.String callingPackage, int appWidgetId) throws android.os.RemoteException;
public boolean hasBindAppWidgetPermission(java.lang.String packageName, int userId) throws android.os.RemoteException;
public void setBindAppWidgetPermission(java.lang.String packageName, int userId, boolean permission) throws android.os.RemoteException;
public boolean bindAppWidgetId(java.lang.String callingPackage, int appWidgetId, int providerProfileId, android.content.ComponentName providerComponent, android.os.Bundle options) throws android.os.RemoteException;
public boolean bindAppWidgetIdSkipBindPermission(java.lang.String callingPackage, int appWidgetId, int providerProfileId, android.content.ComponentName providerComponent, android.os.Bundle options, boolean skipBindPermission) throws android.os.RemoteException;
public void bindRemoteViewsService(java.lang.String callingPackage, int appWidgetId, android.content.Intent intent, android.os.IBinder connection) throws android.os.RemoteException;
public void unbindRemoteViewsService(java.lang.String callingPackage, int appWidgetId, android.content.Intent intent) throws android.os.RemoteException;
public int[] getAppWidgetIds(android.content.ComponentName providerComponent) throws android.os.RemoteException;
}
