package spring.service;

import lombok.*;
import spring.database.repository.UserRepository;
import spring.mapper.UserMapper;

@RequiredArgsConstructor
@Setter
@ToString
public class UserService {
    private final UserMapper userMapper;
    public final UserRepository UserRepository;
}
