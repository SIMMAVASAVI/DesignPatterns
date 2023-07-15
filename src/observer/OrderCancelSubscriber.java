package observer;

public interface OrderCancelSubscriber {

    ReturnData orderCancelEvent();//action that we need to perform when an order place event is consumed

    // Any class that wants to become a subscriber for order cancel event [ wants to consumer order cancel
    // event] then that class should implement this interface

}
