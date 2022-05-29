package Warung;
import java.util.Scanner;
public class cLinkedList {
    cSimpul head, tail;
    int jNode;
    Scanner s = new Scanner(System.in);
    cLinkedList(){
        head = tail = null;
        jNode = 0;
        System.out.println("Object DLL dibuat...");
    }
    public void addNode(cSimpul baru){
    if(tail == null){
        head = tail = baru;
    } else {
        tail.next = baru;
        baru.prev = tail;
        tail = baru;        
    }
    jNode++;
    System.out.println("Penambahan sukses...");
    }
    
    public cSimpul dequeue(){ // Hanya untuk admin / pemilik
        cSimpul d;
        if(head == null){
            d = null;
            System.out.println("Queue Kosong!");
        } else if (head.next == null){
            d = head;
            head = tail = null;
            System.out.println("Dequeue Sukses...");
            jNode--;
        } else {
            d = head;
            head = head.next;
            d.next = null;
            System.out.println("Dequeue Sukses...");
            jNode--;
        }        
        return d;
    }

    public void delNode(){
        if(tail == null){
            System.out.println("Linked List Kosong!");
        } else if(tail.prev == null){
            head = tail = null;
            System.out.println("Penghapusan sukses...");
        } else {
            cSimpul t = tail.prev;
            tail.prev = null;
            tail = t;
            t.next = null;
            System.out.println("Penghapusan sukses...");
        }        
    }
    public void find(int cari){
        if(tail == null){
            System.out.println("Linked List Kosong!");
        } else {
            boolean ada = false;
            for(cSimpul t = head; t != null; t = t.next){
                if(t.getKodeTransaksi() == cari){
                    ada = true;
                    break;
                }            
            }
            if(ada == true){
                System.out.println("Data " + cari + " ditemukan...");
            } else {
                System.out.println("Data " + cari + " tidak ditemukan...");
            }
        }
    }
    public void print(){
        System.out.println("\nUrutan Pemesanan\n");
        // System.out.println("Isi Double Linked List"); 
        // System.out.print("Mundur: ");
        for (cSimpul t = head; t != null; t=t.next) { 
            System.out.println("Kode Transaksi : " + t.getKodeTransaksi() + " ");
            System.out.println("Nama Pembeli   : " +t.getNamaPembeli() + " ");
            System.out.println("Barang         : " + t.getBarang() + " ");
            System.out.println("Jumlah         : " + t.getJumlahBarang() + " ");
            System.out.println("Status         : " + t.getStatus() + "\n");

        }
        // System.out.print("\nMaju: ");
        // for (cSimpul t = tail; t != null; t=t.prev) { 
        //     System.out.print(t.getKodeTransaksi()+" ");                 
        // }
        System.out.println();
        }
    public void edit(){
        System.out.print("Masukkan Kode Transaksi yang akan diubah : ");
        int cari = s.nextInt();
        if(tail == null){
            System.out.println("Linked List Kosong!");
        } else {
            boolean ada = false;
            for(cSimpul t = head; t != null; t = t.next){
                if(t.getKodeTransaksi() == cari){
                    ada = true;
                    System.out.println("\nKode Transaksi : " + t.getKodeTransaksi() + " ");
                    System.out.println("Nama Pembeli   : " +t.getNamaPembeli() + " ");
                    System.out.println("Barang         : " + t.getBarang() + " ");
                    System.out.println("Jumlah         : " + t.getJumlahBarang() + " ");
                    System.out.println("Status         : " + t.getStatus() + "\n");                    
                    System.out.print("\nMasukkan Status yang baru : ");
                    int status = s.nextInt();                 
                    t.setStatus(status);
                    System.out.println("Edit Sukses...");
                    break;
                }            
            }
            if(ada == true){
                System.out.println("Data " + cari + " ditemukan...");
            } else {
                System.out.println("Data " + cari + " tidak ditemukan...");
            }
        }
    }
                   
    }
    

