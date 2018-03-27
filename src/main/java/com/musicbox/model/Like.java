package com.musicbox.model;

import javax.persistence.*;

@Entity
@Table(name = "LIKES")
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long like_id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SONG_ID")
    private Track track;

    public void setTrack(Track track) {
        this.track = track;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return like_id;
    }

    public void setId(Long id) {
        this.like_id = like_id;
    }
}
