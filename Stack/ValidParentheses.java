class Solution {
    public boolean isValid(String s) {
        Stack<Character> bracketStack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == '(' || cur == '[' || cur == '{')
                bracketStack.push(cur);
            else if (cur == ')' || cur == ']' || cur == '}') {
                if (bracketStack.isEmpty())
                    return false;
                char left = bracketStack.pop();
                if (!daliSoodvetni(left, cur))
                    return false;
            }
        }
        return (bracketStack.isEmpty());
    }

    public static boolean daliSoodvetni(char left, char right) {
        switch (left) {
            case '(':
                return (right == ')');
            case '[':
                return (right == ']');
            case '{':
                return (right == '}');
        }
        return false;
    }
}