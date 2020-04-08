/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pert_3_array;

/**
 *
 * @author mumta
 */
public class DataArrayApp{
    public static void main(String[] args) {
        int maxSize = 100;
        DataArray arr;
        arr = new DataArray(maxSize);
        arr.insert(16650200, "Jundi", "Malang");
        arr.insert(16650210, "Ahmad", "Sidoarjo");
        arr.insert(16650220, "Ismail", "Banyuwangi");
        arr.insert(16650230, "Sofi", "Semarang");
        arr.insert(16650240, "Dinda", "Bandung");
        arr.insert(16650250, "Rais", "Ambon");
        arr.insert(16650260, "Helmi", "Madura");
        arr.insert(16650270, "Agung", "Madiun");
        arr.insert(16650280, "Arina", "Malang");
        arr.displayArray();
        System.out.println("============================");
        long searchKey=16650310;
//        Mahasiswa mhs = arr.find(searchKey);
//        if(mhs != null){
//            System.out.println("\nketemu");
//            mhs.displayMhs();
//        }else{
//            System.out.println("ga ketemu "+ searchKey);
//        }
        System.out.println("+++++++++++++++++++++++++++++");
        searchKey = 16650240;
        System.out.println("\nHapus nim: "+searchKey);
        arr.delete(searchKey);
        System.out.println("-------------------------------");
        arr.displayArray();
    }
}
