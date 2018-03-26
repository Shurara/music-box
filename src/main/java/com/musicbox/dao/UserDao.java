package com.musicbox.dao;

import com.musicbox.model.Like;
import com.musicbox.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    User getById(Long id);

    List<User> getAll();

    List<Like> getLikesByUserId(Long id);
}
