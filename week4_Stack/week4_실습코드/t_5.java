package problem_solving.week4;

import java.util.*;
import java.io.*;

public class t_5 {
    public static void main(String[] args) {
        String	s="(1+3*(4+5))/(6*(7+8))";
        System.out.println(checkParen(s));
    }
    private static boolean checkParen(String s) {
        Stack<Character>	stack=new Stack<>();
        for (Character c : s.toCharArray()) {
            stack.push(c);
        }
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            char a = stack.pop();
            if(a == '(')
                count++;
            else if(a == ')')
                count--;
        }

        if(count == 0)
            return true;
        else
            return false;
    }
}
