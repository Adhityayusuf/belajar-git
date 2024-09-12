import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        System.out.println("=== PEMBAYARAN LISTRIK ===");
        Scanner sc = new Scanner(System.in);

        double pemakaian, tariflistrik = 1500.0, totaltagihan;
        boolean melebihi;

        System.out.print("\nApakah Melebihi 500 kWh (true/false): ");
        melebihi = sc.nextBoolean();
        System.out.print("Masukan jumlah pemakaian: ");
        pemakaian = sc.nextInt();

        totaltagihan = pemakaian * tariflistrik;

        System.out.println("Total tagihan yang harus di bayar Rp " + totaltagihan);
        System.out.println("\n=== TERIMA KASIH ===");
    }

}
