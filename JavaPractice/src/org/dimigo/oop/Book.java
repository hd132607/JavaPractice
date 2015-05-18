package org.dimigo.oop;

/**
 * Created by codertimo on 2015. 4. 10..
 */
public class Book {
    private String title;
    private String auther;
    private int page;

   public String getTitle()
   {
       return this.title;
   }
    public String getAuther()
    {
        return this.auther;
    }
    public int getPage()
    {
        return this.page;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setAuther(String auther)
    {
        this.auther = auther;
    }
    public void setPages(int pages)
    {
        this.page = pages;
    }
}
