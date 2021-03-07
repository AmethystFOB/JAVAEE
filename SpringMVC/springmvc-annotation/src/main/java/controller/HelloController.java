package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/prehello")    //若在类前加@RequestMapping，则访问地址变为localhost:8080/prehello/hello
public class HelloController {
    @RequestMapping("/hello")
    public String Hello(Model model){
        //封装数据
        model.addAttribute("msg","Hello SpringMVC Annotation!");
        return "hello";  //会被视图解析器处理
    }

//    @RequestMapping("/hello")
//    public String Hello2(Model model){
//        //封装数据
//        model.addAttribute("msg","Hello SpringMVC Annotation!");
//        return "hello";  //会被视图解析器处理
//    }

//    @RequestMapping("/hello")
//    public String Hello3(Model model){
//        //封装数据
//        model.addAttribute("msg","Hello SpringMVC Annotation!");
//        return "hello";  //会被视图解析器处理
//    }

}
