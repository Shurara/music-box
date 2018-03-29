package com.musicbox.controller;

import com.musicbox.model.Album;
import com.musicbox.model.User;
import com.musicbox.service.AlbumService;
import com.musicbox.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
@RestController
@RequestMapping("/api/albums")
public class AlbumController {

    @Autowired
    private AlbumService albumService;



    @RequestMapping(path = "/get-all", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin(value = "http://localhost:3000")
    public List<Album> getAll() {

        return albumService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin(value = "http://localhost:3000")
    public Album getById(@PathVariable Long id){

        return albumService.getById(id);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    @CrossOrigin(value = "http://localhost:3000")
    public String removeById(@PathVariable Long id) {

        albumService.removeById(id);
        return "redirect:/get-all";
    }

    @RequestMapping(path = "/{id}/cover", method = RequestMethod.PUT)
    @ResponseBody
    @CrossOrigin(value = "http://localhost:3000")
    public String removeCoverById(@PathVariable Long id) {

        albumService.removeCoverById(id);
        return "redirect:/get-all";
    }

    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public ResponseEntity<String> testError() {

        return new ResponseEntity<>(AlbumService.testError(), HttpStatus.OK);
    }
}
