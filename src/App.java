public class App {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(7);
        Persegi persegi = new Persegi(10);
        Segitiga_Sama_Sisi segitigaSamaSisi = new Segitiga_Sama_Sisi(6);
        Segitiga_Siku_Siku segitigaSikuSiku = new Segitiga_Siku_Siku(3, 4);
        Segitiga_Sembarang segitigaSembarang = new Segitiga_Sembarang(2, 3, 4);

        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Luas Segitiga Sama Sisi: " + segitigaSamaSisi.hitungLuas());
        System.out.println("Luas Segitiga Siku-Siku: " + segitigaSikuSiku.hitungLuas());
        System.out.println("Luas Segitiga Sembarang: " + segitigaSembarang.hitungLuas());
    }
}
