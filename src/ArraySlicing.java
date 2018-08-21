

class ArraySlicing {

    private int count = 0;


    public int solution(int[] A) {
        count = 0;
        if (A.length == 2) return 2;
        canSplit(A, A.length);

        return count;
    }


    public void canSplit(int[] items, int indexStart) {

        boolean canSplit = true;
        boolean isSorted = true;
        int max = 0;
        int indexMax = 0;
        int previous = items[0];
        for (int i = 0; i < indexStart; i++) {
            if (max < items[i]) {
                max = items[i];
                indexMax = i;
            }
            if (isSorted) {
                if (previous > items[i]) isSorted = false;
                previous = items[i];
            }
        }
        if (isSorted) {
            count += indexStart;
            return;
        }
        if (indexMax == 0) canSplit = false;
        for (int i = 0; i < indexMax; i++) {
            for (int j = indexMax + 1; j < items.length; j++) {
                if (items[j] < items[i]) canSplit = false;
            }
        }

        count++;
        if (canSplit) {
            canSplit(items, indexMax);
        }
    }
}
