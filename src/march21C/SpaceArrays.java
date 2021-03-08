package march21C;

import java.io.*;
import java.lang.*;
import java.util.*;

/**
 * @link https://www.codechef.com/MARCH21C/problems/SPACEARR
 */
public class SpaceArrays {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split("\\s");
            int[] spaceArr = new int[n];
            for (int i = 0; i < n; i++) {
                spaceArr[i] = Integer.parseInt(line[i]);
            }
            Arrays.sort(spaceArr);
            int sum = 0;

            boolean ans = false;
            for (int i = 1; i <= n; i++) {
                if (spaceArr[i - 1] > i) {
                    ans = true;
                    break;
                }
                sum += i - spaceArr[i - 1];
            }

            if (ans || sum % 2 == 0) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        }
    }
}
