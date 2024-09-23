package services;

import domains.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Client cliente = new Client(1, "Pepito", "Perez", "02-11-2004", "Cra 82 #20-25",
                "250-000");
        cliente.addDestination("Perú");
        cliente.addDestination("Canadá");

        cliente.infoUser();
        cliente.showDestinations();

        System.out.println("-----------------------------------");

        Admin admin = new Admin(1, "Rosa", "Ramirez", "19-08-1986", "Cll 20 #15-02", "228-2983",
                "Administrador");
        admin.infoUser();

        System.out.println("-----------------------------------");

        TravelManager manager = new TravelManager(1, "Jose", "Rodriguez", "20-02-2000", "Cll 9 #02-12", "276-4672",
                "Vendedor");
        manager.infoUser();

        System.out.println("-----------------------------------");

        Provider provider = new Provider(1, "AirBnb");
        provider.infoProvider();
        Provider provider2 = new Provider(2, "Booking");
        provider2.infoProvider();
        provider2.setPlatform("Trivago");
        provider2.infoProvider();

        System.out.println("-----------------------------------");

        Trip trip = new Trip(1, "Santorini");
        trip.infoTrip();
        trip.setNameCity("Madrid");
        trip.infoTrip();

    }



}