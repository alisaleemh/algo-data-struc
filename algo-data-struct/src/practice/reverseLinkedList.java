package practice;


class reverseLinkedList { 
	static Node head; 

	static class Node { 

		int data; 
		Node next; 

		Node(int d) { 
			data = d; 
			next = null; 
		} 
	} 

	/* Function to reverse the linked list */
	Node reverse(Node head) { 
        Node current, plusOne;
        current = head.next;
        plusOne = current.next;
        
        head.next = null;
        current.next=head;
        
        while (plusOne != null)
        {
            plusOne.next = current;
            current = plusOne;
            plusOne = current.next;
        }
        
        return current;
	} 

	// prints content of double linked list 
	void printList(Node node) { 
		while (node != null) { 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
	} 

	public static void main(String[] args) { 
		reverseLinkedList list = new reverseLinkedList(); 
		list.head = new Node(1); 
		list.head.next = new Node(2); 
		list.head.next.next = new Node(3); 
		list.head.next.next.next = new Node(4); 

		System.out.println("Given Linked list"); 
		list.printList(head); 
		head = list.reverse(head); 
		System.out.println(""); 
		System.out.println("Reversed linked list "); 
		list.printList(head); 
	} 
} 
