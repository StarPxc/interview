package algorithm.string;

/**
 * @author Ethanp
 * @version V1.0
 * @Package algorithm.string
 * @Description: TODO KMP算法
 * @date 2018/4/7 10:32
 */
public class KMP {

    public static void main(String[] args) {

    }

    private static void prefixTable(char[] pattern[], int prefix[], int n) {
        prefix[0] = 0;
        int len = 0;
        int i = 1;
        while (i < len) {
            if (pattern[i] == pattern[len]) {
                len++;
                prefix[i] = len;
                i++;
            } else {

            }
        }
    }
}
