package com.musicbox.dao;

import com.musicbox.model.Album;
import com.musicbox.model.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class AlbumDaoImpl implements AlbumDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void addAlbum(Album album) {

    }

    @Override
    public void removeById(Long id) {

    }

    @Override
    public Album getById(Long id) {
        return null;
    }

    @Override
    public List<Album> getAll() {

        return entityManager.createNativeQuery("SELECT * FROM ALBUMS").getResultList();
    }

    @Override
    public List<Track> getTracksByAlbumId(Long id) {
        return null;
    }
}
