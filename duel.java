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
        
        boolean isExit = false;
        while (!isExit) {
            System.out.println("Menu: 1. roti, 2. Sego padang, 3. exit");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                  System.out.println("Selamat makan roti!");
                  break;
                case 2:
                  System.out.println("Selamat makan sego padang!");
                  break;
                case 3:
                  isExit = true;
                  break;
                default:
                  System.out.println("Pilihan tidak valid");
                  break;
            }
        }
    }
}
