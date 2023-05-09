package ru.patrakhin.mythymeleafproject2.service;

import ru.patrakhin.mythymeleafproject2.model.User;

public interface UserService {
    User createUser(String username, String password);
    User findById(long id);
}
