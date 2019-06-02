package greenfoxacademy.fox.fox;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
public interface FoxRepository extends CrudRepository<Fox, Long> {

    @Query(value = "SELECT * FROM fox ORDER BY id ASC", nativeQuery = true)
    Collection<Fox> orderById();
}
