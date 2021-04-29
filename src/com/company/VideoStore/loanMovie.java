package com.company.VideoStore;

import java.util.List;

public class loanMovie extends Client{
    ///Atributos
    private Movie rentedMovie;
    private String retirementDate;
    private String returnDate;

    ///Constructores
    public loanMovie(){
        super();
    }

    public loanMovie(String name, double phone, String direction, String retirementDate,String returnDate, Movie rentedMovie){
        super(name, phone,direction);
        this.retirementDate=retirementDate;
        this.returnDate=returnDate;
        this.rentedMovie=rentedMovie;
    }

    /// Getters And Setters
    public Movie getRentedMovies() {
        return rentedMovie;
    }

    public void setRentedMovies(Movie rentedMovie) {
        this.rentedMovie = rentedMovie;
    }

    public String getRetirementDate() {
        return retirementDate;
    }

    public void setRetirementDate(String retirementDate) {
        this.retirementDate = retirementDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    ///Metodos
    public String  printLoanMovie(){

       return  super.printClient()  + "|| Pelicula Alquilada: " + rentedMovie.getTitle() + "|| Fecha de retiro: " + this.retirementDate + "|| Fecha de devolucion: " + this.returnDate;
    }
}
