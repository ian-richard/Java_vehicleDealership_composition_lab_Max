import org.junit.Before;
import org.junit.Test;
import vehicles.Engine;
import vehicles.Hybrid;
import vehicles.Tires;

import static org.junit.Assert.assertEquals;

public class ElectricTest {
    Hybrid vehicle;
    Engine engine;
    Tires tires;

    @Before
    public void before(){
        engine = new Engine("500w");
        tires = new Tires("Blackstone");
        vehicle = new Hybrid(1000, "Telsa","Model X", "Black", engine, tires);
    }

    @Test
    public void hasPrice(){
        assertEquals(1000, vehicle.getPrice());
    }

    @Test
    public void hasEngine(){
        engine = (Engine) vehicle.getEngine();
        // ask Juan about this
        assertEquals("500w", engine.getEngineSize());
    }

    @Test
    public void hasTires(){
        tires = (Tires) vehicle.getTires();
        // ask Juan about this
        assertEquals("Blackstone", tires.getTiretype());
    }

}
