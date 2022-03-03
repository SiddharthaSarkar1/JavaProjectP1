package com.simplilearn.assistedprojects;
import java.util.*;

public class NewQueue {
	public static void main(String[] args) 
	{
	        		Queue<String> locationsQueue = new java.util.LinkedList<String>();
	                locationsQueue.add("Kolkata");
	        		locationsQueue.add("Howrah");
	        		locationsQueue.add("Nadia");
	        		locationsQueue.add("Durgapur");
	        		locationsQueue.add("Uluberia");	
	                System.out.println("Queue is : " + locationsQueue);
	        		System.out.println("Head of Queue : " + locationsQueue.peek());
	        		locationsQueue.remove();
	        		System.out.println("After removing Head of Queue : " + locationsQueue);
	        		System.out.println("Size of Queue : " + locationsQueue.size());
	    	}
}
