package cn.ning.pattern.behavioral.interpreter;

/*
 * 解释器模式。
 *     |--- AbstractExpression : 抽象表达式
 *     |    声明一个所有的具体表达式都需要实现的抽象接口。这个接口主要是一个interpret()方法，称作解释操作。
 *     |
 *     |--- TerminalExpression : 终结符表达式
 *     |    实现了抽象表达式角色所要求的接口，主要是一个interpret()方法；文法中的每一个终结符都有一个具体终结表达式与
 *     |    之相对应。比如有一个简单的公式R=R1+R2，在里面R1和R2就是终结符，对应的解析R1和R2的解释器就是终结符表达式。
 *     |
 *     |--- Non-terminalExpression : 非终结符表达式
 *     |    文法中的每一条规则都需要一个具体的非终结符表达式，非终结符表达式一般是文法中的运算符或者其他关键字，
 *     |    比如公式R=R1+R2中，“+"就是非终结符，解析“+”的解释器就是一个非终结符表达式。
 *     |
 *     |--- Context : 环境类
 *     |    这个角色的任务一般是用来存放文法中各个终结符所对应的具体值，比如R=R1+R2，我们给R1赋值100，给R2赋值200。
 *     |    这些信息需要存放到环境角色中，很多情况下我们使用Map来充当环境角色就足够了。
 *
 * 定义：
 *     定义一个语言的文法，并建立一个解释器来解释该语言中的句子。
 *
 * 适用场景：
 *     1. 可以将一个需要解释执行的语言中的句子表示为一个抽象语法树。
 *     2. 一些重复出现的问题可以用一种简单的语言来进行表达。
 *     3. 一个简单语法需要解释的场景。
 *     4. 编译器、运算表达式计算。
 *
 * 优点：
 *     1. 可扩展性比较好，灵活。
 *     2. 增加了新的解释表达式的方式。
 *     3. 易于实现简单文法。
 * 缺点：
 *     1. 可利用场景比较少。
 *     2. 对于复杂的文法比较难维护。
 *     3. 解释器模式会引起类膨胀。
 *     4. 解释器模式采用递归调用方法。
 *
 */
public class Demo {
    public static void main(String[] args) {
        TerminalExpression t1 = new TerminalExpression("hello , Beijing");
        TerminalExpression t2 = new TerminalExpression("hello , Shanghai");
        AndExpression andExpression = new AndExpression(t1, t2);
        System.out.println(andExpression.interpret("hello"));
        System.out.println(andExpression.interpret("Beijing"));
    }
}
