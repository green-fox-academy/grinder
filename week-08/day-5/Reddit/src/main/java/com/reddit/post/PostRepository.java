package com.reddit.post;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

    @Query(value = "SELECT * FROM post ORDER BY rate DESC", nativeQuery = true)
    Collection<Post> orderedPosts(); //what is nativequery and collection
}
