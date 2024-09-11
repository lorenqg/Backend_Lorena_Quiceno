package domains.abstracts;

public abstract class Person {

    // Atributos
    private String name;
    private String lastName;

    // Constructor
    public Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    // Getters
    public String getName(){
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Method
    protected abstract void showPerson();


}
