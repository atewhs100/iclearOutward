package com.test.interview;

//13. How do you reverse a linked list in Java?

public class ReverseLinkedList {

	Node head;

	static class Node {
		Node next;
		int data;

		public Node(int i) {
			this.data = i;
			this.next = null;
		}
	}

	public static void main(String[] args) {

		ReverseLinkedList myLinkedList = new ReverseLinkedList();
		myLinkedList.head = new Node(1);

		myLinkedList.head.next = new Node(2);
		myLinkedList.head.next.next = new Node(3);

		printLinkedList(myLinkedList);

		// Reverse LinkedList

		reverseLinkedList(myLinkedList);

		printLinkedList(myLinkedList);

	}

	private static void printLinkedList(ReverseLinkedList myLinkedList) {
		Node h = myLinkedList.head;
		while (myLinkedList.head != null) {

			System.out.println(myLinkedList.head.data);
			myLinkedList.head = myLinkedList.head.next;

		}

		myLinkedList.head = h;
	}

	public static void reverseLinkedList(ReverseLinkedList myLinkedList) {
		Node previous = null;
		Node current = myLinkedList.head;
		Node next;
		while (current != null) {

			previous = current;
			current.next = previous;
		//	next = current.next;

		}

		
		/*
		 * while (current != null) { next = current.next; current.next = previous;
		 * previous = current; current = next; }
		 */
		System.out.println(previous.data);

	}

}

/*
 * 
 * next = current.next; current.next = previous; previous = current; current =
 * next;
 */
