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

    // INSTANCE METHODS
    // accessor methods
    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    // mutator methods
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double distanceTo(EarthLocation other) {
        // radius of earth in miles
        final double rE = 3963.0;

        double lat1 = Math.toRadians(this.latitude);
        double lat2 = Math.toRadians(other.latitude);
        double lon1 = Math.toRadians(this.longitude);
        double lon2 = Math.toRadians(other.longitude);

        // great circle formula
        double resultingDistance = rE * 
            Math.acos(
                Math.sin(lat1)*Math.sin(lat2) +
                Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1-lon2)
            );
        
        return resultingDistance;
    }

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

        // EarthLocation kc = 39.0997° N, 94.5786° W;
        EarthLocation kc = new EarthLocation(39.0997, -94.5786);
        EarthLocation ict = new EarthLocation(37.6872, -97.3301);

        System.out.println("Distance from wichita to kc is: ");
        System.out.println(ict.distanceTo(kc));

    }

    
}
