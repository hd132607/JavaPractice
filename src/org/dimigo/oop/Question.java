package org.dimigo.oop;

import java.util.Scanner;

/**
 * Created by codertimo on 15. 5. 14..
 */
public class Question {
    public static void main(String args[])
    {
        System.out.println("가장 좋아하는 웹툰이름은?");
        Scanner scanner = new Scanner(System.in);
        String webtoon_answer = scanner.nextLine();
        if(webtoon_answer.equals("스튜디오 짭쪼름"))
            System.out.println("맞아요 ㅎㅎ 스튜디오 짭쪼름은 사랑이죠\n");
        else
            System.out.println("틀렸어요... 넌 준성이가 아닌거 같은데\n");

        System.out.println("가장 귀여운 캐릭터 이름은?");
        String char_answer = scanner.nextLine();
        if(char_answer.equals("이소낙"))
            System.out.println("소낙이.....ㅎㅎㅎㅎ 결혼하고싶다 진짜\n");
        else
            System.out.println("틀렸어요... 넌 준성이가 아닌거 같은데\n");

        System.out.println("가장 친한 이성 친구는?");
        String bestfriend_answer = scanner.nextLine();
        if(bestfriend_answer.equals("김태인"))
            System.out.println("맞았어! 음 요즘 좀 상황이 애매하긴 하지?? ㅎ\n");
        else
            System.out.println("틀렸어요... 넌 준성이가 아닌거 같은데\n");

        scanner.close();

    }
}
