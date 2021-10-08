package com.lrq;

import java.util.Stack;

/*
    题目描述：给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

        左括号必须用相同类型的右括号闭合。
        左括号必须以正确的顺序闭合。
        注意空字符串可被认为是有效字符串。
     思路：新建一个栈，遍历字符串，依次将左括号对应的右括号压入栈中，然后比较
 */
public class lc_020 {
    public void main(String[] args) {

    }
    public boolean isvalid(String s){
        Stack<Character> stack=new Stack();
        for(char c:s.toCharArray()){
            if(c=='(')stack.push(')');
            else if(c=='[')stack.push(']');
            else if(c=='{')stack.push('}');
            else if(stack.isEmpty()||c!=stack.pop())return false;
        }
        return stack.isEmpty();
        }

    }
