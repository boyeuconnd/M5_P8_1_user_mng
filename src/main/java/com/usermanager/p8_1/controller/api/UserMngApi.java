package com.usermanager.p8_1.controller.api;


import com.usermanager.p8_1.model.User;
import com.usermanager.p8_1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserMngApi {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public Iterable<User> getList(){
        return userService.getAll();
    }

    @GetMapping("{id}")
    public User getOnUser(@PathVariable Long id){
        return userService.findById(id);
    }

    @PostMapping("")
    public User createUser(@RequestBody User user){

        return userService.save(user);
    }

    @PutMapping("{id}/edit")
    public User updateUser(@PathVariable Long id,@RequestBody User user){
        User currentUser = userService.findById(id);

        currentUser.setName(user.getName());
        currentUser.setEmail(user.getEmail());
        currentUser.setGroups(user.getGroups());
        return userService.save(currentUser);

    }

    @DeleteMapping("{id}/delete")
    public User deleteUser(@PathVariable Long id){
        User deleteUser = userService.findById(id);
        userService.delete(id);
        return deleteUser;
    }


}
