package com.musicbox.controller;

import com.musicbox.model.Track;
import com.musicbox.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tracks")
public class TrackController {

  @Autowired
  private TrackService trackService;

  @GetMapping("/get-all")
//  @RequestMapping(path = "/get-all", method = RequestMethod.GET)
//  @ResponseBody
//  @CrossOrigin(value = "http://localhost:3000")
  public List<Track> getAll() {

    return trackService.getAll();
  }
    @PostMapping("/add-track")
//  @RequestMapping(path = "/add-track", method = RequestMethod.POST)
//  @ResponseBody
//  @CrossOrigin(value = "http://localhost:3000")
    public void addTracks(@RequestBody Track track) {
     trackService.addTracks(track);

    }
  @GetMapping("/{id}")
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//  @ResponseBody
//  @CrossOrigin(value = "http://localhost:3000")
  public Track getById(@PathVariable Long id){

    return trackService.getById(id);
  }

  @PutMapping("/{id}")
//  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//  @ResponseBody
//  @CrossOrigin(value = "http://localhost:*")
  public void updateTrackById(@RequestBody Track track, @PathVariable Long id) {
    trackService.updateTrackById(track, id);
  }
  @DeleteMapping("/{id}")
//  @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
//  @ResponseBody
//  @CrossOrigin(value = "http://localhost:3000")
  public String removeById(@PathVariable Long id) {

    trackService.removeById(id);
    return "redirect:/";
  }
@GetMapping
    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public ResponseEntity<String> testError() {

        return new ResponseEntity<>(TrackService.testError(), HttpStatus.OK);
    }

//  @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
//  @ResponseBody
//  @CrossOrigin(value = "http://localhost:3000")
//  public String removeById(@PathVariable Long id) {
//
//    trackService.removeById(id);
//    return "redirect:/get-all";
//  }

}
