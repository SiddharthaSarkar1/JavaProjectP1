package typecasting;

public class AccessModifierOne {
	
	public void publicMethod() {
		System.out.println("This is a Public Method.");
	}
	
	private void privateMethod() {
		System.out.println("This is a Private Method.");
	}
	
	protected void protectedMethod() {
		System.out.println("This is a Protected Method.");
	}
	
	void defaultMethod() {
		System.out.println("This is a Default Method.");
	}

	public static void main(String[] args) {
		AccessModifierOne amd = new AccessModifierOne();
		//We can access public, private, protected, default methods within the same class.
		amd.publicMethod();
		amd.privateMethod();
		amd.protectedMethod();
		amd.defaultMethod();

	}

}
