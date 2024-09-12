import java.util.Scanner;
public class Gaji {
    public static void main(String[] args) {
        System.out.println(" === PENGHITUNG GAJI KARYAWAN === ");
        Scanner sc = new Scanner(System.in);

        double jmlUpah, bonus = 0.1, pajak = 0.05, dapatbonus, dapatpajak, gajikotor, gajibersih;
        int jmlJam;

        System.out.print("\nJumlah Jam Kerja: ");
        jmlJam = sc.nextInt();
        System.out.print("Jumlah besaran upah: ");
        jmlUpah = sc.nextDouble();

        gajikotor = jmlJam * jmlUpah;
        dapatbonus = gajikotor * bonus;
        dapatpajak = (gajikotor + dapatbonus) * pajak;
        gajibersih = gajikotor + dapatbonus - dapatpajak;

        System.out.println("Jumlah Gaji kotor: " + gajikotor);
        System.out.println("Jumlah Bonusan: " + dapatbonus);
        System.out.println("Jumlah Pajak: " + dapatpajak);
        System.out.println("Jumlah Gaji Bersih: " + gajibersih);
        System.out.println("\n === TERIMA KASIH === ");
    }

    
}
