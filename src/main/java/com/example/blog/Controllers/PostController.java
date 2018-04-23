package com.example.blog.Controllers;

import com.example.blog.models.Post;
import com.example.blog.models.Users;
import com.example.blog.repositories.PostsRepository;
import com.example.blog.repositories.UserRepository;
import com.example.blog.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    private final PostService postSvc;
    private final PostsRepository postDao;
    private final UserRepository userDao;

    public PostController(PostService postSvc, PostsRepository postDao, UserRepository userDao) {
        this.postSvc = postSvc;
        this.postDao = postDao;
        this.userDao = userDao;
    }


    @GetMapping("/posts")
    public String index(Model model) {
        model.addAttribute("posts", postDao.findAll());
        Users users = userDao.findOne(1L);
//        String email = userDao.findById(1L).getEmail();
        return "/posts/index";
    }


    @GetMapping("/posts/{id}")
    public String show(@PathVariable long id, Model model) {
        model.addAttribute("post", postDao.findOne(id));
        return "/posts/show";
    }

    @GetMapping("/posts/create")
    public String showCreateForm(Model model) {
        model.addAttribute("newPost", new Post());
        return "/posts/create";
    }

    @PostMapping("/posts/create")
    public String insert(@ModelAttribute Post newPost) {
        newPost.setUser(userDao.findById(1L));
        postDao.save(newPost);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String showEditForm(@PathVariable long id, Model model) {
        model.addAttribute("post", postDao.findOne(id));
        return "/posts/edit";
    }

    @PostMapping("/posts/edit")
    public String editPost(@PathVariable long id, @ModelAttribute Post post) {
        postDao.save(post);
        return "redirect:/posts";
    }
    @PostMapping("/posts/delete")
    public String deletePost(@ModelAttribute Post post) {
        postDao.delete(post);
        return "redirect:/posts";
    }
}
