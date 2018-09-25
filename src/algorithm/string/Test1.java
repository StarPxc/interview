package algorithm.string;

import java.util.HashMap;

/**
 * @author 浦希成
 * 2018/9/22 14:21
 * 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。
 * 如果可以构成，返回 true ；否则返回 false。
 */
public class Test1 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> con=new HashMap<>();
        for (char c:magazine.toCharArray()){
            con.put(c,con.getOrDefault(c,0)+1);
        }
        for (Character c:ransomNote.toCharArray()){
            if (!con.containsKey(c) ||con.get(c)==0) {
                return false;
            }else {
                con.put(c,con.get(c)-1);
            }

        }
        return true;
    }
}
