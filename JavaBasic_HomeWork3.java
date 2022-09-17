/**
 *Java Basic. Home work - 3. 
 *
 * @author Maksym Samohorodskyi
 * @todo 12.09
 * @date 17.09
**/
class JavaBasic_HomeWork3 {
    public static void main(String[] args) {
        //task 1
        int[] array = {10, 15, 7, 47, 1, 35, 22};
        printArray(array);

        //task 2
        int max = getMax(array);
        System.out.println("Max = " + max);

        //task 3
        int[] invArray = {0,0,1,1,0,1,0,0,1,1};
        printArray(invertArray(invArray));
    }

    //task 1
    static void printArray(int[] array) {
        System.out.print("<");
        for (int i = 0; i < array.length; i ++){
            System.out.print(array[i]);
            if(i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(">");
    }

    //task2
    static int getMax(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    //task 3
    
    static int[] invertArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++){
            if (array[i] == 0) {
                result[i] = 1;
            } else if (array[i] == 1) {
                result[i] = 0;
            }
        }
        return result;
    }
}