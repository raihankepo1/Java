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
class Stack_1 {

    private boolean empty, full;
    private int pos;//menujukkan tempat kosong
    private int max_data = 100;
    private int item[] = new int[max_data];

    public Stack_1() {
        full = false;
        empty = true;
        pos = 0;
    }//end of constructor

//method isFull
    public boolean isFull() {
        return (full);
    }//end of isFull method

//method isEmpty
    public boolean isEmpty() {
        return (empty);
    }//end of isEmptyl method

//method push
    public void push(int data) {
        if (!isFull()) {
            item[pos++] = data;
            empty = false;
            if (pos == max_data) {
                full = true;
            }
            System.out.println("Data sudah ditambahkan");
        } else {
            System.out.println("Stack sudah penuh");
        }
        return;
    }//end of push method

//method pop
    public int pop() {
        int x = 0;
        if (!isEmpty()) {
            x = item[--pos];
            full = false;

            System.out.println("Data yang di POP adalah :" + item[pos]);
            System.out.println("");
            item[pos] = 0;

            if (pos == 0) {
                empty = true;
            } else {
                System.out.println("Stack Kosong!");
            }
        } else {
            System.out.println("Stack Masih Kosong!\n");
        }
        return (x);
    }//end of pop method

//method Display
    public void Display() {
        System.out.println("Isi Stack Adalah : ");

//printing list item
        for (int i = 0; i < pos; i++) {
            System.out.print(item[i] + " ");
        }

        System.out.println("\n");
    }//end of Display

}
