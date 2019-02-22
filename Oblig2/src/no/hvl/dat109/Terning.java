package no.hvl.dat109;

/**
 * @author kjetilhunshammer
 */
public class Terning {
    private int id;
    private int verdi;

    public Terning(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVerdi() {
        return verdi;
    }

    public void setVerdi(int verdi) {
        this.verdi = verdi;
    }

    /**
     * @return verdien til terningen når den er trillet. fra 1-6.
     */
    public int trill() {
        this.verdi = ((int) (Math.random() * 6)) + 1;
        return this.verdi;
    }
}
