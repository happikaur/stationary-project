package com.nology;

import org.junit.Before;
import static org.junit.Assert.*;

public class StationaryTest {
    private Stationary officeSupply;

    @Before
    public void setup() {
        officeSupply = new Stationary(1000, 200, 8000, 50, 300);
    }

    @org.junit.Test
    public void RemovesPens_ReturnUpdatedAMount() {
        officeSupply.removePens(258);
        assertEquals(742, officeSupply.getPens());
    }

    @org.junit.Test
    public void AddPens_ReturnUpdatedAmount() {
        officeSupply.addPens(1500);
        assertEquals(2500, officeSupply.getPens());
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void removeStaples_ReturnUpdatedAmount() {
        officeSupply.removeStaples(18400);
    }
    @org.junit.Test
    public void AddRulers_ReturnUpdatedAmount() {
        officeSupply.addRulers(300);
        assertEquals(300, officeSupply.getRulers());
    }

//    @org.junit.Test
//    public void AddStationary_
//

}
