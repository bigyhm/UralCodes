package com.island.timus.ahundrend;

import java.util.Scanner;

public class T1044_LuckTickets_2 {
    private static int save[][] = new int[10][100];

    private static int getSum(int n, int deta)
    {
        return save[n][deta + 50];
    }

    private static void addSum(int n, int deta, int sum)
    {
        save[n][deta + 50] += sum;
    }

    public static void main(String args[])
    {
        addSum(0, 0, 1);
        for (int i = 0; i <= 6; i++)
            for (int deta = -36; deta <= 36; deta++)
                if (getSum(i, deta) != 0)
                    for (int x = 0; x <= 9; x++)
                        for (int y = 0; y <= 9; y++)
                            addSum(i + 2, deta + x - y, getSum(i, deta));
        try (Scanner cin = new Scanner(System.in))
        {
            while (cin.hasNext())
            {
                int n = cin.nextInt();
                System.out.println(getSum(n, 0));
            }
        }
    }
}
