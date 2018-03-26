package com.musicbox.dao;

import com.musicbox.model.Role;

import java.util.List;

public interface RoleDao {

    Role getById(Long id);

    List<Role> getAll();
}
