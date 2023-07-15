package observer;

public class Refund implements OrderCancelSubscriber{

    public Refund() {
        Amazon a= Amazon.getInstance();
        a.registerOrderCanceledSubscriber(this);
    }
    @Override
    public ReturnData orderCancelEvent() {
        ReturnData data= new ReturnData("Notify the customer regarding order is refunded");
        System.out.println(" Refund triggered for canceled order");
        return data;
    }
}
