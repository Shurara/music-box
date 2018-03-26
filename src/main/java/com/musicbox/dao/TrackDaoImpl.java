package com.musicbox.dao;

import com.musicbox.model.Like;
import com.musicbox.model.Track;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TrackDaoImpl implements TrackDao {
    @Override
    public void addTrack(Track track) {

    }

    @Override
    public void removeById(Long id) {

    }

    @Override
    public Track getById(Long id) {
        return null;
    }

    @Override
    public List<Track> getAll() {
        return null;
    }

    @Override
    public List<Like> getLikesByTrackId(Long id) {
        return null;
    }
}
