package ru.company.socialstudiestrainer.app.service;


import ru.company.socialstudiestrainer.app.domain.entity.User;

public interface UserService {
    User getAuthenticatedUser();
}
