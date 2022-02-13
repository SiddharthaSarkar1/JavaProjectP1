package constructors;

public class ConstructDemo {

		int roll_number;
		String name;
		
		//No-argument constructor or Default constructor
		ConstructDemo(){
			System.out.println("This is a default constructor or no-argument constructor.");
		}
		
		//parameterized constructors (passing one parameter)
		ConstructDemo(int no){
			roll_number = no;
			System.out.println("roll_number -> "+roll_number);
		}
		//parameterized constructors (passing two parameter)
		ConstructDemo(int no, String name){
			roll_number = no;
			this.name = name;
			System.out.println("roll_number -> "+roll_number+" and name ->"+name);
		}
		
		public static void main(String[] args) {
			
			ConstructDemo obj = new ConstructDemo();// No argument constructor will invoke
			
			ConstructDemo obj1 = new ConstructDemo(34);// parameterized constructor will invoke
			
			ConstructDemo obj2 = new ConstructDemo(5, "Pintu Ray");// parameterized constructor will invoke
			
		}
	}

