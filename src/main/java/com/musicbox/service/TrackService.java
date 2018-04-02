package com.musicbox.service;

import com.musicbox.model.Track;
import java.util.List;




public interface TrackService {

    List<Track> getAll(); //GET /api/tracks

    Track getById(Long id);//GET /api/tracks/{id}

    void addTracks(Track track);//POST /api/tracks/{id}

    void updateTracksById (Track track);//PUT /api/tracks/{id}

    void removeTrackById(Long id); //DELETE /api/tracks/{id}

    List<Track> getAllLikedTracks();//    3.7 GET /api/tracks?liked=true

//    3.6 POST /api/tracks/{id}/like

//    3.8 POST /api/tracks/{id}/song mp3 upload.







    static String testError() {
        throw new RuntimeException();
    }
}








