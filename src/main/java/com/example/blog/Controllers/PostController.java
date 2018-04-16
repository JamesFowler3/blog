package com.example.blog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    @GetMapping(path = "/posts")
    @ResponseBody
    public String Index() {
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String ViewPost(@PathVariable int id) {
        return "view an individual post";
    }
    @GetMapping("/posts/create")
    @ResponseBody
    public String CreatingForm() {
        return "view the form for creating a post";
    }
    @PostMapping("/posts/create")
    @ResponseBody
    public String CreatingNewPost() {
        return "view an individual post";
    }
}
