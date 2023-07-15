package observer;

public class Client {

    public static void main(String[] args) {

        Amazon a= Amazon.getInstance(); //publisher

        CustomerNotify customerNotify=new CustomerNotify();
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        IventoryManager iventoryManager=new IventoryManager();
        a.orderPlaced();
        System.out.println("--------- InventoryManager Deregister----------");
        a.deRegisterOrderPlacedSubscriber(iventoryManager);
        a.orderPlaced();
        System.out.println("--------- Order Canceled----------");
        Refund refund= new Refund();
        a.orderCanceled();
    }
}
