package TestJNA;

public class JNACallCpp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double res = CLibrary.instance.seekArea(2, 2);
		System.out.println("the area is:" + res);
	}

}
