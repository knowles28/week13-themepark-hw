package attractions;

import behaviours.ISecure;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecure, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() >= 12 && visitor.getHeight() >= 145){
            return true;}
        else {
            return false;
        }
    }

    public double defaultPrice() {
        return 8.40;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 200.00) {
            return defaultPrice() * 2.00;
        } else {
            return defaultPrice();
        }
    }
}
