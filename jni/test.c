#include <time.h>
#include "rrimagelib.h"
#include "com_sun_jpeg_turbo_demo_Util.h"

JNIEXPORT void JNICALL Java_com_sun_jpeg_turbo_demo_Util_read
(JNIEnv *env, jclass object) {
	long start = clock();

	rrimage *data = read_jpeg("/sdcard/1.jpg");
	if (!data) {
		LOGD("read failed...");
	} else {
		LOGD("width = %d; height = %d;", data->width, data->height);
	}
	long end = clock();
	LOGD("time is %ld", (end - start));
}
