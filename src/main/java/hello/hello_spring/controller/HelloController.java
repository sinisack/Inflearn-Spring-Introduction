package hello.hello_spring.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

//    @GetMapping("hello")
//    public String hello(Model model) {
//        model.addAttribute("data", "hello!!");
//        return "hello";
//    }
//
//
//    @GetMapping("hello-mvc")
//    public String helloMvc(@RequestParam("key") String value, Model model) {
//        model.addAttribute("key", value);
//        return "hello-template";
//    }

//    // 문자가 반환 될 경우
//    @GetMapping("hello-string")
//    @ResponseBody
//    public String helloString(@RequestParam("name") String name) {
//        return "hello" + name;
//    }
//    // 객체가 반환 될 경우
//    @GetMapping("hello-api")
//    @ResponseBody
//    public Hello helloApi(@RequestParam("name") String name) {
//        Hello hello = new Hello();
//        hello.setName(name);
//        return hello;
//    }
//
//    static class Hello {
//        private String name;
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//    }


}





