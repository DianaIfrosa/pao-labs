package pao.exercise.lab3;

public class Shop {
    public static void main(String[] args) {

         CandyBox[] list1 = {new Milka(10, 15, "orange", "german"),
                new Milka(8, 14, "oreo", "belgian"),
                new Milka(12, 10, "strawberries", "polish")};
         CandyBag candyBag1 = new CandyBag(list1);

        CandyBox[] list2 = {new Merci(12, "orange", "polish"),
                new Lindt(8, 10, 3, "berries", "italian"),
                new Milka(15, 7, "strawberries", "polish")};
        CandyBag candyBag2= new CandyBag(list2);

        Area area1 = new Area(candyBag1, 10, "Bulevardul Iuliu Maniu");
        Area area2 = new Area(candyBag2, 25, "Str. Brasov");

        area1.printAddress();
        System.out.println("");
        area2.printAddress();

    }


}
