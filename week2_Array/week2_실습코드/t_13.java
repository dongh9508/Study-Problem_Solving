package problem_solving.week2;

import java.util.*;

public class t_13 {
    public static void main(String[] args) {
        char[] s = {'화','수','목','금','토','일'};
        System.out.println(Arrays.toString(s)); // 삽입 전
        char[] t = new char[s.length+1];

        for(int i=0; i<s.length; i++)
            t[i+1] = s[i];

        t[0]='월';
        s=t;
        System.out.println(Arrays.toString(s)); // 삽입 후
    }
}
