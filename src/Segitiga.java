public abstract class Segitiga extends Bangun_Datar {
    protected double sisiA;
    protected double sisiB;
    protected double sisiC;

    public Segitiga(double sisiA, double sisiB, double sisiC) {
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    @Override
    public double hitungLuas() {
        // Rumus Heron
        double s = (sisiA + sisiB + sisiC) / 2;
        return Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC));
    }

    @Override
    public abstract double hitungKeliling(); // Keliling akan tergantung pada jenis segitiga
}
