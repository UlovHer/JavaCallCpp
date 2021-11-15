//∂ØÃ¨ø‚±‡“Î
#include <iostream>
#include "compileDLL.h"
using namespace std;
void show() {
	cout << "Call the library function" << endl;
	cout << "***************************" << endl;
}
double area(int r) {
	return 3.14*r*r;
}

double seekArea(int r, int h) {
	show();
	double under = 3.14*r*r;
	double v = under*h;
	return v;
}

int testHello() {
	cout << "***************************" << endl;
	cout << "Call the library function test" << endl;
	cout << "***************************" << endl;
	return 1;
}