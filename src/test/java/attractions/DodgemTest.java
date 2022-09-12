package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor4;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor1 = new Visitor(18, 180.00, 5.00);
        visitor4 = new Visitor(11, 100.00, 5.00);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void visitorIsChargedRegularPrice(){
        assertEquals(4.50, dodgems.priceFor(visitor1), 0.00);
    }

    @Test
    public void youngVisitorIsChargedHalfPrice(){
        assertEquals(2.25, dodgems.priceFor(visitor4), 0.00);
    }

}
