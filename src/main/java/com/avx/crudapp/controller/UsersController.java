package com.avx.crudapp.controller;

import com.avx.crudapp.entity.UsersEntity;
import com.avx.crudapp.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UsersController {

    private final UsersService usersService;

    @GetMapping("/users")
    public List<UsersEntity> findAll() {
        return usersService.findAll();
    }

    @GetMapping("/users/{id}")
    public Optional<UsersEntity> findById(@PathVariable("id") Long id) {
        return usersService.findById(id);
    }

    @PostMapping("/users")
    public UsersEntity saveDb(@RequestBody UsersEntity users) {
        return usersService.saveDb(users);
    }

    @PutMapping("/users/{id}")
    public UsersEntity update(@PathVariable("id") Long id, @RequestBody UsersEntity users) {
        return usersService.update(id, users);
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable("id") Long id) {
        usersService.deleteById(id);
    }
}
