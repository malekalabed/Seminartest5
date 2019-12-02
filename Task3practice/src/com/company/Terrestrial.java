package com.company;
public class Terrestrial extends Animal{
    private int numberOfLegs;

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String toString() {
        return super.toString() + " Terrestrial{" +
                "numberOfLegs=" + numberOfLegs +
                '}';
    }
}
