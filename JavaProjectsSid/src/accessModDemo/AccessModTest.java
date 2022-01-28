package accessModDemo;

import typecasting.AccessModifierOne;

public class AccessModTest {

	public static void main(String[] args) {
		AccessModifierOne accd = new AccessModifierOne();
		
		accd.publicMethod();//We can only access public method from a class outside the package.
		
		//accd.privateMethod();
		//accd.protectedMethod();
		//accd.defaultMethod();

	}

}
