package cheap.tcs;
class Person {
    private String name, phone;
    private Address addr;
    private DateOfBirth dob;
    // argument constructor for Person class
    Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    // method to create Address class object
    public void setAddress(String houseNo, String street, String city, String state) {
        addr = new Address(houseNo, street, city, state);
    }
    public void setDOB(int day, int month, int year) {
        dob = new DateOfBirth(day, month, year);
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        if (addr != null) addr.displayAddr();
        if (dob != null) dob.displayDOB();
    }
    class Address {
        private String houseNo, street, city, state;

        Address(String houseNo, String street, String city, String state) {
            this.houseNo = houseNo;
            this.street = street;
            this.city = city;
            this.state = state;
        }
        void displayAddr(){System.out.printf("Address: %s, %s, %s, %s", houseNo, street, city, state);}
    }
    class DateOfBirth {
        private int day, month, year;
        DateOfBirth(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
        void displayDOB() {
            System.out.println("DOB: " + day + "/" + month + "/" + year);
        }
    }
}