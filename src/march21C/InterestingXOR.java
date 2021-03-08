package march21C;

import java.io.*;
import java.lang.*;
import java.util.*;

/**
 * @link https://www.codechef.com/MARCH21C/problems/IRSTXOR
 */
public class InterestingXOR {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            long c = Integer.parseInt(br.readLine());
            long d = (long) Math.ceil(Math.log(c) / Math.log(2));
            long twoPowerD = (long) Math.pow(2, d);
            long max = 0;
            long l = (long) (Math.log(twoPowerD) / Math.log(2));
            for (long i =  l; i < twoPowerD; i++) {
                    long j = i ^ c;
                    long a = j ^ i;
                    if ( a == c) max = Math.max(max, i * j);
            }
            System.out.println(max);
        }
    }
}