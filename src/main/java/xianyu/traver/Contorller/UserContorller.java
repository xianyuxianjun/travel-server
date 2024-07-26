package xianyu.traver.Contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xianyu.traver.Request.Result;
import xianyu.traver.Service.impl.UserServiceImpl;

@RestController
@RequestMapping
@CrossOrigin
public class UserContorller {
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/login")
    public Result login(@RequestParam String username,@RequestParam Integer password){
        boolean isLogin = userService.login(username,password);
        if (isLogin){
            return Result.success();
        }else {
            return Result.error("登陆失败");
        }
    }
}
