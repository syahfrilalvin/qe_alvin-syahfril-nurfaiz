public class Exponentiation {
    public static int pangkat(int a, int b){
       int idx = 1;
       int i = 1;
       while (i <= b){
            idx *= a;
            i++;
       }
       return idx;
    }

    public static void main(String[] args) {
        System.out.println(pangkat(2,3));
        System.out.println(pangkat(5,3));
        System.out.println(pangkat(10,2));
        System.out.println(pangkat(2,5));
        System.out.println(pangkat(7,3));
    }
}
