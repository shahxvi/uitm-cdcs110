public class Customer {
    protected String custName;    // customer name
    protected int icNo;           // identification number
    protected String address;     //address
    protected String roomType;    //room type
    protected int bookingNo;      //booking number
    protected int day;            //number of days

    public Customer() {
        this.custName = "";
        this.icNo = 0;
        this.address = "";
        this.roomType = "";
        this.bookingNo = 0;
        this.day = 0;
    }

    public Customer(String custName, int icNo, String address, String roomType, int bookingNo, int day) {
        this.custName = custName;
        this.icNo = icNo;
        this.address = address;
        this.roomType = roomType;
        this.bookingNo = bookingNo;
        this.day = day;
    }

    public Customer(Customer other) {
        this.custName = other.custName;
        this.icNo = other.icNo;
        this.address = other.address;
        this.roomType = other.roomType;
        this.bookingNo = other.bookingNo;
        this.day = other.day;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setIcNo(int icNo) {
        this.icNo = icNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setBookingNo(int bookingNo) {
        this.bookingNo = bookingNo;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getCustName() {
        return custName;
    }

    public int getIcNo() {
        return icNo;
    }

    public String getAddress() {
        return address;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getBookingNo() {
        return bookingNo;
    }

    public int getDay() {
        return day;
    }

    public String toString() {
        return "Customer Name: " + custName +
               "\nIC Number: " + icNo +
               "\nAddress: " + address +
               "\nRoom Type: " + roomType +
               "\nBooking Number: " + bookingNo +
               "\nDay : " + day;
    }
}
