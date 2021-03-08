package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.User;

//@RestController
@Controller
public class UserController {
//    JSON中文乱码问题解决
//    @RequestMapping(value = "/j1",produces = "application/json; charset=UTF-8")
    @RequestMapping("/j1")
    @ResponseBody  //它就不会走视图解析器，会直接返回一个字符串
    public String json1() throws JsonProcessingException {
        //jackson , ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();
        //创建一个对象
        User user = new User("张建华",7,"男");
        return objectMapper.writeValueAsString(user);
    }
}
