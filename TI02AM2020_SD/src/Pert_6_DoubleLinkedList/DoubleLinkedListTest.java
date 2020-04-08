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
public class DoubleLinkedListTest {

    public static void main(String[] args) {
        DoubleLinkedList theList = new DoubleLinkedList();
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertLast(11);
        theList.insertLast(33);
        theList.insertLast(55);
        theList.displayForward();
        theList.displayBackward();
        theList.deleteFirst();
        theList.deleteLast();
        theList.deleteKey(11);
        theList.displayForward();
        theList.insertAfter(22, 77);
        theList.insertAfter(33, 88);
        theList.displayForward();
    }
}
