public class Staff {
    private String staffName;
    private String staffID;
    private String staffContact;

    public Staff(String staffName, String staffID, String staffContact) {
        this.staffName = staffName;
        this.staffID = staffID;
        this.staffContact = staffContact;
    }

    public void setStaff(String staffName, String staffID, String staffContact) {
        this.staffName = staffName;
        this.staffID = staffID;
        this.staffContact = staffContact;
    }

    public String getStaffName() {
        return staffName;
    }

    public String getStaffID() {
        return staffID;
    }

    public String getStaffContact() {
        return staffContact;
    }
}
