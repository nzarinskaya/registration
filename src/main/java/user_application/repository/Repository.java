package user_application.repository;

import user_application.model.User;

import java.util.List;
import java.util.Optional;

public interface Repository {
    List<User> getAll();
    Optional<User> getById(long userId);
    User save(User user);
}
