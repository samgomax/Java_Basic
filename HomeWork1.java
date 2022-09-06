/**
 *Java Basic. Home work - 1
 *
 * @author Maksym Samohorodskyi
 * @version 
 *
 */
class HomeWork1 {
    public static void main(String[] args) {
        // 1 - assignment to integer variables a, b
        int a = 8, b = 6;
        System.out.println(a);
        System.out.println(b);
        // calculation of the perimeter by variables a, b
        int perimeter = a + b + a + b;
        System.out.println(perimeter);
        //square calculation by variables a, b
        int S = a * b;
        System.out.println(S);
        // 2 - assignment to integer variables c, d
        int c = 5, d = 3;
        System.out.println(c);
        System.out.println(d);
        //arithmetic operation addition, subtraction, multiplication, division
        int sum = c + d;
        System.out.println(sum);
        int sub = c - d;
        System.out.println(sub);
        int mult = c * d;
        System.out.println(mult);
        float div = 5 / 3f;
        System.out.println(div);
        System.out.printf("c = %d, d = %d, sum = %d, sub = %d, mult = %d, div = %f",
        c, d, sum, sub, mult, div);
        // 3 array creation
        int[] numbers = new int[4];
        numbers[0] = 111;
        numbers[1] = 222;
        numbers[2] = 333;
        numbers[3] = 444;
        numbers[4] = 555;
        System.out.println(numbers[0]);
    }
}