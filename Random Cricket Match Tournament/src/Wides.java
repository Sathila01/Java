public class Wides extends Extras{

    private int wides;

    public Wides(int extras) {
        super(extras);
    }

    public Wides(int extras, int wides) {
        super(extras);
        this.wides = wides;
    }

    public int getWides() {
        return wides;
    }

    public void setWides(int wides) {
        this.wides = wides;
    }
}
