package org.dimigo.oop;

/**
 * Created by codertimo on 15. 5. 28..
 */
public class IdolGroup {
    public static void main(String args[])
    {
        String[] idolGroup = {"빅뱅","2NE1","걸스데이"};
        String [][] members = {
                {"지드래곤","태양","대성","탑","승리"},
                {"시엘","산다라박","박봄","민지"},
                {"유라","혜리","소진","민아"}
        };

        for(int i=0; i<idolGroup.length;i++)
        {
            System.out.println("<<"+idolGroup[i]+">>");
            for(int j=0;j<members[i].length;i++)
                System.out.println(members[i][j]);
        }
    }
}
