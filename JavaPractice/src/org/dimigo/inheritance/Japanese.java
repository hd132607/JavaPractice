package org.dimigo.inheritance;

/**
 * Created by codertimo on 15. 8. 27..
 */
public class Japanese extends Person {
    @Override
    public void sayHello() {
        System.out.println("오하이오");
    }

    @Override
    public void sayBye() {
        System.out.println("사요나라");
    }
}
