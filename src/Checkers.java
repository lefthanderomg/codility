import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Checkers {

    public int solution(String[] B) {
        for (int i = 0; i < B.length; i++) {
            String strO = B[i];
            if (strO.contains("O")) {
                int count = 0;
                boolean findX = true;
                int indexO = strO.indexOf("O");
                List<Integer> indexListDot = new ArrayList<>();
                List<Pair<Integer, Integer>> indexListX = new ArrayList<>();
                int big = indexO + 1;
                int small = indexO - 1;
                if (small >= 0) indexListX.add(new Pair<>(small, indexO));
                if (big <= strO.length()) indexListX.add(new Pair<>(big, indexO));

                if (i != 0) {
                    for (int j = i - 1; j >= 0; j--) {
                        String[] currentLine = B[j].split("");

                        if (findX) {
                            findX = false;
                            ArrayList<Integer> newIndexList = new ArrayList<>();
                            for (int l = 0; l < currentLine.length; l++) {
                                if (currentLine[l].equals("X")) {
                                    for (Pair<Integer, Integer> item : indexListX) {
                                        if (l == item.getKey()) {
                                            if (l - 1 >= 0 && item.getKey() < item.getValue()) {
                                                newIndexList.add(l - 1);
                                            }

                                            if (l + 1 <= currentLine.length && item.getKey() > item.getValue()) {
                                                newIndexList.add(l + 1);
                                            }
                                        }
                                    }
                                }

                            }
                            indexListDot = newIndexList;

                        } else {
                            ArrayList<Pair<Integer, Integer>> newIndexList = new ArrayList<>();
                            boolean canJump = false;
                            for (int l = 0; l < currentLine.length; l++) {
                                if (currentLine[l].equals(".")) {
                                    for (Integer item : indexListDot) {
                                        if (l == item) {
                                            canJump = true;
                                            int bigL = l + 1;
                                            int smallL = l - 1;
                                            if (smallL >= 0) newIndexList.add(new Pair<>(smallL, l));
                                            if (bigL <= strO.length()) newIndexList.add(new Pair<>(bigL, l));

                                        }
                                    }
                                }
                            }
                            if (canJump) {
                                count++;
                            }
                            indexListX = newIndexList;
                            findX = true;
                        }
                    }
                }
                return count;
            }
        }
        return 0;
    }

    int count;

    public int solution2(String[] B) {
        count = 0;

        return count;
    }


    public void calculate(String[] B) {

        List<Integer> index = new ArrayList<>();
        int indexO = 0;
        for (int i = 0; i < B.length; i++) {
            String strO = B[i];
            if (strO.contains("O")) {
                if (i - 1 < 0 || i + 1 > B.length - 1) return;
                int indexStr = strO.indexOf("O");
                B[i] = strO.replace("O", ".");
                index.add(indexStr - 1);
                index.add(indexStr + 1);
                indexO = i;
            }
        }


        for (int i = indexO + 1; i < B.length; i++) {
            String strX = B[i];
//            int indexXFirst = indexStrO + 1;
//            int indexXSecond = indexStrO - 1;
//            if (strX.substring(indexXFirst).equals("X")) {


        }

    }


}
