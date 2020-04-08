/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pert_5_singleLinkedList;

/**
 *
 * @author mumta
 */
class Node {
   String nama;
   Node next;
}

public class LinkedList_1 {

    public static void main(String[] args) {
        Node current = null;
        Node first = new Node();   //Create Node first
        Node second = new Node();  //Create Node second
        Node third = new Node();   //Create node third
/*
 * Isi node dengan data kemudian tautkan ke node berikutnya
 *
 */
        first.nama = "data ke-1";
        first.next = second;
        second.nama = "data ke-2";
        second.next = third;
        third.nama = "data ke-3";
        third.next = null;
        current = first; //Set pointer to node first
        while(current != null) {
	    System.out.print(current.nama + " --->> ");
            current = current.next;
	};
        
    }

}
