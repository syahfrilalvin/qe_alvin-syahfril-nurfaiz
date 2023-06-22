public class Palindrome {
    private static boolean palindrome(String value){
        int awal = 0;
        int akhir = value.length() - 1;

        while (awal < akhir) {
            if (value.charAt(awal) != value.charAt(akhir)) {
                return false;
            }
            awal++;
            akhir--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }
}
