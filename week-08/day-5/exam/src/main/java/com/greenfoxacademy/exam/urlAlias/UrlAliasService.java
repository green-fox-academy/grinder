package com.greenfoxacademy.exam.urlAlias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UrlAliasService {

    private UrlAlias itemToDisplayed = new UrlAlias();
    private UrlAliasRepository urlRepo;

    @Autowired
    public UrlAliasService(UrlAliasRepository urlRepo) {
        this.urlRepo = urlRepo;
    }

    public UrlAlias getItemToDisplayed() {
        return itemToDisplayed;
    }

    public void setItemToDisplayed(UrlAlias itemToDisplayed) {
        this.itemToDisplayed = itemToDisplayed;
    }

    public boolean isAlreadyStored(String alias) {
        Optional<UrlAlias> sameItem = urlRepo.getItemByAlias(alias);
        return sameItem.isPresent();
    }

    public void save(UrlAlias urlAlias) {
        urlRepo.save(urlAlias);
    }

    public String getMessage() {
        if(isAlreadyStored(itemToDisplayed.getAlias())) {
            return "Your alias is already in use!";
        }
        else {
            return "Your URL is aliased to " + itemToDisplayed.getAlias() + " and your secret code is " + itemToDisplayed.getSecretCode();
        }
    }

    
}
