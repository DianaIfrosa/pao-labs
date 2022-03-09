package pao.exercise.lab3;

import java.util.Objects;

public class Milka extends CandyBox {

    private double radius, height;

    public Milka(){}
    public Milka(double radius, double height, String flavor, String origin)
    {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }
    @Override
    public double getVolume()
    {
        return Math.PI* Math.pow(this.radius,2) * this.height;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (!(o instanceof Milka))
            return false;
        Milka milka = (Milka) o;
        return milka.getVolume() == getVolume() && milka.flavor == flavor && milka.origin == origin;
    }

    @Override
    public String toString()
    {
        return "The Milka " + this.origin + " chocolate with flavor " + this.flavor + " has volume " + Math.round(getVolume());
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
