package pao.exercise.lab3;

import java.lang.reflect.Array;

public class CandyBag {
    protected CandyBox[] boxes;

    public CandyBag(){}
    public CandyBag(CandyBox[] boxes)
    {
        this.boxes = new CandyBox[boxes.length];
        for (int i = 0; i < boxes.length; i++)
            this.boxes[i] = boxes[i];
    }

    /* acts like a copy constructor */
    public CandyBag(CandyBag candyBag)
    {
        this.boxes = new CandyBox[candyBag.boxes.length];
        for (int i = 0; i < candyBag.boxes.length; i++)
            this.boxes[i] = candyBag.boxes[i];
    }

}
