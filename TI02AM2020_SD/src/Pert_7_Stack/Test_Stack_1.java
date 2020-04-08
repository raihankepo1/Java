/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pert_7_Stack;

import java.util.Scanner;

/**
 *
 * @author mumta
 */
public class Test_Stack_1 {

    public static void main(String[] args) {
        int pilihan;
        int data;
        Stack_1 result = new Stack_1();

//looping until false condition
        do {
//Displaying Menu
            System.out.println("1. PUSH Item");
            System.out.println("2. POP Item");
            System.out.println("3. Lihat Isi Data");
            System.out.println("0. Keluar");

            Scanner input = new Scanner(System.in);
            System.out.println("Masukkan Pilihan :");
            pilihan = input.nextInt();

//condition for choice
            if (pilihan == 1) {
                System.out.println("Data yang ditambahkan : ");
                data = input.nextInt();
                result.push(data);
            } else if (pilihan == 2) {
                result.pop();
            } else if (pilihan == 3) {
                result.Display();
            } else if (pilihan == 0) {
                System.exit(0);
            } else {
                System.out.println("Pilihan Tidak Ada!!");
            }//end of condition

        } while (pilihan != 0);//end looping

    }
}
