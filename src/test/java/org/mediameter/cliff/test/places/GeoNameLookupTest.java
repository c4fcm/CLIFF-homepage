package org.mediameter.cliff.test.places;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mediameter.cliff.places.Adm1GeoNameLookup;
import org.mediameter.cliff.places.CountryGeoNameLookup;

import com.bericotech.clavin.gazetteer.GeoName;

public class GeoNameLookupTest {

    @Test
    public void testCountryLookup() throws Exception {
        CountryGeoNameLookup lookup = new CountryGeoNameLookup();
        assertEquals(lookup.size(),250);
        GeoName usa = lookup.get("US");
        assertEquals(usa.geonameID,6252001);
    }

    @Test
    public void testAdm1Lookup() throws Exception {
        Adm1GeoNameLookup lookup = new Adm1GeoNameLookup();
        assertEquals(lookup.size(),3891);
        GeoName newYorkState = lookup.get("US","NY");
        assertEquals(newYorkState.geonameID,5128638);
    }
    
}
