package algorithm.stack;

import java.util.*;

/**
 * @author Ethanp
 * @version V1.0
 * @Package algorithm.stack
 * @Description: TODO 后缀式（逆波兰算法）
 * @date 2018/4/10 8:25
 */
public class Test2 {
    public static void main(String[] args) {
        String str = "1-2+3*(4-5)";
        System.out.println(1 - 2 + 3 * (4 - 5));
        System.out.println(ShuntingYardAlgorith(str));
        System.out.println(calculator(ShuntingYardAlgorith(str)));
    }

    /**
     * 调度场算法
     *
     * @param str
     * @return 逆波兰表达式 后缀式
     */
    private static String ShuntingYardAlgorith(String str) {
        Stack<Character> operator = new Stack<Character>();
        Queue<Character> operand = new LinkedList<Character>();
        Map<Character, Integer> map = new HashMap<>();
        map.put('+', 1);
        map.put('-', 1);
        map.put('*', 2);
        map.put('/', 2);
        map.put('(', 0);
        map.put('^', 3);
        char[] items = str.toCharArray();
        for (char x : items) {
            if (x > '0' && x < '9') {
                //是操作数,加入操作数队列
                operand.add(x);
            } else {
                //是操作符
                if (operator.isEmpty()) {
                    //堆栈为空，把操作符压进堆栈
                    operator.push(x);
                } else if (x == ')') {
                    //遇到')'进行循环，直到找到'('
                    //循环操作是将操作符栈顶元素弹出到操作数队列队尾
                    boolean flag = true;
                    while (flag) {
                        char pop = operator.pop();
                        if (pop != '(') {//左括号不能加入操作数队列
                            operand.add(pop);
                        } else {
                            flag = false;
                        }

                    }

                } else if (x == '(' || map.get(x) > map.get(operator.peek()) || x == operator.peek()) {
                    //操作符为'('或者操作符的优先级大于栈顶元素或者操作符相同
                    operator.push(x);
                } else {
                    //否则将操作符堆栈栈顶元素弹出到操作数队列
                    char pop = operator.pop();
                    if (pop != '(') {
                        operand.add(pop);
                    }
                    operator.push(x);

                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character item : operand) {
            stringBuilder.append(item);
        }
        int size = operator.size();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(operator.pop());
        }
        return new String(stringBuilder);
    }

    //计算逆波兰表达式的值
    private static double calculator(String str) {
        char[] items = str.toCharArray();
        Stack<Integer> stack = new Stack<Integer>();
        for (char x : items) {
            if (x > '0' && x < '9') {
                stack.push(x - '0');
            } else {
                int a = stack.pop();
                int b = stack.pop();
                if (x == '+') {
                    stack.push(b + a);
                } else if (x == '-') {
                    stack.push(b - a);
                } else if (x == '*') {
                    stack.push(b * a);
                } else if (x == '/') {
                    stack.push(b / a);
                } else {
                    stack.push(b ^ a);
                }
            }
        }
        return stack.peek();
    }
}
