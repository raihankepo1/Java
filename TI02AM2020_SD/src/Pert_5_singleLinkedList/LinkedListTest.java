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
public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList_2 link = new LinkedList_2();
        link.addFirst(1);
        link.addFirst(2);
        link.addLast(3);
        link.addLast(4);
        link.tampilkan();
        link.deleteLast();
        link.tampilkan();
        link.deleteFirst();
        link.tampilkan();

    }
}
