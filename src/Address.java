public class Address {
    private String numStreet;
    private String nameStreet;
    private String apartmentNum;
    private String city;
    private String state;
    private int zipCode;


    public Address(String numStreet, String nameStreet, String apartmentNum, String city, String state, int zipCode) {
        this.numStreet = numStreet;
        this.nameStreet = nameStreet;
        this.apartmentNum = apartmentNum;
        this.state = state;
        this.city = city;
        this.zipCode = zipCode;
    }

    public Address(Address address) {
        this.numStreet = address.getNumStreet();
        this.nameStreet = address.getNameStreet();
        this.apartmentNum = address.getApartmentNum();
        this.city = address.getCity();
        this.zipCode = address.getZipCode();
    }

    public Address(String address) {
        this.numStreet = address.substring(0, address.indexOf(" "));
        if (address.contains("Apt")) {
            this.nameStreet = address.substring(address.indexOf(" ") + 1, address.indexOf("A"));
            this.apartmentNum = address.substring(address.indexOf("A"), address.indexOf(","));
        } else {
            this.nameStreet = address.substring(address.indexOf(" ") + 1, address.indexOf(","));
        }
        this.city =


    }

    public String getNumStreet() {
        return numStreet;
    }

    public void setNumStreet(String numStreet) {
        this.numStreet = numStreet;
    }

    public String getNameStreet() {
        return nameStreet;
    }

    public void setNameStreet(String nameStreet) {
        this.nameStreet = nameStreet;
    }

    public String getApartmentNum() {
        return apartmentNum;
    }

    public void setApartmentNum(String apartmentNum) {
        this.apartmentNum = apartmentNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String toString() {
        String address = "";
        address+= numStreet + " ";
        if (apartmentNum != null) {
            address+= nameStreet + " ";
            address+= apartmentNum + ", ";
        } else {
            address+= nameStreet + ", ";
        }
        address+= city + ", ";
        address+= state + ", ";
        address+= zipCode;
        return address;
    }


}
