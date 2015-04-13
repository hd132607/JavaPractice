package org.dimigo.oop;

/**
 * Created by codertimo on 2015. 4. 10..
 */
public class BookTest {

    public static void main(String args[])
    {
        Book book = new Book();
        book.setAuther("김준성");
        book.setPages(13);
        book.setTitle("자서전");
        System.out.println("제목 :" + book.getTitle());
        System.out.println("저자 :"+book.getAuther());
        System.out.println("페이지 :"+book.getPage());
    }
}
