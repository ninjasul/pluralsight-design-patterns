package behavioral._03_interpreter.interpreter;

import lombok.AllArgsConstructor;

import java.util.StringTokenizer;

@AllArgsConstructor
public class TerminalExpression implements Expression {
    private String data;

    @Override
    public boolean interpret(String str) {
        StringTokenizer st = new StringTokenizer(str);

        while( st.hasMoreTokens()) {
            String test = st.nextToken();
            //System.out.println("The next token is " + test);

            if( test.equals(data) ) {
                return true;
            }
        }

        return false;
    }
}