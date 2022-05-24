package services;

import models.Users;

import java.util.List;

public interface UserService {


    public Users getUsers(int id);

    public List<Users> getAllUsers();

    public Users addUser(Users u);

    public Users updateUser(Users change);

    public Users deleteUser(int id);







}
