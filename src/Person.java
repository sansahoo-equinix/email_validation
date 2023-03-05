import java.util.regex.Pattern;

/**
 * A class representing a person with name, address, email, phone number, salary, and manager.
 */
public class Person {

    private String name;
    private App address;
    private String email;
    private String phone;
    private int salary;
    private Person manager;

    /**
     * Creates a new person with default values.
     */
    public Person() {
        this.name = "Henry";
        this.address = new App();
        this.email = "henry@gmail.com";
        this.phone = "+918080808080";
        this.salary = 100000;
        this.manager = null;
    }

    /**
     * Creates a new person with the given values.
     *
     * @param name     the name of the person
     * @param address  the address of the person
     * @param email    the email address of the person
     * @param phone    the phone number of the person
     * @param salary   the salary of the person
     * @param manager  the manager of the person
     */
    public Person(String name, App address, String email, String phone, int salary, Person manager) {
        this.name = name;
        this.address = new App(address);
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.manager = manager;
    }

    /**
     * Prints the hierarchy of the organization starting from the current person up to the head of the organization.
     */
    public void printHierarchy() {
        if (this.manager != null) {
            this.manager.printHierarchy();
            System.out.print(String.format(" --> %s", this.name));
        } else {
            System.out.print(String.format("Head: %s", this.name));
        }
        System.out.println();
    }

    /**
     * Determines whether the email address of the person is valid or not.
     *
     * @return true if the email address is valid, false otherwise.
     */
    public boolean isEmailValid() {
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return this.email.matches(regex);
    }

    /**
     * Determines whether the phone number of the person is valid or not.
     *
     * @return true if the phone number is valid, false otherwise.
     */
    public boolean isPhoneValid() {
        String regex = "^\\d{10}$";
        return this.phone.matches(regex);
    }

/**
 * Returns
