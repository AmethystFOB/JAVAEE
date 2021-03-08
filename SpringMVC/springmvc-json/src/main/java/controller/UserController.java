package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.User;

@Controller
public class UserController {
    @RequestMapping("/j1")
    @ResponseBody  //它就不会走视图解析器，会直接返回一个字符串
    public String json1() throws JsonProcessingException {
        //jackson , ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();
        //创建一个对象
        User user = new User("Amethyst",7,"boy");
        return objectMapper.writeValueAsString(user);
    }
}
