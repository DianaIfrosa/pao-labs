package pao.exercise.lab2;

/**
 * Write a program to create a Person object, with the following attributes:
 * name as string, surname as string, age as int, identity number as long, type as string.
 * Define a constructor for this class as well as accessors and mutators for all the attributes.
 * Create two objects of type Person and display the information for them on separate lines
 */
public class Exercise1 {
    public static void displayInformation(Person p)
    {
        System.out.println("My full name is " + p.getName() + " " + p.getSurname() + " and I am " + p.getType() +
                           ". I am " + p.getAge() + " years old and my identity number is " + p.getIdentityNumber() + ".");

    }

    public static void main(String[] args)
    {
        Person p1 = new Person("Josh", "Peterson", "adult", 26, 1000 );
        Person p2 = new Person("Mary", "Simson", "adult", 35, 1001 );

        displayInformation(p1);
        displayInformation(p2);
    }

}

class Person
{
    private String name, surname, type;
    private int age;
    private long identityNumber;

    public Person(String name, String surname, String type, int age, long identityNumber)
    {
        this.name = name;
        this.surname = surname;
        this.type = type;
        this.age = age;
        this.identityNumber = identityNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(long identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}