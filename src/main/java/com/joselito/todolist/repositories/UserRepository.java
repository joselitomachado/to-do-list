package com.joselito.todolist.repositories;

import com.joselito.todolist.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {
    UserModel findByUsername(String username);
}
