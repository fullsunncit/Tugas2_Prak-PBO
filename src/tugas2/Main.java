/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;
import java.util.Scanner;
import tugas2.ruang.Balok;
import tugas2.ruang.Tabung;
/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        boolean pilihan = false;
        int ulang;
        System.out.println("Nama    : Nur Rosydatun Nafiah");
        System.out.println("NIM     : 123200001");
        System.out.println("Kelas   : ");
        do{
            int pilih;
            double panjang, lebar, tinggiBalok, jari, tinggiTabung;
            System.out.println("\n\n=========INPUT========");
            System.out.println("1. BALOK");
            System.out.println("2. TABUNG");
            System.out.println("3. EXIT");
            System.out.print("PILIH : ");
            pilih = input.nextInt();

            if(pilih==1){
                System.out.print("Input Panjang   : "); 
                panjang = input.nextInt();
                System.out.print("Input Lebar     : "); 
                lebar = input.nextInt();
                System.out.print("Input Tinggi    : "); 
                tinggiBalok = input.nextInt();

                Balok balok = new Balok(tinggiBalok,panjang,lebar);

                System.out.println("=========OUTPUT=========");
                System.out.println("Luas Persegi Panjang        : " + balok.luas());
                System.out.println("Keliling Persegi Panjang    : " + balok.keliling());
                System.out.println("Volume Balok                : " + balok.volume());
                System.out.println("Luas Permukaan Balok        : " + balok.luasPermukaan()); 
            }
            else if (pilih == 2){
                System.out.print("Input Jari-jari Tabung : "); 
                jari = input.nextInt();
                System.out.print("Input Tinggi Tabung    : "); 
                tinggiTabung = input.nextInt();

                Tabung tabung = new Tabung(tinggiTabung,jari);

                System.out.println("=========OUTPUT=========");
                System.out.println("Luas Lingkaran         : " + tabung.luas());
                System.out.println("Keliling Lingkaran     : " + tabung.keliling());
                System.out.println("Volume Tabung          : " + tabung.volume());
                System.out.println("Luas Permukaan Tabung  : " + tabung.luasPermukaan());
            }
            else if (pilih == 3){
                pilihan = false;
            }
            else{
                System.out.println("Silahkan Input Ulang!!!");
                pilihan = true;
            }
            System.out.print("Ulangi?? (Ya: 1 || Tidak: 0) = ");
            ulang = input.nextInt();
            if(ulang == 1){
                pilihan =  true;
                System.out.println("\n\n\n");
            }
            else if (ulang == 2){
                pilihan = false;
            }
       }while(pilihan = true);
    }
}
