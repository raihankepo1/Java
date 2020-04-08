/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pert_7_Stack;

/**
 *
 * @author mumta
 */
public class Stack_Buku {

    private String[] stack;
    private int max;
    private int top;

    /*Kode diatas merupakan bagian dari pendeklarasian array dan
    variabel. Array akan digunakan sebagai stack, 
   variabel max sebagai batas kapasitas array dan 
    variabel top sebagai pointer data yang paling akhir.
     */
    public Stack_Buku(int size) {
        max = size;
        stack = new String[max];
        top = -1;
    }

    /*
    Kode diatas merupakan sebuah konstruktor yang digunakan untuk 
    menginisialisasi variabel dan menjadi metode yang pertama 
    dijalankan ketika dilakukan instance object. 
    Pemberian nilai -1 pada variabel top adalah indikator bahwa 
    array masih kosong. Seperti yang diketahui bahwa array mulai 
    menyimpan data pertama pada indeks ke-nol.
     */
    public void push(String value) {
        stack[++top] = value;

    }

    /*
    Kode diatas menjelaskan mengenai proses memasukkan data ke dalam
    array dengan indeks increment dari nilai variabel top. 
    Apabila sebelumnya nilai dari top adalah -1, 
    maka (-1) + 1 = 0. Data pertama akan disimpan pada indeks ke-0 
    dan seterusnya.
     */
    public String pop() {
        return stack[top--];
    }

    /*
    Kode diatas digunakan mengeluarkan data dari urutan paling 
    akhir dan melakukan decrement nilai dari variabel top. 
    Nilai data yang dikeluarkan juga di-return dalam metode pop.
     */
    public String peek() {
        return stack[top];
    }

    /*
    kode diatas untuk mengembalikan data yang berada pada 
    indeks yang sama dengan nilai variabel top, 
    dalam artian data yang paling belakang. 
    Program akan error apabila array masih kosong 
    karena dilakukan pengecekan terhadap indeks -1. 
    Script diatas boleh dilengkapi dengan memberikan
    exception.
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /*
    Kode diatas untuk mengecek apakah array kosong atau tidak. 
    Mengembalikan nilai benar atau salah dari hasil pengujian 
    top dengan nilai -1. Jika sama, maka nilainya true.
     */
    public boolean isFull() {
        return top == max - 1;
    }

    /*
    Kode diatas untuk menguji apakah array kosong atau tidak.
    Jika pengujian benar, maka mengembalikan nilai true 
    dan menyatakan bahwa array telah penuh.
     */
    //method Display
    public void Display() {
        System.out.println("Isi Stack Adalah : ");

//printing list item
        for (int i = 0; i < top + 1; i++) {
            System.out.print(i + 1 + "." + stack[i] + " ");
        }

        System.out.println("\n");
    }//end of Display

    public static void main(String[] args) {
        Stack_Buku s = new Stack_Buku(5);

        // push data
        s.push("FISIKA");
        s.push("KIMIA");
        s.push("MATEMATIKA");
        s.Display();
        s.peek(); // MATEMATIKA
        System.out.println("isi peek: "+s.peek());
        s.push("B. INDONESIA");
        s.push("BIOLOGI");
        s.isEmpty(); // false
        s.isFull(); // true
        s.pop(); // remove BIOLOGI
        s.isFull(); // false
    }
}
