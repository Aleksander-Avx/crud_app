package com.avx.crudapp.service;

import com.avx.crudapp.entity.UsersEntity;
import com.avx.crudapp.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;

    @Override
    public List<UsersEntity> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public Optional<UsersEntity> findById(Long id) {
        return usersRepository.findById(id);
    }

    @Override
    public UsersEntity update(Long id, UsersEntity usersEntity) {
        usersEntity.setId(id);
        return usersRepository.save(usersEntity);
    }

    @Override
    public UsersEntity saveDb(UsersEntity users) {
        return usersRepository.save(users);
    }

    @Override
    public void deleteById(Long id) {
        usersRepository.deleteById(id);
    }
}
