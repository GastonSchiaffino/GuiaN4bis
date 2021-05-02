package com.company.VideoStore;

import java.util.Objects;

public class Movie {

    ///Atributos
    private Gender gender;
    private String title;
    private String dateLaunch;
    private int duration;
    private AudienceClassification audienceClassification;
    private String countryOrigin;
    private String description;
    private int amountCopies;

    ///Constructores
    public Movie(){
    }
    public Movie(Gender gender,String title, String dateLaunch, int duration, AudienceClassification audienceClassification, String countryOrigin, String description,int amountCopies){
        this.gender=gender;
        this.title=title;
        this.dateLaunch=dateLaunch;
        this.duration=duration;
        this.audienceClassification=audienceClassification;
        this.countryOrigin=countryOrigin;
        this.description=description;
        this.amountCopies=amountCopies;
    }

    ///Getter and Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateLaunch() {
        return dateLaunch;
    }

    public void setDateLaunch(String dateLaunch) {
        this.dateLaunch = dateLaunch;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public AudienceClassification getAudienceClassification() {
        return audienceClassification;
    }

    public void setAudienceClassification(AudienceClassification audienceClassification) {
        this.audienceClassification = audienceClassification;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAmountCopies() {
        return amountCopies;
    }

    public void setAmountCopies(int amountCopies) {
        this.amountCopies = amountCopies;
    }

    ///Metodos


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return title.equals(movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString(){
    return "Genero: " + this.gender + "|| Titulo: " + this.title + "|| Lanzamiento: " + this.dateLaunch +
            "|| Duracion: " + this.duration + "|| Clasificación: " + this.audienceClassification + "|| Pais de Origen: "
            + countryOrigin + "|| Descripcion: " + this.description + "|| Copias: " + this.amountCopies;
    }


}
