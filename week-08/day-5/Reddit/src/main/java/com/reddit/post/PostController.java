package com.reddit.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;

@Controller
public class PostController {

    PostRepository postrepo;
    RepoService repoService;

    @Autowired
    public PostController(PostRepository postrepo, RepoService repoService) {
        this.postrepo = postrepo;
        this.repoService = repoService;
    }

    @GetMapping("/")
    public String getIndex(Model model) {
        //model.addAttribute("list", postrepo.findAll());
        model.addAttribute("list", postrepo.orderedPosts());
        return "index";
    }

    @GetMapping("/submit")
    public String getSubmit() {
        return "submit";
    }

    @PostMapping("/submit")
    public String createPost(@RequestParam String title, @RequestParam String url) {
        postrepo.save(new Post(title, url));
        return "redirect:/";
    }

    @GetMapping("/minus/{id}") //i need to understand this
    public String decrement(@PathVariable Integer id){
        repoService.downvote(id); //and the reposervice
        //Post post = postrepo.findById(new Long(id)).get();
        //post.downvote();
        //postrepo.save(post);
        return "redirect:/";
    }

    @GetMapping("/plus/{id}") //i need to understand this
    public String increment(@PathVariable Integer id){
        Post post = postrepo.findById(new Long(id)).get();
        post.upvote();
        postrepo.save(post);
        return "redirect:/";
    }
}
