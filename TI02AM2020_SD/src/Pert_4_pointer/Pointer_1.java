/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pert_4_pointer;

/**
 *
 * @author mumta
 */
public class Pointer_1 {
    class Node {
    public int value;
    public Node next;
};
 
void alokasi(){
// Mengalokasikan pointer
    Node x;
    Node y;
    Node px;
    
 
    // Mendeklarasikan objek baru
    x = new Node();
    y = new Node();
    px = new Node();
    
 
    // Memasukkan nilai ke dalam objek
    x.value = 87;
    x.next=x;
    px.next = x;
    
    
    
    System.out.println("----------Hasil----------");
    System.out.println("Alamat x : "+x.next);
    System.out.println("isi px : "+px.next);
    System.out.println("isi x : "+x.value);
    
    
    
    
    
}
    public static void main(String[] args) {
        Pointer_1 pointer = new Pointer_1();
        pointer.alokasi();
    }
}
