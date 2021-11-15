package TestJNA;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface CLibrary extends Library {
	String dllName = "/Clibs/CompileDLL.dll";
	@SuppressWarnings("deprecation")
	// 加载动态链接库
	// 直接写动态库名称，动态库需要到为source或者代码添加动态库路径为source
	// CLibrary instance = (CLibrary) Native.loadLibrary(dllName, CLibrary.class);

	CLibrary instance = (CLibrary) Native.loadLibrary(dllName, CLibrary.class);

	// 链接动态库中的方法
	double seekArea(int a, int b);
}
