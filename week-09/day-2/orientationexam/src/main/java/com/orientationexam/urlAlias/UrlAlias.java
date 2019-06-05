package com.orientationexam.urlAlias;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Random;

@Entity
public class UrlAlias {

    @Id
    @Column(length = 100)
    private String url;
    private String alias;
    private String secretCode;

    public UrlAlias() {

    }

    public UrlAlias(String url, String alias, String secretCode) {
        this.url = url;
        this.alias = alias;
        this.secretCode = secretCode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        url = url;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }

    public void generateSecretCode() {
        String result = "";
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int value = random.nextInt(9);
            result += value;
        }
        secretCode = result;
    }
}
