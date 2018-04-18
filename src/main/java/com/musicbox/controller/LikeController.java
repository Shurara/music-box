package com.musicbox.controller;


import com.musicbox.model.Like;
import com.musicbox.model.Track;
import com.musicbox.model.User;
import com.musicbox.service.LikeService;
import com.musicbox.service.TrackService;
import com.musicbox.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LikeController {

  @Autowired
  private UserService userService;

  @Autowired
  private LikeService likeService;


  @Transactional
  @PostMapping(value = "/tracks/{track_id}/like")
  public void addLike(@RequestBody Like like, @PathVariable Long track_id){
   likeService.addLike(like, track_id);
}

  @GetMapping(value = "/tracks/liked")
  public List<Track> getLikes(User user) {
    return likeService.getLikesByUser(user);
  }


}
