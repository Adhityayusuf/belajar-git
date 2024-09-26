import java.util.Scanner;
public class Mesin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte nliLembab, nliPH;

        System.out.print("Masukkan Nilai Sensor kelembapan: ");
        nliLembab = sc.nextByte();
        System.out.print("Masukkan Nilai Sensor PH: ");
        nliPH = sc.nextByte();

        if (nliLembab <= 7) 
        {
            System.out.println("Alat Penyiram Air Aktif!");
        }else if (nliLembab >= 15 && nliLembab > 7) 
        {
            System.out.println("Alat Penyiram Air Off!");
        }

        if (nliPH <= 10 && nliLembab > 7)
        {
            System.out.println("Alat Penyiram Pupuk Aktif!");
        }else if (nliPH >= 20 && nliLembab <= 7)
        {
            System.out.println("Alat Penyiram Pupuk Off!");
        }
    }
}
