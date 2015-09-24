package org.dimigo.exception;

/**
 * Created by codertimo on 15. 9. 23..
 */
public class Movie {

    private String title;
    private int limitAge;


    public Movie(String title,int limitAge) {
        this.limitAge = limitAge;
        this.title = title;
    }

    public int getLimitAge() {
        return limitAge;
    }

    public String getTitle() {
        return title;
    }
}
