package ru.yatsko.springmvc.spring_boot_project.dao;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.yatsko.springmvc.spring_boot_project.model.User;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;


    public void add(User user) {
        entityManager.persist(user);
    }


    public void delete(Integer id) {
        User user = entityManager.find(User.class, id);
        if(user != null) {
            entityManager.remove(user);
        }
    }


    public List<User> getUsers() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }


    public void update(User user) {
        entityManager.merge(user);
    }


    public User getUserByID(Integer id) {
        return entityManager.find(User.class, id);
    }

}
