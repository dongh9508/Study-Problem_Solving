package problem_solving.week4;

import java.util.*;

public class t_11 {
    public static void main(String[] args) {
        String e="34 12 25/*";
        System.out.println(postfixEval(e));
    }
    private static double postfixEval(String e) {
        Stack<Double> stack = new Stack<>();
        String[] str = e.split(" ");
        String operator = null;

        for (int i = 0; i < str.length; i++) {
            for(int z = 0; z<str[i].length(); z++) {
                if (str[i].charAt(z) == '+' || str[i].charAt(z) == '-' ||
                        str[i].charAt(z) == '/' || str[i].charAt(z) == '*') {

                    if (operator == null)
                        operator = String.valueOf(str[i].charAt(z));
                    else
                        operator += String.valueOf(str[i].charAt(z));

                    String str2 = String.valueOf(str[i].charAt(z));
                    String str3 = str[i].replace(str2, " ");
                    str[i] = str3;
                }
            }
        }

        for(int j=0; j<str.length; j++) {
            stack.push(Double.valueOf(str[j]));
        }

        for(int k=0; k<stack.size(); k++) {
            double n2 = stack.pop();
            double n1 = stack.pop();
            if(operator.charAt(k) == '/') {
                stack.push(n1/n2);
            }
            else if(operator.charAt(k) == '*') {
                stack.push(n1*n2);
            }
            else if(operator.charAt(k) == '+')
                stack.push(n1+n2);
            else if(operator.charAt(k) == '-')
                stack.push(n1-n2);
        }
        return stack.pop();

    }
}
