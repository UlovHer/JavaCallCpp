package TestJNI;

import java.nio.file.FileSystems;

public class CallJNIFunc {
//	一般在类的静态（static）代码块中加载动态库最合适，因为在创建类的实例时，类会被 ClassLoader 先加载到虚拟机，
//	随后立马调用类的 static 静态代码块。这时再去调用 native 方法就万无一失了。加载动态库的两种方式：
//	System.loadLibrary("HelloWorld");  
//	System.load("/Users/yangxin/Desktop/libHelloWorld.jnilib"); 
//	Can't load IA 32-bit .dll on a AMD 64-bit platform解决
//	64位JVM不能调用32位动态库
	static {
//		获取当前系统分隔符路径
		String separator = FileSystems.getDefault().getSeparator();
		String path = System.getProperty("user.dir");
		System.out.println(separator);
		if (separator == "\\") {
			path += "\\CLibs\\InvokeJNIFunc.dll";
		}
		else {
			path += "/CLibs/InvokeJNIFunc.dll";
		}
		System.out.println(path);
		System.load(path);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String path = System.getProperty("java.library.path");
		

		JNICallCpp jniCallCpp = new JNICallCpp();
		jniCallCpp.HellCpp();
		jniCallCpp.HannoTower(5, 'A', 'B', 'C');

	}

}
