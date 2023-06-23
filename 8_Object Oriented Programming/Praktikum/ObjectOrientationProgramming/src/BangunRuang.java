public class BangunRuang {

    protected void volumeKubus(double s){
        double isVolumeKubus = s*s;
        System.out.println("Volume kubus : " + isVolumeKubus);

    }

    protected void volumeBalok(double panjang, double lebar, double tinggi){
        double isVolumeBalok = panjang * lebar * tinggi;
        System.out.println("Volume balok : " + isVolumeBalok);

    }

    protected void volumeTabung(double r, double tinggi){
        double phi = 3.14;
        double isVolumeTabung = phi * r * r * tinggi;
        System.out.println("Volume tabung : " +  Math.ceil(isVolumeTabung));

    }
}
