package com.foxclubagain.fox;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface FoxRepository extends CrudRepository<Fox, Long> {

    @Query(value = "SELECT * FROM fox ORDER BY id DESC LIMIT 1", nativeQuery = true)
    Optional<Fox> lastFox();

    Optional<Fox> findFoxByDrink(String drink);
    Optional<Fox> findFoxById(Long id);
    List<Fox> findAll();

    @Query(value = "SELECT * FROM fox ORDER BY id ASC LIMIT 1", nativeQuery = true)
    Optional<Fox> foxWithLowestId();

    @Query(value = "SELECT drink FROM fox", nativeQuery = true)
    List<String > drinks();
}
