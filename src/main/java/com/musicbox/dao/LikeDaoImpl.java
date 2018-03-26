package com.musicbox.dao;

import com.musicbox.model.Like;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LikeDaoImpl implements LikeDao {
    @Override
    public void addLike(Like like) {

    }

    @Override
    public void removeById(Long id) {

    }

    @Override
    public Like getById(Long id) {
        return null;
    }

    @Override
    public List<Like> getAll() {
        return null;
    }
}
