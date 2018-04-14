package com.musicbox.model;

import com.fasterxml.jackson.annotation.JsonProperty;
//import com.musicbox.configuration.security.UserPrincipal;
//import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("user_id")
    private Long user_id;
    @Column(name = "ROLE")
    private String role;
    @Column(name = "NAME")
    private String name;
    @Column(name = "LOGIN")
    private String login;
    @Column(name = "PASSWORD")
    private String password;
    @OneToMany(mappedBy = "user")
    private List<Like> likes = new ArrayList<>();

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public Long getId() {
        return user_id;
    }

    public void setId(Long id) {
        this.user_id = user_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public static Function<List<GrantedAuthority>, UserPrincipal> ofPrincipal(User user) {
//        return a -> new UserPrincipal(
//            user.getId(),
//            user.getName(),
//            user.getLogin(),
//            user.getPassword(),
//            a
//        );
//    }
}
