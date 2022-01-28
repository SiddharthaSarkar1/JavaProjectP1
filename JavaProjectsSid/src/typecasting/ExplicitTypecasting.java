//Explicit Type Casting (Narrowing)
package typecasting;

public class ExplicitTypecasting {

	public static void main(String[] args) {
		
		//Explicit Type-Casting from double to int
		double dVal = 375.00987;
		int iVal = (int)dVal;
		System.out.println("Converted to double to int : "+iVal);
		
		//Explicit Type-Casting from String to int
		String sVal = "245567";
		int intValue = Integer.parseInt(sVal);
		System.out.println("Converted to String to int : "+intValue);

	}

}
