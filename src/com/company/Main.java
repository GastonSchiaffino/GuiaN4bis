package com.company;

import com.company.VideoStore.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        ///Lista de peliculas
        List<Movie> Movies = new ArrayList<>();

        Movie movie1 = new Movie(Gender.DRAMA, "Titanic", "15 de agosto de 1999", 155, AudienceClassification.UNRATED,
                "Estados Unidos", "Rose no deja a Jack subirse a la tabla y el muere pudiendo haber subido re tranca",20);
        Movie movie2= new Movie(Gender.HORROR, "Annabelle", "3 de octubre de 2014", 98, AudienceClassification.R,
                "EEUU", "La muñeca Annabelle esta poseida",10);
        Movie movie3= new Movie(Gender.HORROR, "Insidius", "1 de abril de 2011", 102, AudienceClassification.PG_13,
                "EEUU", "Visitan a una familia que tiene contacto con entes paranormales",6);
        Movie movie4= new Movie(Gender.HORROR, "La llorona", "19 de abril de 2019", 93, AudienceClassification.NC_17,
                "EEUU", "La familia de un niño desaparece. Buscando a sus padres, el niño ve a su madre ahogando a su hermano.",2);
        Movie movie5= new Movie(Gender.ACTION, "Avengers: Endgame", "22 de abril de 2019", 181, AudienceClassification.PG_13,
                "EEUU", "Thanos obtiene las gemas del infito, los vengadores podran detenerlo?",88);
        Movie movie6= new Movie(Gender.ACTION, "Francotirador", "11 de noviembre de 2014", 132, AudienceClassification.R,
                "EEUU", "Chris Kyle es enviado a Irak con las mision de proteger a sus compañeros. Tiene el " +
                "record de muertes con francotirador.",5);
        Movie movie7= new Movie(Gender.ACTION, "Plan de escape", "18 de octubre de 2013", 115, AudienceClassification.R,
                "EEUU", "Ray Breslin experto en fugas es contratado por una de las carceles con mayor seguridad para probar su sistema antiescapes.",8);
        Movie movie8= new Movie(Gender.COMEDY, "Una esposa de mentira", "11 de febrero de 2011", 117, AudienceClassification.G,
                "EEUU", "Danny hace pasar a su asistente como su ex-esposa para sorprender a su prometida. Emprenden un viaje que no termina " +
                "como esperaban.",12);
        Movie movie9= new Movie(Gender.COMEDY, "Quiero matar a mi jefe", "24 de agosto de 2011", 98, AudienceClassification.G,
                "EEUU", "Un grupo de amigos no soportan el trato de sus jefes y planea asesinarlos para librarse de ellos.",3);
        Movie movie10= new Movie(Gender.COMEDY, "Que paso ayer?", "5 de junio de 2009", 100, AudienceClassification.R,
                "EEUU", "Tres amigos emprenden un viaje a las vegas. El problema que al despertar al dia siguiente no recuerdan nada de lo sucedido",5);
        Movie movie11= new Movie(Gender.DRAMA, "Parasite", "30 de mayo de 2019",132, AudienceClassification.R,"Corea Del Sur", "Tanto Gi Taek como su familia están sin trabajo. " +
                        "Cuando su hijo mayor, Gi Woo, empieza a impartir clases particulares en la adinerada casa de los Park, las dos familias, que tienen mucho en común pese a pertenecer a dos mundos totalmente distintos, " +
                        "entablan una relación de resultados imprevisibles.",3);
        Movie movie12= new Movie(Gender.DRAMA, "Sully: Hazaña en el Hudson", "2 de septiembre de 2016",96 ,AudienceClassification.PG_13,"Estados Unidos", "La historia real del capitán Chesley \"Sully\" Sullenberger, un piloto que se convirtió " +
                        "en un héroe al realizar un amerizaje de emergencia en el río Hudson en su desembocadura en la ciudad de Nueva York el 15 de enero de 2009, salvando la vida de los 155 pasajeros, la tripulación, y de las posibles víctimas que hubiera provocado un accidente " +
                        "sobre la urbe.",2 );
        Movie movie13= new Movie(Gender.DOCUMENTARY,"Anna Frack","3 de febrero de 2020", 95, AudienceClassification.NC_17, "Rusia","La actriz Helen Mirren repasa la vida de Ana Frank por las páginas de su diario y " +
                       "habla de las vidas de cinco mujeres que también fueron deportadas a campos de concentración pero lograron sobrevivir.",1);
        Movie movie14= new Movie(Gender.DOCUMENTARY, "El dilema de las redes sociales", " 26 de enero de 2020", 94, AudienceClassification.PG, "Estados Unidos","Expertos en tecnología de Silicon Valley hacen sonar la alarma " +
                        "sobre el peligroso impacto de las redes sociales, que Big Tech utiliza en un intento de manipular e influir.",4 );
        Movie movie15= new Movie(Gender.DOCUMENTARY, "Apollo 11", "1 de marzo de 2019",93, AudienceClassification.G,"Estados Unidos","Imágenes nunca antes vistas de la misión más célebre de la NASA: los astronautas Neil Armstrong, " +
                        "Buzz Aldrin y Michael Collins se embarcan en un viaje histórico a la Luna.", 2 );
        Movie movie16= new Movie(Gender.ADVENTURE,"Coco", "27 de octubre de 2017", 109, AudienceClassification.PG, "Mexico","Miguel es un niño que sueña con ser músico, pero su familia se lo prohíbe porque su tatarabuelo, músico, los abandonó, " +
                        "y quieren obligar a Miguel a ser zapatero, como todos los miembros de la familia.", 8);
        Movie movie17= new Movie(Gender.ADVENTURE, "El rey león", "9 de julio de 2019", 118, AudienceClassification.PG, "Estados Unidos", "Un joven príncipe león huye de su reino solo para aprender " +
                         "el verdadero significado de la responsabilidad y la valentía.", 6 );
        Movie movie18= new Movie(Gender.ADVENTURE, "Mulán", "25 de marzo de 2020", 120, AudienceClassification.PG_13, "Suiza", "El emperador chino emite un decreto que exige reclutar a un varón de cada familia para luchar con el ejército imperial. " +
                        "Para salvar a su anciano padre de este deber, su única hija Fa Mulán se hace pasar por soldado y toma su lugar.", 3);

        Movies.add(movie1);Movies.add(movie2);Movies.add(movie3);Movies.add(movie4);Movies.add(movie5);Movies.add(movie6);Movies.add(movie7);Movies.add(movie8);
        Movies.add(movie9);Movies.add(movie10);Movies.add(movie11);Movies.add(movie12);Movies.add(movie13);Movies.add(movie14);Movies.add(movie15);
        Movies.add(movie16);Movies.add(movie17);Movies.add(movie18);

        //Movies.forEach(System.out::println);

        ///Lista de prestamos
        List <LoanMovie> listaLoanMovie= new ArrayList<>();
        List <LoanMovie> listaLoanMovie2= new ArrayList<>();

        LocalDate fecha = LocalDate.of(2021,4,29);
        LocalDate fecha2 = LocalDate.of(2021,5,2);
        LocalDate fecha3 = LocalDate.now();
        LocalDate fecha4 = LocalDate.of(2021,4,3);

        LoanMovie loanMovie1= new LoanMovie(movie4,fecha,fecha2);
        LoanMovie loanMovie2= new LoanMovie(movie8,fecha4, fecha3);
        LoanMovie loanMovie3= new LoanMovie(movie18,fecha2, fecha4);
        LoanMovie loanMovie4= new LoanMovie(movie9,fecha2, fecha4);
        LoanMovie loanMovie5= new LoanMovie(movie11,fecha, fecha3);
        LoanMovie loanMovie6= new LoanMovie(movie12,fecha2, fecha4);
        LoanMovie loanMovie7= new LoanMovie(movie14,fecha2, fecha4);

         listaLoanMovie.add(loanMovie1); listaLoanMovie.add(loanMovie2); listaLoanMovie.add(loanMovie3); listaLoanMovie2.add(loanMovie4);
         listaLoanMovie2.add(loanMovie5); listaLoanMovie2.add(loanMovie6); listaLoanMovie2.add(loanMovie7);

        ///Clientes
        List<Client> listclients=new ArrayList<>();
        Client client= new Client("Lucas", 154977520, "Costa azul 4608", listaLoanMovie);
        Client client1= new Client("Gaston", 155966522, "Tucuman 2370", listaLoanMovie2);

        listclients.add(client); listclients.add(client1);

      /*  for(Client c:listclients){
            c.printClient();
        }*/

        // Buscar por titulo
       String title = "Titanic";
       Store store = new Store(Movies,listclients);
     //  store.searchMovie(title);

       store.rentalMovie();
       store.returnMovie();



    }
}
