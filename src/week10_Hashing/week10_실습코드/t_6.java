package problem_solving.week10;

import java.util.*;

public class t_6 {
    public static void main(String[] args) {
        Random random=new Random();
        int N=10000;
        int n[]=new int[N];
        for (int i = 0; i < n.length; i++) n[i]=random.nextInt(N/2);
    }

    private static int hashasv(int[] n) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i=0; i<n.length; i++) {
            m.put(n[i], m.containsKey(n[i]) ? m.get(n[i] +1) : 1);
            if(m.containsKey(n[i])) {
                int freq = m.get(n[i]);
                freq++;
                m.put(n[i], freq);
            }
            else {
                m.put(n[i], 1);
            }
        }
        int maxFreq = 0, maxValue = n[0];
        for(Integer key : m.keySet()) {
            int freq = m.get(key);
            if(maxFreq < freq) {
                maxFreq = freq;
                maxValue = key;
            }
        }
        return maxValue;
    }
}
