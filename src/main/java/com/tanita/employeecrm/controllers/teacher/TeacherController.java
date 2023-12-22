package com.tanita.employeecrm.controllers.teacher;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeacherController {
    @GetMapping("/teacher")
    public String teacherController() {
        return "teacher/teacherMainPage";
    }
}
