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

public class LinkedList_2 {

    Node_1 first ;

    public LinkedList_2(){
        first = null;
    }

    public boolean isEmpty(){
        return (first==null);
    }

    public void addFirst(int data){
        Node_1 node = new Node_1(data);
        node.next = first;
        first = node;
    }

    // Menambah data dari simpul terakhir
    public void addLast(int data){
        Node_1 node, help;
        node = new Node_1(data);
        node.next = null;

        if(isEmpty()){
            first = node;
            first.next = null;
        }else{
            help = first;
            while(help.next!=null){
                help=help.next;
            }
            help.next=node;
        }
    }

    // menghapus data dari simpul pertama
    public Node_1 deleteFirst(){
        if(!isEmpty()){
            Node_1 temp = first;
            first = first.next;
            return temp;
        }else{
            return null;
        }
    }

    // menghapus data dari simpul terakhir
    public Node_1 deleteLast(){
        if(!isEmpty()){
            Node_1 temp, current;
            current=first;
            while(current.next.next != null){
                current=current.next;
            }
            temp=current.next;
            current.next=null;
            return temp;
        }else{
            Node_1 temp = first;
            first = null;
            return temp;
        }
    }

    // menampilkan isi linked list
    public void tampilkan(){
        Node_1 current = first;
        if(current == null){
            System.out.println("Kosong!");
        }else{
            while(current != null){
                current.tampil();
                current = current.next;
            }
            System.out.println();
        }
    }
}