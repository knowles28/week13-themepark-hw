import attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Visitor visitor1;
    Dodgems dodgems;

    @Before
    public void before(){
        themePark = new ThemePark();
        visitor1 = new Visitor(22,120.00,10.00);
        dodgems = new Dodgems("dodgems", 9);

    }

    @Test
    public void canAddRideToVisitedList(){
        themePark.visit(visitor1, dodgems);
        assertEquals(1, visitor1.getAttractionsVisited());
    }

    @Test
    public void canIncrementVisitCountForRide(){
        themePark.visit(visitor1, dodgems);
        assertEquals(1, dodgems.getVisitCount());
    }

}
