package com.musicbox.service;

import com.musicbox.model.Album;
import com.musicbox.model.Track;

import java.util.List;

public interface AlbumService {

    void addAlbum(Album album);

    void removeById(Long id);

    Album getById(Long id);

    List<Album> getAll();

    List<Track> getTracksByAlbumId(Long id);
}
