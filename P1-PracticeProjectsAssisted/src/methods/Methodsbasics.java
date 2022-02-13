package methods;

public class Methodsbasics {
	public void print()
    {
        System.out.println("Method without return type and without Para");
    }
    
    //method returning nothing with 1 Parameter
    public void display(String name)
    {
        System.out.println("My Name is "+name);
    }
    
    //method with return type and parameters
    public int cube(int n)
    {
        return n*n*n;
    }
    
    //method return string and with 2 Parameters
    public String fullName(String fname,String lname)
    {
        return fname+" "+lname;
    }

	public static void main(String[] args) {
		
		Methodsbasics obj1 = new Methodsbasics();
		obj1.display("Sankar");
		obj1.print();
		
		int cubeRes = obj1.cube(5);
		System.out.println("Result : "+cubeRes);
		
		String flRes = obj1.fullName("Sabitri", "Manna");
		System.out.println("Full name is : "+flRes);

	}
}
