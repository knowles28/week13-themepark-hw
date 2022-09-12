package people;

import attractions.Attraction;
import org.w3c.dom.Attr;

import java.util.ArrayList;

public class Visitor {

    private int age;
    private double height;
    private double money;

    private ArrayList<Attraction> attractions;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.attractions = new ArrayList<Attraction>();
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public int getAttractionsVisited() {
        return attractions.size();
    }

    public void addAttractionToVisited(Attraction attraction) {
        this.attractions.add(attraction);
    }


}
