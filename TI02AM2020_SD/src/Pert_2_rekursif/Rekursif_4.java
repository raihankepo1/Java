/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pert_2_rekursif;

/**
 *
 * @author mumta
 */
public class Rekursif_4 {

    // variable global
    static int index = 0;
    static String str = "";

    public static void main(String[] args) {
        cetakFibonacci(20);
    }

    static void cetakFibonacci(int batas) {
        int temp1 = 0;
        int temp2 = 1;
        if (index < batas) {
            if (index == 0) {
                System.out.print(temp1 + " ");
                str += temp1 + ";";
            } else if (index == 1) {
                System.out.print(temp2 + " ");
                str += temp2 + ";";
            } else {
                String[] arr = str.split(";");
                temp1 = Integer.parseInt(arr[arr.length - 1]);
                temp2 = Integer.parseInt(arr[arr.length - 2]);
                System.out.print((temp1 + temp2) + " ");
                str += (temp1 + temp2) + ";";
            }
            index++;
            cetakFibonacci(batas);
        }
    }
}
