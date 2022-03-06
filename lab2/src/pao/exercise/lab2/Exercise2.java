package pao.exercise.lab2;

/**
 * Write a program to create a Room object, the attributes of this object are:
 * room number, room type and room floor.
 *
 * Define a constructor for this class as well as accessors and mutators for all the attributes.
 * Create two objects of type and display the information for them on separate lines.
 */

public class Exercise2 {

    public static void displayInformation(Room r)
    {
        System.out.println("Room no. " + r.getRoomNumber() + " is " + r.getRoomType() + " and is on floor "
                            + r.getRoomFloor() + ".");
    }
    public static void main(String[] args)
    {
        Room r1 = new Room(1,1,"bathroom");
        Room r2 = new Room(2,0,"bedroom");

        displayInformation(r1);
        displayInformation(r2);
    }
}
class Room
{
    private int roomNumber, roomFloor;
    private String roomType;

    public Room(int roomNumber, int roomFloor, String roomType) {
        this.roomNumber = roomNumber;
        this.roomFloor = roomFloor;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(int roomFloor) {
        this.roomFloor = roomFloor;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
}
