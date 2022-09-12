import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> allReviewed;

    public ThemePark() {
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
        this.allReviewed = new ArrayList<IReviewed>();
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }



    public ArrayList<IReviewed> getAllReviewed() {
        return allReviewed;
    }

    public void visit(Visitor visitor, Attraction attraction){
        visitor.addAttractionToVisited(attraction);
        attraction.increaseVisitCount();
    }
}
