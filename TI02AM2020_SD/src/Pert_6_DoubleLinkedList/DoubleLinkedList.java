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
public class DoubleLinkedList {
    Node_6 first;
    Node_6 last;

    //kontruktor
    //set nilai awal adalah null
    public DoubleLinkedList() {
        first = null;
        last = null;
    }

    //mengecek apakah linked list kosong atau tidak
    public boolean isEmpty(){
        return (first==null);
    }

    //method untuk menginsert data dari pertama
    public void insertFirst(int data){
        Node_6 node = new Node_6(data);
        if(isEmpty()){
            last = node;
        }else{
            first.prev = node;
        }

        node.next = first;
        first = node;
    }

    //method untuk menginsert data dari terakhir
    public void insertLast(int data){
        Node_6 node = new Node_6(data);
        if( isEmpty() )
            first = node;
        else{
            last.next = node;
            node.prev = last;
        }
        last = node;
    }

    //method untuk menginsert data pertama
    public Node_6 deleteFirst(){
        Node_6 temp = first;
        if(first.next == null)
            last = null;
        else
            first.next.prev = null;
        first = first.next;
        return temp;
    }

    //method untuk menghapus data terakhir
    public Node_6 deleteLast(){
        Node_6 temp = last;
        if(first.next == null)
            first = null;
        else
            last.prev.next = null;
        last = last.prev;
        return temp;
    }

    //method untuk menginsert data di tengah
    public boolean insertAfter(int key, int data){
        Node_6 current = first;
        while(current.data != key){
            current = current.next;
            if(current == null)
            return false;
        }
        Node_6 node = new Node_6(data);

        if(current==last){
            node.next = null;
            last = node;
        }else{
            node.next = current.next;
         
            current.next.prev = node;
        }
        node.prev = current;
        current.next = node;
        return true;
    }

    //method untuk menghapus data yang dipilih
    public Node_6 deleteKey(int key){
        Node_6 current = first;
        while(current.data != key){
            current = current.next;
        if(current == null)
            return null;
        }
        if(current==first)
            first = current.next;
        else
            current.prev.next = current.next;
        if(current==last)
            last = current.prev;
        else
            current.next.prev = current.prev;
            return current;
    }

    //menampilkan data dari pertama - terakhir
    public void displayForward(){
        System.out.print("List (first-->last): ");
        Node_6 current = first;

        while(current != null){
            current.tampil();
            current = current.next;
        }
        System.out.println("");
    }

    //menampilkan data dari terakhir - pertama
    public void displayBackward(){
        System.out.print("List (last-->first): ");
        Node_6 current = last;
        while(current != null){
            current.tampil();
            current = current.prev;
        }
        System.out.println("");
    }
}