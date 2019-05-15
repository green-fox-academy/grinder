package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

    static AtomicLong atomic = new AtomicLong(1);

    private long id;
    private String content;

    public Greeting(String content) {
        this.content = content;
        this.id = atomic.getAndIncrement();
    }

    public long getId() {
            return id;
    }

    public String getContent() {
            return content;
    }
}

