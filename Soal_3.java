package pbo;
import java.util.Scanner;

public class Soal_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N (1-1000): ");
        int N = scanner.nextInt();
        if (N < 1 || N > 1000) {
            System.out.println("Masukkan nilai N antara 1 dan 1000.");
            return;
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
