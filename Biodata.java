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

        System.out.print("Namaku : " + Nama);
        System.out.print("Nimku  : " + Nim);
        System.out.print("Kelasku: " + Kelas);
        System.out.print("Prodiku: " + Prodi);

        sc.close();
    }
}
