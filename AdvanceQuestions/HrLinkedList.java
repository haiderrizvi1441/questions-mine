package interviewquestions.AdvanceQuestions;

public class HrLinkedList {
	// LINKED LIST STRUCTURE
	
	// reference to the head (first) node in the list 
	private Node head;
	
	// Node class represents the indivisual elements in the list
	private static class Node{
		int data;
		Node next; // reference to next node in list

		public Node(int data){
			this.data = data;
			this.next = null;
		}

	}

	// Adding Functionality Method
	public void add(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return;
		}
		Node last = head;
		while(last.next != null){
			last = last.next;
			
		}
		last.next = newNode;
	}


	// Printing the contets of the list
	public void printLlist(){
		Node current = head;
		while(current != null){
			System.out.println(current.data + " ");
			current = current.next;
		}
	}
	public static void fn1iterative(){

	}
	public static void main(String[] args){
		System.out.println("This is working");
    
}
}

