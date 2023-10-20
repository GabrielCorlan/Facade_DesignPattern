public class OrderFacade {
    Waiter waiter;
    Chef chef;

    public OrderFacade(){
        waiter = new Waiter();
        chef = new Chef();
    }

    public void orderFood(){
        waiter.writeOrder();
        waiter.sendOrderToKitchen();
        chef.prepareFood();
        chef.callWaiter();
        waiter.serveCustomer();
        chef.washDishes();
    }
}
