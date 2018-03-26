package com.musicbox.dao;

import com.musicbox.model.Like;
import com.musicbox.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void addUser(User user) {

    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public List<User> getAll() {

        return entityManager.createNativeQuery("SELECT * FROM USERS").getResultList();
    }

    @Override
    public List<Like> getLikesByUserId(Long id) {
        return null;
    }
}
