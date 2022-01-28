//Arithmetic Calculator
package arithmeticCalculator;
import java.util.Scanner;

	class CalcOperation{
		int result = 0;
		public int add(int a, int b) {
			result = a+b;
			return result;
		}
		public int sub(int a, int b) {
			result = a-b;
			return result;
		}
		public int mul(int a, int b) {
			result = a*b;
			return result;
		}
		public int div(int a, int b) {
			result = a/b;
			return result;
		}
	}


	public class ArithmeticCalculator {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			CalcOperation obj = new CalcOperation();
			System.out.println("Enter the First number : ");
			int num1 = sc.nextInt();
			System.out.println("Enter the Second number : ");
			int num2 = sc.nextInt();
			System.out.println("Enter the Operator : ");
			System.out.println("For addition enter (+)");
			System.out.println("For subtraction enter (-)");
			System.out.println("For multiplication enter (*)");
			System.out.println("For division enter (/)");

			char opr = sc.next().charAt(0);
			sc.close();
			int res = 0;
			//On the basis of operator performing switch-case.
			switch(opr) {
			case '+' : 
				res = obj.add(num1, num2);
				System.out.println("Addition of "+num1+" and "+num2+" is : "+res);
				break;
			case '-' : 
				res = obj.sub(num1, num2);
				System.out.println("Subtraction of "+num1+" and "+num2+" is : "+res);
				break;
			case '*' : 
				res = obj.mul(num1, num2);
				System.out.println("Multiplication of "+num1+" and "+num2+" is : "+res);
				break;
			case '/' : 
				if(num2 != 0) {
					res = obj.div(num1, num2);
					System.out.println("Division of "+num1+" and "+num2+" is : "+res);
				}else {
					System.out.println("Sorry denominator cannot be zero.");	
				}
				break;
			default :
				System.out.println("Ooops! you might have entered improper input.");
			}
		}

	}
