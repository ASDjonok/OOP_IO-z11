public class Lab2 {
    public static void main(String[] args) {
//        int[] array;

//        ....

//        array = new int[4];
        int[] array = {1, 2, 3};
        System.out.println(array);
        System.out.println(array.length);
        System.out.println(array[2]);

//        int[][] matrix = new int[2][3];
        int[][] matrix = new int[2][];

        matrix[0] = new int[3];
        matrix[1] = new int[4];

        /*int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6, 7}
        };*/

        System.out.println(matrix[0][1]);
    }
}
