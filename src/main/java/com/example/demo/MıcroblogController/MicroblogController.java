 package com.example.demo.MıcroblogController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MicroblogController {

    private List<String> posts = new ArrayList<>();

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("posts", posts);
        return "index";
    }
    

@PostMapping("/post")
public String addPost(@RequestParam("postContent") String postContent) {
    posts.add(postContent);
    return "redirect:/";
}

}
