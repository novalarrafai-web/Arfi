import java.util.Scanner;

public class TugasJava1 {
    public static void main(String[] args) {
        int totalBelanja, hargaBarang, jumlahBarang;
        String lanjut;
        lanjut = "y";
        totalBelanja = 0;
        jumlahBarang = 0;
        while (lanjut.equalsIgnoreCase("y")) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan harga barang: ");
            hargaBarang = input.nextInt();
            System.out.print("Masukkan jumlah barang: ");
            jumlahBarang = input.nextInt();
            totalBelanja += hargaBarang * jumlahBarang;
            System.out.print("Apakah ingin menambahkan barang lagi? (y/n): ");
            lanjut = input.next();
        }
        System.out.println("Total Belanja: " + totalBelanja);
    }
}
