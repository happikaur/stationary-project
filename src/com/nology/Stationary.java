package com.nology;

public class Stationary implements StationaryInterface {
    private int pens;
    private int staplers;
    private int staples;
    private int rulers;
    private int a4Booklets;

    public Stationary(int pens, int staplers, int staples, int rulers, int a4Booklets) {
        this.pens = pens;
        this.staplers = staplers;
        this.staples = staples;
        this.rulers = rulers;
        this.a4Booklets = a4Booklets;
    }

    public int getPens() {
        return pens;
    }

    public void setPens(int pens) {
        this.pens = pens;
    }

    public void addPens(int pens) {
        this.pens += pens;
    }

    public void removePens(int pens) {
        this.pens -= pens;
    }

    public int getStaplers() {
        return staplers;
    }

    public void setStaplers(int staplers) {
        this.staplers = staplers;
    }

    public void addStaplers(int staplers) {
        this.staplers += staplers;
    }

    public void removeStaplers(int staplers) {
        if (staplers > this.staplers ) {
            throw new IllegalArgumentException();
        } else {
            this.staplers -= staplers;
        }

    }

    public int getStaples() {
        return staples;
    }

    public void setStaples(int staples) {
        this.staples = staples;
    }

    public void addStaples(int staples) {
        this.staples += staples;
    }

    public void removeStaples(int staples) {
        if (staples > this.staples ) {
            throw new IllegalArgumentException();
        } else {
            this.staples -= staples;
        }
    }

    public int getRulers() {
        return rulers;
    }

    public void setRulers(int rulers) {
        this.rulers = rulers;
    }

    public void addRulers(int rulers) {
        this.rulers += rulers;
    }

    public void removeRulers(int rulers) {
        this.rulers -= rulers;
    }

    public int getA4Booklets() {
        return a4Booklets;
    }

    public void setA4Booklets(int a4Booklets) {
        this.a4Booklets = a4Booklets;
    }

    public void addA4Booklets(int staples) {
        this.a4Booklets += a4Booklets;
    }

    public void removeA4Booklets(int staplers) {
        this.a4Booklets -= a4Booklets;
    }
}
