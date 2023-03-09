import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class EarthLocationTest {

    @Test
    public void testDistanceTo() {
        double expectedDistance, calculatedDistance;
        double tolerance;

        // two locations on top of one another
        EarthLocation l1 = new EarthLocation(37, -45);
        EarthLocation l2 = new EarthLocation(37, -45);
        expectedDistance = 0.0;
        calculatedDistance = l1.distanceTo(l2);
        assertEquals(expectedDistance, calculatedDistance);

        // http://amsi.org.au/ESA_Senior_Years/SeniorTopic8/8b/8b_2content_9.html
        EarthLocation sydney = new EarthLocation(-33.5, 151.13);
        EarthLocation capeTown = new EarthLocation(-33.5, 18.22);
        expectedDistance = 6921.3486986;
        calculatedDistance = sydney.distanceTo(capeTown);
        tolerance = 100;
        assertEquals(expectedDistance, calculatedDistance, tolerance);
    }

    @Test
    public void testParseFromString() {
        String s1 = "37.1 N, 55 W";
        EarthLocation expected = new EarthLocation(37.1, -55);
        EarthLocation actual = EarthLocation.parseFromString(s1);
        assertEquals(expected, actual);

        // String s2 = "37.1, -55";
    }

}