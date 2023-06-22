import java.util.Scanner;

public class FaktorBilangan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan bilangan : " );
        int bil = scanner.nextInt();
        int idx = 1;
        while (idx <= bil){
            if (bil % idx == 0){
                System.out.println("Faktor bilangannya adalah : " + idx);
            }
            idx++;
        }
    }
}
