package repositories;

import models.Users;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersRepoTest {

    UsersRepo ur = new UsersRepoImpl();

    @Test
    public void getUsers() {

        int id = 2;
        Users actual = ur.getUsers(id);

        Users expected = new Users(2, "user1", "user1@email.com", "1989-03-03", "passuser1");
        try {
            assertEquals(expected, actual);
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }


//        assertEquals("users: " + actual.toString() + " does not equal expected users: " + expected.toString(), expected.toString(), actual.toString());

}






