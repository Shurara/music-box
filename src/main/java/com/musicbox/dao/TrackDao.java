package com.musicbox.dao;

import com.musicbox.model.Like;
import com.musicbox.model.Track;

import java.util.List;

public interface TrackDao {

    void addTracks(Track track);

    void updateTrackById(Track track, Long id);

    void removeById(Long id);

    Track getById(Long id);

    List<Track> getAll();

    List<Like> getLikesByTrackId(Long id);
}
