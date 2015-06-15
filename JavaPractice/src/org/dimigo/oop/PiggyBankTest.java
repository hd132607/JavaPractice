package org.dimigo.oop;

/**
 * Created by codertimo on 15. 6. 15..
 */
public class PiggyBankTest {

    public static void main(String[] args)
    {
        PiggyBank piggyBank = new PiggyBank();

        FamilyMember mom = new FamilyMember("엄마");
        FamilyMember father = new FamilyMember("아빠");
        FamilyMember me = new FamilyMember("나");
        FamilyMember sister = new FamilyMember("동생");

        piggyBank.putMoney(mom,10000);
        piggyBank.putMoney(father,5000);
        piggyBank.putMoney(me,100000);

        piggyBank.printBalance();

        piggyBank.putMoney(sister,500);

        piggyBank.printBalance();
    }
}
