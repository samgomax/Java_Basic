/**
 *Java Basic. Home work - 2. Methods
 *
 * @author Maksym Samohorodskyi
 * @todo 07.09
 * @date 02.10
**/
class HomeWork2 {
    public static void main(String[] args) {
        //task 1
        int temperature = 15;
        System.out.println(checkWeather(-5));
        System.out.println(checkWeather(5));
        System.out.println(checkWeather(25));
        System.out.println(checkWeather(35));

        //task 2
        System.out.println(canWalk(true, true)? "I can walk" : "I can't walk");
        System.out.println(canWalk(false, true)? "I can walk" : "I can't walk");
        System.out.println(canWalk(true, false)? "I can walk" : "I can't walk");
        System.out.println(canWalk(false, false)? "I can walk" : "I can't walk");

        //task 3
        int a = 5;
        int b = 3;
        System.out.printf("%d + %d = %d\n", a, b, add(a, b));
        System.out.printf("%d - %d = %d\n", a, b, sub(a, b));
        System.out.printf("%d * %d = %d\n", a, b, mul(a, b));
        System.out.printf("%d / %d = %f\n", a, b, div(a, b));
    }

    static String checkWeather(int temperature){
        if(temperature < 0) {
            return "It's a frost";
        } else if (temperature <= 18) {
            return "It's cold";
        }else if (temperature <=28) {
            return "it's warm";
        }else {
            return "It's hot";
        }
    }

    static boolean canWalk(boolean isWeekend, boolean isRain) {
        return isWeekend && !isRain;
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static float  div(float a, float b) {
        return a / b;
    }
}