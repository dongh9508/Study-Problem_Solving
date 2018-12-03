package problem_solving.week6;

import java.util.*;

public class t_20 {
    public static void main(String[] args) {
        String s[]={"서울", "대구", "부산"};
        perm(s, 0);
    }
    private static void perm(String[] s, int i) {
        if(i==s.length){
            for(int k=0; k<s.length; k++)
                System.out.print(s[k] + " ");
            System.out.println();
            return;
        }
        for (int j = i; j < s.length; j++) {
            String temp= s[i]; s[i]=s[j]; s[j]=temp; // swap
            perm(s, i+1);
            temp=s[i]; s[i]=s[j]; s[j]=temp; // swap
        }
    }
}
