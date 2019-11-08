/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA      : Sandy Akbar
 * KELAS     : PBO-ULANG
 * NIM       : 10114504
 * Deskripsi : Program untuk menghitung gaji karyawan dan manager
 */
public class PBOULANG10114504Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Karyawan ky = new Karyawan();
        Manager mg = new Manager();
        Scanner scn = new Scanner(System.in);
        
        System.out.println("=====Program Perhitungan Gaji Karyawan=====");
        System.out.print("Masukkan NIK : ");
        String nik = scn.next();
        System.out.print("Masukkan Nama : ");
        String nama = scn.next();
        System.out.print("Masukkan Golongan (1/2/3) : ");
        int golongan = scn.nextInt();
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        String jabatan = scn.next();
        System.out.print("Masukkan Jumlah Kehadiran : ");
        int hadir = scn.nextInt();
        
        mg.setNik(nik);
        mg.setNama(nama);
        mg.setJabatan(jabatan);
        mg.setGolongan(golongan);
        mg.setKehadiran(hadir);
        
        System.out.println();
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("NIK : " + mg.getNik());
        System.out.println("NAMA : " + mg.getNama());
        System.out.println("GOLONGAN : " + mg.getGolongan());
        System.out.println("JABATAN : " + mg.getJabatan());
        
        System.out.println();
        System.out.println("TUNJANGAN GOLONGAN : " + mg.tunjanganGolongan(golongan));
        System.out.println("TUNJANGAN JABATAN : " + mg.tunjanganJabatan(jabatan));
        System.out.println("TUNJANGAN KEHADIRAN : " + mg.tunjanganKehadiran(hadir));
        
        System.out.println();
        System.out.println("Gaji Total : " + mg.gajiTotal());
    
    }
    
}
