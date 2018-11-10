
/*******************
  Name: Benny A. Fields III

  Date: 22 March 2018

  Notes: This program uses the recursion
     	 to recall a list and also to reverse
     	 the list. 
*******************/

// Java program for reversing the linked list
 
class MyLinkedList {
 
   static Node head;
 
   static class Node {
 
       int data;
        Node next;
 
        Node(int d) {
            data = d;
            next =null;
        }
    }
 
   /* Function to reverse the linked list */
    Node reverse(Node node) {
    	Node prev = null;
    	Node current = node;
    	Node next = null;
    	while (current != null) {
    		next = current.next;
    		current.next = prev;
    		prev = current;
    		current = next;
    	}
                
        node = prev;
        return node;
    }
 
   // prints content of double linked list
    void printList(Node node) {
       while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
   // assigns the calues to the lists 
   public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);
        list.head.next.next.next.next = new Node(50);
        list.head.next.next.next.next.next = new Node(60);
        list.head.next.next.next.next.next.next = new Node(70);
        list.head.next.next.next.next.next.next.next = new Node(80);
        list.head.next.next.next.next.next.next.next.next = new Node(90);
        list.head.next.next.next.next.next.next.next.next.next= new Node(100);
        
        // prints out the list to start followed by the list in reverse order
        System.out.println("My linked list to start:");
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Now, my linked list reversed:");
		list.printList(head);
    }   
}