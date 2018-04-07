package com.musicbox.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "albums")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("album_id")
    private Long album_id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "COVER")
    private String cover;
    @OneToMany(mappedBy = "album", orphanRemoval = true)
    private List<Track> tracks = new ArrayList<>();

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public Long getId() {
        return album_id;
    }

    public void setId(Long id) {
        this.album_id = album_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "Album{" +
            "album_id=" + album_id +
            ", title='" + title + '\'' +
            ", cover='" + cover + '\'' +
            ", tracks=" + tracks +
            '}';
    }
}
