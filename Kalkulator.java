import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        // a operator b
        System.out.println(" ==== KALKULATOR SEDERHANA ==== ");
        Scanner inputUser;
        float a,b,hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.print("Nilai a= ");
        a = inputUser.nextFloat();
        System.out.print("operator= ");
        operator = inputUser.next().charAt(0);
        System.out.print("Nilai b= ");
        b = inputUser.nextFloat();

        System.out.println("Nilai Input : " + a + operator + b );
        // operator + - * /

        if (operator == '+'){
            //penjumlahan
            hasil = a + b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '-'){
            //pengurangan
            hasil = a - b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '*'){
            //perkalian
            hasil = a * b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '/'){
            //pembagian
            if (b == 0){
                System.out.println("hasil dari pembagian nol adalah tak hingga");
            } else {
                hasil = a / b;
                System.out.println("hasil = " + hasil);
            } 
        } else {
            // operator tidak ditemukan
            System.out.println("hasil tidak ditemukan");
        } 
    System.out.println(" ==== TERIMA KASIH ==== ");
    }
}
