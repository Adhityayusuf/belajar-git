import java.util.Scanner;
public class Mesin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte nliLembab, nliPH;

        do {
        System.out.print("Masukkan Nilai Sensor kelembapan: ");
        nliLembab = sc.nextByte();
        System.out.print("Masukkan Nilai Sensor PH: ");
        nliPH = sc.nextByte();

        if (nliLembab <= 7) {
            System.out.println("Alat Penyiram Air Aktif!");
        }else if (nliLembab >= 15) {
            System.out.println("Alat Penyiram Air Off!");
        }

        if (nliPH <= 10 && nliLembab > 7){
            System.out.println("Alat Penyiram Pupuk Aktif!");
        }else if (nliPH >= 20){
            System.out.println("Alat Penyiram Pupuk Off!");
        }
    
    } while (nliLembab != 0 && nliPH != 0);
    }
}
