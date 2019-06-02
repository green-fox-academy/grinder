package com.greenfoxacademy.exam.urlAlias;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UrlAlias {

    @Id
    @GeneratedValue
    private long id;
    private String url;
    private String alias;
    private int secretCode;

    public UrlAlias() {
        this.secretCode = (int)(Math.random() * 9999 + 1000);
    }

    public UrlAlias(String url, String alias) {
        this.url = url;
        this.alias = alias;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(int secretCode) {
        this.secretCode = secretCode;
    }
}
