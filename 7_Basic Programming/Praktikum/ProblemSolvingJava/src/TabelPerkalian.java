public class TabelPerkalian {
    public static void main(String[] args) {
        int ukuran = 10; // Ukuran tabel

        // Mencetak header kolom
        System.out.print("    ");
        for (int i = 1; i <= ukuran; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        // Mencetak garis pemisah header
        System.out.print("----");
        for (int i = 1; i <= ukuran; i++) {
            System.out.print("----");
        }
        System.out.println();

        // Mencetak tabel perkalian
        for (int i = 1; i <= ukuran; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= ukuran; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
