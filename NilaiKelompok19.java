import java.util.Scanner;

public class NilaiKelompok19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, nilai;
        float totalnilai, rataNilai;
        
    i = 1;
    while (i <=6) {
        System.out.println("Kelompok " + i);

        totalnilai = 0;
        for ( j = 1; j <= 5; j++) {
            System.out.print(" Nilai dari Kelompok Penilai " + j + ": ");
            nilai = sc.nextInt();
            totalnilai += nilai;
        }
        rataNilai = totalnilai / 5;
        System.out.println("Kelompok " + i + " : nilai rata-rata = " + rataNilai);
        i++;
        System.out.println();
    }
    }
}