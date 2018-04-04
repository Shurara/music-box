package com.musicbox.service;

import com.musicbox.dao.TrackDao;
import com.musicbox.model.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackServiceImpl implements TrackService {

    @Autowired
    private TrackDao trackDao;

    @Override
    public List<Track> getAll() {

        return trackDao.getAll();
    }

    @Override
    public Track getById(Long id) {

        return trackDao.getById(id);
    }

    @Override
    public void addTracks(Track track) {

    }

    @Override
    public void updateTrackById(Track track) {

    }

    @Override
    public void removeById(Long id) {

    }

    @Override
    public List<Track> getAllLikedTracks() {
        return null;
    }
}
