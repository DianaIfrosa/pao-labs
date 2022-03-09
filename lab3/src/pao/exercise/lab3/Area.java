package pao.exercise.lab3;

public class Area {
    private CandyBag candyBag;
    private int number;
    private String street;

    public Area(){}
    public Area(CandyBag candyBag, int number, String street)
    {
        this.candyBag = new CandyBag(candyBag); // call "copy constructor"
        this.number = number;
        this.street = street;
    }

    public void printAddress()
    {
        System.out.println("Address: " + street + " no. " + number);
        System.out.println("This candy bag contains " + candyBag.boxes.length + " boxes of chocolate: ");
        for (int i=0; i < candyBag.boxes.length; i++)
            System.out.println(candyBag.boxes[i]);
    }

}
