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
class node {

    int data;
    node prev = null;
    node next = null;

    node(int data) {
        this.data = data;
    }
}

public class Jurnal {

    node head = null;
    node tail = null;

    void addfront(int b) {
        node baru = new node(b);
        if (head == null) {
            head = baru;
            tail = baru;
        } else {
            baru.next = head;
            head.prev = head;
            head = baru;
        }
    }

    void addback(int b) {
        node baru = new node(b);
        if (head == null) {
            head = baru;
            tail = baru;
        } else {
            baru.prev = tail;
            tail.next = baru;
            tail = baru;
        }
    }

    void dellfront() {
        if (head == null) {
            System.out.println("List Kosong");
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    void dellback() {
        if (head == null) {
            System.out.println("List Kosong");
        } else {
            tail = tail.prev;;
            tail.next = null;
        }
    }

    void tampil() {
        node tmp = head;
        if (head == null) {
            System.out.println("List Kosong");
        } else {
            while (tmp != null) {
                System.out.print(tmp.data + " ");
                tmp = tmp.next;
            }
        }
        System.out.println();
    }

    void del(int b) {
        node tmp = head;
        node after = tmp.next;
        if (tmp.next != null) {
            while (tmp.next.data != b) {
                tmp = tmp.next;
                after = after.next;
            }
            tmp.next = after.next;
            after = null;
        }
    }

    void urut() {
        node tmp;
        int t;
        for (int i = 0; i < 7; i++) {
            tmp = head;
            while (tmp.next != null) {
                if (tmp.data > tmp.next.data) {
                    t = tmp.data;
                    tmp.data = tmp.next.data;
                    tmp.next.data = t;
                }
                tmp = tmp.next;
            }
        }
    }

    void addafter(int b, int a) {
        node tmp = head;
        node baru = new node(b);
        while (tmp.data != a) {
            tmp = tmp.next;
        }
        node bantu = tmp.next;
        tmp.next = baru;
        baru.next = bantu;
        baru.prev = tmp;
        bantu.prev = baru;
    }

    void dellall() {
        head = null;
        System.out.println("kosong");
    }

    public static void main(String[] args) {
        Jurnal x = new Jurnal();
        System.out.println("Orang-orang uji nyali");
        x.addback(2);
        x.addback(6);
        x.addback(13);
        x.addback(19);
        x.addback(46);
        x.addback(35);
        x.addback(83);
        x.tampil();
        System.out.println("sisa Orang-orang uji nyali");
        x.dellfront();
        x.dellfront();
        x.dellfront();
        x.tampil();
        System.out.println("sisa Orang-orang uji nyali");
        x.del(46);
        x.tampil();
        System.out.println("sisa Orang-orang uji nyali");
        x.addback(100);
        x.tampil();
        System.out.println("sisa Orang-orang uji nyali");
        x.addafter(13, 35);
        x.tampil();
        System.out.println("sisa Orang-orang uji nyali");
        x.addfront(2);
        x.tampil();
        System.out.println("sisa Orang-orang uji nyali");
        x.addafter(6, 13);
        x.tampil();
        x.dellback();
        x.addback(46);
        System.out.println("sisa Orang-orang uji nyali");
        x.tampil();
        x.dellall();
        x.addback(46);
        x.addback(6);
        x.addback(2);
        x.addback(83);
        x.addback(35);
        x.addback(19);
        x.addback(13);
        System.out.println("sisa Orang-orang uji nyali");
        x.tampil();
        System.out.println("sisa Orang-orang uji nyali");
        x.urut();
        x.tampil();
    }
}
