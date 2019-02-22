package no.hvl.dat109;

public class Spiller {
    private String navn;
    private int verdi;

    public Spiller(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getVerdi() {
        return verdi;
    }

    public void setVerdi(int verdi) {
        this.verdi = verdi;
    }

    public int spill(Kopp kopp) {
        Terning t1 = kopp.getT1();
        Terning t2 = kopp.getT2();

        return this.verdi = kopp.trill(t1, t2);


    }

}
