package testgroup.Task_231.dao;

import testgroup.Task_231.model.User;

import java.util.List;

public interface UserDAO {

    List<User> allUsers();

    void add(User user);

    void delete(User user);

    void edit(User user);

    User getById(int id);
}
