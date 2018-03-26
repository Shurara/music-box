package com.musicbox.controller;

import com.musicbox.model.Album;
import com.musicbox.model.User;
import com.musicbox.service.AlbumService;
import com.musicbox.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/albums")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @RequestMapping(path = "/get-all", method = RequestMethod.GET)
    public ResponseEntity<List<Album>> getAll() {
        return new ResponseEntity<>(albumService.getAll(), HttpStatus.OK);
    }
}
