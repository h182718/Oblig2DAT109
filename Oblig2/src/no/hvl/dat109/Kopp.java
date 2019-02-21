package no.hvl.dat109;

public class Kopp {
    private int id;
    private int sum;

    public Kopp(int id) {
        this.id = id;
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

    public int trill() {

        return (int) (Math.random() * 6) + 1;
    }
}
