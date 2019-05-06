package cn.ning.pattern.behavioral.mediator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 珍爱网，具体中介者。
 */
public class ZhenAi implements Agency {
    private Map<String, Customer> customers = new HashMap<>();

    @Override
    public void 收钱(Person person, int money) {
        Customer customer = customers.get(person.getName());
        if (customer == null) { // 客户资料中不存在此人，新会员。
            customers.put(person.getName(), new Customer(person, money));
        } else {
            customer.pay_money += money;
        }
        System.out.println("珍爱网今收到" + customerName(person) + money + "元。");
    }

    @Override
    public Person 介绍对象(Person person) {
        Customer customer = customers.get(person.getName());
        if(customer == null) {
            System.out.println(customerName(person) + "，您还不是我们珍爱网的会员，请先注册会员。");
            return null;
        }
        if (customer.pay_money <= 0) {
            System.out.println(customerName(person) + "当前余额不足以获得相亲服务，请充值。");
            return null;
        }
        boolean gender = !person.isGender();
        Iterator iter = customers.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Customer p = (Customer)entry.getValue();

            if (p.person.isGender() == gender) {
                return p.person;
            }
        }
        System.out.println("没有合适的相亲对象。");
        return null;
    }

    private class Customer {
        protected Person person;
        protected int pay_money;

        public Customer(Person person, int pay_money) {
            this.person = person;
            this.pay_money = pay_money;
        }
    }

    private String customerName(Person person) {
        String gender = person.isGender() == Person.MALE ? "先生" : "女士";
        return "尊敬的" + person.getName() + gender;
    }
}
