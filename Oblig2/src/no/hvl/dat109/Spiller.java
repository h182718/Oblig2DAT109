package no.hvl.dat109;

/**
 * @author kjetilhunshammer
 */
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

    /**
     * @param kopp Tar kopp som input
     * @return setter verdi, og returnerer verdien.
     */
    public int spill(Kopp kopp) {
        Terning t1 = kopp.getT1();
        Terning t2 = kopp.getT2();

        return this.verdi = kopp.trill(t1, t2);


    }

}
