public class EarthLocation {

    // INSTANCE VARIABLES
    private double latitude;
    private double longitude;
    
    // CONSTRUCTOR(S)
    public EarthLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // overloaded constructor (generate a random location)
    public EarthLocation() {
        this.latitude = (Math.random() * 2 - 1)*90;
        this.longitude = (Math.random() * 2 - 1)*180;
    }

    // INSTANCE METHOD
    public String toString() {
        // make it look like this:
        // 37.6872° N, 97.3301° W
        String result = "";

        if (latitude < 0) {
            result += (latitude * -1);
            result += "° S";
        } else {
            result += latitude;
            result += "° N";
        }

        result += ", ";

        if (longitude < 0) {
            result += (longitude * -1);
            result += "° W";
        } else {
            result += longitude;
            result += "° E";
        }
        return result;
    }

    public static void main(String[] args) {
        final int NTESTS = 10;
        for (int test = 0; test < NTESTS; test++) {
            EarthLocation randLoc = new EarthLocation();
            System.out.println(randLoc);
        }
    }

    
}
