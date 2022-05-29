package Warung;
import java.util.Scanner;
public class cSimpul {
    public static Scanner s = new Scanner(System.in);
    int KodeTransaksi = 240400, jumlahBarang, status;
    String NamaPembeli, barang;
    cSimpul next, prev;
    cSimpul(String np, String b, int jb, int s, int kt){
        NamaPembeli = np; barang = b; status = s;
        jumlahBarang = jb; KodeTransaksi = kt;
        next = prev = null;
        System.out.println("Object node "+ np +" dibuat...");
    }
    public void input(){     
        KodeTransaksi++;                
        System.out.print("Nama Pembeli : ");
        // s = new Scanner(System.in);
        NamaPembeli = s.nextLine();
        System.out.print("Barang : ");
        barang = s.next();
        System.out.print("Jumlah Barang : ");
        jumlahBarang = s.nextInt();
        int status = 0;
        next = null;        
    }

    public void view(){
        System.out.println("Kode Transaksi : " + KodeTransaksi);
        System.out.println("Nama Pembeli : " + NamaPembeli);
        System.out.println("Barang : " + barang);
        System.out.println("Jumlah Barang : " + jumlahBarang);        
        System.out.println("Status : " + status);
    }
    
    public String getNamaPembeli(){
        return NamaPembeli;
    }
    public String getBarang(){
        return barang;
    }
    public int getJumlahBarang(){
        return jumlahBarang;
    }
    public int getStatus(){
        return status;
    }
    public int getKodeTransaksi(){
        return KodeTransaksi;
    }
    
    public void setNamaPembeli(String np){
        NamaPembeli = np;
    }
    public void setBarang(String b){
        barang = b;
    }
    public void setJumlahBarang(int jb){
        jumlahBarang = jb;
    }
    public void setStatus(int s){
        status = s;
    }
    public void setKodeTransaksi(int kt){
        KodeTransaksi = kt;
    }


}
