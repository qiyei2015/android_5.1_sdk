/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /work/android_5.1_sdk/frameworks/base/core/java/android/os/IDisplayDeviceManagementService.aidl
 */
package android.os;
/**
 * @hide
 */
public interface IDisplayDeviceManagementService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.IDisplayDeviceManagementService
{
private static final java.lang.String DESCRIPTOR = "android.os.IDisplayDeviceManagementService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.IDisplayDeviceManagementService interface,
 * generating a proxy if needed.
 */
public static android.os.IDisplayDeviceManagementService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.IDisplayDeviceManagementService))) {
return ((android.os.IDisplayDeviceManagementService)iin);
}
return new android.os.IDisplayDeviceManagementService.Stub.Proxy(obj);
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
case TRANSACTION_listInterfaces:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String[] _result = this.listInterfaces(_arg0);
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getCurrentInterface:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _result = this.getCurrentInterface(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getModelist:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String[] _result = this.getModelist(_arg0, _arg1);
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _result = this.getMode(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_enableInterface:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.enableInterface(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.setMode(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_switchNextDisplayInterface:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.switchNextDisplayInterface(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getEnableSwitchFB:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getEnableSwitchFB();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_setScreenScale:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setScreenScale(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setDisplaySize:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setDisplaySize(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_get3DModes:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.get3DModes(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getCur3DMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.getCur3DMode(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_set3DMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
this.set3DMode(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_saveConfig:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.saveConfig();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setBrightness:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.setBrightness(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setContrast:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
float _arg1;
_arg1 = data.readFloat();
this.setContrast(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setSaturation:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
float _arg1;
_arg1 = data.readFloat();
this.setSaturation(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setHue:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
float _arg1;
_arg1 = data.readFloat();
this.setHue(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.IDisplayDeviceManagementService
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
     ** GENERAL
     *//**
     * Returns a list of currently known display interfaces
     */
@Override public java.lang.String[] listInterfaces(int display) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(display);
mRemote.transact(Stub.TRANSACTION_listInterfaces, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Returns the current enabled display interfaces
     */
@Override public java.lang.String getCurrentInterface(int display) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(display);
mRemote.transact(Stub.TRANSACTION_getCurrentInterface, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Returns a list of supported display modes
     */
@Override public java.lang.String[] getModelist(int display, java.lang.String iface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(display);
_data.writeString(iface);
mRemote.transact(Stub.TRANSACTION_getModelist, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Returns current display mode
     */
@Override public java.lang.String getMode(int display, java.lang.String iface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(display);
_data.writeString(iface);
mRemote.transact(Stub.TRANSACTION_getMode, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Enable selected display interface
     */
@Override public void enableInterface(int display, java.lang.String iface, boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(display);
_data.writeString(iface);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_enableInterface, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Set display mode
     */
@Override public void setMode(int display, java.lang.String iface, java.lang.String mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(display);
_data.writeString(iface);
_data.writeString(mode);
mRemote.transact(Stub.TRANSACTION_setMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Switch next display interface
     */
@Override public void switchNextDisplayInterface(int display) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(display);
mRemote.transact(Stub.TRANSACTION_switchNextDisplayInterface, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Get siwtch framebuffer info
     */
@Override public java.lang.String getEnableSwitchFB() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getEnableSwitchFB, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Set display screen scale value
     */
@Override public void setScreenScale(int display, int direction, int value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(display);
_data.writeInt(direction);
_data.writeInt(value);
mRemote.transact(Stub.TRANSACTION_setScreenScale, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Switch framebuffer
     */
@Override public void setDisplaySize(int display, int width, int height) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(display);
_data.writeInt(width);
_data.writeInt(height);
mRemote.transact(Stub.TRANSACTION_setDisplaySize, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Get Supported 3D Modes
     */
@Override public int get3DModes(int display, java.lang.String iface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(display);
_data.writeString(iface);
mRemote.transact(Stub.TRANSACTION_get3DModes, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Get Current 3D Mode
     */
@Override public int getCur3DMode(int display, java.lang.String iface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(display);
_data.writeString(iface);
mRemote.transact(Stub.TRANSACTION_getCur3DMode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Set 3D Mode
     */
@Override public void set3DMode(int display, java.lang.String iface, int mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(display);
_data.writeString(iface);
_data.writeInt(mode);
mRemote.transact(Stub.TRANSACTION_set3DMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * saveConfig
     */
@Override public int saveConfig() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_saveConfig, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Set brightness
     */
@Override public void setBrightness(int display, int brightness) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(display);
_data.writeInt(brightness);
mRemote.transact(Stub.TRANSACTION_setBrightness, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Set contrast
     */
@Override public void setContrast(int display, float contrast) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(display);
_data.writeFloat(contrast);
mRemote.transact(Stub.TRANSACTION_setContrast, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     *Set saturation
     */
@Override public void setSaturation(int display, float saturation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(display);
_data.writeFloat(saturation);
mRemote.transact(Stub.TRANSACTION_setSaturation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
      *Set Hue
    */
@Override public void setHue(int display, float degree) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(display);
_data.writeFloat(degree);
mRemote.transact(Stub.TRANSACTION_setHue, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_listInterfaces = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getCurrentInterface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getModelist = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_enableInterface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_switchNextDisplayInterface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getEnableSwitchFB = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_setScreenScale = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_setDisplaySize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_get3DModes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getCur3DMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_set3DMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_saveConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_setBrightness = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_setContrast = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_setSaturation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_setHue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
}
/**
     ** GENERAL
     *//**
     * Returns a list of currently known display interfaces
     */
public java.lang.String[] listInterfaces(int display) throws android.os.RemoteException;
/**
     * Returns the current enabled display interfaces
     */
public java.lang.String getCurrentInterface(int display) throws android.os.RemoteException;
/**
     * Returns a list of supported display modes
     */
public java.lang.String[] getModelist(int display, java.lang.String iface) throws android.os.RemoteException;
/**
     * Returns current display mode
     */
public java.lang.String getMode(int display, java.lang.String iface) throws android.os.RemoteException;
/**
     * Enable selected display interface
     */
public void enableInterface(int display, java.lang.String iface, boolean enable) throws android.os.RemoteException;
/**
     * Set display mode
     */
public void setMode(int display, java.lang.String iface, java.lang.String mode) throws android.os.RemoteException;
/**
     * Switch next display interface
     */
public void switchNextDisplayInterface(int display) throws android.os.RemoteException;
/**
     * Get siwtch framebuffer info
     */
public java.lang.String getEnableSwitchFB() throws android.os.RemoteException;
/**
     * Set display screen scale value
     */
public void setScreenScale(int display, int direction, int value) throws android.os.RemoteException;
/**
     * Switch framebuffer
     */
public void setDisplaySize(int display, int width, int height) throws android.os.RemoteException;
/**
     * Get Supported 3D Modes
     */
public int get3DModes(int display, java.lang.String iface) throws android.os.RemoteException;
/**
     * Get Current 3D Mode
     */
public int getCur3DMode(int display, java.lang.String iface) throws android.os.RemoteException;
/**
     * Set 3D Mode
     */
public void set3DMode(int display, java.lang.String iface, int mode) throws android.os.RemoteException;
/**
     * saveConfig
     */
public int saveConfig() throws android.os.RemoteException;
/**
     * Set brightness
     */
public void setBrightness(int display, int brightness) throws android.os.RemoteException;
/**
     * Set contrast
     */
public void setContrast(int display, float contrast) throws android.os.RemoteException;
/**
     *Set saturation
     */
public void setSaturation(int display, float saturation) throws android.os.RemoteException;
/**
      *Set Hue
    */
public void setHue(int display, float degree) throws android.os.RemoteException;
}
