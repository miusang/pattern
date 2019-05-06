package cn.ning.pattern.structural.proxy;

/**
 * 旅行社，代理主题角色。
 */
public class TravelAgency implements Tourist {
    private Person customer;
    public TravelAgency(Person customer) {
        this.customer = customer;
    }
    @Override
    public void makeSchedule() {
        System.out.println("旅行社帮" + customer.getName() + "制定行程。");
    }

    @Override
    public void buyTicket() {
        System.out.println("旅行社帮" + customer.getName() + "买票。");
    }

    @Override
    public void visit() {
        if (this.customer != null) {
            customer.visit();
        }
    }
}
