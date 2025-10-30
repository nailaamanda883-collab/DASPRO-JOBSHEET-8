import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, item, jml_cabang, jml_pelanggan;
        int total_item_cabang = 0, total_semua_pelanggan = 0, total_semua_item = 0;
        System.out.print("Masukkan jumlah cabang: ");
        jml_cabang = sc.nextInt();

        for (i = 1; i <= jml_cabang; i++) {
            System.out.println("\n===== Cabang ke-" + i + " =====");
            System.out.print("Masukkan jumlah pelanggan hari ini: ");
            jml_pelanggan = sc.nextInt();
            total_semua_pelanggan += jml_pelanggan;

            total_item_cabang = 0;

            for (j = 1; j <= jml_pelanggan; j++) {
                System.out.print("Jumlah item yang dipesan oleh pelanggan ke-" + j + ": ");
                item = sc.nextInt();
                total_item_cabang += item;
            }
            total_semua_item += total_item_cabang;

            System.out.println(">> Total item di cabang ke-" + i + ": " + total_item_cabang);
            System.out.println(">> Total pelanggan di cabang ke-" + i + ": " + jml_pelanggan);
        }
        System.out.println("\n===== RINGKASAN PENJUALAN =====");
        System.out.println("Total seluruh pelanggan: " + total_semua_pelanggan);
        System.out.println("Total seluruh item terjual: " + total_semua_item);
    }
}