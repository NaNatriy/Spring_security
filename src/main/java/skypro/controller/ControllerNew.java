package skypro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerNew {

    @GetMapping("/")
    public String showPublicInfo() {
        return "mainInfo";
    }

    @GetMapping("/employee_info")
    public String showEmployeeInfo() {
        return "employeeInfo";
    }

    @GetMapping("/stuff_info")
    public String showStuffInfo() {
        return "stuffInfo";
    }

    @GetMapping("/it_info")
    public String showITInfo() {
        return "itInfo";
    }

    @GetMapping("/director_info")
    public String showDirectorInfo() {
        return "directorInfo";
    }
}