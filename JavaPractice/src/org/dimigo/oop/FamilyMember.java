package org.dimigo.oop;

/**
 * Created by codertimo on 15. 6. 15..
 */
public class FamilyMember {
    private static int memberCnt;
    private String memberName;

    public FamilyMember(String memberName)
    {
        this.memberName = memberName;
        memberCnt++;
    }
    public String getMemberName()
    {
        return this.memberName;
    }
    public static void printMemberCnt()
    {
        System.out.println("총 가족 인원수:"+memberCnt);
    }
}
