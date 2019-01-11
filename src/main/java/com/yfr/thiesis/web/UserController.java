package com.yfr.thiesis.web;

import com.yfr.thiesis.model.UserEntity;
import com.yfr.thiesis.service.UserService;

import org.omg.PortableServer.ForwardRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RequestMapping("/user")
@Controller
public class UserController {
    @Resource
    private UserService userService;
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "getUser", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Object> getUser(@RequestParam("username") String username) {
        UserEntity user = new UserEntity();
        try {
            logger.info("username=" + username);
            System.out.println("request");
            user = userService.getUser(username);
        } catch (Exception e) {
            logger.error("get_user_error",e);
        }

        return new ResponseEntity<Object>(user, HttpStatus.OK);

    }

    @RequestMapping("getFile")
//    @ResponseBody
    public String getFile() {
        File file = new File("/Users/momo/Desktop/test.docx");
        System.out.println(file.getPath());
        return "redirect:/" + file.getPath();

    }

    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ResponseBody
    public String test() {
        System.out.println("request");
        return "test";

    }
}
