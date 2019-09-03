package com.tecsup.lab01.controller;
import com.tecsup.lab01.model.User;

/**
 * Hello world!
 *
 */
public class UserController 
{
    User persona;

    public String datos(){
        persona = new User();
        
        persona.nombres = "Edwin William";
        persona.apellidoPaterno="Arevalo";
        persona.edad =20 ;

        return("Nombre: "+persona.nombres+" Apellido: "+persona.apellidoPaterno+" Edad: "+persona.edad);
    }

    public static void main( String[] args )
    {
        
    }
}
