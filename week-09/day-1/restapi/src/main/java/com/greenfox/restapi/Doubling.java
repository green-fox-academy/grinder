package com.greenfox.restapi;

public class Doubling {

    int received;
    int result;

    public Doubling() {

    }

    public Doubling(int received) {
        this.received = received;
        this.result = doubleIt(received);
    }

    public int getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int doubleIt(int num) {
        return num * 2;
    }
}
