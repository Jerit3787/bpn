/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semakanBPN;
import java.util.Scanner;
/**
 *
 * @author Danish Hakim
 */
public class SistemSemakanBantuanPrihatinRakyat {
    public static void main(String[] args) {
       
        //load Scanner first
        Scanner input = new Scanner(System.in);
        int bantuan;
        String kategoriPendapatan, sebabBantuan = null, pernahBSH = null, ya = "Ya", tidak, statusPermohonan;
        tidak = "Tidak";
       
        //Ucapan kepada pengguna
        System.out.println("**Selamat datang ke sistem semakan Bantuan Prihatin Nasional (BPN)**");
       
        //Input pertama (Nama)
        System.out.println("Sila masukkan nama anda :");
        String nama = input.nextLine();  //terima nama pada line seterusnya
       
        //Input kedua (Nombor Kad Pengenalan)
        System.out.println("Sila masukkan no. kad pengenalan anda (tanpa sempang '-') :");
        String noKadPengenalan = input.nextLine(); //terima kad pengenalan pada nombor seterusnya
       
        //Input ketiga (Status Perkahwinan)
        System.out.println("Sila nyatakan status perkahwinan anda (Bujang/Sudah Berkahwin) :");
        String statusPerkahwinan = input.nextLine(); //terima status pada line seterusnya
        String bujang = "Bujang"; //untuk if
        String sudahBerkahwin = "Sudah Berkahwin"; //untuk if
       
        //Input keempat (Pendapatan)
        System.out.println("Sila nyatakan pendapatan anda (tanpa RM) :");
        int pendapatan = input.nextInt(); //terima kad pengenalan pada nombor seterusnya
       
        //Input kelima (Penerima BSH & Daftar LHDNM)
        if (pendapatan <= 2000) {
            System.out.println("yes.2000");
            System.out.println("Adakah anda berdaftar dengan Lembaga Hasil Dalam Negara (LHDNM) (Ya/Tidak) :");
            pernahBSH = input.nextLine();
        }
        else if (pendapatan <= 4000) {
            System.out.println("Adakah anda merupakan penerima Bantuan Sara Hidup (BSH) (Ya/Tidak) :");
            pernahBSH = input.nextLine();
            System.out.println("yes.4000");
        }
            
        //Sistem Kelayakan
       
        //Perundingan Pertama (Kategori Pendapatan)

        if (pendapatan <= 3000) {
            kategoriPendapatan = "Golongan Below 40 (B40)";
        }
        else if (pendapatan >= 2001 && pendapatan <= 6275) {
            kategoriPendapatan = "Golongan Middle 40 (M40)";
        }
        else {
            kategoriPendapatan = "Golongan Top 20 (T20)";
        }
        
        //Perundingan Kedua (Status Perkahwinan & Jumlah Bantuan)
        if (statusPerkahwinan.equals(bujang)) {
            if (pendapatan <= 1) {
                bantuan = 0;
                sebabBantuan = "Belum bekerja/Tidak bekerja";
            }
            
            else if (pendapatan <= 2000) {
                bantuan = 800;
                sebabBantuan = "Pendapatan dalam lingkungan syarat";
            }
            else if (pendapatan >= 2001 && pendapatan <= 4000) {
                bantuan = 500;
                sebabBantuan = "Pendapatan dalam lingkungan syarat";
            }
            else {
                bantuan = 0;
                sebabBantuan = "Pendapatan dalam lingkungan syarat";
            }
        }
        else if (statusPerkahwinan.equals(sudahBerkahwin)) {
            if (pendapatan <= 4000) {
                bantuan = 1600;
                sebabBantuan = "Pendapatan dalam lingkungan syarat";
            }
            else if (pendapatan >= 4001 && pendapatan <= 8000) {
                bantuan = 1000;
                sebabBantuan = "Pendapatan dalam lingkungan syarat";
            }
            else {
                bantuan = 0;
            }
        }
        else {
        System.out.println("no.failed");
            bantuan = 0;
            sebabBantuan = "Gagal disemak! Sila semak amount gaji dan status perkahwinan. Masukkan nilai mengikut sistem.";
        }

        //Perundingan Ketiga (Penerima BSH & Pembayar Cukai LHDNM)
        if (pernahBSH.equals(ya)) {
            statusPermohonan = "TIDAK PERLU MEMOHON PERMOHONAN BAHARU";
        }
        else {
            statusPermohonan = "PERLU MEMOHON PERMOHONAN BAHARU";
        }
        
        //Sistem Pemberitahuan
        System.out.println("========  Sistem Semakan Bantuan Prihatin Nasional ========");
        System.out.println("Nama : " + nama);
        System.out.println("No. Kad Pengenalan : " + noKadPengenalan);
        System.out.println("Status Perkahwinan : " + statusPerkahwinan);
        System.out.println("Pendapatan : RM" + pendapatan);
        System.out.println("Kategori Pendapatan : "+ kategoriPendapatan);
        if (bantuan == 0) {
            System.out.println("Status Bantuan : Maaf anda tidak layak menerima bantuan!");
            System.out.println("Sebab ditolak : " + sebabBantuan);
            System.out.println("Jumlah bantuan : RM0");
        }
        else {
            System.out.println("Status Bantuan : Tahniah anda layak menerima Bantuan Prihatin Nasional (BPN)");
            System.out.println("Sebab diterima : " + sebabBantuan);
            System.out.println("Jumlah bantuan : RM" + bantuan);
        }
        System.out.println("Tindakan Penerima : "+ statusPermohonan);
    }
}
