package services;

import models.Users;
import repositories.UsersRepo;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UsersRepo ur;

    public UserServiceImpl(UsersRepo ur){
        this.ur = ur;
    }

    @Override
    public Users getUsers(int id) {
        return ur.getUsers(id);
    }

    @Override
    public List<Users> getAllUsers() {
        return ur.getAllUsers();
    }

    @Override
    public Users addUser(Users u) {
        return ur.addUser(u) ;
    }

    @Override
    public Users updateUser(Users change) {
        return ur.updateUser(change);
    }

    @Override
    public Users deleteUser(int id) {
        return ur.deleteUser(id);
    }
}
