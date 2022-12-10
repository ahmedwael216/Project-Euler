package src;
import java.util.HashMap;
import java.util.Map;

public class Problem_26 {
    public static void main(String[] args) {
        int maxLength = -1;
        int maxNumber = 0;
        for (int i = 2; i < 1000 ; i++) {
            int len = getCycleLength(i);
            if(len>maxLength){
                maxLength=len;
                maxNumber=i;
            }
        }
        System.out.println(maxNumber);
    }
    public static int getCycleLength(int n) {
        Map<Integer,Integer> stateToIter = new HashMap<>();
        int state = 1;
        for (int iter = 0; ; iter++) {
            if (stateToIter.containsKey(state))
                return iter - stateToIter.get(state);
            else {
                stateToIter.put(state, iter);
                state = state * 10 % n;
            }
        }
    }
}
