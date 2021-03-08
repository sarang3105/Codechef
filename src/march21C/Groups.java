package march21C;

import java.io.*;
import java.lang.*;
import java.util.*;

/**
 * @link https://www.codechef.com/MARCH21C/problems/GROUPS
 */
public class Groups {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] count = br.readLine().split("0");
            int sum = 0;
            for (String s: count) {
                if (!s.equals("")) {
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
