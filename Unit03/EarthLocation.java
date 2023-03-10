import java.util.Scanner;

public class EarthLocation {
    // STATIC VARIABLES
    // radius of earth in miles
    private static final double rE = 3963.0;
    private static int numLocationsCreated = 0;

    // INSTANCE VARIABLES
    private double latitude;
    private double longitude;

    // CONSTRUCTOR(S)
    public EarthLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;

        numLocationsCreated++;
    }

    // overloaded constructor (generate a random location)
    public EarthLocation() {
        this.latitude = (Math.random() * 2 - 1) * 90;
        this.longitude = (Math.random() * 2 - 1) * 180;
    }

    // INSTANCE METHODS
    // accessor methods
    public static int getNumberOfLocationsCreated() {
        return numLocationsCreated;
    }

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
            if (afterLatIndex == -1) {
                System.err.println("Could not parse String... here's an example:");
                System.err.println("37.6872° N, 97.3301° W");

                return null;
            }

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
            if (afterLonIndex == -1) {
                System.err.println("Could not parse String... here's an example:");
                System.err.println("37.6872° N, 97.3301° W");

                return null;
            }
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

    public boolean equals(Object otherJank) {
        if (this == otherJank) {
            return true;
        }

        if (otherJank == null) {
            return false;
        }

        if (this.getClass() != otherJank.getClass()) {
            return false;
        }

        EarthLocation other = (EarthLocation) otherJank;

        if (this.latitude == other.latitude &&
            this.longitude == other.longitude) {
                return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        // EarthLocation kc = 39.0997° N, 94.5786° W;
        // EarthLocation ict = 37.6872° N, 97.3301° W;

        // EarthLocation kc = new EarthLocation(39.0997, -94.5786);
        // EarthLocation ict = new EarthLocation(37.6872, -97.3301);

        Scanner s = new Scanner(System.in);

        String usrResponse = "y";

        EarthLocation earthOrigin = new EarthLocation(0, 0);
        EarthLocation earthOrigin2 = EarthLocation.parseFromString("1 N, 7 E");

        while (usrResponse.equals("y")) {
            System.out.println("Please enter your first location geographic coordinates");
        
            String loc1String = s.nextLine();
            EarthLocation loc1 = parseFromString(loc1String);
            if (loc1 == null) {
                System.out.println("Hey, sorry about that. Couldn't parse your string");
            }
    
            System.out.println("Please enter your second location geographic coordinates");
            String loc2String = s.nextLine();
            EarthLocation loc2 = parseFromString(loc2String);
            if (loc2 == null) {
                System.out.println("Hey, sorry about that. Couldn't parse your string");
            }
    
            if (loc1 != null && loc2 != null) {
                System.out.println("Distance between these locations: ");
                System.out.println(loc1.distanceTo(loc2));
            }
            

            System.out.println("Type 'y' if you would like to enter another location pair");
            usrResponse = s.nextLine();
        }

        System.out.println("In your session, you created " + getNumberOfLocationsCreated() + " locations");
        

    }

}

// javac EarthLocation.java; java EarthLocation
