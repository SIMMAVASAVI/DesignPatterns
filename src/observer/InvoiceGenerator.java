package observer;

public class InvoiceGenerator implements OrderPlacedSubscriber,OrderCancelSubscriber{ // Listen to event and take some action

    public InvoiceGenerator() {
        Amazon a= Amazon.getInstance();
        a.registerOrderPlacedSubscriber(this);
        a.registerOrderCanceledSubscriber(this);
    }
    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData data= new ReturnData("Notify the customer regarding InvoiceGenerator");
        System.out.println(" Invoice Generated for Placed Order");
        return data;
    }


    @Override
    public ReturnData orderCancelEvent() {
        ReturnData data= new ReturnData("Notify the customer regarding order is placed");
        System.out.println(" Invoice Generated for cancel Order");
        return data;
    }
}
