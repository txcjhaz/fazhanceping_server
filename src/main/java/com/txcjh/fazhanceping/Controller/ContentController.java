package com.txcjh.fazhanceping.Controller;

import com.txcjh.fazhanceping.mapper.DafenMapper;
import com.txcjh.fazhanceping.mapper.TuiyouMapper;
import com.txcjh.fazhanceping.mapper.UserInfoMapper;
import com.txcjh.fazhanceping.model.Dafen;
import com.txcjh.fazhanceping.model.Tuiyou;
import com.txcjh.fazhanceping.model.UserInfo;
import com.txcjh.fazhanceping.model.UserInfoExample;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "内容控制", description = "内容控制")
@RestController
public class ContentController {
    @Autowired
    TuiyouMapper tuiyouMapper;
    @Autowired
    DafenMapper dafenMapper;
    @Autowired
    UserInfoMapper userInfoMapper;
    private String privateKey = "-----BEGIN PRIVATE KEY-----\n" +
            "MIIBVQIBADANBgkqhkiG9w0BAQEFAASCAT8wggE7AgEAAkEA3B4Ij3VyYp21uwOH\n" +
            "P4YmGk2nAbCy8Bu3s5tSup+5zJMK1T2XW4wQWkCbcAabr4EDbUTJXRYNQnrO4HcZ\n" +
            "4v4BnQIDAQABAkEAjEgbvonkL1NBaYFTJbnx+Jt6jwo0z+9qQO4BaGy5NdVl1hgw\n" +
            "q277onw1yLms/RqykEw8oJI1ONqPUiYfyGoGoQIhAPH4Yn5TvgD4SvB/GXts6Fb3\n" +
            "uv3FhU7XJLRMSpeADRFlAiEA6OFH76d/j/7rDm5tAIrsYGnmaimub2UEt/xRttfm\n" +
            "h9kCIErTDlIWP0k5fqMECrM6KFbMYIydCe4pZXZDqUVUGbZpAiEAq3+UIVpBp8J8\n" +
            "ShFqNncYYlw6sj3l1uUW14N6jeNrQukCIB8FrYu9p1Ais+d8QP0i7XItH61VM4O7\n" +
            "Benaq+saItpK\n" +
            "-----END PRIVATE KEY-----\n";

    @GetMapping(value = "/getSideInfo")
    public List<UserInfo> getSideInfo(){
        List<UserInfo> list = userInfoMapper.selectByExample(new UserInfoExample());
        for (UserInfo userInfo : list){
            userInfo.setIsExcelent(null);
            userInfo.setScore(null);
        }
        return  list;
    }

    @PostMapping(value = "/isExcelent")
    @ApiOperation(value = "推优")
    public int isExcelent(String userId, String objectId, Boolean isExcelent){
        List<Integer> objectIds = tuiyouMapper.getByKeyAndObject(Integer.valueOf(userId));
        if(objectIds.contains(Integer.valueOf(objectId)))//之前已经插入过记录
            return 0;
        Tuiyou tuiyou = new Tuiyou();
        tuiyou.setUserId(Integer.valueOf(userId));
        tuiyou.setIsexcelent(isExcelent);
        tuiyou.setRecommendedUserId(Integer.valueOf(objectId));
        tuiyouMapper.insert(tuiyou);
        return 1;
    }

    @ApiOperation(value = "打分")
    @PostMapping(value = "/makeMark")
    public int makeMark(String userId, String objectId, int score){
        Dafen dafen = new Dafen();
        dafen.setUserId(Integer.valueOf(userId));
        dafen.setObjectId(Integer.valueOf(objectId));
        dafen.setScore(score);
        return dafenMapper.insert(dafen);
    }
}
