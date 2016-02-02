/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/content/pm/IOnAppsChangedListener.aidl
 */
package android.content.pm;
/**
 * {@hide}
 */
public interface IOnAppsChangedListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.content.pm.IOnAppsChangedListener
{
private static final java.lang.String DESCRIPTOR = "android.content.pm.IOnAppsChangedListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.content.pm.IOnAppsChangedListener interface,
 * generating a proxy if needed.
 */
public static android.content.pm.IOnAppsChangedListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.content.pm.IOnAppsChangedListener))) {
return ((android.content.pm.IOnAppsChangedListener)iin);
}
return new android.content.pm.IOnAppsChangedListener.Stub.Proxy(obj);
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
case TRANSACTION_onPackageRemoved:
{
data.enforceInterface(DESCRIPTOR);
android.os.UserHandle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.UserHandle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
this.onPackageRemoved(_arg0, _arg1);
return true;
}
case TRANSACTION_onPackageAdded:
{
data.enforceInterface(DESCRIPTOR);
android.os.UserHandle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.UserHandle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
this.onPackageAdded(_arg0, _arg1);
return true;
}
case TRANSACTION_onPackageChanged:
{
data.enforceInterface(DESCRIPTOR);
android.os.UserHandle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.UserHandle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
this.onPackageChanged(_arg0, _arg1);
return true;
}
case TRANSACTION_onPackagesAvailable:
{
data.enforceInterface(DESCRIPTOR);
android.os.UserHandle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.UserHandle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String[] _arg1;
_arg1 = data.createStringArray();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.onPackagesAvailable(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onPackagesUnavailable:
{
data.enforceInterface(DESCRIPTOR);
android.os.UserHandle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.UserHandle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String[] _arg1;
_arg1 = data.createStringArray();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.onPackagesUnavailable(_arg0, _arg1, _arg2);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.content.pm.IOnAppsChangedListener
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
@Override public void onPackageRemoved(android.os.UserHandle user, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((user!=null)) {
_data.writeInt(1);
user.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_onPackageRemoved, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onPackageAdded(android.os.UserHandle user, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((user!=null)) {
_data.writeInt(1);
user.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_onPackageAdded, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onPackageChanged(android.os.UserHandle user, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((user!=null)) {
_data.writeInt(1);
user.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_onPackageChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onPackagesAvailable(android.os.UserHandle user, java.lang.String[] packageNames, boolean replacing) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((user!=null)) {
_data.writeInt(1);
user.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStringArray(packageNames);
_data.writeInt(((replacing)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onPackagesAvailable, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onPackagesUnavailable(android.os.UserHandle user, java.lang.String[] packageNames, boolean replacing) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((user!=null)) {
_data.writeInt(1);
user.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStringArray(packageNames);
_data.writeInt(((replacing)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onPackagesUnavailable, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onPackageRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onPackageAdded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onPackageChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onPackagesAvailable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onPackagesUnavailable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public void onPackageRemoved(android.os.UserHandle user, java.lang.String packageName) throws android.os.RemoteException;
public void onPackageAdded(android.os.UserHandle user, java.lang.String packageName) throws android.os.RemoteException;
public void onPackageChanged(android.os.UserHandle user, java.lang.String packageName) throws android.os.RemoteException;
public void onPackagesAvailable(android.os.UserHandle user, java.lang.String[] packageNames, boolean replacing) throws android.os.RemoteException;
public void onPackagesUnavailable(android.os.UserHandle user, java.lang.String[] packageNames, boolean replacing) throws android.os.RemoteException;
}
