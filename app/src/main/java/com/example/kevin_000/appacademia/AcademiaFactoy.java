package com.example.kevin_000.appacademia;

/**
 * Created by kevin_000 on 20/08/2017.
 */

public class AcademiaFactoy {

    public Academia GetAcademia(String tipo,String nombre, String id){

        if( tipo == "estudiante"){

            return new Estudiante(nombre,id);

        }
        if( tipo == "profesor"){

            return new Profesor(nombre,id);

        }
        if( tipo == "administrativo"){

            return new Administrativo(nombre,id);

        }

        return null;

    }





}
