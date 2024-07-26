package xianyu.traver.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xianyu.traver.DO.User;
import xianyu.traver.Dao.UserMapper;
import xianyu.traver.Service.UserService;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    /**
     * @param username
     * @param password
     * @return boolean
     */
    @Override
    public boolean login(String username, Integer password) {
        User user = userMapper.selectUserByUsername(username);
        if (user != null &&user.getPassword().equals(password)){
            return true;
        }else{
            return false;
        }
    }
}
