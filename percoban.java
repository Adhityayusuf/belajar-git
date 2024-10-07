import java.util.Scanner;
public class percoban {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Kelipatan, Jumlah = 0, Counter = 0, total = 0; 

        System.out.print("Masukkan bilangan Kelipatan (1-9): ");
        Kelipatan = sc.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % Kelipatan == 0) {
                total += i;
                Counter++;

                System.out.println("Banyak bilangan " + Kelipatan + " dari 1 sampai 50 adalah " + Counter);
            break;
            }
        }
    }
}
