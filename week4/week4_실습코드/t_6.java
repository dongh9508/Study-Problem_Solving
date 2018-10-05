package problem_solving.week4;

import java.util.*;
import java.io.*;

public class t_6 {
    public static void main(String[] args) {
        String	s="부산({Busan}[(Boo)(saan)])시청({City}{hall}[(See)(Cheong)])"; // true
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
            if(a == '(' || a == '{' || a == '[' )
                count++;
            else if(a == ')' || a == '}' || a == ']')
                count--;
        }

        if(count == 0)
            return true;
        else
            return false;
    }
}
