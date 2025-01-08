package ru.company.socialstudiestrainer.util;

import lombok.RequiredArgsConstructor;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;
import ru.company.socialstudiestrainer.app.domain.entity.User;
import ru.company.socialstudiestrainer.repository.UserRepository;
import ru.company.socialstudiestrainer.util.exceptions.UserNotFoundException;

@Component
@RequiredArgsConstructor
public class UserMapperHelper {
    private final UserRepository userRepository;

    @Named("mapUserFromId")
    public User mapUserFromId(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException("User not found",
                        System.currentTimeMillis()));
    }
}
