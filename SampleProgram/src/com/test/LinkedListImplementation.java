package com.test;

public class LinkedListImplementation {

	Node head;
	
	static class Node {

		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public static void main(String[] args) {

		LinkedListImplementation linkedList = new LinkedListImplementation();
		
		linkedList.head = new Node(2);
		Node first = new Node(3);
		Node second = new Node(7);
		
		linkedList.head.next = first;
		first.next = second;
	
		
		printLinkedList(linkedList);
		
		
		
	}

	private static void printLinkedList(LinkedListImplementation linkedList) {

		Node current = linkedList.head;
		while(current != null) {
			
			System.out.print(current.data +"------->");
			current = current.next;
		}
		
		System.out.println("null");
	}

}
