package com.musicbox.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tracks")
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long track_id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "URL")
    private String url;
    @ManyToOne(fetch = FetchType.LAZY)
//    @JsonProperty("album")
    @JsonIgnoreProperties("tracks")
    @JoinColumn(name = "ALBUM_ID")
    private Album album;

    @OneToMany(mappedBy = "track")
    private List<Like> likes = new ArrayList<>();

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Track(){}

    public Long getTrack_id() {
        return track_id;
    }

    public Album getAlbum() {
        return album;
    }

    public Long getId() {
        return track_id;
    }

    public void setId(Long id) {
        this.track_id = track_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
