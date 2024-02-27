package com.infsis.proyect1.Services;

import com.infsis.proyect1.DTOs.UserDTO;

import java.util.Optional;

public interface UserService {
    Optional<UserDTO> getUserById(Integer userId);
    UserDTO saveUser(UserDTO userDTO);
    UserDTO updateUser(Integer userId, UserDTO userDTO);
    void delete(Integer userId);
}
