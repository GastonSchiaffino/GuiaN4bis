package com.company.VideoStore;

import java.util.List;

public class Store {
    //Atributos
    private List<Movie> listMovie;
    private List<Client> listClient;

    //Constructores
    public Store(){
    }
    public Store(List<Movie> listMovie, List<Client> listClient){
        this.listMovie=listMovie;
        this.listClient=listClient;
    }
    ///Getters Ans Setters

    public List<Movie> getListMovie() {
        return listMovie;
    }

    public void setListMovie(List<Movie> listMovie) {
        this.listMovie = listMovie;
    }

    public List<Client> getListClient() {
        return listClient;
    }

    public void setListClient(List<Client> listClient) {
        this.listClient = listClient;
    }
    //Metodos
    public void searchMovie(String title){
        for(Movie m: listMovie){
            if(title.equals(m.getTitle()))
                System.out.println(m.toString());
        }
    }
    //Stream
       /* Movie searchMovie = Movies.stream()
                .filter(x->x.getTitle()==title)
                .findFirst()
                .orElse(null);
        if(searchMovie!=null)
        System.out.println(searchMovie.toString());*/


    public void rentalMovie(){
        if(listClient!=null) {
            for(Client c: this.listClient) {
                c.rentalMoviesCurrent();
            }
        }
    }

    public void returnMovie(){
        if(listClient!=null) {
            for(Client c: this.listClient) {
                c.returnMoviesNow();
            }
        }
    }
}
