public class Segitiga_Sama_Kaki extends Segitiga {
    public Segitiga_Sama_Kaki(double sisiA, double sisiB) {
        super(sisiA, sisiB, sisiA);
    }

    @Override
    public double hitungKeliling() {
        return 2 * sisiA + sisiB;
    }
}
