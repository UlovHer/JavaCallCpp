#pragma once
//声明动态库导出函数
extern  "C" _declspec(dllexport) double seekArea(int r, int h);
extern  "C" _declspec(dllexport) int testHello();
//动态库需要使用__declspec(dllexport)导出和 __declspec(dllimport)加载