package ru.company.socialstudiestrainer.util.strategy.roles;

import org.springframework.stereotype.Service;
import ru.company.socialstudiestrainer.app.domain.entity.Role;
import ru.company.socialstudiestrainer.app.domain.entity.RoleEnum;
import ru.company.socialstudiestrainer.repository.RoleRepository;

@Service
public class UserRoleStrategy implements RoleStrategy {

    private final RoleRepository roleRepository;

    public UserRoleStrategy(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role getRole() {
        return roleRepository.findByName(RoleEnum.ROLE_USER)
                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
    }
}
