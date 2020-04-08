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
public class Node_6 {
    int data;
    Node_6 next;
    Node_6 prev;

    public Node_6(int data){
        this.data = data;
    }

    public void tampil(){
        System.out.print("{"+data+"}");
    }
}
