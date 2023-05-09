package ru.patrakhin.mythymeleafproject2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.patrakhin.mythymeleafproject2.model.User;
import ru.patrakhin.mythymeleafproject2.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(String username, String password) {
        User user = new User();
        user.setName(username);
        user.setPassword(password);
        return userRepository.save(user);
    }



    @Override
    public User findById(long id) {
        return userRepository.findById(id);
    }
}