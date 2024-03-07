public class Segitiga_Sembarang extends Segitiga {
    public Segitiga_Sembarang(double sisiA, double sisiB, double sisiC) {
        super(sisiA, sisiB, sisiC);
    }

    @Override
    public double hitungKeliling() {
        return sisiA + sisiB + sisiC;
    }
}
