#include "TestJNI_JNICallCpp.h"
#include<string>
#include<iostream>
//using namespace std;

#ifdef __cplusplus
extern "C" {
#endif

	JNIEXPORT void JNICALL Java_TestJNI_JNICallCpp_HannoTower
	(JNIEnv *jni_env, jobject jobj, jint layer, jchar from, jchar inter, jchar to) {
		if (layer == 1) {
			//��Java�������Ĳ���jcharΪunsigned int 16,����char���ͣ���Ҫǿת
			std::cout << "Disk 1 from " << char(from) << " to " << char(to) << std::endl;
		}
		else {
			Java_TestJNI_JNICallCpp_HannoTower(jni_env, jobj, layer - 1, from, to, inter);
			std::cout << "Disk " << layer << " from " << char(from) << " to " << char(to) << std::endl;
			Java_TestJNI_JNICallCpp_HannoTower(jni_env, jobj, layer - 1, inter, from, to);
		}
	}

	JNIEXPORT void JNICALL Java_TestJNI_JNICallCpp_HellCpp
	(JNIEnv *, jobject) {
		std::cout << "Call Invoke JNI Func Success" << std::endl;
	}

#ifdef __cplusplus
}
#endif