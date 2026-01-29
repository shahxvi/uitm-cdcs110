public abstract class Presenter {
    protected String presenterName;
    protected int presenterID;
    protected String presenterAffliation;

    public Presenter() {
        this.presenterName = "";
        this.presenterID = 0;
        this.presenterAffliation = "";
    }

    public Presenter(String presenterName, int presenterID, String presenterAffliation) {
        this.presenterName = presenterName;
        this.presenterID = presenterID;
        this.presenterAffliation = presenterAffliation;
    }

    /* Setters */
    public void setPresenterName(String presenterName) {
        this.presenterName = presenterName;
    }

    public void setPresenterID(int presenterID) {
        this.presenterID = presenterID;
    }

    public void setPresenterAffliation(String presenterAffliation) {
        this.presenterAffliation = presenterAffliation;
    }
    /* Setters */

    /* Getters */
    public String getPresenterName() {
        return presenterName;
    }

    public int getPresenterID() {
        return presenterID;
    }

    public String getPresenterAffliation() {
        return presenterAffliation;
    }
    /* Getters */

    public abstract double enrollFee();

    public String toString() {
        return "Presenter Name: " + presenterName +
               "\nPresenter ID: " + presenterID +
               "\nPresenter Affliation: " + presenterAffliation;
    }
}
