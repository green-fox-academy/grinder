package com.greenfoxacademy.exam.urlAlias;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UrlAliasRepository extends CrudRepository<UrlAlias, Long> {

    //@Query(value = "SELECT * FROM alias a WHERE a.alias = ?1 ", nativeQuery = true)
    Optional<UrlAlias> getItemByAlias(String alias);

}
