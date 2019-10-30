package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.StudentService;

/**
 * 学生控制器
 * Created by Hooyuu14 on 2017/7/21.
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("index")
    @ResponseBody
    public String index(Model model) {
       return "hahahahah";
    }
}
