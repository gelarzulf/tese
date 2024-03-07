public class Segitiga_Siku_Siku extends Segitiga {
    public Segitiga_Siku_Siku(double sisiA, double sisiB) {
        super(sisiA, sisiB, Math.sqrt(sisiA * sisiA + sisiB * sisiB));
    }

    @Override
    public double hitungKeliling() {
        return sisiA + sisiB + sisiC;
    }
}
