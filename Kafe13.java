import java.util.Scanner;
public class Kafe13 {
    public static void main(String[] args) {
        System.out.println(" ==== STRUK PEMBAYARAN KAFE ==== ");
        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jmlkopi, jmlTeh, jmlRoti, nominallnt;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga, nominalBayar;
        float diskon = 10 / 100;
        byte totalbyte;
         
        System.out.print("\nMasukkan Keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembeli kopi: ");
        jmlkopi = input.nextInt();
        System.out.print("Masukkan jumlah pembeli Teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembeli Roti: ");
        jmlRoti = input.nextInt();

        totalHarga = (jmlkopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        nominalBayar = totalHarga - (diskon * totalHarga);
        nominallnt = (int) nominalBayar;
        totalbyte = (byte) totalHarga;

        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembelian " + jmlkopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + "roti");
        System.out.println("Nominal bayar Rp " + nominalBayar);
        
        System.out.println("\n ==== TERIMA KASIH ==== ");
    }
}

    
