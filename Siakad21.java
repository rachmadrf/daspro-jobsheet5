import java.util.Scanner;

public class Siakad21 {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        String nama, kelas, nim, nilaiHuruf, kualifikasi;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        //memasukkan nama, nim, kelas, dan absen
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        //memasukkan nilaiKuis, nilaiTugas, dan nilaiUjian
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();

        //menghitung nilaiAkhir
        nilaiAkhir = ((nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUTS * 0.30) + (nilaiUAS * 0.35));

        //nilaiAkhir huruf
        if (nilaiAkhir > 80 && nilaiAkhir <= 100 ) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else if (nilaiAkhir <= 39) {
            nilaiHuruf = "E";
        } else {
            nilaiHuruf = "null";
        }

        //kualifikasi
        if (nilaiAkhir > 80 && nilaiAkhir <= 100 ) {
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            kualifikasi = "Kurang";
        } else if (nilaiAkhir <= 39) {
            kualifikasi = "Gagal";
        } else {
            kualifikasi = "null";
        }

        //menampilkan data mahasiswa 
        System.out.println("Nama: " + nama + " (NIM: " + nim + ")");
        System.out.println("Kelas: " + kelas + ", No. Absen: " + absen);
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualirifkasi: " + kualifikasi);
    }
}