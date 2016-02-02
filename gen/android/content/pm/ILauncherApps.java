/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/content/pm/ILauncherApps.aidl
 */
package android.content.pm;
/**
 * {@hide}
 */
public interface ILauncherApps extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.content.pm.ILauncherApps
{
private static final java.lang.String DESCRIPTOR = "android.content.pm.ILauncherApps";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.content.pm.ILauncherApps interface,
 * generating a proxy if needed.
 */
public static android.content.pm.ILauncherApps asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.content.pm.ILauncherApps))) {
return ((android.content.pm.ILauncherApps)iin);
}
return new android.content.pm.ILauncherApps.Stub.Proxy(obj);
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
case TRANSACTION_addOnAppsChangedListener:
{
data.enforceInterface(DESCRIPTOR);
android.content.pm.IOnAppsChangedListener _arg0;
_arg0 = android.content.pm.IOnAppsChangedListener.Stub.asInterface(data.readStrongBinder());
this.addOnAppsChangedListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_removeOnAppsChangedListener:
{
data.enforceInterface(DESCRIPTOR);
android.content.pm.IOnAppsChangedListener _arg0;
_arg0 = android.content.pm.IOnAppsChangedListener.Stub.asInterface(data.readStrongBinder());
this.removeOnAppsChangedListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getLauncherActivities:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.UserHandle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.UserHandle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.util.List<android.content.pm.ResolveInfo> _result = this.getLauncherActivities(_arg0, _arg1);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_resolveActivity:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.UserHandle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.UserHandle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.content.pm.ResolveInfo _result = this.resolveActivity(_arg0, _arg1);
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
case TRANSACTION_startActivityAsUser:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.graphics.Rect _arg1;
if ((0!=data.readInt())) {
_arg1 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.os.Bundle _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
android.os.UserHandle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.UserHandle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.startActivityAsUser(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_showAppDetailsAsUser:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.graphics.Rect _arg1;
if ((0!=data.readInt())) {
_arg1 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.os.Bundle _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
android.os.UserHandle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.UserHandle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.showAppDetailsAsUser(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_isPackageEnabled:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.UserHandle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.UserHandle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _result = this.isPackageEnabled(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isActivityEnabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.UserHandle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.UserHandle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _result = this.isActivityEnabled(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.content.pm.ILauncherApps
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
@Override public void addOnAppsChangedListener(android.content.pm.IOnAppsChangedListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_addOnAppsChangedListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeOnAppsChangedListener(android.content.pm.IOnAppsChangedListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_removeOnAppsChangedListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.util.List<android.content.pm.ResolveInfo> getLauncherActivities(java.lang.String packageName, android.os.UserHandle user) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.pm.ResolveInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
if ((user!=null)) {
_data.writeInt(1);
user.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getLauncherActivities, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.pm.ResolveInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.pm.ResolveInfo resolveActivity(android.content.Intent intent, android.os.UserHandle user) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ResolveInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((user!=null)) {
_data.writeInt(1);
user.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_resolveActivity, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ResolveInfo.CREATOR.createFromParcel(_reply);
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
@Override public void startActivityAsUser(android.content.ComponentName component, android.graphics.Rect sourceBounds, android.os.Bundle opts, android.os.UserHandle user) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((component!=null)) {
_data.writeInt(1);
component.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((sourceBounds!=null)) {
_data.writeInt(1);
sourceBounds.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((opts!=null)) {
_data.writeInt(1);
opts.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((user!=null)) {
_data.writeInt(1);
user.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startActivityAsUser, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void showAppDetailsAsUser(android.content.ComponentName component, android.graphics.Rect sourceBounds, android.os.Bundle opts, android.os.UserHandle user) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((component!=null)) {
_data.writeInt(1);
component.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((sourceBounds!=null)) {
_data.writeInt(1);
sourceBounds.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((opts!=null)) {
_data.writeInt(1);
opts.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((user!=null)) {
_data.writeInt(1);
user.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_showAppDetailsAsUser, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isPackageEnabled(java.lang.String packageName, android.os.UserHandle user) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
if ((user!=null)) {
_data.writeInt(1);
user.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_isPackageEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isActivityEnabled(android.content.ComponentName component, android.os.UserHandle user) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((component!=null)) {
_data.writeInt(1);
component.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((user!=null)) {
_data.writeInt(1);
user.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_isActivityEnabled, _data, _reply, 0);
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
static final int TRANSACTION_addOnAppsChangedListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_removeOnAppsChangedListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getLauncherActivities = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_resolveActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_startActivityAsUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_showAppDetailsAsUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_isPackageEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_isActivityEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
public void addOnAppsChangedListener(android.content.pm.IOnAppsChangedListener listener) throws android.os.RemoteException;
public void removeOnAppsChangedListener(android.content.pm.IOnAppsChangedListener listener) throws android.os.RemoteException;
public java.util.List<android.content.pm.ResolveInfo> getLauncherActivities(java.lang.String packageName, android.os.UserHandle user) throws android.os.RemoteException;
public android.content.pm.ResolveInfo resolveActivity(android.content.Intent intent, android.os.UserHandle user) throws android.os.RemoteException;
public void startActivityAsUser(android.content.ComponentName component, android.graphics.Rect sourceBounds, android.os.Bundle opts, android.os.UserHandle user) throws android.os.RemoteException;
public void showAppDetailsAsUser(android.content.ComponentName component, android.graphics.Rect sourceBounds, android.os.Bundle opts, android.os.UserHandle user) throws android.os.RemoteException;
public boolean isPackageEnabled(java.lang.String packageName, android.os.UserHandle user) throws android.os.RemoteException;
public boolean isActivityEnabled(android.content.ComponentName component, android.os.UserHandle user) throws android.os.RemoteException;
}
