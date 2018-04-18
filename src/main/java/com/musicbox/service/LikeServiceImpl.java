package com.musicbox.service;

import com.musicbox.dao.LikeDao;
import com.musicbox.model.Like;
import com.musicbox.model.Track;
import com.musicbox.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LikeServiceImpl implements LikeService {

  @Autowired
  private LikeDao likeDao;


  @Override
  public void addLike(Like like, Long track_id) {
    likeDao.addLike(like, track_id);

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

  @Override
  public List<Track> getByUser(User user) {
    return null;
  }
}
