package com.musicbox.dao;

import com.musicbox.model.Like;
import com.musicbox.model.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class TrackDaoImpl implements TrackDao {

  @Autowired
  EntityManager entityManager;

  @Override
  @Transactional
  public void addTracks(Track track) {
    String title = track.getTitle();
    String url = track.getUrl();
    Long albumId = track.getAlbum().getId();
    String sql = "INSERT INTO tracks(TITLE, ALBUM_ID, URL)" +
        " VALUES(\"" + title + "\"," + albumId + ", \"" + url +"\"  )";
    Query query = entityManager.createNativeQuery(sql, Track.class);
    query.executeUpdate();

  }

  @Override
  @Transactional
  public void updateTrackById(Track track, Long id) {
    String trackName = track.getTitle();
    String trackUrl = track.getUrl();
    Long trackId = id;
    String sql = "UPDATE tracks SET TITLE = '" + trackName + "', URL = '" + trackUrl + "' WHERE TRACK_ID IN(" + trackId + ")";
    Query query = entityManager.createNativeQuery(sql, Track.class);
    query.executeUpdate();
  }

    @Override
  @Transactional
  public void removeById(Long id) {
  Track track = entityManager.find(Track.class, id);
  entityManager.remove(track);

  }

  @Override
  public Track getById(Long id) {
    String sql = "SELECT * FROM tracks WHERE TRACK_ID IN(" + id + ")";
    Query query = entityManager.createNativeQuery(sql, Track.class);
    Track track = (Track)query.getSingleResult();
    return track;
  }

  @Override
  public List<Track> getAll() {
    String sql = "SELECT  * FROM tracks";
    Query query = entityManager.createNativeQuery(sql, Track.class);
    List<Track> tracks = (List<Track>)query.getResultList();
    return tracks;
  }

  @Override
  public List<Like> getLikesByTrackId(Long id) {

    return null;
  }






}
