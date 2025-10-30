import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, kuadrat, jml_kuadrat = 0;
        String tampilan = "";

        for ( n = 1; n <=5; n++) {
            for ( i = 1; i <= n; i++) {
                kuadrat = i * i;
                jml_kuadrat += kuadrat;
                tampilan += kuadrat;
                if (i != n) {
                    tampilan += " + ";
                }
            }
            System.out.println("n = " + n + " --> jumlah kuadrat = " + tampilan + " = " + jml_kuadrat);
        }
    }
}