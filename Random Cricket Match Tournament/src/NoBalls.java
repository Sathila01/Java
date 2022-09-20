public class NoBalls extends Extras {

    private int noBalls;

    public NoBalls(int extras) {
        super(extras);
    }

    public NoBalls(int extras, int noBalls) {
        super(extras);
        this.noBalls = noBalls;
    }

    public int getNoBalls() {
        return noBalls;
    }

    public void setNoBalls(int noBalls) {
        this.noBalls = noBalls;
    }
}
