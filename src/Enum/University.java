package Enum;

public enum University {
    VGU("address 1", 3000),
    VGTU("address 2", 1000),
    FORESTTECH("address 3", 1558),
    SHI("address 4", 549);

    private String address;
    private int numberOfStudents;

    University(String address, int numberOfStudents) {
        this.address = address;
        this.numberOfStudents = numberOfStudents;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public String toString() {
        return "University{" +
                "address='" + address + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}
