package behavioral._03_interpreter.interpreter;

public class InterpreterClient {

    static Expression buildInterpreterTree() {
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        // Tigers and Bears
        Expression alternation1 = new AndExpression(terminal2, terminal3);

        // Lions or (Tigers and Bears)
        Expression alternation2 = new OrExpression(terminal1, alternation1);


        return new AndExpression(terminal3, alternation2);
    }

    public static void main(String[] args) {
        Expression define = buildInterpreterTree();

        printInterpretationResult(define, "Lions");
        printInterpretationResult(define, "Tigers");
        printInterpretationResult(define, "Bears");
        printInterpretationResult(define, "Lions Tigers");
        printInterpretationResult(define, "Lions Bears");
        printInterpretationResult(define, "Tigers Bears");
    }

    private static void printInterpretationResult(Expression define, String context) {
        System.out.println(context + " is " + define.interpret(context));
    }
}
