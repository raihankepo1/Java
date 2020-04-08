/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author mumta
 */
public class Latihan2 {
    static void cetakAngka(int angka) {
         if (angka <= 10) {
             System.out.print(angka + " ");
             angka+=1;
             cetakAngka(angka);
         }
     }
    public static void main(String[] args) {
        cetakAngka(0);
    }
}
