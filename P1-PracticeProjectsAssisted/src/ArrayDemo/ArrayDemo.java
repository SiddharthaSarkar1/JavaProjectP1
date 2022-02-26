package ArrayDemo;

public class ArrayDemo {
	
		public static void main(String[] args) {
		//Single-dimensional array
		int arr[]= {10,20,30,40,50};
		for(int i=0;i<5;i++) {
		System.out.println("Elements of array arr: "+arr[i]);
		}


		//Multidimensional array
		int[][] a = {
		            {2, 4, 6, 8}, 
		            {3, 6, 9} };
		      
		      System.out.println("\nLength of row 1: " + a[0].length);
		}
	
}
