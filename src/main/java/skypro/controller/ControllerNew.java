package skypro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerNew {

    @GetMapping("/")
    public String showPublicInfo() {
        return "publicInfo";
    }

    @GetMapping("/tester_info")
    public String showTesterInfo() {
        return "testerInfo";
    }

    @GetMapping("/admin_info")
    public String showAdminInfo() {
        return "adminInfo";
    }
}