package xianyu.traver.DO;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName(value = "users")
public class User {
    @TableId
    private Integer userId; //用户Id
    private String username; //用户名
    private String password; //密码
    private String email;  //邮箱
    private Date createAt;  //创建时间
    private Date updateAt;  //修改时间
}
