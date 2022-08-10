package src.algo;

import java.util.Stack;

public class ValidParenthesis {

    /**
     * 1-string değeri paratmetre olarak alıyoruz
     * 2-stack yaratıyoruz
     * 3-eğer ({[ değil ise
     * 4-eğer stack boş ya da  karakter ] değilse ya da en üstteki [ değilse
     *  ve karakter ) değilse ya da  en üstteki ( değilse
     *  ve karakter } değilse ya da en üstteki { değilse stack'e sıradaki karakteri ekle
     *  değise stack'den çıkart.
     * 5-eğer ({[ ise stack'e ekle
     */

    public static boolean validParentheses(String str) {
        Stack<Character> st = new Stack();

        for(int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) != '{' && str.charAt(i) != '(' && str.charAt(i) != '[') {
                if (st.isEmpty() ||
                        (str.charAt(i) != ']' || st.peek() != '[') &&
                        (str.charAt(i) != ')' || st.peek() != '(') &&
                        (str.charAt(i) != '}' || st.peek() != '{')) {
                    st.push(str.charAt(i));
                } else {
                    st.pop();
                }
            } else {
                st.push(str.charAt(i));
            }
        }

        return st.isEmpty();
    }
}
