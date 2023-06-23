import java.util.Scanner;

public class OngkosKirim {
    public static void main(String[] args) {
        OperationOngkosKirim operationOngkosKirim = new OperationOngkosKirim();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan panjang dimensi : ");
        int panjang = scanner.nextInt();
        System.out.print("Masukan lebar dimensi : ");
        int lebar = scanner.nextInt();
        System.out.print("Masukan tinggi dimensi : ");
        int tinggi = scanner.nextInt();
        System.out.print("Masukan berat barang : ");
        int berat = scanner.nextInt();

        operationOngkosKirim.HargaOngkir(panjang, lebar, tinggi, berat);
    }
}
