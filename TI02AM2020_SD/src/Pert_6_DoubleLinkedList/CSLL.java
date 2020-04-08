/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pert_6_DoubleLinkedList;

/**
 *
 * @author mumta
 */
import javax.swing.*;

public class CSLL {

    public static void main(String[] args) {

        classop_1 Operasi = new classop_1();

        JOptionPane.showMessageDialog(null, "              MODUL 1 \nCIRCULAR SINGLE LINKEDLIST\n       ", "SELAMAT DATANG", JOptionPane.INFORMATION_MESSAGE);

        System.out.println("             MODUL 1  CIRCULAR SINGLE LINKEDLIST ");

        System.out.println("             <<<<<<<=========================================>>>>>>>\n");

        int jawab1 = 0, jawab3 = 0;

        do {

            String operasi = JOptionPane.showInputDialog("Operasi yang dapat Anda pilih :\n1.Tambah\n2. Hapus\n3. Cetak");

            int op = Integer.parseInt(operasi);   //konversi string-int

            switch (op) {

                case 1: {

                    do {

                        String tambah = JOptionPane.showInputDialog("Menambahkan Node :");

                        System.out.print("\nMenambahkan Node (" + tambah + ")");

                        Operasi.Tambah(tambah);

                        String jawab = JOptionPane.showInputDialog("Tekan '1' jika ingin menambahkan lagi");

                        jawab1 = Integer.parseInt(jawab);

                    } while (jawab1 == 1);

                }

                break;

                case 2: {

                    String hapus = JOptionPane.showInputDialog("Menghapus Node :");

                    System.out.print("\nMenghapus Node (" + hapus + ")");

                    Operasi.Hapus(hapus);

                }

                break;

                case 3: {

                    System.out.println();

                    Operasi.Cetak();

                }

                break;

                default:

                    JOptionPane.showMessageDialog(null, "Maaf, operasi yang Anda pilih tidak ada", "LAPORAN", JOptionPane.ERROR_MESSAGE);

            }

            String jawab2 = JOptionPane.showInputDialog("Tekan '1' jika ingin memilih operasi yang lain");

            jawab3 = Integer.parseInt(jawab2);

        } while (jawab3 == 1);

        JOptionPane.showMessageDialog(null, "TERIMA KASIH ATAS KUNJUNGAN ANDA", "SAMPAI JUMPA", JOptionPane.INFORMATION_MESSAGE);

    }

}

//============================================================================//
class classnd_1 {

    public String input;

    public classnd_1 next;

}

//============================================================================//
class classop_1 {

    private classnd_1 head, tail;

    public void classop_1() {

        head = null;

        tail = null;

    }

    public void Tambah(String tambah) {

        classnd_1 node = new classnd_1();

        node.input = tambah;

        if (head == null) {

            head = tail = node;   //blm ada isi

        } else {

            tail.next = node;   //tail next menunjuk ke node

            tail = tail.next;   //tail menunjuk ke tail next(node)

            tail.next = head;   //tail next menunjuk head

        }

    }

    public void Hapus(String hapus) {

        classnd_1 hapus1 = head, hapus2 = head;

        while (hapus1 != null) {

            if (hapus.equals(hapus1.input)) //cek kesamaan 2 string
            {

                if (hapus1 == head) {

                    head = hapus1.next;

                    hapus1 = null;

                    tail.next = head;

                    return;     //kembali ke fungsi

                } else {
                    if (hapus1 == tail) {

                        hapus1.next = head.next;

                        hapus1 = null;

                        tail = hapus2;

                        tail.next = head;

                        return;

                    } else {

                        hapus2.next = hapus1.next;

                        hapus1 = null;

                        return;

                    }

                }

            } else {

                hapus2 = hapus1;

                hapus1 = hapus1.next;

            }

        }

        if (hapus1 == null) {
            JOptionPane.showMessageDialog(null, "Maaf, data yang akan Anda hapus tidak ditemukan", "LAPORAN", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void Cetak() {

        classnd_1 cetak = head;     //cetak mulai dari head

        System.out.println("Mencetak LinkList:");

        for (int i = 0; i < 20; i++) {

            System.out.print(cetak.input + "->");

            cetak = cetak.next; //cetak selanjutnya

        }

//System.out.print("null");
        System.out.println();

    }

}
