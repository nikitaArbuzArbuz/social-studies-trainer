package ru.company.socialstudiestrainer.app.mapper;

import lombok.extern.slf4j.Slf4j;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.company.socialstudiestrainer.app.domain.dto.UserDto;
import ru.company.socialstudiestrainer.app.domain.entity.User;

@Mapper(componentModel = "spring")
@Slf4j
public abstract class UserMapper {
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "login", source = "login")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "roles", source = "roles")
    public abstract UserDto map(User user);
}