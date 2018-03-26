package com.musicbox.dao;

import com.musicbox.model.Like;

import java.util.List;

public interface LikeDao {

    void addLike(Like like);

    void removeById(Long id);

    Like getById(Long id);

    List<Like> getAll();
}
