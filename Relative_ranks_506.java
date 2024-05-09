package Leetcode;

import java.util.Arrays;

public class Relative_ranks_506 {
    public static void main(String[] args) {
        int[] score={5,4,3,2,1};
        Relative_ranks_506 ob=new Relative_ranks_506();
        System.out.println(Arrays.toString(ob.findRelativeRanks(score)));
    }
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int max = 0;
        for (int x : score) {
            if (x > max) {
                max = x;
            }
        }
        int score_idx[] = new int[max + 1];
        for (int i = 0; i < n; i++) {
            score_idx[score[i]] = i + 1;
        }

        String rank[] = new String[n];
        int c = 1;
        String medals[] = { "Gold Medal", "Silver Medal", "Bronze Medal" };

        for (int i = max; i >= 0; i--) {
            if (score_idx[i] != 0) {
                int org_idx = score_idx[i] - 1;
                if (c < 4) {
                    rank[org_idx] = medals[c - 1];
                } else {
                    rank[org_idx] = Integer.toString(c);
                }
                c++;
            }
        }
        return rank;
    }
}
