package com.greenfoxacademy.trialexam;

import com.greenfoxacademy.trialexam.urlAlias.UrlAlias;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlAliasrepository extends CrudRepository<UrlAlias, Long> {
}
