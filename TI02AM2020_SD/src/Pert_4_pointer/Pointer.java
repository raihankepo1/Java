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
public class Pointer {
    class Node {
    public int value;
    public Node next;
};
 
void alokasi(){
// Mengalokasikan pointer
    Node x;
    Node y;
    Node z;
 
    // Mendeklarasikan objek baru
    x = new Node();
    y = new Node();
    z = new Node();
 
    // Memasukkan nilai ke dalam objek
    x.value = 1;
    y.value = 2;
    z.value = 3;
    System.out.println("----------VALUE----------");
    System.out.println("x-value :"+x.value);
    System.out.println("y-value :"+y.value);
    System.out.println("z-value :"+z.value);
    // Mengalamatkan pointer ke objek tersebut
    x.next = y;
    y.next = z;
    z.next = x;
    System.out.println("----------NEXT----------");
    System.out.println("x-next :"+ x.next);
    System.out.println("y-next :"+y.next);
    System.out.println("z-next :"+z.next);
}
    public static void main(String[] args) {
        Pointer pointer = new Pointer();
        pointer.alokasi();
        
    }
}

