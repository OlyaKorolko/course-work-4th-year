package by.issoft.dto.out.user;

import by.issoft.domain.user.Role;
import by.issoft.domain.user.UserCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserOutDTO {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String phone;
    private LocalDateTime registrationDateTime;
    private UserCategory userCategory;
    private Role role;
}
