package com.example.lab1.bean;

import java.util.HashMap;
import java.util.List;

public class Ahorcado {



    private int num;
    private int longitud;
    private HashMap<String, List<String> >temas;


    public Ahorcado(int num, int longitud, List<String> temas) {
        this.num = num;
        this.longitud = longitud;
        this.temas = new HashMap<>();
        this.temas.put("Animales" , List.of("leon", "elefante","tigre","cebra","jirafa","delfin"));
        this.temas.put("Frutas",List.of("manzana", "platano","kiwi","mango","pera","uva"));
        this.temas.put("Paises", List.of("Mexico", "Canada","Brasil","Espana","Francia"));
    }

    public Ahorcado() {

    }
}
