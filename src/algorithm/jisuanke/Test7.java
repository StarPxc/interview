package algorithm.jisuanke;

public class Test7 {
    public static void main(String[] args) {
        test(5, 7);
    }

    public static void test(int n, int m) {
        char a;
        for (int i = 0; i < n; i++) {
            a = (char) ('A' + i);//每行第一个字母
            int j = 0;
            while (a > 'A' && j++ < m) {
                System.out.print(a--);
            }
            while (j++ < m) {
                System.out.print(a++);
            }

            System.out.println();
        }

    }
}
