package user_application.repository;

import user_application.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

public class AllUsersRepository implements Repository {
    public static AllUsersRepository allUR = new AllUsersRepository();

    public AllUsersRepository() {
    }

    private AtomicLong doId = new AtomicLong(1);
    private static final List<User> users = new ArrayList<>();

    @Override
    public List<User> getAll() {
        return users ;
    }

    @Override
    public Optional<User> getById(long userId) {
        return Optional.empty();
    }

    @Override
    public User save(User user) {
        user.setId(doId.getAndIncrement());
        users.add(user);
        return user;
    }
}
