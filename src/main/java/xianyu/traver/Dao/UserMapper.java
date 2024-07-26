package xianyu.traver.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import xianyu.traver.DO.User;

@Mapper
public interface UserMapper {
    /**
     * 根据用户名查询用户
     * @param username
     * @return user
     */
    @Select("select * from users where username=#{username} ")
    User selectUserByUsername(String username);

    /**
     * 根据Id查询用户
     * @param userId
     * @return user
     */
    @Select("select * from users where user_id=#{userId}")
    User selectUserById(Integer userId);
}
