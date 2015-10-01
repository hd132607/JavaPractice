package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by codertimo on 15. 10. 1..
 */
public class MelonGenreChart {
    public static void main(String args[]) {

        Map<String, List<Music>> musics = new HashMap<>();

        ArrayList<Music> balade = new ArrayList<>();
        ArrayList<Music> dance = new ArrayList<>();
        musics.put("발라드",balade);
        musics.put("댄스", dance);

        balade.add(new Music("내 첫사랑", "베리굿"));
        balade.add(new Music("또 다시 사랑", "임창정"));
        balade.add(new Music("부산에 가면", "박진영"));

        dance.add(new Music("커피", "유재환,김예림"));
        dance.add(new Music("다 잘될거야", "쿨"));

        System.out.println("-- << 멜론 장르별 챠트 >> --");
        printMap(musics);

        System.out.println("-- << 발라드 3위 곡 변경 >> --");
        balade.get(2).setTitle("지우고 지워도");
        balade.get(2).setSiger("차수경");
        printMap(musics);

        System.out.println("-- << 발라드 1위곡 삭제 >> --");
        balade.remove(0);
        printMap(musics);

        System.out.println("-- << 전체 리스트 삭제 >> --");
        musics.clear();
        printMap(musics);


    }

    public static void printMap(Map<String, List<Music>> map)
    {
        for (Map.Entry<String, List<Music>> entry : map.entrySet( )) {
            System.out.println(entry.getKey());
            int count=1;
            for(Music music : entry.getValue())
            {
                System.out.println(""+count+++". "+music.toString());
            }
        }
    }
}
