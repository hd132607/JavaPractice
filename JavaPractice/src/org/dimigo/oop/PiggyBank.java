package org.dimigo.oop;

/**
 * Created by codertimo on 15. 6. 15..
 */
public class PiggyBank {
    private int balance;

    public void putMoney(FamilyMember familyMember, int amount)
    {
        System.out.println(familyMember.getMemberName()+" "+amount+"원 넣음");
    }
    public void printBalance()
    {
        System.out.println("돼지 저금통 총 금액 :"+this.balance);
    }
}
