package com.musicbox.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tracks")
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("track_id")
    private Long track_id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "URL")
    private String url;
    @ManyToOne
    @JsonProperty("album")
    @JoinColumn(name = "ALBUM_ID")
    @JsonIgnoreProperties(value = "tracks", allowSetters = true)
    private Album album;

    @OneToMany(mappedBy = "track")
    private List<Like> likes = new ArrayList<>();

    public List<Like> getLikes() {
        return likes;
    }

    public Album getAlbum() {
        return album;
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

    @Override
    public String toString() {
        return "Track{" +
                "track_id=" + track_id +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", album=" + album +
                ", likes=" + likes +
                '}';
    }
}
