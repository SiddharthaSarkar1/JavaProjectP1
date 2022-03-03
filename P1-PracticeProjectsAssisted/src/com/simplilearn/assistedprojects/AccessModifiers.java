package com.simplilearn.assistedprojects;

public class AccessModifiers {
	protected void display()
	{
		System.out.println("you are accessing private method");
	}

	private void test()
	{
		System.out.println("my private method");
	}
	
	public void hello()
	{
		System.out.println("public method");
	}
	void world()
	{
		System.out.println("default method");
	}
	public static void main(String args[])
	{
	AccessModifiers obj=new AccessModifiers();
	{
	obj.display();
	obj.test();
	obj.hello();
	obj.world();
	}
}
}
