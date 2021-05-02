package com.company.VideoStore;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


public class Client {

    //Atribbuto
    private String name;
    private long phone;
    private String direction;
    private List<LoanMovie> listLoanMovies;


    ///Constructores
    public Client(){
    }
    public Client(String name, long phone, String direction, List<LoanMovie> listLoanMovies){
        this.name=name;
        this.phone=phone;
        this.direction=direction;
        this.listLoanMovies=listLoanMovies;
    }

    ///Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public List<LoanMovie> getListLoanMovies() {
        return listLoanMovies;
    }

    public void setListLoanMovies(List<LoanMovie> listLoanMovies) {
        this.listLoanMovies = listLoanMovies;
    }

    ///Metodos

    public void printClient(){
        System.out.println( "Nombre: " + this.name + "|| Telefono: " + this.phone + "|| Direccion: " + this.direction + "\nPrestamos: ");
        if(listLoanMovies!=null)
            listLoanMovies.forEach(System.out::println);
        else
            System.out.println("No tiene peliculas alquiladas");
    }

    ///Alquileres de Pelis Vigentes
    public void rentalMoviesCurrent () {
        LocalDate now = LocalDate.now();
        if (this.listLoanMovies != null) {
            boolean dev=false;
            for (LoanMovie m : this.listLoanMovies) {
                if (now.isBefore(m.getReturnDate())) {
                    System.out.println("Alquileres Vigentes: " + m.toString());
                    dev=true;
                }
            }
            if (dev==false)
            System.out.println("No hay Alquileres vigentes");
        }
    }

        ///Devoluciones del dia de la fecha
        public void returnMoviesNow() {
            LocalDate now = LocalDate.now();
            if (this.listLoanMovies != null) {
                boolean dev=false;
                for (LoanMovie m : this.listLoanMovies) {
                    if (now.equals(m.getReturnDate())) {
                        System.out.println("Devolucion que deben hacerse hoy: " + m.toString());
                        dev = true;
                    }
                }
                if (dev == false) {
                    System.out.println("No hay devoluciones");
                }
            } else
                System.out.println("No hay devoluciones");
        }


}
