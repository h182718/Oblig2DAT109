package no.hvl.dat109;

public class Kopp {
    private int id;
    private int sum;
    private Terning t1;
    private Terning t2;

    public Kopp(int id) {
        this.id = id;
        this.setT2(new Terning(1));
        this.setT1(new Terning(2));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public Terning getT1() {
        return t1;
    }

    public void setT1(Terning t1) {
        this.t1 = t1;
    }

    public Terning getT2() {
        return t2;
    }

    public void setT2(Terning t2) {
        this.t2 = t2;
    }


    public int trill(Terning t1, Terning t2) {

        return this.sum = t1.trill() + t2.trill();

    }
}
