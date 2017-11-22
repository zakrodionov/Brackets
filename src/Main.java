import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // всевозможные варианты построения строк
        String test0="<{}[]()>";
        String test1="<{}[(])>";
        String test2="<{}[]()";
        String test3="{}()[]{}()";
        String test4="}()}[]((]<{}[]()>";
        String test5="{()}[]((]{}()[]{}()";
        String test6="<{x+y}[]()qwe>r";
        String test7="";
        String test8="84949";

        System.out.println(validateBrackets(test0));
        System.out.println(validateBrackets(test1));
        System.out.println(validateBrackets(test2));
        System.out.println(validateBrackets(test3));
        System.out.println(validateBrackets(test4));
        System.out.println(validateBrackets(test5));
        System.out.println(validateBrackets(test6));
        System.out.println(validateBrackets(test7));
        System.out.println(validateBrackets(test8));





    }

    public static boolean validateBrackets(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{' || c=='<' ) {
                stack.push(c);
            } else if(c == ']') {
                if(stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if(c == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if(c == '}') {
                if(stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            } else if(c == '>') {
                if(stack.isEmpty() || stack.pop() != '<') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }

}
