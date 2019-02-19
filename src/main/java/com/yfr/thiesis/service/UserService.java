package com.yfr.thiesis.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yfr.thiesis.dao.UserDao;
import com.yfr.thiesis.model.UserEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public UserEntity getUser(String username) {
        return userDao.getUser(username);
    }

    public static void main(String[] args) {
        String s = "[{\"day\":0,\"id\":\"6000002599\",\"image\":{\"image_height\":720,\"image_url\":\"http://talk.momocdn.com/talk_video/24/A1/24A1175C-C50B-40BB-A912-81FACDD1E73220190109_L.jpg\",\"image_width\":1280},\"like\":false,\"month\":0,\"nickName\":\"\",\"shareUrl\":\"http://www.baidu.com\",\"tagName\":\"\",\"uri\":\"http://talk.momocdn.com/talk_video/24/A1/24A1175C-C50B-40BB-A912-81FACDD1E73220190109.mp4\",\"url\":\"http://talk.momocdn.com/talk_video/24/A1/24A1175C-C50B-40BB-A912-81FACDD1E73220190109.mp4\",\"userPhoto\":\"\",\"vid\":\"6000002599\",\"videoCover\":\"http://talk.momocdn.com/talk_video/24/A1/24A1175C-C50B-40BB-A912-81FACDD1E73220190109_L.jpg\",\"year\":0}]";
        List<Map> map1 = JSON.parseObject(s,List.class);
        System.out.println(map1);

        String s1= "[{" +
                "\"data\": {" +
                "\"studentList\": [{" +
                "\"scourse\": {" +
                "\"cname\": \"语文,数学,英语\"," +
                "\"cscore\": \"93,95,98\"" +
                "}," +
                "\"sname\": \"张三\"," +
                "\"sage\": \"20\"," +
                "\"sid\": \"101\"" +
                "}," +
                "{" +
                "\"scourse\": {" +
                "\"cname\": \"物理,化学,生物\"," +
                "\"cscore\": \"92,93,97\"" +
                "}," +
                "\"sname\": \"李四\"," +
                "\"sage\": \"30\"," +
                "\"sid\": \"102\"" +
                "}]" +
                "}," +
                "\"resultCode\": \"1\"" +
                "}]";
        List<Map> data = JSON.parseArray(s,Map.class);
        System.out.println(data);

    }
}
