package pao.exercise.lab2;

/**
 * Write a program to create an object Subject with the following attributes:
 * room as Room, noOfStudents as integer, teacher as Person.
 *
 * Define a constructor for this class as well as accessors and mutators for all the attributes.
 *
 * Create two objects of type Subject and display the information for them on separate lines.
 */
public class Exercise3 {
    // Overloading methods
    public static void displayInformation(Room r)
    {
        System.out.println("Room no. " + r.getRoomNumber() + " is " + r.getRoomType() + " and is on floor "
                + r.getRoomFloor() + ".");
    }

    public static void displayInformation(Person p)
    {
        System.out.println("My full name is " + p.getName() + " " + p.getSurname() + " and I am " + p.getType() +
                ". I am " + p.getAge() + " years old and my identity number is " + p.getIdentityNumber() + ".");

    }

    public static void displayInformation(Subject s)
    {
        displayInformation(s.getRoom());
        System.out.println(s.getNoOfStudents() + " students follow this course in this room.");
        System.out.println("The subject's teacher has the following description: ");
        displayInformation(s.getTeacher());
    }

    public static void main(String[] args)
    {
        Room r1 = new Room(1,1,"bathroom");
        Room r2 = new Room(2,0,"bedroom");
        Person p1 = new Person("Josh", "Peterson", "adult", 26, 1000 );
        Person p2 = new Person("Mary", "Simson", "adult", 35, 1001 );

        Subject s1 = new Subject(r1,25, p1);
        Subject s2 = new Subject(r2, 30, p2);

        displayInformation(s1);
        displayInformation(s2);
    }

}
class Subject
{
    private Room room;
    private int noOfStudents;
    private Person teacher;

    public Subject(Room room, int noOfStudents, Person teacher)
    {
        this.room = room;
        this.noOfStudents = noOfStudents;
        this.teacher = teacher;
    }

    public Room getRoom()
    {
        return room;
    }

    public void setRoom(Room room)
    {
        this.room = room;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }
}