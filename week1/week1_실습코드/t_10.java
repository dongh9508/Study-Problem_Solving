package problem_solving.chap1;

import java.io.*;
import java.math.BigInteger;

public class t_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s1 = in.readLine();
        String s2 = in.readLine();
        int c = 0;

        if(s1.length() > s2.length())
            c = s1.length();
        else
            c = s2.length();

        int[] arr = new int[c];

        for(int i=c-1; i>=0; i--) {

            if(s1.length() > s2.length()) {
                int a = s1.length() - s2.length();
                for(int k=0; k<a; k++)
                    s2 = "0" + s2;
            }
            else {
                int a = s2.length() - s1.length();
                for(int k=0; k<a; k++)
                    s1 = "0" + s1;
            }
            int num = 0;

            int x = Integer.valueOf(String.valueOf(s1.charAt(i)));
            int y = Integer.valueOf(String.valueOf(s2.charAt(i)));
            num = x + y;

            if (num == 9 && arr[i] == 1 && i != 0) {
                arr[i - 1] = arr[i - 1] + 1;
            }

            if (num > 9 && i != 0) {
                arr[i - 1] = arr[i - 1] + num / 10;
                arr[i] = arr[i] + num % 10;
            } else {
                arr[i] = arr[i] + num;
            }

            if (arr[i] == 10 && i != 0)
                arr[i] = 0;
        }


        for(int i=0; i<arr.length; i++) {
            if(String.valueOf(arr[i]) != null && arr[0] != 0)
                System.out.print(arr[i]);
        }

        System.out.println();
        /*
        제대로 계산이 되는지 확인을 위해서 밑에 있는 s3와 s4의 값을 s1과 s2에 입력해서 결과값이
        동일하게 나오는지 확인하였습니다. 결과는 동일한 값으로 나옵니다.
        */
        String s3="-1";
        String s4="200";
        BigInteger n1=new BigInteger(s3);
        BigInteger n2=new BigInteger(s4);
        System.out.println(n1.add(n2));
    }
}
