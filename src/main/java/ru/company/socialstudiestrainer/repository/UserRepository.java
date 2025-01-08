package ru.company.socialstudiestrainer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.company.socialstudiestrainer.app.domain.entity.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByLogin(String username);

    Optional<User> findByEmail(String email);

    Boolean existsByLogin(String username);

    Boolean existsByEmail(String email);
}
