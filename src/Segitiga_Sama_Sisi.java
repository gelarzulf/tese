public class Segitiga_Sama_Sisi extends Segitiga {
    public Segitiga_Sama_Sisi(double sisi) {
        super(sisi, sisi, sisi);
    }

    @Override
    public double hitungKeliling() {
        return 3 * sisiA;
    }
}
