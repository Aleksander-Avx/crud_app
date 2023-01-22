package com.avx.crudapp.service;

import com.avx.crudapp.entity.UsersEntity;

import java.util.List;
import java.util.Optional;

public interface UsersService {

    List<UsersEntity> findAll();

    Optional<UsersEntity> findById(Long id);

    UsersEntity update(Long id, UsersEntity usersEntity);

    UsersEntity saveDb(UsersEntity users);

    void deleteById(Long id);
}
