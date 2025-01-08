package ru.company.socialstudiestrainer.app.domain.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.company.socialstudiestrainer.app.domain.entity.Role;

import java.io.Serializable;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto implements Serializable {
    private String firstName;
    private String lastName;
    @Size(max = 20)
    @NotBlank(message = "Please provide a login")
    private String login;
    @Size(max = 50)
    @Email(message = "Please provide a valid email address")
    @NotBlank(message = "Please provide a email")
    private String email;
    private Set<Role> roles;
}