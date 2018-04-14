package com.musicbox.dao;


import com.musicbox.model.Like;
import com.musicbox.model.Track;
import com.musicbox.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class LikeDaoImpl implements LikeDao{

    @Autowired
    EntityManager entityManager;



    @Override
    public void addLike(Like like, Long track_id, long user_id) {
        user_id = 5;
        Track track = entityManager.find(Track.class, track_id);
        User user = entityManager.find(User.class, user_id);
        like.setTrack(track);
        like.setUser(user);
        entityManager.persist(like);

    }

    @Override
    public void removeById(Long id, Like like) {
//        Track track = entityManager.find(Track.class,id);
//        entityManager.remove(like);

    }

    @Override
    public Like getById(Long id) {
        return null;
    }

    @Override
    public List<Like> getAll() {
        return null;
    }

    @Override
    public List<Track> getByUser(User user) {
        return null;
    }
}
