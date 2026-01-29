public class PaperPresenter extends Presenter {
    private char sector; // A = Academicia, I = Industry

    public PaperPresenter() {
        super();
        this.sector = '\0';
    }

    public PaperPresenter(String presenterName, int presenterID, String presenterAffliation, char sector) {
        super(presenterName, presenterID, presenterAffliation);
        this.sector = sector;
    }

    public void setSector(char sector) {
        this.sector = sector;
    }

    public char getSector() {
        return sector;
    }

    @Override
    public double enrollFee() {
        double enrollFee = 0.00;
        switch (sector) {
            case 'A': enrollFee = 180.00; break;
            case 'I': enrollFee = 200.00; break;
        }

        return enrollFee;
    }

    public String toString() {
        return super.toString() +
               "\nSector: " + sector;
    }
}
