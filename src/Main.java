public class Main {

    public static void main(String[] args) {
//        testCheckers();
        testArraySlicing();
    }

    private static void testCheckers() {
        Checkers checkers = new Checkers();
        String[] B = new String[11];
//        B[0] = "..X..........";
//        B[1] = "..X..X.......";
//        B[2] = "......X......";
//        B[3] = "X..XX.X......";
//        B[4] = "......X......";
//        B[5] = ".X.XX........";
//        B[6] = "..X..........";
//        B[7] = ".X...X.X.....";
//        B[8] = ".............";
//        B[9] = "...X.X.......";
//        B[10]= "....O........";

//        B[0] = "..X...";
//        B[1] = "......";
//        B[2] = "....X.";
//        B[3] = ".X....";
//        B[4] = "..X.X.";
//        B[5] = "...O..";

//        B[0] = "X....";
//        B[1] = ".X...";
//        B[2] = "..O..";
//        B[3] = "...X.";
//        B[4] = ".....";


        System.out.println(checkers.solution(B));

    }

    private static void testArraySlicing() {
//        int[] A = {2, 1, 6, 4, 3, 7};
        //3
        int[] A = {2, 4, 1, 6, 5, 9, 7};
        //3
//        int[] A = {4, 3, 2, 6, 1};
        //1
//        int[] A = {10, 100, 100_000, 1000, 100_00, 1000000, 10000000, 100000000, 1000000000};

//        int[] A = {1, 2, 10, 3, 9, 12, 13};

//
//        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] A = {10, 4, 3, 2, 8};

        ArraySlicing arraySlicing = new ArraySlicing();
        System.out.println(arraySlicing.solution(A));
    }
}
