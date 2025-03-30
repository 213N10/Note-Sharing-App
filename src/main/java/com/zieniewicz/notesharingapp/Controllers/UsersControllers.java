package com.zieniewicz.notesharingapp.Controllers;

import com.zieniewicz.api.UsersApi;
import com.zieniewicz.model.User;
import com.zieniewicz.model.UsersBlockIdPatchRequest;
import com.zieniewicz.notesharingapp.Services.UsersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UsersControllers implements UsersApi {

    UsersService usersService = new UsersService();

    @Override
    public ResponseEntity<List<User>> usersSearchGet(String query, Integer offset, Integer limit) {
        return UsersApi.super.usersSearchGet(query, offset, limit);
    }

    @Override
    @GetMapping("/users/{id}")
    public ResponseEntity<User> usersIdGet(@PathVariable String id) {
        User user = usersService.findUserById(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public ResponseEntity<Void> usersIdDelete(String id) {
        return UsersApi.super.usersIdDelete(id);
    }

    @Override
    public ResponseEntity<Void> usersBlockIdPatch(String id, UsersBlockIdPatchRequest usersBlockIdPatchRequest) {
        return UsersApi.super.usersBlockIdPatch(id, usersBlockIdPatchRequest);
    }
}
