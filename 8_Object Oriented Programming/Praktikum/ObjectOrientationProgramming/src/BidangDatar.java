public class BidangDatar {

    public void luasPersegi(double s){
        double isLuasPersegi = s*s;
        System.out.println("Luas Persegi : " + isLuasPersegi);
    }

    public void luasSegitiga(double alas, double tinggi){
        double isLuasSegitiga = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga : " + isLuasSegitiga);
    }

    public void luasPersegiPanjang(double panjang, double lebar){
        double isLuasPersegiPanjang = panjang * lebar;
        System.out.println("Luas Persegi Panjang : " + isLuasPersegiPanjang);
    }


    public void kelilingPersegi(double s){
        double isKelilingPersegi = 4 * s;
        System.out.println("Keliling Persegi : " + isKelilingPersegi);

    }

    public void kelilingSegitiga(double sisi1, double sisi2, double sisi3){
        double isKelilingSegitiga = sisi1 + sisi2 + sisi3;
        System.out.println("Keliling Segitiga : " + isKelilingSegitiga);

    }

    public void kelilingPersegiPanjang(double panjang, double lebar){
        double isKelilingPersegiPanjang = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang : " + isKelilingPersegiPanjang);

    }

}
