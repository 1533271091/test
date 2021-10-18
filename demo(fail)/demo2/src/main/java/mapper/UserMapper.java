package mapper;


import pojo.User;

import java.util.List;

public interface UserMapper {
    int insert(User user);
    List<User> getList();

}
