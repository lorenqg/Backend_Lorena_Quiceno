package domains;

import domains.abstracts.User;

public class TravelManager extends User {
    private String position;

    public TravelManager(){}

    public TravelManager(int id, String name, String lastName, String bornDate, String address,
                 String phoneNumber, String position){
        super(id, name, lastName, bornDate, address, phoneNumber);
        this.position = position;
    }

    @Override
    public void infoUser() {
        System.out.printf("Agente de Viaje No. %s \n %s %s. \n Fecha de nacimiento: %s. \n Dirección: %s. \n Teléfono: %s. \n Puesto: %s \n",
                getId(), getName(), getLastName(), getBornDate(), getAddress(), getPhoneNumber(), getPosition());
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
