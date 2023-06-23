public class OperasiBidang {
    public static void main(String[] args) {
        BidangDatar bidangDatar = new BidangDatar();

        bidangDatar.luasPersegi(4);
        bidangDatar.luasSegitiga(5,5);
        bidangDatar.luasPersegiPanjang(6,6);
        System.out.println("----------------------");
        bidangDatar.kelilingPersegi(4);
        bidangDatar.kelilingSegitiga(12, 5, 6);
        bidangDatar.kelilingPersegiPanjang(7,8);

    }
}
