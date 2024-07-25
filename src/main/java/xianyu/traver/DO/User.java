package xianyu.traver.DO;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName(value = "users")
public class User {
    @TableId
    private Integer userId;
    private String username;
    private String password;
    private String email;
    private Date createAt;
    private Date updateAt;
}
