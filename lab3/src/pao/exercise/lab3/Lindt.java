package pao.exercise.lab3;

public class Lindt extends CandyBox {
    private double length, width, height;

    public Lindt(){}
    public Lindt(double length, double width, double height, String flavor, String origin)
    {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getVolume()
    {
        return this.length * this.height * this.width;
    }

    @Override
    public String toString()
    {
        return "The Lindt " + this.origin + " chocolate with flavor " + this.flavor + " has volume " + Math.round(getVolume());
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (!(o instanceof Lindt))
            return false;
        Lindt lindt = (Lindt) o;
        return lindt.getVolume() == getVolume() && lindt.flavor == flavor && lindt.origin == origin;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
