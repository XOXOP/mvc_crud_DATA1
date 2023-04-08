package web.service;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.List;

@Component
public interface UserService {
    List<User> getUsers();

    void saveUser(User userSave);

    void deleteUser(Long id);

    User findUser(Long id);

    void updateUser(User userUpdate);

}