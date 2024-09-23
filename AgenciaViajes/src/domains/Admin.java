package domains;

import domains.abstracts.User;

public class Admin extends User {
    private String rol;

    public Admin(){}

    public Admin(int id, String name, String lastName, String bornDate, String address,
                 String phoneNumber, String rol){
        super(id, name, lastName, bornDate, address, phoneNumber);
        this.rol = rol;
    }

    // Getter
    public String getRol() {
        return rol;
    }

    // Setter
    public void setRol(String rol) {
        this.rol = rol;
    }

    // Method
    @Override
    public void infoUser() {
        System.out.printf("Admin No. %s \n %s %s. \n Fecha de nacimiento: %s. \n Dirección: %s. \n Teléfono: %s. \n Rol: %s \n",
                getId(), getName(), getLastName(), getBornDate(), getAddress(), getPhoneNumber(), getRol());
    }
}
