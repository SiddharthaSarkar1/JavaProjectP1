package accessModDemo;

import typecasting.AccessModifierOne;

public class AccessModChild extends AccessModifierOne {

	public static void main(String[] args) {
		AccessModChild accd = new AccessModChild();
		
			//We can access public, protected method from sub-class outside the package.
			accd.publicMethod();
			accd.protectedMethod();
			
			//accd.privateMethod();
			//accd.defaultMethod();

	}

}
