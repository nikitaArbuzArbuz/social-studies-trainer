package ru.company.socialstudiestrainer.app.service;

import ru.company.socialstudiestrainer.app.domain.dto.JwtResponse;
import ru.company.socialstudiestrainer.app.domain.dto.LoginRequest;
import ru.company.socialstudiestrainer.app.domain.dto.SignupRequest;
import ru.company.socialstudiestrainer.app.domain.dto.UserDto;

public interface AuthorizationService {
    JwtResponse authorize(LoginRequest loginRequest);

    UserDto register(SignupRequest signupRequest);
}