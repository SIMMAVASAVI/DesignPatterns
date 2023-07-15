package facade;

public class Amazon {

    OrderPlacedHelper orderPlacedHelper;
    OrderCancelledHelper orderCancelledHelper;

    public Amazon() {
        this.orderPlacedHelper = new OrderPlacedHelper();
        this.orderCancelledHelper = new OrderCancelledHelper();
    }

    public void orderPlaced(){
        //As method is Heavy moved it to a separate helper class - Facade
        orderPlacedHelper.orderPlaced();
    }
    public void orderCancelled(){
        //As method is Heavy moved it to a separate helper class - Facade
        orderCancelledHelper.orderCancelled();
    }
}
