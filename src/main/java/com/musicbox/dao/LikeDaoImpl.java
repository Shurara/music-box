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
    public void addLike(Like like, Long track_id) {

        Track track = entityManager.find(Track.class, track_id);
        like.setTrack(track);
        entityManager.persist(like);

    }

    @Override
    public void removeById(Long id, Like like) {
        Track track = entityManager.find(Track.class,id);
        entityManager.remove(like);

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
