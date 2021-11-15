package TestJNI;

public class JNICallCpp {
	// 声明为native，表明是有外部来实现的
	public native void HannoTower(int topN, char from, char inter, char to);
	public native void HellCpp();

}
