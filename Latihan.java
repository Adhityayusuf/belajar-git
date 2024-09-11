import java.util.Scanner;
public class Latihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alas, tinggi;
        float luas;
        //Variabel 

        System.out.print("Masukan alas: ");
        alas = sc.nextInt();
        System.out.print("Masukan tinggi: ");
        tinggi = sc.nextInt();
        //Scannernya

        luas = alas * tinggi / 2;
        System.out.println("Luas segitiga: " + luas);
    }
}
