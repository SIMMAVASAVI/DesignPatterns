package observer;

public interface OrderPlacedSubscriber { // Structure eof Subscriber
    ReturnData orderPlaceEvent();//action that we need to perform when an order place event is consumed

    // Any class that wants to become a subscriber for order placed event [ wants to consumer order placed
    // event] then that class should implement this interface
}
