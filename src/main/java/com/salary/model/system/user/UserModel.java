package com.salary.model.system.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

@Controller
@RequestMapping("/system/user")
@ApiIgnore
public class UserModel {

    @GetMapping("/user")
    public String user(){
        return "system/user/user";
    }

    @GetMapping("/insert")
    public String insert(){
        return "system/user/insert";
    }

    @GetMapping("/update")
    public String update(){
        return "system/user/update";
    }

    @GetMapping("/reset")
    public String reset(){
        return "system/user/reset";
    }

    @GetMapping("/delete")
    public String delete(){
        return "system/user/delete";
    }
}
