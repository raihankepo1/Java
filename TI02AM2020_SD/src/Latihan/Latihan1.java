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
public class Latihan1 {
    static void rekursif(int i){
        System.out.println("Cetak Rekursif ke-"+i);
        i+=1;
        rekursif(i);
    }
    public static void main(String[] args) {
        rekursif(0);
    }
}
