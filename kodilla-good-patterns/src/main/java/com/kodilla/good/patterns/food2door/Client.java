package com.kodilla.good.patterns.food2door;

public class Client {
    private String clientName;
    private String clientSurname;
    private String clientAdress;

    public Client(String clientName, String clientSurname, String clientAdress) {
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.clientAdress = clientAdress;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public String getClientAdress() {
        return clientAdress;
    }
}
