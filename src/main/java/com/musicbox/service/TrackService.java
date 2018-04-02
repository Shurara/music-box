package com.musicbox.service;

import com.musicbox.model.Track;
import java.util.List;




public interface TrackService {


    void addTrack(Track track);

    void removeById(Long id);

    void removeCoverById(Long id);

    Track getById(Long id);

    List<Track> getAll();

    List<Track> getTracksByAlbumId(Long id);

    static String testError() {
        throw new RuntimeException();
    }
}








