import java.util.Stack;

public class BracketsBalance {

    public boolean bracketsBalance(String str) {
        char[] chars = str.toCharArray();
        Stack<Character> bktStack = new Stack<>();
        for(char symbol : chars) {
            if (symbol == '(' || symbol == '[' || symbol == '{') {
                bktStack.push(symbol);
            }
            if (symbol == ')' || symbol == ']' || symbol == '}') {
                if (!bktStack.empty()) {
                    char lastSymbol = bktStack.peek();
                    if (lastSymbol == '(' && symbol == ')' || lastSymbol == '[' && symbol == ']' ||
                            lastSymbol == '{' && symbol == '}' ) {
                        bktStack.pop();
                    }
                }
                else {
                    return false;
                }
            }
        }
        return bktStack.empty();
    }
}