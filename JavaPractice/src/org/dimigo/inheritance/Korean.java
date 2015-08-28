package org.dimigo.inheritance;

/**
 * Created by codertimo on 15. 8. 27..
 */
public class Korean extends Person{

    @Override
    public void sayHello() {
        System.out.println("안녕하세요");
    }

    @Override
    public void sayBye() {
        System.out.println("잘가요");
    }
}
