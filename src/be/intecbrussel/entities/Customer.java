package be.intecbrussel.entities;

public class Customer implements Entity{

    private int id;
    private String nationalityId;
    private String firstName;
    private  String lastName;
    private int yearOfBirth;

    public Customer() {
    }

    public Customer(int id, String nationalityId, String firstName, String lastName, int yearOfBirth) {
        this.id = id;
        this.nationalityId = nationalityId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public Customer setId(int id) {
        this.id = id;
        return this;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public Customer setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Customer setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Customer setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public Customer setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        return this;
    }
}
