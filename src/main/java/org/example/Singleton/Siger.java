package org.example.Singleton;

public class Siger {
    private Siger(){}
    private static Siger instance = new Siger();
    public static Siger getInstance(){
        return instance;
    }
    private String version;
    private int maxReservation;

    public String getVersion(){
        return version;
    }
    public int getMaxReservation(){
        return maxReservation;
    }
    public void setVersion(String version){
        this.version = version;
    }
    public void setMaxReservation(int maxReservation){
        this.maxReservation = maxReservation;
    }
}
