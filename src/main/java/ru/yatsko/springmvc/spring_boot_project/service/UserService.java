package ru.yatsko.springmvc.spring_boot_project.service;



import ru.yatsko.springmvc.spring_boot_project.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void delete(Integer id);
    void update(User user);
    List<User> getUsers();
    User getUserByID(Integer id);
}
