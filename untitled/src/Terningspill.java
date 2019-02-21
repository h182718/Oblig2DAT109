public class Terningspill {
    private int id;

    public Terningspill(int id) {
        this.id = id;
    }

    public static void main(String[] args) {

    }

    public Spiller leggTilSpiller(String navn) {
        return new Spiller(navn);
    }

    public void spill() {

    }
}
