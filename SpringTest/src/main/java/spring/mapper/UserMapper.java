package spring.mapper;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import spring.dto.UserDto;

@RequiredArgsConstructor
@ToString
public class UserMapper {
    private final UserDto userDto;

}
