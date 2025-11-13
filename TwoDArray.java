package DSA_Assignments;

import java.util.*;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];
        int countA = 0, countB = 0;
        long sumA = 0, sumB = 0;

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
            if (A[i] == -1) countA++;
            else sumA += A[i];
        }

        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
            if (B[i] == -1) countB++;
            else sumB += B[i];
        }

        int totalMissing = countA + countB;

        if (totalMissing == 1) {
            long diff = sumB - sumA;
            if (countA == 1) {  // missing in A
                System.out.println(diff >= 0 ? 1 : 0);
            } else {  // missing in B
                diff = sumA - sumB;
                System.out.println(diff >= 0 ? 1 : 0);
            }
        } 
        else if (totalMissing == 2) {
            if (countA == 1 && countB == 1) {
                System.out.println("Infinite");
            } else {
                long diff = sumB - sumA;
                if (diff < 0) System.out.println(0);
                else System.out.println(diff + 1);
            }
        }
        sc.close();
    }
}

