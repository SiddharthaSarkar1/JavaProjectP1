//Implicit Type Casting (Widening)
package typecasting;

public class ImplicitTypecasting {

	public static void main(String[] args) {
		
		byte byteVal = 25;
		System.out.println("byte data-type : "+byteVal);
		
		short shortVal = byteVal;
		System.out.println("converted byte to short : "+shortVal);
		
		int intVal = shortVal;
		System.out.println("converted short to int : "+intVal);
		
		float floatVal = intVal;
		System.out.println("converted int to float : "+floatVal);
		
		double doubleVal = intVal;
		System.out.println("converted float to double : "+doubleVal);
	}

}
