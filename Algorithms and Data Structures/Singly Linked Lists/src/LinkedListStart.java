/*
Ariel Webster
Created: 9/18/18
Edited: 9/9/22
For in class example and class lab, class 201
Fill in the methods below to create a functioning singly linked list
You should not change the provided method signatures, unless directed to by myself or the TAs

*/

public class LinkedListStart {

	public Node head = null;

	public static void main(String[] args) {

//nodes to be added to the linkedlist
// (if you don't see your name on this list you aren't enrolled in the class and you should talk to me about that)
		Node p1 = new Node("Chandler");
		Node p2 = new Node("Jacob");
		Node p3 = new Node("Kelly");
		Node p4 = new Node("Ben");
		Node p5 = new Node("Thomas");
		Node p6 = new Node("Kester");
		Node p8 = new Node("Hailey");
		Node p9 = new Node("Nathan");
		Node p10 = new Node("Kayla");
		Node p11 = new Node("Jill");
		Node p12 = new Node("Zachary");
		Node p13 = new Node("Sophia");
		Node p14 = new Node("Liam");
		Node p15 = new Node("Daniel");
		Node p16 = new Node("Alex");
		Node p17 = new Node("James");
		Node p18 = new Node("Robert");
		Node p19 = new Node("Anthony");
		Node p20 = new Node("Gavin");

		LinkedListStart ll = new LinkedListStart();
		ll.addFirst(p8); // Haily
		ll.addLast(p19); // Anthony
		ll.add(p9, 1); // Nathan
		ll.add(p5, 2); // Thomas
		ll.add(p17, 4); // James
		ll.remove(5);
		System.out.println(ll.indexOf(p5));
		System.out.println(ll.get(4).getName());
		System.out.println(ll.contains(p13));
		ll.PrintList();

	}

//adds an element to the head of the linked list
// p is the new node to be added to the linked list.
	public void addFirst(Node p) {
		
		// If head is null...
		if (head == null) {
			// head is p;
			head = p;
			// else...
		} else {
			// set the next value of p to head
			p.setNext(head);
			head = p;
		}
	}

//adds an element to the end of the linked list
	public void addLast(Node p) {
		// If head is null...
		if (head == null) {
			// Head is p
			head = p;
		}
		// Node is head
		Node node = head;
		// While node.getNext() is null...
		while (node.getNext() != null) {
			// The new.getNext() is node
			node = node.getNext();
		}

		// Set node to p
		node.setNext(p);
	}

//adds an element to a specific index, i, within the linked list
	public void add(Node p, int i) {
		// If head is null...
		if (head == null) {
			// return
			return;
		}
		// If i is 0...
		if (i == 0) {
			// Add a new node that's p
			addFirst(p);
			return;
		}

		// Node is head
		Node node = head;

		// Iterates through the list
		for (int n = 0; n < i - 1; n++) {
			// If node.getNext() is null...
			if (node.getNext() == null) {
				// returns
				return;
			}
			// Go onto the next node
			node = node.getNext();
		}

		// If node.getNext() is null...
		if (node.getNext() == null) {
			// set the next node to p
			node.setNext(p);
			return;
		}

		// The new node is the next one
		Node nextNode = node.getNext();
		// Set the next node to p
		node.setNext(p);
		// Set the next node to the next node
		p.setNext(nextNode);
	}

//removes the element at the head of the linked list
	public void removeFirst() {
		// Head is head.getNext()
		head = head.getNext();
	}

//removes the element at the tail of the linked list
	public void removeLast() {
		// If head is null...
		if (head == null) {
			// return
			return;
		}

		// Lead node
		Node lead = head;
		// If the lead node.getNext() is null...
		if (lead.getNext() == null) {
			// Removes the First node
			removeFirst();
		}

		// Lead is lead.getNext()
		lead = lead.getNext();
		// New follow lead
		Node follow = head;

		// While lead.getNext() is null...
		while (lead.getNext() != null) {
			// Lead is the next
			// Follow is the next
			lead = lead.getNext();
			follow = follow.getNext();
		}

		// Set follow to null...
		follow.setNext(null);
	}

//removes an element at a specific index within the linked list
	public void remove(int i) {
		// If head is null...
		if (head == null) {
			// return
			return;
		}
		// if i is 0...
		if (i == 0) {
			// Removes the first node
			removeFirst();
			return;
		}

		// New node at head
		Node node = head;

		// Iterates through the linkedList
		for (int n = 0; n < i - 1; n++) {
			// If node.getNext() is null...
			if (node.getNext() == null) {
				return;
			}

			// Node is node.getNext()
			node = node.getNext();
		}

		// If node.getNext() is null...
		if (node.getNext() == null) {
			// Set the next value to null
			node.setNext(null);
			return;
		}

		// New nextNode
		Node nextNode = node.getNext();
		// New nextNextNode
		Node nextNextNode = nextNode.getNext();

		// Set the node to the nextNextNode
		node.setNext(nextNextNode);

	}

//removes every element from the linked list
	public void clear() {
		// Cuts off everything from the head
		head = null;

	}

//returns true if the linked list contains specified Node, returns false if not
	public boolean contains(Node p) {
		System.out.println("This is the method contains()");
		// New node called index as head
		Node index = head;

		// If head is null...
		if (head == null) {
			// Return false
			return false;
		}
		// While the index is not null...
		while (index != null) {
			// If the index is the same as the Node p
			if (index == p) {
				// Return true
				return true;

			}

			// The index is now index.getNext()
			index = index.getNext();
		}

		// Return false
		return false;
	}

//returns the node at specified index.
	public Node get(int i) {
		System.out.println("This is the method get()");
		// If the head is null...
		if (head == null) {
			// Return null
			return null;
		}
		// If i is at 0
		if (i == 0) {
			// It's at the head
			return head;
		}

		// Node is starting at the head
		Node node = head;
		// Iterates through
		for (int n = 0; n < i - 1; n++) {
			// If the next node is null
			if (node.getNext() == null) {
				// return null
				return null;
			}
			// Node is now the next node
			node = node.getNext();
		}
		// Return the next Node
		return node.getNext();
	}

//returns the index of the specified node
	public int indexOf(Node p) {
		System.out.println("This is the method indexOf()");
		// Node index starts at the head
		Node index = head;
		
		// If the head is null...
		if (head == null) {
			// Return -1
			return -1;
		}
		// Iterates through the LinkedList
		for (int i = 0; index != null; i++) {
			// If index is the same as p
			if (index == p) {
				// Return the value of i
				return i;

			}
			// Keep iterating by making index the next node
			index = index.getNext();
		}
		// Return -1
		return -1;
	}

//prints out the Linked List
	public void PrintList() {
		System.out.println("This is the method PrintList()");
		Node index = head;
		while (index != null) {
			System.out.println(index.getName());
			index = index.getNext();
		}
	}

//

}
