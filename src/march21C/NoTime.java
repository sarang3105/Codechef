package march21C;

import java.io.*;
import java.lang.*;
import java.util.*;

/**
 * @link https://www.codechef.com/MARCH21C/problems/NOTIME
 */
public class NoTime {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split("\\s");
        int n = Integer.parseInt(line[0]); // timezones
        int h = Integer.parseInt(line[1]); //time needed
        int x = Integer.parseInt(line[2]); //timeleft

        line = br.readLine().split("\\s");
        int[] zones = new int[n];
        for (int i = 0; i < n; i++) {
            zones[i] = Integer.parseInt(line[i]);
        }

        Arrays.sort(zones);

        int lo = 0, hi = n - 1; boolean ans = false;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (zones[mid] + x >= h) {
                ans = true;
                break;
            } else {
                lo = mid + 1;
            }
        }
        if (ans) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
