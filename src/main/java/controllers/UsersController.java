package controllers;

import com.google.gson.Gson;
import io.javalin.http.Handler;
import models.Users;
import services.UserService;

import java.util.List;

public class UsersController {

    private UserService us;
    private Gson gson = new Gson();

    public UsersController(UserService us) {
        this.us = us;

    }

    public Handler getAllUsers = (context) -> {

        List<Users> users = us.getAllUsers();
        String usersJSON = gson.toJson(users);

        context.result(usersJSON);



    };

    public Handler getUsers= (context) -> {

       int id = Integer.parseInt(context.pathParam("id"));


       Users u = us.getUsers(id);
       context.result(gson.toJson(u));

    };
     public Handler addUser = (context) -> {
         Users u = gson.fromJson(context.body(),Users.class);

         u = us.addUser(u);
         context.result(gson.toJson(u));

     };




}
