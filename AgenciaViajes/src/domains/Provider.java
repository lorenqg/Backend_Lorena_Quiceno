package domains;

import domains.abstracts.User;

public class Provider{
    private int providerId;
    private String platform;

    public Provider(){}

    public Provider(int providerId, String platform){
        this.providerId = providerId;
        this.platform = platform;
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void infoProvider(){
        System.out.printf("El proveedor No. %s es %s \n", getProviderId(), getPlatform());
    }
}
