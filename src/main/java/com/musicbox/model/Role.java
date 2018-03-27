package com.musicbox.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROLES")
public class Role {
    @Id
    @Column(name = "ID_ROLE")
    private Long id_role;
    @Column(name = "ROLE")
    private String role;

    public Long getId() {
        return id_role;
    }

    public void setId(Long id) {
        this.id_role = id_role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
