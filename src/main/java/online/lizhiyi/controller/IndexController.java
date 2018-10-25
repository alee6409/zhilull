package online.lizhiyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {
    
    @RequestMapping("/index")
    @ResponseBody//方法执行完后返回的内容会返回到请求页面的body上，直接显示在网页上
    public Map<String, String> index(){
        Map<String, String> map = new HashMap<>();
        map.put("手机","电脑");
        map.put("iphone","imac");
        return map;
    }

    @RequestMapping("/welcome")
    @ResponseBody//方法执行完后返回的内容会返回到请求页面的body上，直接显示在网页上
    public String welcome(){
        return "welcome to 之路ll";
    }
}
