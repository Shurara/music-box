package com.musicbox.service;

import com.musicbox.model.Like;
import com.musicbox.model.Track;
import com.musicbox.model.User;

import java.util.List;

public interface LikeService {

  void addLike(Like like, Long track_id, Long user_id);

  void removeById(Long id);

  Like getById(Long id);

  List<Like> getAll();

  List<Track> getByUser(User user);
}
