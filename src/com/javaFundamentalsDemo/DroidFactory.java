package com.javaFundamentalsDemo;

public class DroidFactory {
    private String serialNumber;

    Model model = new Model("Astromech", "Starship repair/support");


    public DroidFactory(String serialNumber){
        this.serialNumber = serialNumber;
    }

    public String speak (String serialNumber){
        return serialNumber + " is speaking now.";
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    @Override
    public String toString() {
        return "Droid{" +
                "serialNumber='" + serialNumber + '\''+
                '}';
    }
}
