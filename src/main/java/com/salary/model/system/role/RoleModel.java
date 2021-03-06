package com.salary.model.system.role;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

@Controller
@RequestMapping("/system/role")
@ApiIgnore
public class RoleModel {

    @GetMapping("/role")
    public String role(){
        return "system/role/role";
    }

    @GetMapping("/insert")
    public String insert(){
        return "system/role/insert";
    }

    @GetMapping("/update")
    public String update(){
        return "system/role/update";
    }
}
