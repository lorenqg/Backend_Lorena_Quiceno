package domains;

public class Trip {
    private int tripId;
    private String nameCity;

    public Trip(){}

    public Trip(int tripId, String nameCity){
        this.tripId = tripId;
        this.nameCity = nameCity;
    }

    // Getters
    public int getTripId() {
        return tripId;
    }

    public String getNameCity() {
        return nameCity;
    }

    // Setters
    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public void infoTrip(){
        System.out.printf("El viaje No. %s es a %s \n", getTripId(), getNameCity());
    }

}
