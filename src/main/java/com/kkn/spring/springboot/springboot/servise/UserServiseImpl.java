package com.kkn.spring.springboot.springboot.servise;

import com.kkn.spring.springboot.springboot.dao.UserDao;
import com.kkn.spring.springboot.springboot.model.User;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiseImpl implements UserServise {

    private final UserDao userDao;

    public UserServiseImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public List<User> allUsers() {
        return userDao.allUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);

    }

    @Override
    @Transactional
    public User getById(int id) {
        return userDao.getById(id);
    }

    @Override
    @Transactional
    public void update(long id, User user) {
        userDao.update(id, user);

    }

    @Override
    @Transactional
    public void delete(int id) {
        userDao.delete(id);

    }
}
