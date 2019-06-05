package com.orientationexam.urlAlias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlAliasService {

    UrlAliasRepository urlAliasRepo;

    @Autowired
    public UrlAliasService(UrlAliasRepository urlAliasRepo) {
        this.urlAliasRepo = urlAliasRepo;
    }

    public void saveUrlAlias() {
        urlAliasRepo.save(new UrlAlias());
    }
}
