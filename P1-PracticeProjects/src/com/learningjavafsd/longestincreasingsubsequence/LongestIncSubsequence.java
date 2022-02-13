//Longest Increasing Subsequence.
package com.learningjavafsd.longestincreasingsubsequence;

public class LongestIncSubsequence {
	
	public static int longestIncSub(int arr[], int arr_len) {
		int outer_Max = 0;
		
		int newArr[] = new int[arr_len];
		
		for(int i=0;i<arr_len;i++) {
			int max = 0;
			for(int j=0;j<i;j++) {
				if(arr[j] < arr[i]) {
					if(newArr[j] > max) {
						max = newArr[j];
					}
				}
			}
			newArr[i] = max + 1;
			
			if(outer_Max < newArr[i]) {
				outer_Max = newArr[i];
			}
		}
		return outer_Max;
	}

	public static void main(String[] args)
    {
        int a[] = { 7, 19, 10, 35, 20, 53, 44, 59, 93, 3 };
        int n = a.length;
        int result = longestIncSub(a, n);
        System.out.println("The Length of longest increasing subsequence is : " + result);
    }

	
}
