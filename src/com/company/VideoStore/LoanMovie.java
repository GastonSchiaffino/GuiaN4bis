package com.company.VideoStore;


import java.time.LocalDate;

public class LoanMovie {
    ///Atributos
    private Movie rentedMovie;
    private LocalDate retirementDate;
    private LocalDate returnDate;

    ///Constructores
    public LoanMovie(){};

    public LoanMovie(Movie rentedMovie,LocalDate retirementDate,LocalDate returnDate){
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

    public LocalDate getRetirementDate() {
        return retirementDate;
    }

    public void setRetirementDate(LocalDate retirementDate) {
        this.retirementDate = retirementDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    ///Metodos
    @Override
    public String  toString(){
       return  "|| Pelicula Alquilada: " + this.rentedMovie.getTitle() +
               "|| Fecha de retiro: " + this.retirementDate + "|| Fecha de devolucion: " + this.returnDate;
    }

}
