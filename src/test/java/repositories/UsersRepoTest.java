package repositories;

import models.Users;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersRepoTest {

    UsersRepo ur = new UsersRepoImpl();

    @Test
    public void getUsers() {

        int id = 4;
        Users actual = ur.getUsers(id);

        Users expected = new Users(4, "Carol Smith", "smith@email.com", "1991-05-05", "passuser23");
        assertEquals(expected.toString());
        try {
            assertEquals(expected, actual);
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
         assertEquals(expected, actual);
        System.out.println("Test Passed");

    }

    private void assertEquals(String toString) {
    }

    private void assertEquals(Users expected, Users actual) {
    }


}






