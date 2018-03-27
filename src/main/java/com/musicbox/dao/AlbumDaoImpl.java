package com.musicbox.dao;

import com.musicbox.model.Album;
import com.musicbox.model.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
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
        String sql = "SELECT * FROM ALBUMS WHERE ALBUM_ID IN(" + id + ")";

        Query query = entityManager.createNativeQuery(sql, Album.class);
        Album album = (Album) query.getSingleResult();
        return album;

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
