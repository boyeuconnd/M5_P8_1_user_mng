package com.usermanager.p8_1.service;

import com.usermanager.p8_1.model.User;

public interface UserService {

    Iterable<User> getAll();

    User findById(Long id);

    User save(User user);

    void delete(Long id);


}
