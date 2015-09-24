package org.dimigo.collection;

/**
 * Created by codertimo on 15. 9. 24..
 */
public class Music {
    private String title;
    private String siger;


    public Music(String title, String siger) {
        this.title = title;
        this.siger = siger;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSiger() {
        return siger;
    }

    public void setSiger(String siger) {
        this.siger = siger;
    }
    public String toString(){
        return "Music [title="+title+", siger="+siger+"]";
    }

}
