import java.util.Scanner;
public class KategoriUsia21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int umur;

        do {
            System.out.print("Masukkan umur: ");
            umur = sc.nextInt();
            if (umur < 0) {
                System.out.println("Input tidak valid.");
            }
        } while (umur < 0);
        
        if (umur <= 12) {
            System.out.println("Kategori anak");
        } else if (umur <= 19) {
            System.out.println("Kategori remaja");
        } else if (umur <= 64) {
            System.out.println("Kategori dewasa");
        } else {
            System.out.println("Kategori lansia");
        }
    }
}