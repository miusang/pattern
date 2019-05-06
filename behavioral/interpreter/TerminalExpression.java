package cn.ning.pattern.behavioral.interpreter;

public class TerminalExpression implements Expression {
    private String data; // 此时环境类为String类。

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (data.contains(context)) {
            return true;
        }
        return false;
    }
}
