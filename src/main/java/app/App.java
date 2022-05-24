package app;

import controllers.UsersController;
import io.javalin.Javalin;
import io.javalin.jetty.JettyUtil;
import repositories.UsersRepo;
import repositories.UsersRepoImpl;
import services.UserService;
import services.UserServiceImpl;
import io.javalin.http.util.ContextUtil;

public class App {

    public static void main(String[] args) {

        JettyUtil.logDuringStartup = false;


        Javalin app = Javalin.create(config -> config.enableCorsForAllOrigins());

        establishRoutes(app);


        app.start();


    }


    private static void establishRoutes(Javalin app){
        UsersRepo ur = new UsersRepoImpl();
        UserService us = new UserServiceImpl(ur);
        UsersController uc = new UsersController(us);

        app.get("/hello",(context) -> context.result("Hello World"));
        app.get("/hello2", new HelloHandler());

        app.get("/users", uc.getAllUsers);
        app.get("/users/{id}", uc.getUsers);
        app.post("/users", uc.addUser);
        app.put("/users/{id}", uc.updateUser);
        app.delete("/users/{id}", uc.deleteUser);

    }

}
