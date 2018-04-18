package com.musicbox.dao;

import com.musicbox.model.Like;
import com.musicbox.model.Track;
import com.musicbox.model.User;

import java.util.List;

public interface LikeDao {

    void addLike(Like like, Long track_id);

    void removeById(Long id, Like like);

    Like getById(Long id);

    List<Like> getAll();

    List<Track>getLikesByUser(User user);
}
