package com.musicbox.service;

import com.musicbox.dao.TrackDao;
import com.musicbox.model.Track;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TrackServiceImpl implements TrackService {


    @Autowired
    private TrackDao trackDao;

    @Override
    public void addTrack(Track track) {

    }

    @Override
    public void removeById(Long id) {

    }

    @Override
    public void removeCoverById(Long id) {

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
    public List<Track> getTracksByAlbumId(Long id) {
        return null;
    }
}
