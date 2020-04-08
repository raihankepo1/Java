/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pert_6_DoubleLinkedList;

/**
 *
 * @author mumta
 */

class Multilevel_LinkedList { 
      
    static Node_4 head; 
      
    class Node_4 { 
          
        int data; 
        Node_4 next, child; 
          
        Node_4(int d) { 
            data = d; 
            next = child = null; 
        } 
    } 
  
    // A utility function to create a linked list with n nodes. The data 
    // of nodes is taken from arr[].  All child pointers are set as NULL 
    Node_4 createList(int arr[], int n) { 
        Node_4 node = null; 
        Node_4 p = null; 
          
        int i; 
        for (i = 0; i < n; ++i) { 
            if (node == null) { 
                node = p = new Node_4(arr[i]); 
            } else { 
                p.next = new Node_4(arr[i]); 
                p = p.next; 
            } 
            p.next = p.child = null; 
        } 
        return node; 
    } 
  
    // A utility function to print all nodes of a linked list 
    void printList(Node_4 node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
        System.out.println(""); 
    } 
      
    Node_4 createList() { 
        int arr1[] = new int[]{10, 5, 12, 7, 11}; 
        int arr2[] = new int[]{4, 20, 13}; 
        int arr3[] = new int[]{17, 6}; 
        int arr4[] = new int[]{9, 8}; 
        int arr5[] = new int[]{19, 15}; 
        int arr6[] = new int[]{2}; 
        int arr7[] = new int[]{16}; 
        int arr8[] = new int[]{3}; 
  
        /* create 8 linked lists */
        Node_4 head1 = createList(arr1, arr1.length); 
        Node_4 head2 = createList(arr2, arr2.length); 
        Node_4 head3 = createList(arr3, arr3.length); 
        Node_4 head4 = createList(arr4, arr4.length); 
        Node_4 head5 = createList(arr5, arr5.length); 
        Node_4 head6 = createList(arr6, arr6.length); 
        Node_4 head7 = createList(arr7, arr7.length); 
        Node_4 head8 = createList(arr8, arr8.length); 
  
        /* modify child pointers to create the list shown above */
        head1.child = head2; 
        head1.next.next.next.child = head3; 
        head3.child = head4; 
        head4.child = head5; 
        head2.next.child = head6; 
        head2.next.next.child = head7; 
        head7.child = head8; 
  
        /* Return head pointer of first linked list.  Note that all nodes are 
         reachable from head1 */
        return head1; 
    } 
  
    /* The main function that flattens a multilevel linked list */
    void flattenList(Node_4 node) { 
          
        /*Base case*/
        if (node == null) { 
            return; 
        } 
          
        Node_4 tmp = null; 
  
        /* Find tail node of first level linked list */
        Node_4 tail = node; 
        while (tail.next != null) { 
            tail = tail.next; 
        } 
  
        // One by one traverse through all nodes of first level 
        // linked list till we reach the tail node 
        Node_4 cur = node; 
        while (cur != tail) { 
  
            // If current node has a child 
            if (cur.child != null) { 
  
                // then append the child at the end of current list 
                tail.next = cur.child; 
  
                // and update the tail to new last node 
                tmp = cur.child; 
                while (tmp.next != null) { 
                    tmp = tmp.next; 
                } 
                tail = tmp; 
            } 
  
            // Change current node 
            cur = cur.next; 
        } 
    } 
      
    public static void main(String[] args) { 
        Multilevel_LinkedList list = new Multilevel_LinkedList(); 
        head = list.createList(); 
        list.flattenList(head); 
        list.printList(head); 
    } 
} 

