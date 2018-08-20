import java.util.Arrays;

class ArraySlicing {

    private int count;

    ArraySlicing() {
        this.count = 0;
    }

    int solution(int[] A) {
        canSplit(A);
        return count;
    }

    private void canSplit(int[] A) {
        count++;
        boolean isSorted = true;
        int max = 0;
        int min = 0;
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < A.length - 1; i++) {
            if (max < A[i]) {
                max = A[i];
                indexMax = i;
            }
            if (min > A[i]) {
                min = A[i];
                indexMin = i;
            }
            if (A[i] > A[i + 1]) {
                isSorted = false;
            }
        }
        if (isSorted) return;
        if (indexMin > indexMax) return;
        if (indexMax == 0) return;
        if (indexMax + 1 != A.length && A.length != 2) {
            for (int i = 0; i < indexMax; i++) {
                for (int j = indexMax + 1; j < A.length; j++) {
                    if (A[j] < A[i]) {
                        return;
                    }
                }

            }
        }

        canSplit(Arrays.copyOfRange(A, 0, indexMax));
    }

}
