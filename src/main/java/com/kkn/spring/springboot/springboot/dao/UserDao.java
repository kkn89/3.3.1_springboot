package com.kkn.spring.springboot.springboot.dao;


import com.kkn.spring.springboot.springboot.model.User;

import java.util.List;

public interface UserDao {
    List<User> allUsers();

    void saveUser(User user);

    User getById(int id);

    void update(long id, User user);

    void delete(int id);
}
