package com.foxclubagain.fox;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface FoxRepository extends CrudRepository<Fox, Long> {

    @Query(value = "SELECT * FROM fox ORDER BY id DESC LIMIT 1", nativeQuery = true)
    Optional<Fox> lastFox();

    //Optional<Fox> findFoxByDrink(String drink);
}
