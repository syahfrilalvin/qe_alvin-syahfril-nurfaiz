public class OperationOngkosKirim {
    //Dimensi barang minimal 50 cm.
    //Berat 1 kg = 5000;

    protected void HargaOngkir(double panjang, double lebar, double tinggi, double berat){
        double isDimensiBarang = panjang * lebar * tinggi;

        if((isDimensiBarang <= 50) &&(berat <= 1)){
            int isHargaOngkir = 5000;
            System.out.println("Harga Ongkir : " + isHargaOngkir);
        }else if((isDimensiBarang >= 50) && (berat > 1)){
            double isHargaOngkir = 5000 * berat;
            System.out.println("Harga Ongkir : Rp. " + isHargaOngkir);

        }

    }
}
