package org.dimigo.basic;

import java.util.Scanner;

/**
 * Created by Timo on 15. 3. 26..
 */
public class While {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int menu;

        //<게임메뉴>
        //1. 공격
        //2. 수비
        //3. 종료

        do {
            System.out.println("----------Welcome to Dimigo------------");
            System.out.println("1. 점호열외");
            System.out.println("2. 무단외출");
            System.out.println("3. 자수하기");
            menu = scanner.nextInt();  // 키보드로 입력한 숫자 가져오기 //Returen value Type : int

            switch (menu)
            {
                case 1:
                    System.out.println("오늘은 점호열외일이 아닙니다!! <청소봉사 3일>");
                    break;
                case 2:
                    System.out.println("전희진 선생?님한테 적발되었습니다!! <선도위원회>");
                    break;
                case 3:
                    System.out.println("자수한 너는 멋쟁이 !!!<윤영진>");
                    break;
                default:
                    System.out.println("노잼입니다");
                    break;

            }
        }while(menu != 3);
    }
}
