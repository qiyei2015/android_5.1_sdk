/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**************************************************************************
* 
* File name   : lights.h
* Description : for firefly-rk3288
* Author      : qiyei2015(1273482124@qq.com) in chengdu
*
* Version       Date       Author         modefy
* 1.0           16-1-30    qiyei2015      create
*
**************************************************************************/

#ifndef ANDROID_LIGHTS_H
#define ANDROID_LIGHTS_H

/*/sys/class/leds/ in firefly-rk3288 /*/
char const*const RED_LED_FILE 			= "/sys/class/leds/red/brightness";
char const*const GREEN_LED_FILE 		= "/sys/class/leds/user_yellow/brightness";
char const*const BLUE_LED_FILE 			= "/sys/class/leds/power_blue/brightness";
char const*const RED_LED_FILE_TRIGGER	= "/sys/class/leds/red/trigger";
char const*const GREEN_LED_FILE_TRIGGER	= "/sys/class/leds/user_yellow/trigger";
char const*const BLUE_LED_FILE_TRIGGER	= "/sys/class/leds/power_blue/trigger";
char const*const RED_LED_FILE_DELAYON	= "/sys/class/leds/red/delay_on";
char const*const GREEN_LED_FILE_DELAYON	= "/sys/class/leds/user_yellow/delay_on";
char const*const BLUE_LED_FILE_DELAYON	= "/sys/class/leds/power_blue/delay_on";
char const*const RED_LED_FILE_DELAYOFF	= "/sys/class/leds/red/delay_off";
char const*const GREEN_LED_FILE_DELAYOFF	= "/sys/class/leds/user_yellow/delay_off";
char const*const BLUE_LED_FILE_DELAYOFF	= "/sys/class/leds/power_blue/delay_off";


char const*const LCD_BACKLIGHT_FILE	= "/sys/class/backlight/rk28_bl/brightness";

//char const*const ALS_FILE	= "/sys/class/leds/lcd-backlight/als/enable";


#endif //ANDROID_LIGHTS_H
