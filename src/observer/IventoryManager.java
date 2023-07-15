package observer;

public class IventoryManager implements OrderPlacedSubscriber{ // Listen to event and take some action


    public IventoryManager() {
        Amazon a= Amazon.getInstance();
        a.registerOrderPlacedSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData data= new ReturnData("Notify the customer regarding order is Inventory Manager");
        System.out.println(" Inventary Manager Generated ");
        return data;
    }
}
