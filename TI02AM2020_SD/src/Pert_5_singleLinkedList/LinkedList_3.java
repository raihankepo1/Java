/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pert_5_singleLinkedList;

/**
 *
 * @author mumta
 */
import java.util.LinkedList;

public class LinkedList_3 {
        
    public static void main(String[] args) {
        
    LinkedList<String> linkedList= new LinkedList<>();

    linkedList.add("Data 1");
    linkedList.add("Data 2");
    linkedList.add("Data 3");
    linkedList.add("Data 4");
    linkedList.add("Data 5");

    System.out.println("output :"+linkedList+", Ukuran :" +linkedList.size());
    
    linkedList.addFirst("data 0");   
    linkedList.addLast("data 6");

    System.out.println("output :"+linkedList+", Ukuran :" +linkedList.size());
        
    linkedList.set(0,"data 11");
    linkedList.set(6,"data 12");

    System.out.println("output :"+linkedList+", Ukuran :" +linkedList.size());
    
    linkedList.removeFirst();
    linkedList.removeLast();
    
    System.out.println("output :"+linkedList+", Ukuran :" +linkedList.size());
    
    linkedList.remove(3);
            
    System.out.println("output :"+linkedList+", Ukuran :" +linkedList.size());

    }
    
}
