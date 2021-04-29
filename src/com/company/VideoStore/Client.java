package com.company.VideoStore;

import java.util.List;

public class Client {

    //Atribbuto
    private String name;
    private double phone;
    private String direction;


    ///Constructores
    public Client(){
    }
    public Client(String name, double phone, String direction){
        this.name=name;
        this.phone=phone;
        this.direction=direction;
    }

    ///Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }


///Metodos
    public String printClient(){
        return "Nombre: " + this.name + "|| Telefono: " + this.phone + "|| Direccion: " + this.direction;

    }
}
