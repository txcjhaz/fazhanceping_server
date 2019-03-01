package com.txcjh.fazhanceping.Controller;

import com.txcjh.fazhanceping.mapper.UserInfoMapper;
import com.txcjh.fazhanceping.mapper.UsersMapper;
import com.txcjh.fazhanceping.model.Users;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "登录", description = "登录")
@RestController
public class LoginController {
    @Autowired
    UsersMapper userMapper;
    @Autowired
    UserInfoMapper userInfoMapper;

    @PostMapping(value = "/login")
    @ApiOperation(value = "登录")
    public String login(@RequestBody Users user){
        Users user_ = userMapper.selectByPrimaryKey(user.getUserId());
        if(user_ == null)//用户不存在
            return "0";
        if(user.getPasswd().equals(user_.getPasswd())) {// 返回1则登录成功，0则登录失败
            return userInfoMapper.selectByPrimaryKey(user.getUserId()).getUserName();
        }
        else//密码不对
            return "0";
    }
}
