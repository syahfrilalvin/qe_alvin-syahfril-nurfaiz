public class UbahHuruf {
    private static String ubahHuruf(String s){
        int shift = 10;
        StringBuilder encryptedMessage = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (!Character.isLetter(currentChar)) {
                encryptedMessage.append(currentChar);
                continue;
            }

            char encryptedChar = (char) (currentChar + shift);
            if (encryptedChar > 'Z') {
                encryptedChar = (char) ('A' + (encryptedChar - 'Z' - 1));
            }
            encryptedMessage.append(encryptedChar);
        }
        return encryptedMessage.toString();

    }

    public static void main(String[] args) {
        System.out.println(ubahHuruf("SEPULSA OKE"));
        System.out.println(ubahHuruf("ALTERRA ACADEMY"));
        System.out.println(ubahHuruf("INDONESIA"));
        System.out.println(ubahHuruf("GOLANG"));
        System.out.println(ubahHuruf("PROGRAMMER"));
    }
}
