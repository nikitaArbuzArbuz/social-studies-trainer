package ru.company.socialstudiestrainer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.company.socialstudiestrainer.app.domain.entity.Role;
import ru.company.socialstudiestrainer.app.domain.entity.RoleEnum;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleEnum name);
}
