package com.company;
public class Aquatic extends Animal {
    private int numberOfFins;

    public int getNumberOfFins() {
        return numberOfFins;
    }

    public void setNumberOfFins(int numberOfFins) {
        this.numberOfFins = numberOfFins;
    }

    @Override
    public String toString() {
        return super.toString() + " Aquatic{" +
                "numberOfFins=" + numberOfFins +
                '}';
    }
}

