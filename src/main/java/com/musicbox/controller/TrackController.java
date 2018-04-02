package com.musicbox.controller;

import com.musicbox.model.Track;
import com.musicbox.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tracks")
public class TrackController {

  @Autowired
  private TrackService trackService;

  @RequestMapping(path = "/get-all", method = RequestMethod.GET)
  @ResponseBody
  @CrossOrigin(value = "http://localhost:3000")
  public List<Track> getAll() {

    return trackService.getAll();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  @ResponseBody
  @CrossOrigin(value = "http://localhost:3000")
  public Track getById(@PathVariable Long id){

    return trackService.getById(id);
  }

  @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
  @ResponseBody
  @CrossOrigin(value = "http://localhost:3000")
  public String removeById(@PathVariable Long id) {

    trackService.removeById(id);
    return "redirect:/get-all";
  }





}
