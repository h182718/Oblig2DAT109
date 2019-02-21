package no.hvl.dat109;

public class Terningspill {
    private int id;

    public Terningspill(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Terningspill Spill = new Terningspill(1);
        Spill.spill();
    }

    public Spiller leggTilSpiller(String navn) {
        Spiller spiller = new Spiller(navn);
        return spiller;
    }

    private void spill() {
        Kopp kopp = new Kopp(1);
        Terning t1 = new Terning(1);
        Terning t2 = new Terning(2);
        kopp.trill();

    }
}
