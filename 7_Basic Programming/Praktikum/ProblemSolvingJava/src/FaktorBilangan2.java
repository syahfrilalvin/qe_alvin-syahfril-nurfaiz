import java.util.Scanner;

public class FaktorBilangan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bil = input.nextInt();
        int idx = bil;
        while (idx >= 1){
            if (bil % idx == 0){
                System.out.println("Faktor bilangannya adalah : " + idx);
            }
            idx--;
        }
    }
}
