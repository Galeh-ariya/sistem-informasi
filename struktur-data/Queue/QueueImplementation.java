package pertemuan9;


import java.util.Arrays;

public class QueueImplementation {
    public static void main(String[] args) {

        int[] array = new int[5];

        // logika memasukkan
        //<- out [1][2][3][4][5]  <- in
        //<- out [0][0][0][0][0]  <- in 1, 2, 3


        //logika mengeluarkan
        //<- out [1][2][3][4][5]  <- in
        //1, 2, 3, 4, 5 <- out [0][0][0][0][0]  <- in

        // [1][2][3][4][0]
        // output -> 5


        pull(1, array);
        System.out.println(Arrays.toString(array));

        pull(2, array);
        System.out.println(Arrays.toString(array));

        pull(3, array);
        System.out.println(Arrays.toString(array));

        pull(4, array);
        System.out.println(Arrays.toString(array));

        pull(5, array);
        System.out.println(Arrays.toString(array));

        System.out.println("");


        int result1 = get(array);
        System.out.println(result1);
        System.out.println(Arrays.toString(array));

        int result2 = get(array);
        System.out.println(result2);
        System.out.println(Arrays.toString(array));

        int result3 = get(array);
        System.out.println(result3);
        System.out.println(Arrays.toString(array));

        int result4 = get(array);
        System.out.println(result4);
        System.out.println(Arrays.toString(array));

        int result5 = get(array);
        System.out.println(result5);
        System.out.println(Arrays.toString(array));



    }

    public static void pull(int data, int[] array) {

        for(var i = 0; i < array.length; i++) {

            if(array[i] == 0) {
                array[i] = data;
                break;
            }

        }

    }

    public static int get(int[] array) {

        // 1, 2, 3, 4, 5
        for(var i = 0; i < array.length; i++) {

            if(array[i] != 0) {
                var temp = array[i];
                // 1, 2, 3, 4, 5
                array[i] = 0;
                // 0, 2, 3, 4, 5
                return temp;
            } else {
                continue;
            }

        }

        return 0;

    }

}
