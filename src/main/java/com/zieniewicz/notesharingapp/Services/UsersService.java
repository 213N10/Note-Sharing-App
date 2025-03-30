package com.zieniewicz.notesharingapp.Services;

import com.zieniewicz.model.User;

import java.util.Arrays;
import java.util.List;

public class UsersService {

    // Lista użytkowników jako instancja zmiennej
    private List<User> users;

    public UsersService() {
        // Inicjalizacja listy użytkowników w konstruktorze
        this.users = Arrays.asList(
                new User()
                        .id("1")
                        .email("john.doe@example.com")
                        .username("john_doe")
                        .firstName("John")
                        .lastName("Doe")
                        .roles(List.of("admin"))
                        .userStatus(User.UserStatusEnum.ACTIVE),

                new User()
                        .id("2")
                        .email("jane.smith@example.com")
                        .username("jane_smith")
                        .firstName("Jane")
                        .lastName("Smith")
                        .roles(List.of("user"))
                        .userStatus(User.UserStatusEnum.ACTIVE),

                new User()
                        .id("3")
                        .email("alex.jones@example.com")
                        .username("alex_jones")
                        .firstName("Alex")
                        .lastName("Jones")
                        .roles(List.of("user"))
                        .userStatus(User.UserStatusEnum.ACTIVE),

                new User()
                        .id("4")
                        .email("emily.brown@example.com")
                        .username("emily_brown")
                        .firstName("Emily")
                        .lastName("Brown")
                        .roles(List.of("user"))
                        .userStatus(User.UserStatusEnum.ACTIVE),

                new User()
                        .id("5")
                        .email("michael.white@example.com")
                        .username("michael_white")
                        .firstName("Michael")
                        .lastName("White")
                        .roles(List.of("moderator"))
                        .userStatus(User.UserStatusEnum.BANNED)
        );
    }
    public User findUserById(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

}

