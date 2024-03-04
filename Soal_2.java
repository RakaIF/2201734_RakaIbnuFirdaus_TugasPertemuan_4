package pbo;
import java.util.Scanner;

public class Soal_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan batas awal (>= 1): ");
        int batasAwal = scanner.nextInt();
        System.out.print("Masukkan batas akhir (<= 100): ");
        int batasAkhir = scanner.nextInt();
        if (batasAwal < 1 || batasAkhir > 100) {
            System.out.println("Salah Masukan!");
            return;
        }
        System.out.println("Bilangan prima antara " + batasAwal + " dan " + batasAkhir + ":");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            boolean Prima = true;

            if (i <= 1) {
                Prima = false;
            } else {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        Prima = false;
                        break;
                    }
                }
            }
            if (Prima) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
