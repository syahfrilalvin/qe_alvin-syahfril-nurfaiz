public class DrawXYZ {
    private static void DrawXYZ(int n){

        char[] isSimbol = {'Y', 'Z', 'X'};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(isSimbol[(i + j) % isSimbol.length] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        DrawXYZ(3);
        DrawXYZ(5);
        DrawXYZ(1);
    }
}

