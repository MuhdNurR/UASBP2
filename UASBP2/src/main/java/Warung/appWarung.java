package Warung;
import java.util.Scanner;
public class appWarung {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        cSimpul simpul = null;
        cLinkedList DLL = new cLinkedList();
        int pilih = 0, pilih1 = 0, KodeTransaksi = 240400;
        do{
        System.out.println("\nPROGRAM WARUNG");
        System.out.println("1. Pembeli");
        System.out.println("2. Member");
        System.out.println("3. Admin");
        System.out.println("4. Pemilik");
        System.out.println("5. Exit");
        System.out.print("Pilih : ");
        pilih = s.nextInt();
        switch(pilih){
            case 1:
            do {
                System.out.println("\nPembeli");
                System.out.println("1. Tambah Pesanan");
                System.out.println("2. Hapus Pesanan");
                System.out.println("3. Lihat Pesanan");
                System.out.println("4. Selesai");
                System.out.print("Pilih : ");
                pilih1 = s.nextInt();
                switch(pilih1){
                    case 1:
                        System.out.println("\nTambah Pesanan");                        
                        System.out.print("Masukkan Nama Pembeli : ");
                        s = new Scanner(System.in);
                        String nama = s.nextLine();
                        System.out.print("Masukkan Barang : ");
                        String barang = s.next();
                        System.out.print("Masukkan Jumlah Barang : ");
                        int jumlah = s.nextInt();
                        int status = 0;
                        KodeTransaksi++;
                        simpul = new cSimpul(nama, barang, jumlah, status, KodeTransaksi);                        
                        DLL.addNode(simpul);                        
                        break;
                    case 2:
                        System.out.println("Hapus Pesanan");
                        System.out.print("Masukkan Kode Transaksi : ");
                        KodeTransaksi = s.nextInt();
                        DLL.find(KodeTransaksi);
                        break;
                    case 3:
                        System.out.println("Lihat Pesanan");
                        DLL.print();
                        break;
                    case 4:
                        System.out.println("Terima Kasih");
                        break;
                }         
            } while(pilih1 != 4); 
            break;

            case 2:
                System.out.println("Member");                
                System.out.println("1. Tambah Pesanan");
                System.out.println("2. Hapus Pesanan");
                System.out.println("3. Lihat Pesanan");
                System.out.println("4. Ubah Password");
                System.out.println("5. Selesai");                
                break;
            case 3:
            do{
                System.out.println("Admin");
                System.out.println("1. Lihat Pesanan");
                System.out.println("2. Ubah Status Pesanan");
                System.out.println("3. Selesai");
                System.out.print("Pilih : ");
                pilih1 = s.nextInt();
                switch(pilih1){
                    case 1:
                        System.out.println("Lihat Pesanan");
                        DLL.print();
                        break;
                    case 2:
                        System.out.println("Ubah Status Pesanan");
                        DLL.edit();
                        break;
                    case 3:
                        System.out.println("Terima Kasih");
                        break;
                }
            } while(pilih1 != 3);
                

                
                break;
            case 4:
                System.out.println("Pemilik");
                break;
            case 5:
                System.out.println("Terima Kasih...");
                break;
            default:
                System.out.println("Pilihan tidak ada");
        }
        
    } while(pilih != 5);
        } 
        
}
