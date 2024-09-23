package domains.abstracts;

public abstract class User {
    private int id;
    private String name;
    private String lastName;
    private String bornDate;
    private String address;
    private String phoneNumber;

    public User(int id, String name, String lastName, String bornDate, String address,
                String phoneNumber){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.bornDate = bornDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public User() {

    }

    // Getters
    public Number getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBornDate() {
        return bornDate;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public abstract void infoUser();
}
