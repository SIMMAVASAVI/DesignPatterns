package observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon { // publisher -> where the event actually happens
    private  List<OrderPlacedSubscriber> orderPlacedSubscribers;
    private List<OrderCancelSubscriber> orderCancelSubscribers;

    private static Amazon instance;

    public Amazon() {
        this.orderPlacedSubscribers = new ArrayList<>();
        this.orderCancelSubscribers=new ArrayList<>();
    }

    public void registerOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    public void deRegisterOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }

    public void registerOrderCanceledSubscriber(OrderCancelSubscriber orderCancelSubscriber){
        orderCancelSubscribers.add(orderCancelSubscriber);
    }

    public void deRegisterOrderCanceledSubscriber(OrderPlacedSubscriber orderCancelSubscriber){
        orderCancelSubscribers.remove(orderCancelSubscriber);
    }

    public static Amazon getInstance(){
        if(instance==null){
            synchronized (Amazon.class){
                if(instance==null){
                    instance=new Amazon();
                }
            }
        }
        return instance;
    }

    public void orderPlaced(){
        for(OrderPlacedSubscriber orderPlacedSubscriber : orderPlacedSubscribers){
            orderPlacedSubscriber.orderPlaceEvent();
        }
    }

    public void orderCanceled(){
        for(OrderCancelSubscriber orderCancelSubscriber : orderCancelSubscribers){
            orderCancelSubscriber.orderCancelEvent();
        }
    }
}
