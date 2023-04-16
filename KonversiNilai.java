import java.util.Scanner;
import javax.swing.text.html.StyleSheet;

public class KonversiNilai {
    public static void main(String[] args) {
        System.out.println("Konversi Nilai");
        System.out.println("===============================");
        System.out.println("Yuda Ananda");
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        if (nilai >= 85 && nilai <= 100) {
            System.out.println("Nilai anda adalah A");
        } else if (nilai >= 75 && nilai <= 84) {
            System.out.println("Nilai anda adalah B");
        } else if (nilai >= 65 && nilai <= 74) {
            System.out.println("Nilai anda adalah C");
        } else if (nilai >= 55 && nilai <= 64) {
            System.out.println("Nilai anda adalah D");
        } else if (nilai < 55) {
            System.out.println("Nilai anda adalah E");
        } else {
            System.out.println("Input salah");
        }

        input.close();
    }
}
