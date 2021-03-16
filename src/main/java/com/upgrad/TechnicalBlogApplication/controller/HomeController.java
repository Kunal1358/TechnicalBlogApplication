package com.upgrad.TechnicalBlogApplication.controller;

import com.upgrad.TechnicalBlogApplication.model.Post;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

    @RequestMapping("/getAllPosts")
    public String getAllPost(Model model) {

        ArrayList<Post> posts =new ArrayList<>();

        Post post1=new Post();
        post1.setTitle("iPhone");
        post1.setBody("iPhones are not better than Android");
        post1.setDate(new Date());

        Post post2=new Post();
        post2.setTitle("YouTube");
        post2.setBody("1K Subs + 4k Watch Hours");
        post2.setDate(new Date());

        Post post3=new Post();
        post3.setTitle("Summers");
        post3.setBody("Summer sale is coming");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        model.addAttribute("posts",posts);
        return "index";

    }
}
