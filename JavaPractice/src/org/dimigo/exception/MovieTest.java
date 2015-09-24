package org.dimigo.exception;

/**
 * Created by codertimo on 15. 9. 23..
 */
public class MovieTest {

    public static void main(String args[])
    {
        try{
            Movie[] movies =
                    {
                            new Movie("베테랑", 15), new Movie("엔트맨",12), new Movie("사도",12)
                    };
                int age = 13;

            for(Movie movie : movies)
            {
                buyTicket(movie,age);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void buyTicket(Movie movie, int age) throws AgeCheckException {
        if(movie.getLimitAge()>age)
            throw new AgeCheckException(movie);
        System.out.println(movie.getTitle()+" 영화 즐감하세요!");
    }


}
