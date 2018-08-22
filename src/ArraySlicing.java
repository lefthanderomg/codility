import java.util.Stack;

class ArraySlicing {


    public int solution(int[] A) {
        Stack<Integer> stackArray = new Stack<>();
        stackArray.push(A[0]);
        for (int i = 1; i < A.length; i++) {
            if (A[i] >= stackArray.peek()) stackArray.push(A[i]);
            else {
                int last = stackArray.pop();
                while (stackArray.size() > 0 && A[i] < stackArray.peek()) stackArray.pop();
                stackArray.push(last);
            }
        }
        return stackArray.size();
    }


}
