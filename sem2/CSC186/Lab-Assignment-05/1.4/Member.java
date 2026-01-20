public class Member extends Customer {
    int memberNo;
    String dateExpired;

    public Member() {
        super();
        memberNo = 0;
        dateExpired = "";
    }

    public Member(String custName, int icNo, String address, String roomType, int bookingNo, int day, int memberNo, String dateExpired) {
        super(custName, icNo, address, roomType, bookingNo, day);
        this.memberNo = memberNo;
        this.dateExpired = dateExpired;
    }
    
    public Member(Member other) {
        super(other);
        this.memberNo = other.memberNo;
        this.dateExpired = other.dateExpired;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public void setDateExpired(String dateExpired) {
        this.dateExpired = dateExpired;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public String getDateExpired() {
        return dateExpired;
    }

    public double calculatePayment() {
        double payment = 0.00;
        if (roomType.equalsIgnoreCase("Standard")) {
            payment = 180;
        } else if (roomType.equalsIgnoreCase("Superior")) {
            payment = 220;
        } else if (roomType.equalsIgnoreCase("Deluxe")) {
            payment = 280;
        } else if (roomType.equalsIgnoreCase("Executive")) {
            payment = 400;
        }
        return payment;
    }

    public String toString() {
        return super.toString() +
               "\nMember Number: " + memberNo +
               "\nExpiry Date: " + dateExpired;
    }
}
