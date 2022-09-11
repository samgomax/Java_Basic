/**
 *Java Basic. Home work - 2. Methods
 *
 * @author Maksym Samohorodskyi
 * @todo 11.09
 * @date 11.09
 *
 */
class HomeWork2 {
    public static void main(String[] args){
        int c = add(15, 5);
        System.out.println(add(15, 5));
        int d = sub(15, 5);
        System.out.println(sub(15, 5));
        int e = mult(15, 5);
        System.out.println(mult(15, 5));
        int f = div(15, 5);
        System.out.println(div(15, 5));
        
        int t = -8;
        if (t < 0){
            System.out.println("It's frost");
        } else if (t >= 0 && t <= 18){
            System.out.println("It's cold");
        } else if (t >= 19 && t <= 28){
            System.out.println("It's warm");
        } else if (t > 29){
            System. out.println("It's hot");
/* я никак не могу понять как мне правильно написать метод и вернуть строку.
постоянно какая-то ошибка при попытку записать через switch, выводит ошибку,
что нельзя преобразовать int в boolean*/
        }
//** exercise 2
        boolean isWeekend = false;
        boolean isRain = false;
        if(!isWeekend && !isRain) {
            System.out.println("I can't walk");
        }
    }
//*exercise 3
        static int add(int a, int b){
            int c = a+b;
            return c;
        }
        static int sub(int a, int b){
            int d = a-b;
            return d;
        }
        static int mult(int a, int b){
            int e = a*b;
            return e;
        }
        static int div(int a, int b){
            int f = a/b;
            return f;
        }
    }
//* я не могу понять логику последовательности действий. 