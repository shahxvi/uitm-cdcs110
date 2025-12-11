public class Photocopy {
    String lectName;
    String staffID;
    String facCode;
    String assType;
    int masterNum;
    int copiesNum;

    public Photocopy() {
        this.lectName = "";
        this.staffID = "";
        this.facCode = "";
        this.assType = "";
        this.masterNum = 0;
        this.copiesNum = 0;
    }

    public void setPhotocopy(String lectName, String staffID, String facCode, String assType, int masterNum, int copiesNum) {
        this.lectName = lectName;
        this.staffID = staffID;
        this.facCode = facCode;
        this.assType = assType;
        this.masterNum = masterNum;
        this.copiesNum = copiesNum;
    }

    public String getLectName() {
        return lectName;
    }

    public String getStaffID() {
        return staffID;
    }

    public String getFacCode() {
        return facCode;
    }

    public String getAssType() {
        return assType;
    }

    public int getMasterNum() {
        return masterNum;
    }

    public int getCopiesNum() {
        return copiesNum;
    }

    public String toString() {
        return String.format("%-8s    %-31d    %-25d    %-5d\n\n", staffID, masterNum, copiesNum, (masterNum * copiesNum));
    }
}
