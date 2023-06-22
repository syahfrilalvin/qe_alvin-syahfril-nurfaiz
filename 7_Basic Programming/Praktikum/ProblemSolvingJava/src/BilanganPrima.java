public class BilanganPrima {
    private static boolean primeNumber(int number){
        if(number <= 1){
            return false;
        }
        int idx = 2;
        while(idx <= number /2){
            if (number % idx == 0){
                return false;
            }
            idx++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));
    }
}
