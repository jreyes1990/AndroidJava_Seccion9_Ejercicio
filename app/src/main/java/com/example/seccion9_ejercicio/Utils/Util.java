package com.example.seccion9_ejercicio.Utils;

import com.example.seccion9_ejercicio.Models.Mail;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Util {
  public static String[] colors = new String[]
          { "F44336", "E91E63", "9C27B0", "673AB7", "3F51B5",
            "03A9F4", "00968B", "4CAF50", "CDDC39", "FFC107",
            "FF5722", "795548", "9E9E9E", "455A64", "FF5722" };

  public static List<Mail> getDummyData(){
    return new ArrayList<Mail>(){
      {
        add(new Mail("Presupuesto 2017", "Hola Alejandro", "Este es el presupuesto para el anio 2017 del que me mencionaste en la reunion de ayer"));
        add(new Mail("Cena Empresa", "Queridos amigos", "La cena de la empresa de este anio sera en el mismo restaurante que los anios pasados"));
        add(new Mail("Partido Tenis", "Querido Alex", "Cuando dijiste que ibamos a ir a jugar ese torneo de tenis"));
        add(new Mail("Oferta de empleo", "Android Developer", "Hola, estamos buscando desarrolladores Android sin experiencia"));
        add(new Mail("Cursos 2017", "Cuniado", "He visto unos cursos muy interesantes sobre programacion. Pasate por la casa hoy y le echamos un vistazo"));
        add(new Mail("Conferencia de lectores", "El lugar", "El lugar elegido para la conferencia de lectores internacional celebrada el dia 29 de Febrero"));
        add(new Mail("Propositos anio nuevo", "Participa en nuestra dinamica encuesta para propuesta de anio nuevo", "jreyes@gmail.com"));
        add(new Mail("Valora este formulario", "Valor", "Valora este formulario que te adjunto Bro"));
      }
    };
  }

  public static String getRandomColor(){
    // Numero aleatorio entre [0] y [14]
    int randomNumber = new Random().nextInt(colors.length) + 0;

    // Devolvemos el color
    return colors[randomNumber];
  }
}
