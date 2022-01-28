package typecasting;

public class AccessModF {
	public static void main(String[] args) {
		AccessModifierOne camd = new AccessModifierOne();
		camd.publicMethod();
		//camd.privateMethod();//We cannot access private method out of the class.
		camd.protectedMethod();
		camd.defaultMethod();
	}

}
