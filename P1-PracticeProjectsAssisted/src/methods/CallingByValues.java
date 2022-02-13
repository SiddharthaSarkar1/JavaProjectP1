//Call By Value
package methods;

public class CallingByValues {
	
	int a = 100;
	
	public int operation(int a) {
		a = a+100;
		return a;
	}
	
	public static void main(String[] args) {
		CallingByValues obj = new CallingByValues();
		System.out.println("Before calling the function value of a--->"+obj.a);
		obj.operation(100);
		System.out.println("Before calling the function value of a--->"+obj.a);
	}
}
