package problem_solving.week4;

import java.util.*;
import java.io.*;

public class t_10 {
    public static void main(String[] args) {
        String	e="3 1 2 / *";
        System.out.println(postfixEval(e));
    }
    private static double postfixEval(String e) {
        Stack<Double>	stack=new Stack<>();
        for (String token : e.split("\\s+")) {
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                double n1 = 0;
                double n2 = 0;
                if(token.equals("+")) {
                    n2 = stack.pop();
                    n1 = stack.pop();
                    stack.push(n1+n2);
                }
                else if(token.equals("-")) {
                    n2 = stack.pop();
                    n1 = stack.pop();
                    stack.push(n1-n2);
                }
                else if(token.equals("*")) {
                    n2 = stack.pop();
                    n1 = stack.pop();
                    stack.push(n1*n2);
                }
                else {
                    n2 = stack.pop();
                    n1 = stack.pop();
                    stack.push(n1/n2);
                }
            }
            else {
                stack.push(Double.valueOf(token));
            }
        }
        return stack.pop();
    }
}
