package com.sbi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf")
public class BloggerController {

    @GetMapping("/getBlogger")
    public String gteBlogger(Model model){
        Blogger blogger = new Blogger(1L,"小黑","123456");
        model.addAttribute("blogger",blogger);
        return "blogger";
    }
}
