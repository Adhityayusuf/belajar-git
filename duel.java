import java.util.Scanner;
public class duel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int rekening = 123456789;
        boolean isRekening = false;
        do {
          System.out.print("Masukan Rekening: ");  
          int inputrekening = sc.nextInt();
          sc.nextLine();

          if (inputrekening == rekening) {
            isRekening = true;

          }
        }while (!isRekening);
        
    }
}
