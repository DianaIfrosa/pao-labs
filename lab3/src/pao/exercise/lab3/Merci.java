package pao.exercise.lab3;

public class Merci extends CandyBox
{
    private double length;
    public Merci() {}
    public Merci(double length, String flavor, String origin)
    {
        super(flavor, origin);
        this.length = length;
    }

    @Override
    public double getVolume()
    {
        return Math.pow(this.length, 3);
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getLength()
    {
        return this.length;
    }

    @Override
    public String toString()
    {
        return "The Merci " + this.origin + " chocolate with flavor " + this.flavor + " has volume " + Math.round(getVolume());
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (!(o instanceof Merci))
            return false;
        Merci merci = (Merci) o;
        return merci.getVolume() == getVolume() && merci.origin == origin && merci.flavor == flavor;
    }

}