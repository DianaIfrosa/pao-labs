package pao.exercise.lab3;
import java.lang.Math;

public abstract class CandyBox {

    protected String flavor, origin;

    public CandyBox()
    {
        flavor = "default";
        origin = "unknown";
    }

    public CandyBox(String flavor, String origin)
    {
        this.flavor = flavor;
        this.origin = origin;
    }

    public abstract double getVolume();

    @Override
    public String toString()
    {
        return "CandyBox{" +
                "flavor='" + flavor + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}


