package algorithm.stack;

import java.util.Stack;

/**
 * @author Ethanp
 * @version V1.0
 * @Package algorithm.stack
 * @Description: TODO
 * @date 2018/4/8 19:21
 */
public class Test1 {

    public static void main(String[] args) {
        System.out.println(isValid("([])"));
    }

    private static boolean isValid(String s) {
        //如果s为空或者长度为0或者长度为奇数，括号肯定不匹配
        if (s == null || s.length() == 0 || s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        boolean flag = true;
        //从s的第一个字符开始遍历
        for (int i = 0; i < s.length(); i++) {
            //如果遇到"(""[""{",则压入栈中
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                //判断stack栈是否为空，且栈顶元素与s的相应字符匹配，
                //如果匹配，则栈顶元素出栈；否则，整个字符串都字符串不匹配，跳出循环；
                if (!stack.empty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    flag = false;
                    break;
                }
            } else if (s.charAt(i) == ']') {
                //判断stack栈是否为空，且栈顶元素与s的相应字符匹配
                if (!stack.empty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    flag = false;
                    break;
                }
            } else if (s.charAt(i) == '}') {
                //判断stack栈是否为空，且栈顶元素与s的相应字符匹配
                if (!stack.empty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    flag = false;
                    break;
                }
            }
        }
        //遍历一遍字符串后，看栈是否为空，如果不为空，则该字符串不匹配；
        if (!stack.empty()) {
            flag = false;
        }

        return flag;
    }
}
