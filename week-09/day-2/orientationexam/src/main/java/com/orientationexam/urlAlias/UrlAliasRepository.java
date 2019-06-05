package com.orientationexam.urlAlias;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlAliasRepository extends CrudRepository<UrlAlias, String> {

}
