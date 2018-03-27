package com.musicbox.service;

import com.musicbox.dao.AlbumDao;
import com.musicbox.model.Album;
import com.musicbox.model.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumDao albumDao;

    @Override
    public void addAlbum(Album album) {

    }

    @Override
    public void removeById(Long id) {

    }

    @Override
    public Album getById(Long id) {
        return albumDao.getById(id);
    }

    @Override
    public List<Album> getAll() {

        return albumDao.getAll();
    }

    @Override
    public List<Track> getTracksByAlbumId(Long id) {
        return null;
    }
}
