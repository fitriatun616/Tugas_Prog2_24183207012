/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author ASUS
 */
public class MainClass {
     public static void main(String[]args){
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Fitriatun Nisa";
        mhs1.npm = "24183207012";
        mhs1.jurusan = "Pendidikan Teknologi Informasi";
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama = "Ludfi Yuwanda";
        mhs2.npm = "24183207017";
        mhs2.jurusan = "Pendidikan Teknologi Informasi";
        
        System.out.println("=== Data Mahasiswa 1 ===");
        mhs1.tampilkanData();
        System.out.println(" ");
        System.out.println("=== Data Mahasiswa 2 ===");
        mhs2.tampilkanData();
    }
}
