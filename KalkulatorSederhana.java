import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        System.out.println("=== KALKULATOR SEDERHANA ===");

        Scanner sc = new Scanner(System.in);

        System.out.print("\nNomor1 : ");
        int Nomor1 = sc.nextInt();
        System.out.print("Nomor2 : ");
        int Nomor2 = sc.nextInt();
        sc.close();

        int x = Nomor1;
        int y = Nomor2;

        double hasil_1;
        double hasil_2;
        double hasil_3;
        double hasil_4;

        hasil_1 = x + y;
        hasil_2 = x - y;
        hasil_3 = x * y;
        hasil_4 = x / y;

        System.out.println("Hasil dari tambah : " + hasil_1);
        System.out.println("Hasil dari kurang : " + hasil_2);
        System.out.println("Hasil dari kali   : " + hasil_3);
        System.out.println("Hasil dari bagi   : " + hasil_4);
        
    }
}
