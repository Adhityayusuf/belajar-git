import java.util.Scanner;

public class Biodata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama : "); 
        String Nama = sc.nextLine();

        System.out.print("Nim  : ");
        String Nim = sc.nextLine();

        System.out.print("Kelas: ");
        String Kelas = sc.nextLine();

        System.out.print("Prodi: ");
        String Prodi = sc.nextLine();

        System.out.println("\n=== BIODATA DIRI KU ===");
        System.out.println("Namaku : " + Nama);
        System.out.println("Nimku  : " + Nim);
        System.out.println("Kelasku: " + Kelas);
        System.out.println("Prodiku: " + Prodi);
        System.out.println("===   TERIMA KASIH  ===");

        sc.close();
    }
}
