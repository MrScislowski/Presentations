public class EarthLocation {

    // INSTANCE VARIABLES
    private double latitude;
    private double longitude;
    
    // CONSTRUCTOR
    public EarthLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
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
        EarthLocation wichita = new EarthLocation(37.6872, -97.3301);
        System.out.println(wichita);
    }

    
}
