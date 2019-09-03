package com.tecsup.lab01.view;
import com.tecsup.lab01.controller.UserController;


/**
 * Hello world!
 *
 */
public class UserView 
{
    public static void main( String[] args )
    {
        UserController user = new UserController();
        System.out.println(user.datos());
    }
}
