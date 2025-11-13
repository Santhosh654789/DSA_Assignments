package DSA_Assignments;

import java.util.*;

public class SumAsPerFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int q = sc.nextInt(); 
        while (q-- > 0) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            long sum = 0;

            for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
                int num = e.getKey();
                int f = e.getValue();

                if (f >= L && f <= R) {
                    sum += (long) num * f;  
                }
            }

            System.out.println(sum);
        }
        sc.close();
    }
}

    


