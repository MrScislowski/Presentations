import java.util.Scanner;

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
        this.latitude = (Math.random() * 2 - 1) * 90;
        this.longitude = (Math.random() * 2 - 1) * 180;
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
                        Math.sin(lat1) * Math.sin(lat2) +
                                Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));

        return resultingDistance;
    }

    public static EarthLocation parseFromString(String s) {
        // 0123456789
        // 37.6872° N, 97.3301° W
        boolean isNorth = true;
        int afterLatIndex = s.indexOf("N");
        if (afterLatIndex == -1) {
            afterLatIndex = s.indexOf("S");
            isNorth = false;
        }
        int endOfLat = afterLatIndex;
        while (stringIsNumber(s.substring(endOfLat, endOfLat+1)) == false) {
            endOfLat--;
        }
        String latString = s.substring(0, endOfLat + 1);


        int startOfLonIndex = afterLatIndex;
        while (stringIsNumber(s.substring(startOfLonIndex, startOfLonIndex+1)) == false) {
            startOfLonIndex++;
        }

        boolean isEast = true;
        int afterLonIndex = s.indexOf("E");
        if (afterLonIndex == -1) {
            afterLonIndex = s.indexOf("W");
            isEast = false;
        }
        int endOfLon = afterLonIndex;
        while (stringIsNumber(s.substring(endOfLon, endOfLon+1)) == false) {
            endOfLon--;
        }
        String lonString = s.substring(startOfLonIndex, endOfLon + 1);

        double actualLatitude = Double.parseDouble(latString);
        if (!isNorth) {
            actualLatitude *= -1;
        }
        
        double actualLongitude = Double.parseDouble(lonString);
        if (!isEast) {
            actualLongitude *= -1;
        }
        return new EarthLocation(actualLatitude, actualLongitude);
    }

    private static boolean stringIsNumber(String s) {
        
        if (s.equals("0") ||
        s.equals("1") ||
        s.equals("2") ||
        s.equals("3") ||
        s.equals("4") ||
        s.equals("5") ||
        s.equals("6") ||
        s.equals("7") ||
        s.equals("8") ||
        s.equals("9")) {
            return true;
        } else {
            return false;
        }
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

        // EarthLocation kc = 39.0997° N, 94.5786° W;
        // EarthLocation ict = 37.6872° N, 97.3301° W;

        // EarthLocation kc = new EarthLocation(39.0997, -94.5786);
        // EarthLocation ict = new EarthLocation(37.6872, -97.3301);

        Scanner s = new Scanner(System.in);

        System.out.println("Please enter your first location geographic coordinates");
        ;
        // some scanner stuff
        String loc1String = s.nextLine();

        

        EarthLocation loc1 = parseFromString(loc1String);
        System.out.println("Please enter your second location geographic coordinates");
        ;
        // more scanner stuff
        String loc2String = s.nextLine();
        EarthLocation loc2 = parseFromString(loc2String);

        System.out.println("your locations are: ");
        System.out.println(loc1);
        System.out.println(loc2);

        System.out.println("Distance between these locations: ");
        System.out.println(loc1.distanceTo(loc2));

    }

}

// javac EarthLocation.java; java EarthLocation
