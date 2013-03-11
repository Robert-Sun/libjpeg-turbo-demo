LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE    := test
LOCAL_SRC_FILES :=  test.c rrimagelib.c
LOCAL_LDLIBS +=  -lm -llog -ljnigraphics -lz

LOCAL_STATIC_LIBRARIES += libjpeg
LOCAL_C_INCLUDES += $(LOCAL_PATH)/libjpeg

include $(BUILD_SHARED_LIBRARY)

include $(LOCAL_PATH)/libjpeg/Android.mk