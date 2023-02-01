import org.w3c.dom.Node;

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

	public static void main(String [] args){
		
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
		ll.addFirst(p6);
		ll.addFirst(p8);
		ll.PrintList();
			
	}
	
	//adds an element to the head of the linked list
	// p is the new node to be added to the linked list.
	public void addFirst(Node p){
		if (head == null){
			head = p;
		}else{
			p.setNext(head);
			head = p;
		}
	}
	
	//adds an element to the end of the linked list
	public void addLast(Node p){
		
	}
	
	//adds an element to a specific index, i, within the linked list
	public void add(Node p, int i){
	
	}
	
	//removes the element at the head of the linked list
	public void removeFirst(){
		
	}
	
	//removes the element at the tail of the linked list
	public void removeLast(){
		
	}
	
	//removes an element at a specific index within the linked list
	public void remove(int i){
		
	}
	
	//removes every element from the linked list
	public void clear(){
		
	}
	
	//returns true if the linked list contains specified Node, returns false if not
	public boolean contains(Node p){
		return false;
	}
	
	//returns the node at specified index.
	public Node get(int i){
		return null;
	}
	
	//returns the index of the specified node
	public int indexOf(Node p){
		return 0;
	}
	
	//prints out the Linked List
	public void PrintList(){
		Node index = head;
		while (index != null){
			System.out.println(index.getName());
			index = index.getNext();
		}
	}
	
}