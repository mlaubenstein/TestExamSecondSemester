public class Aufgabe5point1 {

    private double longitude,latitude,elevation;

    Aufgabe5point1(double longitude, double latitude, double elevation){
        this.longitude = longitude;
        this.latitude = latitude;
        this.elevation = elevation;
    }

    Aufgabe5point1(double longitude, double latitude){
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double getElevation() {
        return this.elevation;
    }

    public double getLongitude(){
        return this.longitude;
    }

    public double getLatitude(){
        return this.latitude;
    }

    public double getVerticalDistance(){
        return this.longitude-longitude;
    }

}
