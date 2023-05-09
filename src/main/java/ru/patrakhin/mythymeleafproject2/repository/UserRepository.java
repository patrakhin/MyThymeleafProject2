package ru.patrakhin.mythymeleafproject2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.patrakhin.mythymeleafproject2.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserId(long id);
}