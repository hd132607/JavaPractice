package org.dimigo.basic;

/**
 * Created by Timo on 15. 3. 23..
 */
public class Condition {
    public static void main(String argv[])
    {
        int fast_bus = 850;
        int classic_car = 300;
        int default_pay = 600;

        int pay_bus= 300;
        int pay_etc = 200;

        int total_price =0 ;

        String car_type = "고속버스";
        int distance = 25;

        int up_distance =0;
        if(distance%10>=5)
            up_distance = (distance/10 +1) * 10;


        switch (car_type)
        {
            case "고속버스":
                total_price += fast_bus;
                if(up_distance >10)
                    total_price += (up_distance / 10 -1) * pay_bus;
                break;
            case "경차":
                total_price += classic_car;
                if(up_distance >10)
                    total_price += (up_distance / 10 -1) * pay_etc;
                break;
            default:
                total_price += default_pay;
                if(up_distance >10)
                    total_price += (up_distance / 10 -1) * pay_etc;
                break;
        }

        System.out.println("<<고속도로 통행료 계산>>");
        System.out.println("거리: "+distance+"km");
        System.out.println("차종: "+car_type);
        System.out.println("금액 :"+total_price+"원");
    }
}
