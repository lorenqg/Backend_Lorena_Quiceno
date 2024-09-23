package domains;

import domains.abstracts.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client extends User {
    private List<String> destinations;

    public Client(){}

    public Client(int id, String name, String lastName, String bornDate, String address,
                  String phoneNumber
                  ){
        super(id, name, lastName, bornDate, address, phoneNumber);
        this.destinations = new ArrayList<>();
    }

    @Override
    public void infoUser() {
        System.out.printf("Cliente No. %s \n %s %s. \n Fecha de nacimiento: %s. \n Dirección: %s. \n Teléfono: %s. \n",
                getId(), getName(), getLastName(), getBornDate(), getAddress(), getPhoneNumber());
    }

    public void addDestination(String destination){
        destinations.add(destination);
    }

    public void showDestinations(){
        System.out.printf("Destinos: %s \n", getDestinations());
    }

    public List<String> getDestinations() {
        return destinations;
    }
}
