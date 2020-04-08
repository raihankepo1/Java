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
public class Rekursif_5 {
    public static int recursiveFactorial(int n){
        if (n==0)return 1;
        else return n * (recursiveFactorial(n-1));
    }
    public static void main(String[] args) {
        System.out.println("Hasil :"+recursiveFactorial(4));
    }
}
