import java.util.Scanner;

public class NilaiKelompok19modif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int JUMLAH_KELOMPOK = 6;
        final int JUMLAH_PENILAI = 5;

        double totalNilai, rataNilai;
        double rataTertinggi = 0;
        int kelompokTertinggi = 0;

        for (int i = 1; i <= JUMLAH_KELOMPOK; i++) {
            totalNilai = 0;
            System.out.println("\nKelompok ke-" + i);

            for (int j = 1; j <= JUMLAH_PENILAI; j++) {
                System.out.print("Masukkan nilai dari penilai ke-" + j + ": ");
                double nilai = input.nextDouble();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / JUMLAH_PENILAI;
            System.out.println("Rata-rata nilai kelompok " + i + " = " + rataNilai);

            // Cek apakah rata-rata ini lebih tinggi dari yang sebelumnya
            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }
        }

        System.out.println("\n=== HASIL AKHIR ===");
        System.out.println("Kelompok dengan rata-rata tertinggi adalah Kelompok ke-" 
                           + kelompokTertinggi + " dengan nilai rata-rata " + rataTertinggi);

        input.close();
    }
}
