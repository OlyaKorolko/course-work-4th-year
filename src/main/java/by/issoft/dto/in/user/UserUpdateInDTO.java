package by.issoft.dto.in.user;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;


@Data
@NoArgsConstructor
public class UserUpdateInDTO {
    private String firstName;

    private String lastName;

    @Email(message = "Email should be valid")
    private String email;

    @Pattern(regexp = "^\\+?\\d{7,}$", message = "Phone should be valid")
    private String phone;

    @Size(max = 100)
    private String password;

    private String address;

    private String city;

    @Past
    private LocalDate birthDate;
}
