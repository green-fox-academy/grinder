package com.greenfoxacademy.trialexam.urlAlias;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UrlAlias {

    @Id
    @Column(length = 30)
    private String alias;
    private String url;
    private int secretCode = (int)(Math.random() * 9999 + 1000);

    public UrlAlias() {

    }

    public UrlAlias(String url, String alias) {
        this.url = url;
        this.alias = alias;
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
