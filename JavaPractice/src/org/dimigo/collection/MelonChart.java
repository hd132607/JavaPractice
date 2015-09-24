package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codertimo on 15. 9. 24..
 */
public class MelonChart {
    public static void main(String args[])
    {
        ArrayList<Music> musics = new ArrayList<>();
        musics.add(new Music("바람이나 좀 쐐","개리"));
        musics.add(new Music("보통연애", "박경"));
        musics.add(new Music("취향저격", "iKon"));

        System.out.println("-- << 멜론 챠트 >> --");
        printList(musics);

        System.out.println("-- << 2위 곡 추가 >> --");
        musics.add(new Music("레옹", "이유갓지"));
        printList(musics);

        System.out.println("-- << 3위 곡 변경 >> --");
        musics.get(2).setTitle("맙소사");
        musics.get(2).setSiger("황태지");
        printList(musics);

        System.out.println("-- << 4위 곡 삭제 >> --");
        musics.remove(3);
        printList(musics);

        System.out.println("-- << 전체 리스트 삭제 >> --");
        musics.clear();
        printList(musics);
    }

    public static void printList(List<Music> musics)
    {
        int count=0;
        for (Music music : musics)
        {
           System.out.println(""+count+++". "+music.toString());
        }
    }
}
