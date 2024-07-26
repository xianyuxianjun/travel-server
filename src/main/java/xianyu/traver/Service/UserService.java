package xianyu.traver.Service;

public interface UserService {
    /**
     * 登录
     * @param username
     * @param password
     * @return boolean
     */
    boolean login(String username,Integer password);
}
