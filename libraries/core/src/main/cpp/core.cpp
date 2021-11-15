#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_alistar_android_starter_libraries_core_NativeLib_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}