package com.reddit.post;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Service
public class RepoService {

    PostRepository postRepo;

    public RepoService(PostRepository postRepo) {
        this.postRepo = postRepo;
    }

    public void downvote(Integer id) {
        Post post = postRepo.findById(new Long(id)).get();
        post.downvote();
        postRepo.save(post);
    }
}
