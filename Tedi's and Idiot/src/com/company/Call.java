package com.company;

import java.util.ArrayList;

public class Call {
    private String nameOfCaller;
    private int numberOfCaller;
    private static int queueIndex;
    private int queuePosition;
    ArrayList<Call> queue = new ArrayList<>();

    public Call(){}
    public Call(String name, int number){
        this.nameOfCaller = name;
        this.numberOfCaller = number;
        queuePosition = queueIndex;
        queueIndex++;

    }
    public void addToArray(Call caller){
        if(queue.size() > 10) {
            System.out.println("You cannot store more than 10 calls !");
        }else{
            queue.add(caller);
        }
    }
    public void finnishCall(){
        queue.remove(0);
    }

    public String toString(){
        return "("+ queuePosition +")" + "name: " + nameOfCaller + "(" + numberOfCaller + ")";
    }
}
