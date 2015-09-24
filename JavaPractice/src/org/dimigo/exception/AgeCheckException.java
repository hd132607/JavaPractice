package org.dimigo.exception;

/**
 * Created by codertimo on 15. 9. 23..
 */
public class AgeCheckException extends Exception {
    public AgeCheckException()
    {}
    public AgeCheckException(Movie movie)
    {
        super(movie.getTitle()+"은/는 "+movie.getLimitAge()+"이상입니다.");
    }
}
