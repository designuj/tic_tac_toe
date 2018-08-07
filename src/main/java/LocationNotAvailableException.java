public class LocationNotAvailableException extends Exception {

    private int location;

    public LocationNotAvailableException(int location) {
        super("Location " + location + " is already taken.");
    }

    public int getLocation() {
        return location;
    }
}
