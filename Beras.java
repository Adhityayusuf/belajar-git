import java.util.Scanner;
public class Beras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int JumlahSeluruhBeras,Kantongberas;
        byte Berasdibagi = 5;

        System.out.print("Jumlah Beras : ");
        JumlahSeluruhBeras = sc.nextInt();

        Kantongberas = JumlahSeluruhBeras / Berasdibagi;

        System.out.println("Jumlah Kantong Plastik : " + Kantongberas);


    }
    
}
