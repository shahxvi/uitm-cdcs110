public class SdcPresenter extends Presenter {
    private int level; // 1 = Undergraduate, 2 = Postgraduate

    
    public SdcPresenter() {
        super();
        this.level = 0;
    }

    public SdcPresenter(String presenterName, int presenterID, String presenterAffliation, int level) {
        super(presenterName, presenterID, presenterAffliation);
        this.level = level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public double enrollFee() {
        double enrollFee = 0.00;
        switch (level) {
            case 1: enrollFee = 100.00; break;
            case 2: enrollFee = 150.00; break;
        }

        return enrollFee;
    }

    public String toStrin() {
        return super.toString() +
               "Level: " + level;
    }
}
