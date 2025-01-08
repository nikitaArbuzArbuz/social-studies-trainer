package ru.company.socialstudiestrainer.app.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.company.socialstudiestrainer.app.domain.entity.User;
import ru.company.socialstudiestrainer.app.service.UserService;
import ru.company.socialstudiestrainer.repository.UserRepository;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User getAuthenticatedUser() {
        Authentication authUser = SecurityContextHolder.getContext().getAuthentication();
        String login = authUser.getName();
        log.info("Получаем объект залогиненного пользователя c login: {}", login);
        return userRepository.findByLogin(login).orElseThrow(() ->
                new UsernameNotFoundException("User not found!"));
    }
}
