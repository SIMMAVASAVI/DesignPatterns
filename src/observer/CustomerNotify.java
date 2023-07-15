package observer;

public class CustomerNotify implements OrderPlacedSubscriber,OrderCancelSubscriber{ // Listen to event and take some action

    public CustomerNotify() {
        Amazon a= Amazon.getInstance();
        a.registerOrderPlacedSubscriber(this);
        a.registerOrderCanceledSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData data= new ReturnData("Notify the customer regarding order is placed");
        System.out.println(" Notify the customer regarding ");
        return data;
    }

    @Override
    public ReturnData orderCancelEvent() {
        ReturnData data= new ReturnData("Notify the customer regarding order is placed");
        System.out.println(" Notify the customer regarding ");
        return data;
    }
}
