import BuyersSellers.Customer;
import BuyersSellers.Dealership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    Dealership dealership;

    @Before
    public void before() {
        dealership = new Dealership(1000, "J.Bond");
    }


    @Test
    public void hasMoney() {
        assertEquals(1000, dealership.getMoney());
    }
}



