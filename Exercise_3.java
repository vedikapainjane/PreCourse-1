// Exercise_3 : Implement Singly Linked List.
// Time Complexity : O(n)
// Space Complexity : O(n) where n is the number of items in the stack.
import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
class LinkedList { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            //Write your code here 
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null){
            list.head = new_node;
        }
        else{
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head;
            // Below causes O(n) time complexity.
            while(last.next != null){
                last = last.next;
            }
            // Insert the new_node at last node
            last.next = new_node;

        }
 
        // Return the list by head 
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node current_node = list.head;
        System.out.print("Printing LinkedList: \n"); 
        // Traverse through the LinkedList 
        while(current_node != null){
            // Print the data at current node 
            System.out.println(current_node.data + " ");
            // Go to next node 
            current_node = current_node.next;
        }  
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}