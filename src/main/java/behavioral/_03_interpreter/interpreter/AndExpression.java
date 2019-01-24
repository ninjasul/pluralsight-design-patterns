package behavioral._03_interpreter.interpreter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AndExpression implements Expression {

    private Expression expr1;
    private Expression expr2;

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}