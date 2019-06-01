package greenfoxacademy.fox.fox;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoxRepository extends CrudRepository<Fox, Long> {
}
