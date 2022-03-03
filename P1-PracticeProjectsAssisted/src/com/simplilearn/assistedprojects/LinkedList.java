package com.simplilearn.assistedprojects;

public class LinkedList {
	Node head;
	public class Node{
		String data;
	    Node next;
	    
	    Node(String data)
	    {
	    	this.data=data;
	    	this.next=next;
	    }
	}
	
	//add first
public void addFirst(String data) {
	Node newNode = new Node(data);
	if(head == null) {
		head=newNode;
	}
	newNode.next=head;
	head=newNode;
}
	
//add last
public void addLast(String data) {
	Node newNode = new Node(data);
	if(head == null) {
		head=newNode;
		return;
	}
	Node currNode = head;
	while(currNode!=null)
	{
		currNode=currNode.next;
	}
	currNode.next = newNode;
	}

//printing the list
public void printList()
{
	if(head==null)
	{
		System.out.println("list is empty");
	}
	Node currNode=head;
		
	while(currNode !=null) {
		System.out.print(currNode.data + " -> ");
	currNode = currNode.next;	
	}
	System.out.println("NULL");
}
	public static void main(String args[])
	{
		LinkedList list=new LinkedList();
		list.addFirst("my");
		list.addFirst("Linked List");
		list.printList();
	}
}
