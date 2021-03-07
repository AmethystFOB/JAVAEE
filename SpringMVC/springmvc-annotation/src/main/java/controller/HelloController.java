package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/prehello")    //若在类前加@RequestMapping，则访问地址变为localhost:8080/prehello/hello
public class HelloController {
    @RequestMapping("/hello")
    public String Hello(Model model){
        //封装数据
        model.addAttribute("msg","Hello SpringMVC Annotation!");
        return "hello";  //会被视图解析器处理
    }
    //访问时旧方法：http://localhost:8080/add1?a=1&b=2
    @RequestMapping("/add1")
    public String addParm01(double a, double b,Model model){
        double res = a + b;
        //封装数据
        model.addAttribute("msg","传统方法/计算结果为："+res);
        return "hello";  //会被视图解析器处理
    }

    //访问时RestFul风格：http://localhost:8080/add2/1/2
    @RequestMapping("/add2/{a}/{b}")
    public String addParm02(@PathVariable double a, @PathVariable double b, Model model){
        double res = a + b;
        //封装数据
        model.addAttribute("msg","RestFul/计算结果为："+res);
        return "hello";  //会被视图解析器处理
    }

    //path 或 value ;get post put delete: http://localhost:8080/add3/1/2
    @RequestMapping(path = "/add3/{a}/{b}",method = RequestMethod.GET)
    public String addParm03(@PathVariable double a, @PathVariable double b, Model model){
        double res = a + b;
        //封装数据
        model.addAttribute("msg","RestFul/计算结果为："+res);
        return "hello";  //会被视图解析器处理
    }

//    @PostMapping("/add4/{a}/{b}")
//    public String addParm04(@PathVariable double a, @PathVariable double b, Model model){
//        double res = a + b;
//        //封装数据
//        model.addAttribute("msg","RestFul/计算结果为："+res);
//        return "hello";  //会被视图解析器处理
//    }


}
