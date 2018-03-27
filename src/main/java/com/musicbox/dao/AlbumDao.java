package com.musicbox.dao;

import com.musicbox.model.Album;
import com.musicbox.model.Track;

import java.util.List;
import java.util.Optional;

public interface AlbumDao {

    void addAlbum(Album album);

    void removeById(Long id);

    void removeCoverById(Long id);

    Album getById(Long id);

    List<Album> getAll();

    List<Track> getTracksByAlbumId(Long id);
}
