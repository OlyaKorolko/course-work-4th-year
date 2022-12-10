package by.issoft.dto.mapper.user;

import by.issoft.domain.user.User;
import by.issoft.dto.in.user.UserInDTO;
import by.issoft.dto.in.user.UserUpdateInDTO;
import by.issoft.dto.out.user.UserOutDTO;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

public interface UserMapper {
    @Mapping(source = "userCategoryId", target = "userCategory.id")
    @Mapping(target = "password", qualifiedByName = "encodePassword")
    User fromDto(UserInDTO userInDTO);

    UserOutDTO toDto(User user);

    @Mapping(target = "password", qualifiedByName = "encodePassword")
    void fillFromDto(UserUpdateInDTO userUpdateInDTO, @MappingTarget User user);
}
