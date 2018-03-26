package com.musicbox.service;

import com.musicbox.dao.UserDao;
import com.musicbox.model.Like;
import com.musicbox.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {

    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public List<User> getAll() {

        return userDao.getAll();
    }

    @Override
    public List<Like> getLikesByUserId(Long id) {
        return null;
    }
}
