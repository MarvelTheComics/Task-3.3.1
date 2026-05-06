package ru.yatsko.springmvc.spring_boot_project.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.yatsko.springmvc.spring_boot_project.dao.UserDao;
import ru.yatsko.springmvc.spring_boot_project.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService{
    private UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        userDao.delete(id);
    }

    @Transactional
    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Transactional
    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Transactional
    @Override
    public User getUserByID(Integer id) {
        return userDao.getUserByID(id);
    }
}
