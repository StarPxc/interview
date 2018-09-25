package algorithm.pat;

import java.util.Scanner;

/**
 * Create by Ethan on 2017/11/6
 */
public class Test5 {
    public static String pxc(int n) {
        if (n < 10) {
            return "0" + n;
        } else {
            return n + "";
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int start = console.nextInt();
        int end = console.nextInt();
        int clkTck = end - start;
        double interval = Math.round((double) (end - start) / 100);
        int second = (int) (interval % 60);
        int minutes = (int) ((interval / 60) % 60);
        int hours = (int) (interval / 3600);
        System.out.println(pxc(hours) + ":" + pxc(minutes) + ":" + pxc(second));

    }
}