package pbo;
import java.util.Scanner;

public class Soal_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            int a = scanner.nextInt();
            
            if (a >= 1000 && a <= 99999 && a % 1000 == 0) {
                System.out.println(a + " adalah bilangan ribuan");
            } else {
                System.out.println(a + " bukan merupakan bilangan ribuan");
            }
        }

        scanner.close();
    }
}